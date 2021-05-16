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
import com.example.appflorentinobeautieofficial.model.FlashSales;

import java.util.List;

public class FlashSaleAdapterMain extends RecyclerView.Adapter<FlashSaleAdapterMain.FlashSaleHolder> {

    Context context;
    List<FlashSales> flashSaleList;

    public FlashSaleAdapterMain(Context context, List<FlashSales> flashSaleList) {
        this.context = context;
        this.flashSaleList = flashSaleList;
    }

    @NonNull

    @Override
    public FlashSaleHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new FlashSaleHolder(LayoutInflater.from(context).inflate(R.layout.home_flash_sales_row_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FlashSaleAdapterMain.FlashSaleHolder holder, int position) {

        holder.itemImage.setImageResource(flashSaleList.get(position).getImageUrl());
        holder.itemName.setText(flashSaleList.get(position).getName());
        holder.itemPrice.setText(flashSaleList.get(position).getPrice());
        holder.itemSaleOff.setText(flashSaleList.get(position).getSaleoff());
        holder.itemView.setOnClickListener((view)->{
            Intent i = new Intent(context, ProductDetailsActivity.class);
            i.putExtra("name",flashSaleList.get(position).getName());
            i.putExtra("image",flashSaleList.get(position).getImageUrl());
            i.putExtra("price",flashSaleList.get(position).getPrice());
            i.putExtra("des",flashSaleList.get(position).getDescription());
            context.startActivity(i);
        });
    }

    @Override
    public int getItemCount() {
        return flashSaleList.size();
    }

    public static final class FlashSaleHolder extends RecyclerView.ViewHolder{
        ImageView itemImage;
        TextView itemPrice, itemName, itemSaleOff, itemDes;
        public FlashSaleHolder(@NonNull  View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.flash_sales_product_img);
            itemName = itemView.findViewById(R.id.flash_sales_name);
            itemPrice = itemView.findViewById(R.id.flash_sales_price);
            itemSaleOff = itemView.findViewById(R.id.flash_sales_sale_off);
            itemDes = itemView.findViewById(R.id.product_description);        }
    }
}
