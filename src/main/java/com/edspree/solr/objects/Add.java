package com.edspree.solr.objects;

public class Add <T>{
    private Doc <T> add;

    public Add(){
        add = new Doc<T>();
    }
    /**
     * @return the add
     */
    public Doc getAdd() {
        return add;
    }

    /**
     * @param add the add to set
     */
    public void setAdd(Doc add) {
        this.add = add;
    }
    
}
