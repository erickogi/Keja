package com.keja.keja.Models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;

public class LocationsClass {

    @Entity(tableName = "Country")
    public static class  Country{
        @PrimaryKey(autoGenerate = true)
        private int KEYID;
        private int id;
        private String name;

        public Country(int KEYID, int id, String name) {
            this.KEYID = KEYID;
            this.id = id;
            this.name = name;
        }

        public Country() {
        }

        public int getKEYID() {
            return KEYID;
        }

        public void setKEYID(int KEYID) {
            this.KEYID = KEYID;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    @Entity(tableName = "County")
    public static class  County{

        @PrimaryKey(autoGenerate = true)
        private int KEYID;

        private int id;
        private String name;

        public County(int KEYID, int id, String name) {
            this.KEYID = KEYID;
            this.id = id;
            this.name = name;
        }

        public County() {
        }

        public int getKEYID() {
            return KEYID;
        }

        public void setKEYID(int KEYID) {
            this.KEYID = KEYID;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    @Entity(tableName = "City")
    public  static class  City{
        @PrimaryKey(autoGenerate = true)
        private int KEYID;
        private int id;
        private String name;

        public City() {
        }

        public City(int KEYID, int id, String name) {
            this.KEYID = KEYID;
            this.id = id;
            this.name = name;
        }

        public int getKEYID() {
            return KEYID;
        }

        public void setKEYID(int KEYID) {
            this.KEYID = KEYID;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    @Entity(tableName = "Town")
    public static class  Town{
        @PrimaryKey(autoGenerate = true)
        private int KEYID;
        private int id;
        private String name;

        public int getKEYID() {
            return KEYID;
        }

        public void setKEYID(int KEYID) {
            this.KEYID = KEYID;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
