package com.keja.keja.Data.Room;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.keja.keja.Models.Categories;
import com.keja.keja.Models.HomesModel;
import com.keja.keja.Models.LocationsClass;
import com.keja.keja.Models.OwnersModel;
import com.keja.keja.Models.PriceCategoriesModel;

import java.util.List;

import static com.keja.keja.Models.LocationsClass.*;

public class DAO {

    @Dao
    public interface HomesDao {
        @Insert
        void insertMultipleHomes(HomesModel... universities);

        @Insert
        void insertMultipleListHomes(List<HomesModel> universities);

        @Insert
        void insertOnlySingleHome(HomesModel university);




        @Query("SELECT * FROM HOMES")
        LiveData<List<HomesModel>> fetchAllData();

        @Query("SELECT * FROM HOMES WHERE KEYID =:keyid")
        LiveData<HomesModel> getHomeByKeyID(int keyid);

        @Query("SELECT * FROM HOMES WHERE id =:id")
        LiveData<HomesModel> getHomeByID(int id);




        @Query("SELECT * FROM HOMES WHERE location_id =:locationid")
        LiveData<List<HomesModel>> getHomeByLocationId(int locationid);


        @Query("SELECT * FROM HOMES WHERE category_id =:category")
        LiveData<List<HomesModel>> getHomeByCategoryId(int category);


        @Query("SELECT * FROM HOMES WHERE price_category_id =:priceid")
        LiveData<List<HomesModel>> getHomeByPriceId(int priceid);

        @Query("SELECT * FROM HOMES WHERE place LIKE :keyid")
        LiveData<List<HomesModel>> getHomeByPlace(String keyid);

        @Query("SELECT * FROM HOMES WHERE owner_name LIKE :owner_name")
        LiveData<List<HomesModel>> getHomeByOwnerName(String owner_name);

        @Query("SELECT * FROM HOMES WHERE owner_id LIKE :owner_id")
        LiveData<List<HomesModel>> getHomeByOwnerId(int owner_id);

        @Query("SELECT * FROM HOMES WHERE place LIKE :place AND price_category_id =:price_category AND location_id = :location AND category_id=:cat_id ")
        LiveData<List<HomesModel>> getHomeBySearch(String place,int price_category,int location,int cat_id);



        @Update
        void updateRecord(HomesModel homesModel);

        @Delete
        void deleteRecord(HomesModel homesModel);;
    }

    @Dao
    public interface CategoriesDao {
        @Insert
        void insertMultipleCategories(Categories... categories);

        @Insert
        void insertMultipleListCategories(List<Categories> categories);

        @Insert
        void insertOnlySingleCategory(Categories c);




        @Query("SELECT * FROM Categories")
        LiveData<List<Categories>> fetchAllData();

        @Query("SELECT * FROM Categories WHERE KEYID =:keyid")
        LiveData<Categories> getCategoryByKeyID(int keyid);

        @Query("SELECT * FROM Categories WHERE id =:id")
        LiveData<Categories> getCategory(int id);




        @Query("SELECT * FROM Categories WHERE title =:title")
        LiveData<List<Categories>> getCategoriesByTitle(int title);





        @Update
        void updateRecord(Categories categories);

        @Delete
        void deleteRecord(Categories categories);;
    }


    @Dao
    public interface PriceCategories {
        @Insert
        void insertMultiplePriceCategories(PriceCategoriesModel... categories);

        @Insert
        void insertMultipleListPriceCategories(List<PriceCategoriesModel> categories);

        @Insert
        void insertOnlySinglePriceCategories(PriceCategoriesModel c);




        @Query("SELECT * FROM PriceCategories")
        LiveData<List<PriceCategoriesModel>> fetchAllData();

        @Query("SELECT * FROM PriceCategories WHERE KEYID =:keyid")
        LiveData<PriceCategoriesModel> getPriceCategoriesByKeyID(int keyid);

        @Query("SELECT * FROM PriceCategories WHERE id =:id")
        LiveData<PriceCategoriesModel> getPriceCategories(int id);




        @Query("SELECT * FROM PriceCategories WHERE price =:price")
        LiveData<List<PriceCategoriesModel>> getPriceCategoriesByTitle(String price);





        @Update
        void updateRecord(PriceCategoriesModel categories);

        @Delete
        void deleteRecord(PriceCategoriesModel categories);;
    }


    @Dao
    public interface CountryDao {
        @Insert
        void insertMultipleCountry(LocationsClass.Country... countrys);

        @Insert
        void insertMultipleListCountry(List<LocationsClass.Country> countries);

