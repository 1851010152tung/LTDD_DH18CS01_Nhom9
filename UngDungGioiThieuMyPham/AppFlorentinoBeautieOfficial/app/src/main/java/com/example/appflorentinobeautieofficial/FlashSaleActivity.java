package com.example.appflorentinobeautieofficial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.appflorentinobeautieofficial.adapter.FlashSaleAdapter;
import com.example.appflorentinobeautieofficial.model.FlashSales;

import java.util.ArrayList;
import java.util.List;

public class FlashSaleActivity extends AppCompatActivity {


    private RecyclerView rcvFlashSale;
    private FlashSaleAdapter flashSaleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_sale);

        rcvFlashSale = findViewById(R.id.rcv_flashSale);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvFlashSale.setLayoutManager(linearLayoutManager);
        flashSaleAdapter = new FlashSaleAdapter(getListFlashSale());
        rcvFlashSale.setAdapter(flashSaleAdapter);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        rcvFlashSale.addItemDecoration(itemDecoration);

    }

    private List<FlashSales> getListFlashSale() {
        List<FlashSales> list = new ArrayList<>();
        list.add(new FlashSales("Matte Lip Butter","$10.00","14% OFF",R.drawable.img_5, "asad"));
        list.add(new FlashSales("Coconut Bronze Shimmering Dry Oil","$22.00","20% OFF",R.drawable.img_3, "asjdho"));
        list.add(new FlashSales("Pear Bath Blend","$10.00","30% OFF",R.drawable.img_8, "asdhgo"));
        list.add(new FlashSales("Happy Go Lash Mascara","$16.00","30% OFF",R.drawable.img_7, "asdhgo"));
        list.add(new FlashSales("Dior Hydra Life","$29.00","10% OFF",R.drawable.img_15, "asdhgo"));
        list.add(new FlashSales("Matte Clay Concealer", "$8,00","14% OFF",R.drawable.img_1, "asdhgo"));
        list.add(new FlashSales("Coconut Lip Butter", "$4,00","20% OFF",R.drawable.img_4, "asdhgo"));
        list.add(new FlashSales("HUILE ABRICOT", "$19,00 ","30% OFF",R.drawable.img_14, "asdhgo"));
        list.add(new FlashSales("DIOR PRESTIGE", "$309,00","30% OFF",R.drawable.img_12, "asdhgo"));
        list.add(new FlashSales("Hand Held Mirror", "$15,00 ","10% OFF",R.drawable.img_10, "asdhgo"));
        return  list;
    }
}