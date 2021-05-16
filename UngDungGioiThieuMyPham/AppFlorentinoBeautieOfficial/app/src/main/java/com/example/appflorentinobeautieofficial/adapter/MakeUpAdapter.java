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
import com.example.appflorentinobeautieofficial.model.FlashSales;
import com.example.appflorentinobeautieofficial.model.NewProduct;

import java.util.List;

public class MakeUpAdapter extends RecyclerView.Adapter<MakeUpAdapter.MakeUpViewHolder> {

    private List<NewProduct> mListMakeUp;

    public MakeUpAdapter(List<NewProduct> mListMakeUp) {

        this.mListMakeUp = mListMakeUp;
    }

    @NonNull
    @Override
    public MakeUpViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate((R.layout.activity_make_up_item),
                parent, false);
        return new MakeUpViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MakeUpAdapter.MakeUpViewHolder holder, int position) {

        NewProduct newProduct = mListMakeUp.get(position);
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
        if(mListMakeUp != null){
            return mListMakeUp.size();}
        return 0;
    }

    public class MakeUpViewHolder extends RecyclerView.ViewHolder {

        ImageView itemImage;
        TextView itemPrice, itemName;
        RatingBar itemRating;

        public MakeUpViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.make_up_img);
            itemName = itemView.findViewById(R.id.make_up_name);
            itemPrice = itemView.findViewById(R.id.make_up_price);
            itemRating = itemView.findViewById(R.id.ratingbar);
        }
    }
}
