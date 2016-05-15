package com.edspree.solr.objects;

import com.datastax.driver.mapping.annotations.Field;
import com.datastax.driver.mapping.annotations.UDT;

@UDT(keyspace = "matriculla", name = "address")
public class Address {
    @Field(name = "plot_street")
    private String plotStreet;
    @Field(name = "town")
    private String town;
    @Field(name = "city")
    private String city;
    @Field(name = "state")
    private String state;
    @Field(name = "country")
    private String country;
    @Field(name = "pin")
    private String pin;
    /**
     * @return the plotStreet
     */
    public String getPlotStreet() {
        return plotStreet;
    }
    /**
     * @param plotStreet the plotStreet to set
     */
    public void setPlotStreet(String plotStreet) {
        this.plotStreet = plotStreet;
    }
    /**
     * @return the town
     */
    public String getTown() {
        return town;
    }
    /**
     * @param town the town to set
     */
    public void setTown(String town) {
        this.town = town;
    }
    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }
    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * @return the state
     */
    public String getState() {
        return state;
    }
    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }
    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }
    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
    /**
     * @return the pin
     */
    public String getPin() {
        return pin;
    }
    /**
     * @param pin the pin to set
     */
    public void setPin(String pin) {
        this.pin = pin;
    }
}
    