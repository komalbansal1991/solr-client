package com.edspree.solr.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.common.SolrInputDocument;

import com.edspree.solr.objects.Add;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SolrClient {
    
    private String serverURL;
    private HttpSolrClient solr = null;
    private SolrInputDocument doc = null;
    public SolrClient(String serverURL){
        this.serverURL = serverURL;
        this.solr = new HttpSolrClient(this.serverURL);
        doc = new SolrInputDocument();
    }
    
    public void postObjToSolr(Add obj) throws ClientProtocolException, IOException{
       String postUrl = this.serverURL + "/update/json?wt=json&commit=true";
       System.out.println(postUrl);
       HttpClient httpClient = HttpClientBuilder.create().build();
       
       HttpPost postReq = new HttpPost(postUrl);
       ObjectMapper mapper = new ObjectMapper();
       String jsonString = mapper.writeValueAsString(obj);
       StringEntity entity = new StringEntity(jsonString);
       System.out.println(jsonString);
       entity.setContentType("application/json");
       postReq.setEntity(entity);
       HttpResponse response = httpClient.execute(postReq);
       HttpEntity httpEntity = response.getEntity();
       InputStream in = httpEntity.getContent();

       String encoding = httpEntity.getContentEncoding() == null ? "UTF-8" : httpEntity.getContentEncoding().getName();
       encoding = encoding == null ? "UTF-8" : encoding;
       String responseText = IOUtils.toString(in, encoding);
       System.out.println("response Text is " + response.toString());
    }
    
}
