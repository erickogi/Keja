package com.keja.keja.Adapters;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.keja.keja.Models.HomesByCategories;
import com.keja.keja.Models.HomesModel;
import com.keja.keja.R;

import java.util.ArrayList;
import java.util.List;

public class HomesListBaseAdapter extends RecyclerView.Adapter<HomesListBaseAdapter.WordViewHolder> {

    class WordViewHolder extends RecyclerView.ViewHolder {
        private final TextView title;
        private final  RecyclerView recycler_view_list;

        private WordViewHolder(View itemView) {
            super(itemView);
            recycler_view_list=itemView.findViewById(R.id.recyclerView);
            title = itemView.findViewById(R.id.title);
        }
    }

    private  HomesListAdapter itemListDataAdapter;
    private final LayoutInflater mInflater;
    private Context context;
    private List<HomesByCategories> homesByCategories; // Cached copy of words

    public HomesListBaseAdapter(Context context) {
        this.context=context;
        mInflater = LayoutInflater.from(context); }

    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.item_homes_base_recyclerview, parent, false);
        return new WordViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        if (homesByCategories != null) {
            HomesByCategories current = homesByCategories.get(position);
            holder.title.setText(current.getCategoryName());

            List<HomesModel> singleSectionItems = current.getHomesModels();


            itemListDataAdapter = new HomesListAdapter(context);


            itemListDataAdapter.notifyDataSetChanged();
            itemListDataAdapter.setHomes(singleSectionItems);


            holder.recycler_view_list.setHasFixedSize(true);
            holder.recycler_view_list.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
            holder.recycler_view_list.setAdapter(itemListDataAdapter);


            holder.recycler_view_list.setNestedScrollingEnabled(false);





        } else {
            // Covers the case of data not being ready yet.
            holder.title.setText("No Title");
        }

    }

   public void setHomesByCategories(List<HomesByCategories> words){
        homesByCategories = words;
        notifyDataSetChanged();
    }

    // getItemCount() is called many times, and when it is first called,
    // homesByCategories has not been updated (means initially, it's null, and we can't return null).
    @Override
    public int getItemCount() {
        if (homesByCategories != null)
            return homesByCategories.size();
        else return 0;
    }
}
