package com.keja.keja.Data.Room.Repositories;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.keja.keja.Data.Room.DAO;
import com.keja.keja.Data.Room.KejaDatabase;
import com.keja.keja.Models.HomesModel;

import java.util.List;

public class HomeRepository {
    private DAO.HomesDao homesDao;
    private LiveData<List<HomesModel>> homes;
    private LiveData<HomesModel> home;


    private KejaDatabase db;


    public HomeRepository(Application application) {
        db = KejaDatabase.getDatabase(application);
        homesDao=db.dao();
    }

    public LiveData<List<HomesModel>> getAllHomes() {
        homesDao = db.dao();
        return homesDao.fetchAllData();
    }

    public LiveData<HomesModel> getHomeByKeyId(int keyid) {
        homesDao = db.dao();
        return homesDao.getHomeByKeyID(keyid);

    }
    public LiveData<HomesModel> getHomeById(int id) {
        homesDao = db.dao();
        return homesDao.getHomeByID(id);
    }

    public LiveData<List<HomesModel>> getAllHomesByCategory(int category) {
        homesDao = db.dao();
        return homesDao.getHomeByCategoryId(category);

    }
    public LiveData<List<HomesModel>> getAllHomesByLocation(int locationid) {
        homesDao = db.dao();
        return homesDao.getHomeByLocationId(locationid);

    }
    public LiveData<List<HomesModel>> getAllHomesByPlace(String place) {
        homesDao = db.dao();
        return homesDao.getHomeByPlace(place);

    }

    public LiveData<List<HomesModel>> getAllHomesByPriceId(int priceid) {
        homesDao = db.dao();
        return homesDao.getHomeByPriceId(priceid);

    }
    public LiveData<List<HomesModel>> getHomesByOwnerName(String ownerName) {
        homesDao = db.dao();
        return homesDao.getHomeByOwnerName(ownerName);

    }
    public LiveData<List<HomesModel>> getHomesByOwnerId(int ownerID) {
        homesDao = db.dao();
        return homesDao.getHomeByOwnerId(ownerID);

    }
    public LiveData<List<HomesModel>> getHomesBySearch(String place,int priceid,int location,int cat) {
        homesDao = db.dao();
        return homesDao.getHomeBySearch(place, priceid,location,cat);

    }



    public void insert (HomesModel homesModel) {
        homesDao = db.dao();

        new insertHomeAsyncTask(homesDao).execute(homesModel);
    }
    private static class insertHomeAsyncTask extends AsyncTask<HomesModel, Void, Boolean> {

        private DAO.HomesDao mAsyncTaskDao;

        insertHomeAsyncTask(DAO.HomesDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Boolean doInBackground(final HomesModel... params) {
             mAsyncTaskDao.insertOnlySingleHome(params[0]);
             return true;

        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);


        }
    }


}
