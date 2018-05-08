package com.keja.keja.Data.Room.Repositories;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.keja.keja.Data.Room.DAO;
import com.keja.keja.Data.Room.KejaDatabase;
import com.keja.keja.Models.LocationsClass.City;

import java.util.List;

public class CityRepository {
    private DAO.City cityDao;
    private LiveData<List<City>> cities;
    private LiveData<City> citiy;


    private KejaDatabase db;


    public CityRepository(Application application) {
        db = KejaDatabase.getDatabase(application);
        cityDao=db.daocity();
    }

    public LiveData<List<City>> getAllCitys() {
        cityDao = db.daocity();
        return cityDao.fetchAllData();
    }

    public LiveData<City> getCityByKeyId(int keyid) {
        cityDao = db.daocity();
        return cityDao.getCityByKeyID(keyid);

    }
    public LiveData<City> getCityById(int id) {
        cityDao = db.daocity();
        return cityDao.getCity(id);
    }

  
    public LiveData<List<City>> getAllCitysByName(String name) {
        cityDao = db.daocity();
        return cityDao.getCityByName(name);

    }



    public void insert (City citiesModel) {
        cityDao = db.daocity();

        new CityRepository.insertCityAsyncTask(cityDao).execute(citiesModel);
    }
    private static class insertCityAsyncTask extends AsyncTask<City, Void, Boolean> {

        private DAO.City mAsyncTaskDao;

        insertCityAsyncTask(DAO.City daocity) {
            mAsyncTaskDao = daocity;
        }

        @Override
        protected Boolean doInBackground(final City... params) {
            mAsyncTaskDao.insertOnlySingleCity(params[0]);
            return true;

        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);


        }
    }
}
