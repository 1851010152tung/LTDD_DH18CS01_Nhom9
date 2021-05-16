package com.example.appflorentinobeautieofficial.adapter;

import android.content.Context;
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

public class HairCareAdapter extends RecyclerView.Adapter<HairCareAdapter.HairCareViewHolder> {

    List<NewProduct> mListHairCare;

    public HairCareAdapter(List<NewProduct> mListHairCare) {
        this.mListHairCare = mListHairCare;
    }

    @NonNull

    @Override
    public HairCareViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate((R.layout.activity_hair_care_item),parent,false);
        return new HairCareViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HairCareAdapter.HairCareViewHolder holder, int position) {

        NewProduct newProduct =mListHairCare.get(position);

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
        if(mListHairCare != null){
            return mListHairCare.size();}
        return 0;
    }

    public class HairCareViewHolder extends RecyclerView.ViewHolder{
        ImageView itemImage;
        TextView itemPrice, itemName;
        RatingBar itemRating;

        public HairCareViewHolder(@NonNull  View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.hair_care_img);
            itemName = itemView.findViewById(R.id.hair_care_name);
            itemPrice = itemView.findViewById(R.id.hair_care_price);
            itemRating = itemView.findViewById(R.id.hair_care_ratingbar);
        }
    }
}
