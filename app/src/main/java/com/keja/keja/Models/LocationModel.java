package com.keja.keja.Models;

import android.arch.persistence.room.Entity;

import java.io.Serializable;


@Entity(tableName = "location")
public class LocationModel implements Serializable{
    private int KEYID;
    private int id;
    private String location;
    private String location_desc;
    private String lat,lon;
    private String county;
    private String state;
    private String town;
    private String country;

    public LocationModel() {
    }

    public LocationModel(int KEYID, int id, String location, String location_desc, String lat, String lon, String county, String state, String town, String country) {
        this.KEYID = KEYID;
        this.id = id;
        this.location = location;
        this.location_desc = location_desc;
        this.lat = lat;
        this.lon = lon;
        this.county = county;
        this.state = state;
        this.town = town;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKEYID() {
        return KEYID;
    }

    public void setKEYID(int KEYID) {
        this.KEYID = KEYID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation_desc() {
        return location_desc;
    }

    public void setLocation_desc(String location_desc) {
        this.location_desc = location_desc;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
