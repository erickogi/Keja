package com.keja.keja.Data.Room.Repositories;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.keja.keja.Data.Room.DAO;
import com.keja.keja.Data.Room.KejaDatabase;
import com.keja.keja.Models.LocationsClass.Town;

import java.util.List;

public class TownRepository {
    private DAO.TownDao townDao;
    private LiveData<List<Town>> towns;
    private LiveData<Town> town;


    private KejaDatabase db;


    public TownRepository(Application application) {
        db = KejaDatabase.getDatabase(application);
        townDao=db.daotown();
    }

    public LiveData<List<Town>> getAllTowns() {
        townDao = db.daotown();
        return townDao.fetchAllData();
    }

    public LiveData<Town> getTownByKeyId(int keyid) {
        townDao = db.daotown();
        return townDao.getTownByKeyID(keyid);

    }
    public LiveData<Town> getTownById(int id) {
        townDao = db.daotown();
        return townDao.getTown(id);
    }

  
    public LiveData<List<Town>> getAllTownsByName(String name) {
        townDao = db.daotown();
        return townDao.getTownByName(name);

    }



    public void insert (Town townsModel) {
        townDao = db.daotown();

        new TownRepository.insertTownAsyncTask(townDao).execute(townsModel);
    }
    private static class insertTownAsyncTask extends AsyncTask<Town, Void, Boolean> {

        private DAO.TownDao mAsyncTaskDao;

        insertTownAsyncTask(DAO.TownDao daotown) {
            mAsyncTaskDao = daotown;
        }

        @Override
        protected Boolean doInBackground(final Town... params) {
            mAsyncTaskDao.insertOnlySingleTown(params[0]);
            return true;

        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);


        }
    }
}
