package com.keja.keja.Models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "OwnersModel")
public class OwnersModel  {
    @PrimaryKey(autoGenerate = true)
    private int KEYID;
    private int id;
   @NonNull
    private String owner_name,owner_phone,owner_email="Not set";

   private String owner_img;

    public OwnersModel(int KEYID, @NonNull String owner_name, @NonNull String owner_phone,
                       @NonNull String owner_email, @NonNull int id, String owner_img) {
        this.KEYID = KEYID;
        this.owner_name = owner_name;
        this.owner_phone = owner_phone;
        this.owner_email = owner_email;
        this.id = id;
        this.owner_img = owner_img;
    }

    public OwnersModel() {
    }

    public int getKEYID() {
        return KEYID;
    }

    public void setKEYID(int KEYID) {
        this.KEYID = KEYID;
    }

    @NonNull
    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(@NonNull String owner_name) {
        this.owner_name = owner_name;
    }

    @NonNull
    public String getOwner_phone() {
        return owner_phone;
    }

    public void setOwner_phone(@NonNull String owner_phone) {
        this.owner_phone = owner_phone;
    }

    @NonNull
    public String getOwner_email() {
        return owner_email;
    }

    public void setOwner_email(@NonNull String owner_email) {
        this.owner_email = owner_email;
    }

    @NonNull
    public int id() {
        return id;
    }

    public void id(@NonNull int id) {
        this.id = id;
    }

    public String getOwner_img() {
        return owner_img;
    }

    public void setOwner_img(String owner_img) {
        this.owner_img = owner_img;
    }
}
