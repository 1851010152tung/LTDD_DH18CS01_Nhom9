package com.example.appflorentinobeautieofficial.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appflorentinobeautieofficial.R;
import com.example.appflorentinobeautieofficial.model.FlashSales;

import java.util.List;

public class FlashSaleAdapter extends RecyclerView.Adapter<FlashSaleAdapter.FlashSaleViewHolder> {

    private List<FlashSales> mListFlashSale;

    public FlashSaleAdapter(List<FlashSales> mListFlashSale) {
        this.mListFlashSale = mListFlashSale;
    }

    @NonNull
    @Override
    public FlashSaleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate((R.layout.activity_flash_sale_item),
                parent, false);
        return new FlashSaleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FlashSaleAdapter.FlashSaleViewHolder holder, int position) {
        FlashSales flashSales  = mListFlashSale.get(position);
        if(flashSales == null){
            return;
        }
        else
        {
            holder.itemImage.setImageResource(flashSales.getImageUrl());
            holder.itemName.setText(flashSales.getName());
            holder.itemPrice.setText((flashSales.getPrice()));
            holder.itemSaleOff.setText((flashSales.getSaleoff()));
        }
    }

    @Override
    public int getItemCount() {
        if(mListFlashSale != null){
            return mListFlashSale.size();}
        return 0;
    }

    public class FlashSaleViewHolder extends RecyclerView.ViewHolder {

        ImageView itemImage;
        TextView itemPrice, itemName, itemSaleOff;

        public FlashSaleViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.flash_sales_product_img);
            itemName = itemView.findViewById(R.id.flash_sales_name);
            itemPrice = itemView.findViewById(R.id.flash_sales_price);
            itemSaleOff = itemView.findViewById(R.id.flash_sales_sale_off);
        }
    }
}

