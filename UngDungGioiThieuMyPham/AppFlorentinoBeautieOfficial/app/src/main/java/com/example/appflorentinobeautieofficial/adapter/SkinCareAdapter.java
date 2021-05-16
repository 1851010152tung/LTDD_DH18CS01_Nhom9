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

public class SkinCareAdapter extends RecyclerView.Adapter<SkinCareAdapter.SkinCareViewHolder> {

    private List<NewProduct> mListSkinCare;

    public SkinCareAdapter(List<NewProduct> mListSkinCare) {

        this.mListSkinCare = mListSkinCare;
    }
    @NonNull
    @Override
    public SkinCareViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate((R.layout.activity_skin_care_item),
                parent, false);
        return new SkinCareViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SkinCareAdapter.SkinCareViewHolder holder, int position) {

        NewProduct newProduct = mListSkinCare.get(position);
        if(newProduct == null){
            return;
        }
        else
        {
            holder.itemImage.setImageResource(newProduct.getImageUrl());
            holder.itemName.setText(newProduct.getName());
            holder.itemPrice.setText((newProduct.getPrice()));
            holder.itemRating.setRating(Float.parseFloat(newProduct.getRating()));
        }
    }

    @Override
    public int getItemCount() {
        if(mListSkinCare != null){
            return mListSkinCare.size();}
        return 0;
    }

    public class SkinCareViewHolder extends RecyclerView.ViewHolder {

        ImageView itemImage;
        TextView itemPrice, itemName;
        RatingBar itemRating;

        public SkinCareViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.skin_care_img);
            itemName = itemView.findViewById(R.id.skin_care_name);
            itemPrice = itemView.findViewById(R.id.skin_care_price);
            itemRating = itemView.findViewById(R.id.ratingbar);
        }
    }
}
