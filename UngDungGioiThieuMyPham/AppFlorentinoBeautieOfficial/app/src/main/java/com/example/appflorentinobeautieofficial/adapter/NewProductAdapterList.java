package com.example.appflorentinobeautieofficial.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appflorentinobeautieofficial.NewProductActivity;
import com.example.appflorentinobeautieofficial.ProductDetailsActivity;
import com.example.appflorentinobeautieofficial.R;
import com.example.appflorentinobeautieofficial.model.FlashSales;
import com.example.appflorentinobeautieofficial.model.NewProduct;

import java.util.ArrayList;
import java.util.List;

public class NewProductAdapterList extends RecyclerView.Adapter<NewProductAdapterList.NewProductViewHolder> {

    public Object setOnItemClickListener;
    private List<NewProduct> mListNewProduct = new ArrayList<>();
    private Context context;

    public NewProductAdapterList(List<NewProduct> mListNewProduct, Context context) {
        this.context = context;
        this.mListNewProduct = mListNewProduct;
    }


    @NonNull
    @Override
    public NewProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate((R.layout.activity_new_product_item), parent, false);
        return new NewProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewProductAdapterList.NewProductViewHolder holder, int position) {
        NewProduct newProduct  = mListNewProduct.get(position);
        if(newProduct == null){
            return;
        }
        else
        {
            holder.itemImage.setImageResource(newProduct.getImageUrl());
            holder.itemName.setText(newProduct.getName());
            holder.itemPrice.setText(newProduct.getPrice());
            holder.itemDesc.setText(newProduct.getDescription());
            holder.itemRating.setRating(Float.parseFloat(newProduct.getRating()));
            holder.setItemClickListener(new ItemClickListener() {
               @Override
               public void onClick(View view, int position, boolean isClick) {
                   if(isClick){
                       Intent i = new Intent(context, ProductDetailsActivity.class);
                       i.putExtra("name",mListNewProduct.get(position).getName());
                       i.putExtra("image",mListNewProduct.get(position).getImageUrl());
                       i.putExtra("price",mListNewProduct.get(position).getPrice());
                       i.putExtra("des",mListNewProduct.get(position).getDescription());
                       context.startActivity(i);
                   }else{
                       return;
                   }
               }
           });
        }
    }

    @Override
    public int getItemCount() {
        if(mListNewProduct != null){
            return mListNewProduct.size();}
        return 0;
    }

    public class NewProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener{

        ImageView itemImage;
        TextView itemPrice, itemName, itemDesc;
        RatingBar itemRating;

        ItemClickListener itemClickListener;

        public NewProductViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.new_product_img);
            itemName = itemView.findViewById(R.id.new_product_name);
            itemPrice = itemView.findViewById(R.id.new_product_price);
            itemDesc = itemView.findViewById(R.id.new_product_description);
            itemRating = itemView.findViewById(R.id.ratingbar);

            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
        }

        public void setItemClickListener(ItemClickListener itemClickListener){
            this.itemClickListener = itemClickListener;
        }

        @Override
        public void onClick(View v) {
            itemClickListener.onClick(v, getAdapterPosition(), false);
        }


        @Override
        public boolean onLongClick(View v) {
            itemClickListener.onClick(v, getAdapterPosition(), true);
            return true;
        }
    }

    public interface ItemClickListener {
        void onClick(View view, int position, boolean isLongClick);
    }

}