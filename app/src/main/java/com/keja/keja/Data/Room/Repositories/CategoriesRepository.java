package com.keja.keja.Data.Room.Repositories;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.keja.keja.Data.Room.DAO;
import com.keja.keja.Data.Room.KejaDatabase;
import com.keja.keja.Models.Categories;

import java.util.List;

public class CategoriesRepository {
    private DAO.CategoriesDao categoriesdao;
    private LiveData<List<Categories>> categkories;
    private LiveData<Categories> home;


    private KejaDatabase db;


    public CategoriesRepository(Application application) {
        db = KejaDatabase.getDatabase(application);
        categoriesdao=db.daocategories();
    }

    public LiveData<List<Categories>> getAllCategories() {
        categoriesdao = db.daocategories();
        return categoriesdao.fetchAllData();
    }

    public LiveData<Categories> getCategoriesByKeyId(int keyid) {
        categoriesdao = db.daocategories();
        return categoriesdao.getCategoryByKeyID(keyid);

    }
    public LiveData<Categories> getCategoriesById(int id) {
        categoriesdao = db.daocategories();
        return categoriesdao.getCategory(id);
    }

    public LiveData<List<Categories>> getAllCategoriesByCategory(int category) {
        categoriesdao = db.daocategories();
        return categoriesdao.getCategoriesByTitle(category);

    }



    public void insert (Categories categoriesdaoModel) {
        categoriesdao = db.daocategories();

        new CategoriesRepository.insertCategoriesAsyncTask(categoriesdao).execute(categoriesdaoModel);
    }
    private static class insertCategoriesAsyncTask extends AsyncTask<Categories, Void, Boolean> {

        private DAO.CategoriesDao mAsyncTaskDao;

        insertCategoriesAsyncTask(DAO.CategoriesDao daocategories) {
            mAsyncTaskDao = daocategories;
        }

        @Override
        protected Boolean doInBackground(final Categories... params) {
            mAsyncTaskDao.insertOnlySingleCategory(params[0]);
            return true;

        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);


        }
    }

}
