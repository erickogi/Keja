package com.keja.keja.Data.Room.Repositories;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.keja.keja.Data.Room.DAO;
import com.keja.keja.Data.Room.KejaDatabase;
import com.keja.keja.Models.LocationsClass.County;

import java.util.List;

public class CountyRepository {
    private DAO.CountyDao countyDao;
    private LiveData<List<County>> countys;
    private LiveData<County> county;


    private KejaDatabase db;


    public CountyRepository(Application application) {
        db = KejaDatabase.getDatabase(application);
        countyDao=db.daocount();
    }

    public LiveData<List<County>> getAllCountys() {
        countyDao = db.daocount();
        return countyDao.fetchAllData();
    }

    public LiveData<County> getCountyByKeyId(int keyid) {
        countyDao = db.daocount();
        return countyDao.getCOuntyByKeyID(keyid);

    }
    public LiveData<County> getCountyById(int id) {
        countyDao = db.daocount();
        return countyDao.getCounty(id);
    }

  
    public LiveData<List<County>> getAllCountysByName(String name) {
        countyDao = db.daocount();
        return countyDao.getCountyByName(name);

    }



    public void insert (County countysModel) {
        countyDao = db.daocount();

        new CountyRepository.insertCountyAsyncTask(countyDao).execute(countysModel);
    }
    private static class insertCountyAsyncTask extends AsyncTask<County, Void, Boolean> {

        private DAO.CountyDao mAsyncTaskDao;

        insertCountyAsyncTask(DAO.CountyDao daocount) {
            mAsyncTaskDao = daocount;
        }

        @Override
        protected Boolean doInBackground(final County... params) {
            mAsyncTaskDao.insertOnlySingleCounty(params[0]);
            return true;

        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);


        }
    }
}
