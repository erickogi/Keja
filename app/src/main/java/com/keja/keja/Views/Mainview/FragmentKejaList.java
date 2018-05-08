package com.keja.keja.Views.Mainview;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.keja.keja.Adapters.HomesListBaseAdapter;
import com.keja.keja.Data.Room.DAO;
import com.keja.keja.Data.Room.KejaDatabase;
import com.keja.keja.Data.Room.ViewModels.HomesViewModel;
import com.keja.keja.Models.HomesByCategories;
import com.keja.keja.Models.HomesModel;
import com.keja.keja.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FragmentKejaList extends Fragment {
    HomesViewModel viewModel;

    private List<HomesByCategories> homesByCategories;
    private HomesListBaseAdapter adapter;
    private View view;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home_list,container,false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        this.view=view;
        viewModel= ViewModelProviders.of(this).get(HomesViewModel.class);

        initview();
        initData();

    }

    void  initview(){
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        adapter = new HomesListBaseAdapter(getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


    }
    private void initData() {



        viewModel.getAllHomes().observe(this, new Observer<List<HomesModel>>() {
            @Override
            public void onChanged(@Nullable final List<HomesModel> homesModels) {
                // Update the cached copy of the words in the adapter.


                homesByCategories=new ArrayList<>();
                if(homesModels!=null&&homesModels.size()>0) {

                    Log.d("isnotnull",""+homesModels.size());
                    HashMap<Integer,String> daa=new HashMap<>();

                    for(HomesModel homesModel:homesModels){
                        if(daa.containsKey(homesModel.getCategory_id())){


                        }else{
                            daa.put(homesModel.getCategory_id(), homesModel.getTitle());
                            HomesByCategories homesByCategory = new HomesByCategories();
                            homesByCategory.setCategoryID(homesModel.getCategory_id());
                            homesByCategory.setCategoryName(homesModel.getCategory());

                            List<HomesModel> homesModels1=new ArrayList<>();
                            for(HomesModel homesModel1:homesModels) {


                                if(homesModel1.getCategory_id()==homesModel.getCategory_id()){
                                    homesModels1.add(homesModel1);
                                }


                            }
                            homesByCategory.setHomesModels(homesModels1);

                            homesByCategories.add(homesByCategory);

                        }
                    }


                    adapter.setHomesByCategories(homesByCategories);

                }else {
                    generateData();
                }
            }
        });

    }
    public void generateData(){

        for(int a=0;a<10;a++){
            String catname="categor"+a;
            int categoryid=a+1;


            for(int b=0;b<10;b++){
                HomesModel homesModel=new HomesModel();
                //HomesModel homesModel=new HomesModel();
                homesModel.setId(a+b);
                homesModel.setCategory(catname);
                homesModel.setCategory_id(categoryid);
                homesModel.setPlace("place "+(a+b));
                homesModel.setPrice_category_id(a+b);
                homesModel.setLocation_id(a+b);
                homesModel.setTitle("title "+(a+b));
                homesModel.setShort_desc("short desc "+(a+b));
                homesModel.setLong_desc("long desc "+(a+b));
                homesModel.setLat("lat"+(a+b));
                homesModel.setLon("lon"+(a+b));
                homesModel.setPlace_desc("place desc"+(a+b));
                homesModel.setOwner_id(""+(a+b));
                homesModel.setOwner_email("owner email"+(a+b));
                homesModel.setOwner_name("owner name"+(a+b));
                homesModel.setOwner_phone("owner phone"+(a+b));
                homesModel.setImg_url("http://dashboard.photozuri.com/public/img/products/15addba0a58ce2.png");
                homesModel.setPrice("10,000 Ksh");

                viewModel.insert(homesModel);

               // initData();
            }


        }


    }
    @Override
    public void onResume() {
        super.onResume();
    }
}
