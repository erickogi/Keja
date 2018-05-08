package com.keja.keja.Models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;
import android.support.annotation.NonNull;


import com.keja.keja.Data.Room.Converters;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity(tableName = "homes")
public class HomesModel implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int KEYID;

    @NonNull
    private int id,category_id,location_id,price_category_id;

    @NonNull
    private String category;
    @NonNull
    private String title="Not set";
    @NonNull
    private String short_desc,long_desc="Not set";


    @NonNull
    private String lat,lon,place,place_desc="Not set";

    @NonNull
    private String owner_name,owner_phone,owner_email,owner_id="Not set";
    @NonNull
    private String img_url="Not set";

    private String floor_material="Not set";
    private String wall_color="Not set";



    @TypeConverters(Converters.class)
    private ArrayList<HomeImagesModel> other_images;

    @NonNull
    private String price="Not set";

    private boolean is_price_negotiable,is_first_tenancy,hasWater,hasElectricity,hasWif,hasGas,isFurnished,hasTiles,hasDstv,isFenced,hasParking,hasGate,isGated,hasCCTV,hasGuard;
    private int rooms,toilets,bathrooms,sinks,windows,doors,taps;

    private boolean isinFlats,isinEstate,isFlatRoofed;
    private int floorPos;

    public HomesModel() {
    }

    public HomesModel(@NonNull int KEYID, @NonNull int id, @NonNull int category_id, @NonNull int location_id, @NonNull int price_category_id, @NonNull String category, @NonNull String title, @NonNull String short_desc, @NonNull String long_desc, @NonNull String lat, @NonNull String lon, @NonNull String place, @NonNull String place_desc, @NonNull String owner_name, @NonNull String owner_phone, @NonNull String owner_email, @NonNull String owner_id, @NonNull String img_url, String floor_material, String wall_color, ArrayList<HomeImagesModel> other_images, @NonNull String price, boolean is_price_negotiable, boolean is_first_tenancy, boolean hasWater, boolean hasElectricity, boolean hasWif, boolean hasGas, boolean isFurnished, boolean hasTiles, boolean hasDstv, boolean isFenced, boolean hasParking, boolean hasGate, boolean isGated, boolean hasCCTV, boolean hasGuard, int rooms, int toilets, int bathrooms, int sinks, int windows, int doors, int taps, boolean isinFlats, boolean isinEstate, boolean isFlatRoofed, int floorPos) {
        this.KEYID = KEYID;
        this.id = id;
        this.category_id = category_id;
        this.location_id = location_id;
        this.price_category_id = price_category_id;
        this.category = category;
        this.title = title;
        this.short_desc = short_desc;
        this.long_desc = long_desc;
        this.lat = lat;
        this.lon = lon;
        this.place = place;
        this.place_desc = place_desc;
        this.owner_name = owner_name;
        this.owner_phone = owner_phone;
        this.owner_email = owner_email;
        this.owner_id = owner_id;
        this.img_url = img_url;
        this.floor_material = floor_material;
        this.wall_color = wall_color;
        this.other_images = other_images;
        this.price = price;
        this.is_price_negotiable = is_price_negotiable;
        this.is_first_tenancy = is_first_tenancy;
        this.hasWater = hasWater;
        this.hasElectricity = hasElectricity;
        this.hasWif = hasWif;
        this.hasGas = hasGas;
        this.isFurnished = isFurnished;
        this.hasTiles = hasTiles;
        this.hasDstv = hasDstv;
        this.isFenced = isFenced;
        this.hasParking = hasParking;
        this.hasGate = hasGate;
        this.isGated = isGated;
        this.hasCCTV = hasCCTV;
        this.hasGuard = hasGuard;
        this.rooms = rooms;
        this.toilets = toilets;
        this.bathrooms = bathrooms;
        this.sinks = sinks;
        this.windows = windows;
        this.doors = doors;
        this.taps = taps;
        this.isinFlats = isinFlats;
        this.isinEstate = isinEstate;
        this.isFlatRoofed = isFlatRoofed;
        this.floorPos = floorPos;
    }

    public HomesModel(@NonNull int KEYID, @NonNull int id, @NonNull int category_id, @NonNull int location_id, @NonNull int price_category_id, @NonNull String title, @NonNull String short_desc, @NonNull String long_desc, @NonNull String lat, @NonNull String lon, @NonNull String place, @NonNull String place_desc, @NonNull String owner_name, @NonNull String owner_phone, @NonNull String owner_email, @NonNull String owner_id, @NonNull String img_url, String floor_material, String wall_color, ArrayList<HomeImagesModel> other_images, @NonNull String price, boolean is_price_negotiable, boolean is_first_tenancy, boolean hasWater, boolean hasElectricity, boolean hasWif, boolean hasGas, boolean isFurnished, boolean hasTiles, boolean hasDstv, boolean isFenced, boolean hasParking, boolean hasGate, boolean isGated, boolean hasCCTV, boolean hasGuard, int rooms, int toilets, int bathrooms, int sinks, int windows, int doors, int taps, boolean isinFlats, boolean isinEstate, boolean isFlatRoofed, int floorPos) {
        this.KEYID = KEYID;
        this.id = id;
        this.category_id = category_id;
        this.location_id = location_id;
        this.price_category_id = price_category_id;
        this.title = title;
        this.short_desc = short_desc;
        this.long_desc = long_desc;
        this.lat = lat;
        this.lon = lon;
        this.place = place;
        this.place_desc = place_desc;
        this.owner_name = owner_name;
        this.owner_phone = owner_phone;
        this.owner_email = owner_email;
        this.owner_id = owner_id;
        this.img_url = img_url;
        this.floor_material = floor_material;
        this.wall_color = wall_color;
        this.other_images = other_images;
        this.price = price;
        this.is_price_negotiable = is_price_negotiable;
        this.is_first_tenancy = is_first_tenancy;
        this.hasWater = hasWater;
        this.hasElectricity = hasElectricity;
        this.hasWif = hasWif;
        this.hasGas = hasGas;
        this.isFurnished = isFurnished;
        this.hasTiles = hasTiles;
        this.hasDstv = hasDstv;
        this.isFenced = isFenced;
        this.hasParking = hasParking;
        this.hasGate = hasGate;
        this.isGated = isGated;
        this.hasCCTV = hasCCTV;
        this.hasGuard = hasGuard;
        this.rooms = rooms;
        this.toilets = toilets;
        this.bathrooms = bathrooms;
        this.sinks = sinks;
        this.windows = windows;
        this.doors = doors;
        this.taps = taps;
        this.isinFlats = isinFlats;
        this.isinEstate = isinEstate;
        this.isFlatRoofed = isFlatRoofed;
        this.floorPos = floorPos;
    }

    @NonNull
    public String getCategory() {
        return category;
    }

    public void setCategory(@NonNull String category) {
        this.category = category;
    }

    @NonNull
    public int getKEYID() {
        return KEYID;
    }

    public void setKEYID(@NonNull int KEYID) {
        this.KEYID = KEYID;
    }

    @NonNull
    public int getId() {
        return id;
    }

    public void setId(@NonNull int id) {
        this.id = id;
    }

    @NonNull
    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(@NonNull int category_id) {
        this.category_id = category_id;
    }

    @NonNull
    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(@NonNull int location_id) {
        this.location_id = location_id;
    }

    @NonNull
    public int getPrice_category_id() {
        return price_category_id;
    }

    public void setPrice_category_id(@NonNull int price_category_id) {
        this.price_category_id = price_category_id;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    public void setTitle(@NonNull String title) {
        this.title = title;
    }

    @NonNull
    public String getShort_desc() {
        return short_desc;
    }

    public void setShort_desc(@NonNull String short_desc) {
        this.short_desc = short_desc;
    }

    @NonNull
    public String getLong_desc() {
        return long_desc;
    }

    public void setLong_desc(@NonNull String long_desc) {
        this.long_desc = long_desc;
    }

    @NonNull
    public String getLat() {
        return lat;
    }

    public void setLat(@NonNull String lat) {
        this.lat = lat;
    }

    @NonNull
    public String getLon() {
        return lon;
    }

    public void setLon(@NonNull String lon) {
        this.lon = lon;
    }

    @NonNull
    public String getPlace() {
        return place;
    }

    public void setPlace(@NonNull String place) {
        this.place = place;
    }

    @NonNull
    public String getPlace_desc() {
        return place_desc;
    }

    public void setPlace_desc(@NonNull String place_desc) {
        this.place_desc = place_desc;
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
    public String getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(@NonNull String owner_id) {
        this.owner_id = owner_id;
    }

    @NonNull
    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(@NonNull String img_url) {
        this.img_url = img_url;
    }

    public String getFloor_material() {
        return floor_material;
    }

    public void setFloor_material(String floor_material) {
        this.floor_material = floor_material;
    }

    public String getWall_color() {
        return wall_color;
    }

    public void setWall_color(String wall_color) {
        this.wall_color = wall_color;
    }

    public ArrayList<HomeImagesModel> getOther_images() {
        return other_images;
    }

    public void setOther_images(ArrayList<HomeImagesModel> other_images) {
        this.other_images = other_images;
    }

    @NonNull
    public String getPrice() {
        return price;
    }

    public void setPrice(@NonNull String price) {
        this.price = price;
    }

    public boolean isIs_price_negotiable() {
        return is_price_negotiable;
    }

    public void setIs_price_negotiable(boolean is_price_negotiable) {
        this.is_price_negotiable = is_price_negotiable;
    }

    public boolean isIs_first_tenancy() {
        return is_first_tenancy;
    }

    public void setIs_first_tenancy(boolean is_first_tenancy) {
        this.is_first_tenancy = is_first_tenancy;
    }

    public boolean isHasWater() {
        return hasWater;
    }

    public void setHasWater(boolean hasWater) {
        this.hasWater = hasWater;
    }

    public boolean isHasElectricity() {
        return hasElectricity;
    }

    public void setHasElectricity(boolean hasElectricity) {
        this.hasElectricity = hasElectricity;
    }

    public boolean isHasWif() {
        return hasWif;
    }

    public void setHasWif(boolean hasWif) {
        this.hasWif = hasWif;
    }

    public boolean isHasGas() {
        return hasGas;
    }

    public void setHasGas(boolean hasGas) {
        this.hasGas = hasGas;
    }

    public boolean isFurnished() {
        return isFurnished;
    }

    public void setFurnished(boolean furnished) {
        isFurnished = furnished;
    }

    public boolean isHasTiles() {
        return hasTiles;
    }

    public void setHasTiles(boolean hasTiles) {
        this.hasTiles = hasTiles;
    }

    public boolean isHasDstv() {
        return hasDstv;
    }

    public void setHasDstv(boolean hasDstv) {
        this.hasDstv = hasDstv;
    }

    public boolean isFenced() {
        return isFenced;
    }

    public void setFenced(boolean fenced) {
        isFenced = fenced;
    }

    public boolean isHasParking() {
        return hasParking;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    public boolean isHasGate() {
        return hasGate;
    }

    public void setHasGate(boolean hasGate) {
        this.hasGate = hasGate;
    }

    public boolean isGated() {
        return isGated;
    }

    public void setGated(boolean gated) {
        isGated = gated;
    }

    public boolean isHasCCTV() {
        return hasCCTV;
    }

    public void setHasCCTV(boolean hasCCTV) {
        this.hasCCTV = hasCCTV;
    }

    public boolean isHasGuard() {
        return hasGuard;
    }

    public void setHasGuard(boolean hasGuard) {
        this.hasGuard = hasGuard;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getToilets() {
        return toilets;
    }

    public void setToilets(int toilets) {
        this.toilets = toilets;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getSinks() {
        return sinks;
    }

    public void setSinks(int sinks) {
        this.sinks = sinks;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getTaps() {
        return taps;
    }

    public void setTaps(int taps) {
        this.taps = taps;
    }

    public boolean isIsinFlats() {
        return isinFlats;
    }

    public void setIsinFlats(boolean isinFlats) {
        this.isinFlats = isinFlats;
    }

    public boolean isIsinEstate() {
        return isinEstate;
    }

    public void setIsinEstate(boolean isinEstate) {
        this.isinEstate = isinEstate;
    }

    public boolean isFlatRoofed() {
        return isFlatRoofed;
    }

    public void setFlatRoofed(boolean flatRoofed) {
        isFlatRoofed = flatRoofed;
    }

    public int getFloorPos() {
        return floorPos;
    }

    public void setFloorPos(int floorPos) {
        this.floorPos = floorPos;
    }
}