        @Insert
        void insertOnlySingleCountry(LocationsClass.Country c);




        @Query("SELECT * FROM Country")
        LiveData<List<LocationsClass.Country>> fetchAllData();

        @Query("SELECT * FROM Country WHERE KEYID =:keyid")
        LiveData<LocationsClass.Country> getCOuntryByKeyID(int keyid);

        @Query("SELECT * FROM Country WHERE id =:id")
        LiveData<LocationsClass.Country> getCountry(int id);




        @Query("SELECT * FROM Country WHERE  name LIKE :name")
        LiveData<List<LocationsClass.Country>> getCountryByName(String name);





        @Update
        void updateRecord(LocationsClass.Country categories);

        @Delete
        void deleteRecord(LocationsClass.Country categories);;
    }


    @Dao
    public interface CountyDao {
        @Insert
        void insertMultipleCounty(LocationsClass.County... countrys);

        @Insert
        void insertMultipleListCounty(List<LocationsClass.County> countries);

        @Insert
        void insertOnlySingleCounty(LocationsClass.County c);




        @Query("SELECT * FROM County")
        LiveData<List<LocationsClass.County>> fetchAllData();

        @Query("SELECT * FROM County WHERE KEYID =:keyid")
        LiveData<LocationsClass.County> getCOuntyByKeyID(int keyid);

        @Query("SELECT * FROM County WHERE id =:id")
        LiveData<LocationsClass.County> getCounty(int id);




        @Query("SELECT * FROM County WHERE  name LIKE :name")
        LiveData<List<LocationsClass.County>> getCountyByName(String name);





        @Update
        void updateRecord(LocationsClass.County categories);

        @Delete
        void deleteRecord(LocationsClass.County categories);;
    }



    @Dao
    public interface City {
        @Insert
        void insertMultipleCity(LocationsClass.City... countrys);

        @Insert
        void insertMultipleListCity(List<LocationsClass.City> countries);

        @Insert
        void insertOnlySingleCity(LocationsClass.City c);




        @Query("SELECT * FROM City")
        LiveData<List<LocationsClass.City>> fetchAllData();

        @Query("SELECT * FROM City WHERE KEYID =:keyid")
        LiveData<LocationsClass.City> getCityByKeyID(int keyid);

        @Query("SELECT * FROM City WHERE id =:id")
        LiveData<LocationsClass.City> getCity(int id);




        @Query("SELECT * FROM City WHERE  name LIKE :name")
        LiveData<List<LocationsClass.City>> getCityByName(String name);





        @Update
        void updateRecord(LocationsClass.City categories);

        @Delete
        void deleteRecord(LocationsClass.City categories);;
    }

    @Dao
    public interface TownDao {
        @Insert
        void insertMultipleTown(LocationsClass.Town... countrys);

        @Insert
        void insertMultipleListTown(List<LocationsClass.Town> countries);

        @Insert
        void insertOnlySingleTown(LocationsClass.Town c);




        @Query("SELECT * FROM Town")
        LiveData<List<LocationsClass.Town>> fetchAllData();

        @Query("SELECT * FROM Town WHERE KEYID =:keyid")
        LiveData<LocationsClass.Town> getTownByKeyID(int keyid);

        @Query("SELECT * FROM Town WHERE id =:id")
        LiveData<LocationsClass.Town> getTown(int id);




        @Query("SELECT * FROM Town WHERE  name LIKE :name")
        LiveData<List<LocationsClass.Town>> getTownByName(String name);





        @Update
        void updateRecord(LocationsClass.Town categories);

        @Delete
        void deleteRecord(LocationsClass.Town categories);;
    }


    @Dao
    public interface OwnersModelDao {
        @Insert
        void insertMultipleOwnersModel(OwnersModel... countrys);

        @Insert
        void insertMultipleListOwnersModel(List<OwnersModel> countries);

        @Insert
        void insertOnlySingleOwnersModel(OwnersModel c);




        @Query("SELECT * FROM OwnersModel")
        LiveData<List<OwnersModel>> fetchAllData();

        @Query("SELECT * FROM OwnersModel WHERE KEYID =:keyid")
        LiveData<OwnersModel> getOwnerByKeyID(int keyid);

        @Query("SELECT * FROM OwnersModel WHERE id =:id")
        LiveData<OwnersModel> getOwnersModel(int id);




        @Query("SELECT * FROM OwnersModel WHERE  owner_name LIKE :name")
        LiveData<List<OwnersModel>> getOwnersModelByName(String name);





        @Update
        void updateRecord(OwnersModel categories);

        @Delete
        void deleteRecord(OwnersModel categories);;
    }
}
