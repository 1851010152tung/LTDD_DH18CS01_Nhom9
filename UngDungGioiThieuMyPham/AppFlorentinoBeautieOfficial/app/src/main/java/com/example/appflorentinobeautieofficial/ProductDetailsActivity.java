package com.example.appflorentinobeautieofficial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

public class ProductDetailsActivity extends AppCompatActivity {
    ImageView img, back;
    TextView proname, proprice,prodes;
    String name,price,des;
    int image;
    LinearLayout llRating;
    RatingBar ratingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        Intent i = getIntent();

        name = i.getStringExtra("name");
        image = i.getIntExtra("image",R.drawable.img_1);
        price = i.getStringExtra("price");
        des = i.getStringExtra("des");

        proname = findViewById(R.id.tv_prode_title);
        prodes = findViewById(R.id.tv_prode_description);
        proprice = findViewById(R.id.tv_prode_price);
        img = findViewById(R.id.iv_prode_image);
        back = findViewById(R.id.iv_prode_trove);
        llRating = findViewById(R.id.ll_rating);

        proname.setText(name);
        proprice.setText(price);
        prodes.setText(des);
        img.setImageResource(image);

        llRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProductDetailsActivity.this, Detail_RatingBar.class));
            }
        });

        back.setOnClickListener((view)->{
            Intent a = new Intent(ProductDetailsActivity.this,MainActivity.class);
            startActivity(a);
            finish();
        });

    }
}