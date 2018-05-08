package com.keja.keja.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.keja.keja.Models.HomesModel;
import com.keja.keja.R;

import java.util.List;

public class HomesListAdapter extends RecyclerView.Adapter<HomesListAdapter.WordViewHolder> {

    class WordViewHolder extends RecyclerView.ViewHolder {
        //private final TextView title;
        private final TextView price;
        private final TextView place;
        private final ImageView imageView;

        private WordViewHolder(View itemView) {
            super(itemView);
            price=itemView.findViewById(R.id.txt_price);
            place=itemView.findViewById(R.id.txt_place);
            imageView=itemView.findViewById(R.id.img);
            //title = itemView.findViewById(R.id.title);
        }
    }

    private final LayoutInflater mInflater;
    private List<HomesModel> homes; // Cached copy of words
    private Context context;

    HomesListAdapter(Context context) {
        this.context=context;
        mInflater = LayoutInflater.from(context); }

    @Override
    public HomesListAdapter.WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.item_home, parent, false);
        return new HomesListAdapter.WordViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(HomesListAdapter.WordViewHolder holder, int position) {
        if (homes != null) {
            HomesModel current = homes.get(position);
            holder.place.setText(current.getPlace());
            holder.price.setText(current.getPrice());

            Log.d("logima", current.getImg_url());
            Glide.with(context)
                    // .load(com.erickogi14gmail.photozuri.NetworkUtills.ApiConstants.categoryimgurl + image.getImageurl())
                    .load(current.getImg_url())
                    .apply(new RequestOptions()
                            .placeholder(R.drawable.ic_home)
                            .error(R.drawable.ic_more_vert_black_24dp)
                            .centerCrop().diskCacheStrategy(DiskCacheStrategy.RESOURCE))
                    .into(holder.imageView);
//            Glide.with(context).load(current.getImg_url()).apply( new RequestOptions()
//                    .placeholder(R.drawable.ic_home)
//                    .error(R.drawable.ic_more_vert_black_24dp)
//                    .centerCrop().diskCacheStrategy(DiskCacheStrategy.RESOURCE));

        } else {
            // Covers the case of data not being ready yet.
            holder.price.setText("No Price");
        }
    }

    void setHomes(List<HomesModel> words){
        homes = words;
        notifyDataSetChanged();
    }

    // getItemCount() is called many times, and when it is first called,
    // homes has not been updated (means initially, it's null, and we can't return null).
    @Override
    public int getItemCount() {
        if (homes != null)
            return homes.size();
        else return 0;
    }
}
