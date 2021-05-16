package com.example.appflorentinobeautieofficial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.appflorentinobeautieofficial.adapter.FlashSaleAdapter;
import com.example.appflorentinobeautieofficial.adapter.NewProductAdapterList;
import com.example.appflorentinobeautieofficial.model.FlashSales;
import com.example.appflorentinobeautieofficial.model.NewProduct;

import java.util.ArrayList;
import java.util.List;

public class NewProductActivity extends AppCompatActivity {


    private RecyclerView rcvNewProduct;
    private NewProductAdapterList newProductAdapter;
    private List<NewProduct> listData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_product);

        rcvNewProduct = findViewById(R.id.rcv_newProduct);
        rcvNewProduct.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvNewProduct.setLayoutManager(linearLayoutManager);
        newProductAdapter = new NewProductAdapterList(getListNewProduct(), this);
        rcvNewProduct.setAdapter(newProductAdapter);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        rcvNewProduct.addItemDecoration(itemDecoration);

    }



    private List<NewProduct> getListNewProduct() {
        listData.add(new NewProduct("Matte Lip Butter","$10.00","4.5",R.drawable.img_5,"\"Introducing a new make-up must-have for blemish-prone skin. Conceal skin imperfections throughout the day with our 100% vegan Matte Clay Concealer. This lightweight concealer is enriched with skin-clearing tea tree and leaves a breathable, yet full-coverage matte finish. For skin that looks visibly clearer, use this beauty essential alone for a fast-drying natural finish or team with our Matte Clay Foundation for a lasting flawless finish look.\n" +
                "\n" +
                "Full-coverage, matte finish\n" +
                "Conceals imperfections, blemishes, and dark circles\n" +
                "Enriched with Community Fair Trade Tea Tree Oil\n" +
                "Sweat & humidity resistant\n" +
                "Ideal for any skin type\n" +
                "Breathable 24-hour coverage\"\t"));
        listData.add(new NewProduct("Coconut Bronze Shimmering Dry Oil","$22.00","4.0",R.drawable.img_3,"\"Get natural-looking summer skin all year round with our Coconut Bronze Glistening Glow Powder. This lightweight bronzer and highlighter gives skin an instant shimmering finish. It also has an easy-to-use puff for touching up your radiant tan effect whenever and wherever you want.\n" +
                "Shimmering bronzer and highlighter\n" +
                "For a natural-looking, sun-kissed glow in seconds\n" +
                "Non-cakey formula\n" +
                "Blends seamlessly into skin\n" +
                "Enriched with Community Fair Trade organic virgin coconut oil from Samoa\n" +
                "Suitable for sensitive skin\n" +
                "Dermatologically tested\n" +
                "100% recyclable packaging\"\t"));
        listData.add(new NewProduct("Pear Bath Blend","$10.00","2.5",R.drawable.img_8,"\"Give your skin a natural-looking, sun-kissed glow with our Coconut Bronze Shimmering Dry Oil. This non-greasy formula enhances your natural tan with a warm hint of shimmering color. It can also be used all year round to give every skin tone a little boost of holiday radiance.\n" +
                "- Dry shimmering oil\n" +
                "- For a tan-enhancing glow\n" +
                "- Non-greasy finish\n" +
                "Enriched with Community Fair Trade organic virgin coconut oil from Samoa\n" +
                "Suitable for sensitive skin Dermatologically tested\"\t"));
        listData.add(new NewProduct("Happy Go Lash Mascara","$16.00","4.5",R.drawable.img_7,"tung"));
        listData.add(new NewProduct("Dior Hydra Life","$29.00","5.0",R.drawable.img_11,"Tung"));
        listData.add(new NewProduct("Creme Abricot","$15.00","4.5",R.drawable.img_15,"Tung"));
        return  listData;
    }
}