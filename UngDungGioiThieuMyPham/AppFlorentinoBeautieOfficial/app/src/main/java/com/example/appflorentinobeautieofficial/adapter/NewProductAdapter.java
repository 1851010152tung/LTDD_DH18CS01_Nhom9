package com.example.appflorentinobeautieofficial.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appflorentinobeautieofficial.ProductDetailsActivity;
import com.example.appflorentinobeautieofficial.R;
import com.example.appflorentinobeautieofficial.model.NewProduct;

import java.util.List;

public class NewProductAdapter extends RecyclerView.Adapter<NewProductAdapter.NewProductHolder> {

    Context context;
    List<NewProduct> newProductList;

    public NewProductAdapter(Context context, List<NewProduct> newProductList) {
        this.context = context;
        this.newProductList = newProductList;
    }

    @NonNull

    @Override
    public NewProductHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new NewProductHolder(LayoutInflater.from(context).inflate(R.layout.home_new_product_row_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NewProductAdapter.NewProductHolder holder,final int position) {

        holder.itemImage.setImageResource(newProductList.get(position).getImageUrl());
        holder.itemName.setText(newProductList.get(position).getName());
        holder.itemPrice.setText(newProductList.get(position).getPrice());
        holder.itemDes.setText(newProductList.get(position).getDescription());
        holder.itemRating.setRating(Float.parseFloat(newProductList.get(position).getRating()));
        holder.itemView.setOnClickListener((view)->{
                Intent i = new Intent(context, ProductDetailsActivity.class);
                i.putExtra("name",newProductList.get(position).getName());
                i.putExtra("image",newProductList.get(position).getImageUrl());
                i.putExtra("price",newProductList.get(position).getPrice());
                i.putExtra("des",newProductList.get(position).getDescription());
                context.startActivity(i);
            });
    }

    @Override
    public int getItemCount() {
        return newProductList.size();
    }

    public static final class NewProductHolder extends RecyclerView.ViewHolder{
        ImageView itemImage;
        TextView itemPrice, itemName,itemDes;
        RatingBar itemRating;

        public NewProductHolder(@NonNull  View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.product_img);
            itemName = itemView.findViewById(R.id.product_name);
            itemPrice = itemView.findViewById(R.id.product_price);
            itemRating = itemView.findViewById(R.id.ratingbar);
            itemDes = itemView.findViewById(R.id.product_description);
        }
    }
}
