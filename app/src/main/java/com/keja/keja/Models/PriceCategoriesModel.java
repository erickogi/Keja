package com.keja.keja.Models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "PriceCategories")
public class PriceCategoriesModel {
    @PrimaryKey(autoGenerate = true)
    private int KEYID;
    private int id;
    private String price;
    private String desc;


    public PriceCategoriesModel() {
    }


    public PriceCategoriesModel(int KEYID, int id, String price, String desc) {
        this.KEYID = KEYID;
        this.id = id;
        this.price = price;
        this.desc = desc;
    }

    public PriceCategoriesModel(int KEYID, String price, String desc) {
        this.KEYID = KEYID;
        this.price = price;
        this.desc = desc;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
