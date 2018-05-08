package com.keja.keja.Data.Room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;

import com.keja.keja.Models.Categories;
import com.keja.keja.Models.HomesModel;
import com.keja.keja.Models.LocationModel;
import com.keja.keja.Models.LocationsClass;
import com.keja.keja.Models.OwnersModel;
import com.keja.keja.Models.PriceCategoriesModel;

@Database(entities =  {HomesModel.class,Categories.class,OwnersModel.class,PriceCategoriesModel.class, LocationsClass.County.class,
        LocationsClass.City.class, LocationsClass.Country.class, LocationsClass.Town.class}, version = 2)

//@TypeConverters({Converters.class})
public abstract class KejaDatabase extends RoomDatabase {
    public abstract DAO.HomesDao dao();
    public abstract DAO.CategoriesDao daocategories();
    public abstract DAO.OwnersModelDao daoowners();
    public abstract DAO.PriceCategories daopricecategories();
    public abstract DAO.CountyDao daocount();
    public abstract DAO.City daocity();
    public abstract DAO.CountryDao daocountry();
    public abstract DAO.TownDao daotown();

    private static KejaDatabase INSTANCE;

    public static KejaDatabase getDatabase(final Context context) {

        if (INSTANCE == null) {
            synchronized (KejaDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            KejaDatabase.class, "keja_db")
                            .build();

                }
            }
        }
        return INSTANCE;
    }
}
