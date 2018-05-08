package com.keja.keja.Data.Room.Repositories;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.keja.keja.Data.Room.DAO;
import com.keja.keja.Data.Room.KejaDatabase;
import com.keja.keja.Models.LocationsClass;
import com.keja.keja.Models.LocationsClass.Country;

import java.util.List;

public class CountryRepository {
    private DAO.CountryDao countryDao;
    private LiveData<List<LocationsClass.Country>> countrys;
    private LiveData<LocationsClass.Country> country;


    private KejaDatabase db;


    public CountryRepository(Application application) {
        db = KejaDatabase.getDatabase(application);
        countryDao=db.daocountry();
    }

    public LiveData<List<LocationsClass.Country>> getAllCountrys() {
        countryDao = db.daocountry();
        return countryDao.fetchAllData();
    }

    public LiveData<LocationsClass.Country> getCountryByKeyId(int keyid) {
        countryDao = db.daocountry();
        return countryDao.getCOuntryByKeyID(keyid);

    }
    public LiveData<LocationsClass.Country> getCountryById(int id) {
        countryDao = db.daocountry();
        return countryDao.getCountry(id);
    }


    public LiveData<List<LocationsClass.Country>> getAllCountrysByName(String name) {
        countryDao = db.daocountry();
        return countryDao.getCountryByName(name);

    }



    public void insert (LocationsClass.Country countrysModel) {
        countryDao = db.daocountry();

        new CountryRepository.insertCountryAsyncTask(countryDao).execute(countrysModel);
    }
    private static class insertCountryAsyncTask extends AsyncTask<LocationsClass.Country, Void, Boolean> {

        private DAO.CountryDao mAsyncTaskDao;

        insertCountryAsyncTask(DAO.CountryDao daocountry) {
            mAsyncTaskDao = daocountry;
        }

        @Override
        protected Boolean doInBackground(final LocationsClass.Country... params) {
            mAsyncTaskDao.insertOnlySingleCountry(params[0]);
            return true;

        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);


        }
    }
}
