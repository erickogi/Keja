package com.keja.keja.Data.Room;

import android.arch.persistence.room.TypeConverter;
import android.location.Location;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.keja.keja.Models.HomeImagesModel;
import com.keja.keja.Models.HomesModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Converters {


    static Gson gson = new Gson();

    @TypeConverter
    public static List<HomesModel> stringToHomeList(String data) {
        if (data == null) {
            return Collections.emptyList();
        }

        Type listType = new TypeToken<List<HomesModel>>() {}.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String HomeListToString(ArrayList<HomesModel> homesModels) {
        return gson.toJson(homesModels);
    }


    @TypeConverter
    public static ArrayList<HomeImagesModel> stringToImageList(String data) {
        if (data == null) {
            return new ArrayList<>();
        }

        Type listType = new TypeToken<ArrayList<HomeImagesModel>>() {}.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String HomeImgsToString(ArrayList<HomeImagesModel> homeImagesModels) {
        return gson.toJson(homeImagesModels);
    }

    @TypeConverter
    public static Long fromDate(Date date) {
        if (date==null) {
            return(null);
        }

        return(date.getTime());
    }

    @TypeConverter
    public static Date toDate(Long millisSinceEpoch) {
        if (millisSinceEpoch==null) {
            return(null);
        }

        return(new Date(millisSinceEpoch));
    }

    @TypeConverter
    public static String fromLocation(Location location) {
        if (location==null) {
            return(null);
        }

        return(String.format(Locale.US, "%f,%f", location.getLatitude(),
                location.getLongitude()));
    }

    @TypeConverter
    public static Location toLocation(String latlon) {
        if (latlon==null) {
            return(null);
        }

        String[] pieces=latlon.split(",");
        Location result=new Location("");

        result.setLatitude(Double.parseDouble(pieces[0]));
        result.setLongitude(Double.parseDouble(pieces[1]));

        return(result);
    }

}
