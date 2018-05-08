package com.keja.keja.Data.Room.ViewModels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.keja.keja.Data.Room.Repositories.HomeRepository;
import com.keja.keja.Models.HomesModel;

import java.util.List;

public class HomesViewModel extends AndroidViewModel {
    private HomeRepository mRepository;


    private LiveData<List<HomesModel>> homes;


    public HomesViewModel (Application application) {
        super(application);
        mRepository = new HomeRepository(application);
        homes = mRepository.getAllHomes();
    }


    public void insert(HomesModel homesModel) { mRepository.insert(homesModel); }

    public LiveData<List<HomesModel>> getAllHomes() { return homes; }
    public LiveData<List<HomesModel>> getAllHomesByCategory(int id) { return mRepository.getAllHomesByCategory(id); }
    public LiveData<List<HomesModel>> getAllHomesByLocation(int id) { return mRepository.getAllHomesByLocation(id); }
    public LiveData<List<HomesModel>> getAllHomesByPlace(String place) { return mRepository.getAllHomesByPlace(place); }
    public LiveData<List<HomesModel>> getAllHomesByPriceId(int id) { return mRepository.getAllHomesByPriceId(id); }
    public LiveData<List<HomesModel>> getAllHomesByOwnerId(int id) { return mRepository.getHomesByOwnerId(id); }
    public LiveData<List<HomesModel>> getAllHomesByOwnerName(String name) { return mRepository.getHomesByOwnerName(name); }


    LiveData<HomesModel> getHomeById(int id) { return mRepository.getHomeById(id); }
    LiveData<HomesModel> getHomeByKeyId(int id) { return mRepository.getHomeByKeyId(id); }




}
