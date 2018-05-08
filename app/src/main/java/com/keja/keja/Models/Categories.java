package com.keja.keja.Models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "Categories")
public class Categories implements Serializable{
    @PrimaryKey(autoGenerate = true)
    private int KEYID;

    private String id;
    private String title;
    private String description;


    public Categories() {
    }

    public Categories(int KEYID, String id, String title, String description) {
        this.KEYID = KEYID;
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getKEYID() {
        return KEYID;
    }

    public void setKEYID(int KEYID) {
        this.KEYID = KEYID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
