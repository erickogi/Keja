package com.keja.keja.Data.Room.Repositories;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.keja.keja.Data.Room.DAO;
import com.keja.keja.Data.Room.KejaDatabase;
import com.keja.keja.Models.PriceCategoriesModel;

import java.util.List;

public class PriceCategoriesRepostory {
    private DAO.PriceCategories priceCategoriesDao;
    private LiveData<List<PriceCategoriesModel>> priceCategoriesModels;
    private LiveData<PriceCategoriesModel> priceCategoriesModel;


    private KejaDatabase db;


    public PriceCategoriesRepostory(Application application) {
        db = KejaDatabase.getDatabase(application);
        priceCategoriesDao=db.daopricecategories();
    }

    public LiveData<List<PriceCategoriesModel>> getAllPricecategories() {
        priceCategoriesDao = db.daopricecategories();
        return priceCategoriesDao.fetchAllData();
    }

    public LiveData<PriceCategoriesModel> getPricecategoryByKeyId(int keyid) {
        priceCategoriesDao = db.daopricecategories();
        return priceCategoriesDao.getPriceCategoriesByKeyID(keyid);

    }
    public LiveData<PriceCategoriesModel> getPricecategoryById(int id) {
        priceCategoriesDao = db.daopricecategories();
        return priceCategoriesDao.getPriceCategories(id);
    }


    public LiveData<List<PriceCategoriesModel>> getAllPricecategoriesByPrice(String title) {
        priceCategoriesDao = db.daopricecategories();
        return priceCategoriesDao.getPriceCategoriesByTitle(title);

    }




    public void insert (PriceCategoriesModel priceCategoriesModelsModel) {
        priceCategoriesDao = db.daopricecategories();

        new PriceCategoriesRepostory.insertPricecategoryAsyncTask(priceCategoriesDao).execute(priceCategoriesModelsModel);
    }
    private static class insertPricecategoryAsyncTask extends AsyncTask<PriceCategoriesModel, Void, Boolean> {

        private DAO.PriceCategories mAsyncTaskDao;

        insertPricecategoryAsyncTask(DAO.PriceCategories daopricecategories) {
            mAsyncTaskDao = daopricecategories;
        }

        @Override
        protected Boolean doInBackground(final PriceCategoriesModel... params) {
            mAsyncTaskDao.insertOnlySinglePriceCategories(params[0]);
            return true;

        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);


        }
    }
}
