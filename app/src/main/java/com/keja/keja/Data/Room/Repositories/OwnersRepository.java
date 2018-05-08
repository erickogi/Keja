package com.keja.keja.Data.Room.Repositories;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.keja.keja.Data.Room.DAO;
import com.keja.keja.Data.Room.KejaDatabase;
import com.keja.keja.Models.OwnersModel;

import java.util.List;

public class OwnersRepository {
    private DAO.OwnersModelDao ownersDao;
    private LiveData<List<OwnersModel>> owners;
    private LiveData<OwnersModel> owner;


    private KejaDatabase db;


    public OwnersRepository(Application application) {
        db = KejaDatabase.getDatabase(application);
        ownersDao=db.daoowners();
    }

    public LiveData<List<OwnersModel>> getAllOwners() {
        ownersDao = db.daoowners();
        return ownersDao.fetchAllData();
    }

    public LiveData<OwnersModel> getOwnerByKeyId(int keyid) {
        ownersDao = db.daoowners();
        return ownersDao.getOwnerByKeyID(keyid);

    }
    public LiveData<OwnersModel> getOwnerById(int id) {
        ownersDao = db.daoowners();
        return ownersDao.getOwnersModel(id);
    }


    public LiveData<List<OwnersModel>> getAllOwnersByName(String name) {
        ownersDao = db.daoowners();
        return ownersDao.getOwnersModelByName(name);

    }



    public void insert (OwnersModel ownersModel) {
        ownersDao = db.daoowners();

        new insertOwnerAsyncTask(ownersDao).execute(ownersModel);
    }
    private static class insertOwnerAsyncTask extends AsyncTask<OwnersModel, Void, Boolean> {

        private DAO.OwnersModelDao mAsyncTaskDao;

        insertOwnerAsyncTask(DAO.OwnersModelDao daoowners) {
            mAsyncTaskDao = daoowners;
        }

        @Override
        protected Boolean doInBackground(final OwnersModel... params) {
             mAsyncTaskDao.insertOnlySingleOwnersModel(params[0]);
             return true;

        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);


        }
    }


}
