package com.edspree.solr.objects;

public class Doc<T> {
    private T doc;

    /**
     * @return the doc
     */
    public T getDoc() {
        return doc;
    }

    /**
     * @param doc the doc to set
     */
    public void setDoc(T doc) {
        this.doc = doc;
    }
}
