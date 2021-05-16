package com.example.appflorentinobeautieofficial.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appflorentinobeautieofficial.R;
import com.example.appflorentinobeautieofficial.model.NewProduct;

import java.util.List;

public class OthersAdapter extends RecyclerView.Adapter<OthersAdapter.OthersViewHolder> {
    List<NewProduct> mListOthers;

    public OthersAdapter(List<NewProduct> mListOthers) {
        this.mListOthers = mListOthers;
    }

    @NonNull
    @Override
    public OthersAdapter.OthersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate((R.layout.activity_others_item),parent,false);
        return new OthersViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OthersAdapter.OthersViewHolder holder, int position) {

        NewProduct newProduct =mListOthers.get(position);

        if(newProduct == null){
            return;
        }
        else{
            holder.itemImage.setImageResource(newProduct.getImageUrl());
            holder.itemName.setText(newProduct.getName());
            holder.itemPrice.setText(newProduct.getPrice());
            holder.itemRating.setRating(Float.parseFloat(newProduct.getRating()));}
    }

    @Override
    public int getItemCount() {

        if(mListOthers != null){
            return mListOthers.size();}
        return 0;
    }

    public class OthersViewHolder extends RecyclerView.ViewHolder{
        ImageView itemImage;
        TextView itemPrice, itemName;
        RatingBar itemRating;

        public OthersViewHolder(@NonNull  View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.others_img);
            itemName = itemView.findViewById(R.id.others_name);
            itemPrice = itemView.findViewById(R.id.others_price);
            itemRating = itemView.findViewById(R.id.others_ratingbar);
        }
    }
}
