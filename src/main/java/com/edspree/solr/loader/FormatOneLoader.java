package com.edspree.solr.loader;

import java.awt.List;
import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.datastax.driver.mapping.Mapper;
import com.datastax.driver.mapping.MappingManager;
import com.datastax.driver.mapping.Result;
import com.edspree.solr.client.SolrClient;
import com.edspree.solr.objects.Add;
import com.edspree.solr.objects.Doc;
import com.edspree.solr.objects.FormatOne;
import com.edspree.solr.objects.Institute;

public class FormatOneLoader {
    private static Cluster cluster;
    private static Session session;
    private static Mapper<Institute> mapper;
    
    public static Add prepObj() throws ClientProtocolException, IOException{
        ResultSet rs = session.execute("select * from matriculla.institutes");
        SolrClient client = new SolrClient("http://localhost:8983/solr/edspree");
        int count = 0;
        for(Row row: rs.all()){
            Institute ins = new Institute();
            ins.setId(""+count);
            ins.setInstituteId(row.getString("institute_id"));
            ins.setAboutUs(row.getString("about_us"));
            //ins.setFees(row.getString("avg_fees"));
            ins.setSubject(row.getString("subject"));
            Add add = new Add<Institute>();
            Doc doc = new Doc<Institute>();
            doc.setDoc(ins);
            add.setAdd(doc);
            count++;
            client.postObjToSolr(add);
            break;
        }
        System.out.println(count);
        return null;
    }
    
    private static void cassandraClient(String nodeIp){
        cluster = Cluster.builder()
                .addContactPoint(nodeIp).build();
        session = cluster.connect();
        MappingManager manager = new MappingManager(session);
        mapper = manager.mapper(Institute.class);        
    }
    
    public static void main(String args[]) throws ClientProtocolException, IOException{
//        SolrClient client = new SolrClient(args[0]);
//        Add obj = null;
//        client.postObjToSolr(obj);
        cassandraClient("127.0.0.1");
        prepObj();
    }
}
