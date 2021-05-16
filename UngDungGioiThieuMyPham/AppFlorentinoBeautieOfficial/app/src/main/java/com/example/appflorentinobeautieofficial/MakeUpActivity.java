package com.example.appflorentinobeautieofficial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.appflorentinobeautieofficial.adapter.FlashSaleAdapter;
import com.example.appflorentinobeautieofficial.adapter.MakeUpAdapter;
import com.example.appflorentinobeautieofficial.model.FlashSales;
import com.example.appflorentinobeautieofficial.model.NewProduct;

import java.util.ArrayList;
import java.util.List;

public class MakeUpActivity extends AppCompatActivity {

    private RecyclerView rcvmakeUp;
    private MakeUpAdapter makeUpAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_up);

        rcvmakeUp = findViewById(R.id.rcv_makeUp);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvmakeUp.setLayoutManager(linearLayoutManager);
        makeUpAdapter = new MakeUpAdapter(getListMakeUp());
        rcvmakeUp.setAdapter(makeUpAdapter);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        rcvmakeUp.addItemDecoration(itemDecoration);
    }

    private List<NewProduct> getListMakeUp() {
        List<NewProduct> list = new ArrayList<>();
        list.add(new NewProduct("Matte Clay Concealer", "$10,00 ", "4.0", R.drawable.img_1, "Introducing a new make-up must-have for blemish-prone skin. Conceal skin imperfections throughout the day with our 100% vegan Matte Clay Concealer. This lightweight concealer is enriched with skin-clearing tea tree and leaves a breathable, yet full-coverage matte finish. For skin that looks visibly clearer, use this beauty essential alone for a fast-drying natural finish or team with our Matte Clay Foundation for a lasting flawless finish look.\n" +
                "\n" +
                "Full-coverage, matte finish\n" +
                "Conceals imperfections, blemishes, and dark circles\n" +
                "Enriched with Community Fair Trade Tea Tree Oil\n" +
                "Sweat & humidity resistant\n" +
                "Ideal for any skin type\n" +
                "Breathable 24-hour coverage"));
        list.add(new NewProduct("Coconut Bronze™ Glistening Glow Powder", "$20.00 ", "4.5", R.drawable.img_2, "Get natural-looking summer skin all year round with our Coconut Bronze Glistening Glow Powder. This lightweight bronzer and highlighter gives skin an instant shimmering finish. It also has an easy-to-use puff for touching up your radiant tan effect whenever and wherever you want.\n" +
                "Shimmering bronzer and highlighter\n" +
                "For a natural-looking, sun-kissed glow in seconds\n" +
                "Non-cakey formula\n" +
                "Blends seamlessly into skin\n" +
                "Enriched with Community Fair Trade organic virgin coconut oil from Samoa\n" +
                "Suitable for sensitive skin\n" +
                "Dermatologically tested\n" +
                "100% recyclable packaging"));
        list.add(new NewProduct("Coconut Bronze Shimmering Dry Oil", "$22.00", "4.0", R.drawable.img_3,"Give your skin a natural-looking, sun-kissed glow with our Coconut Bronze Shimmering Dry Oil. This non-greasy formula enhances your natural tan with a warm hint of shimmering color. It can also be used all year round to give every skin tone a little boost of holiday radiance.\n" +
                "- Dry shimmering oil\n" +
                "- For a tan-enhancing glow\n" +
                "- Non-greasy finish\n" +
                "Enriched with Community Fair Trade organic virgin coconut oil from Samoa\n" +
                "Suitable for sensitive skin Dermatologically tested"));
        list.add(new NewProduct("Coconut Lip Butter", "$6.00", "4.0", R.drawable.img_4, "Go nuts for our creamy Coconut Lip Butter. The rich buttery texture helps lips feel softer and suppler, while protecting from dryness. Enriched with Community Fair Trade organic coconut oil from Samoa, the Lip Butter has a dreamy tropical scent and leaves a subtle, clear shine.\n" +
                "Nourishing, rich butter texture\n" +
                "Moisturizes and instantly soothes lips\n" +
                "Relieves and protects lips from dryness\n" +
                "Lips feel softer, smoother and more supple\n" +
                "Leaves a subtle shine with no color\n" +
                "Subtle coconut scent\n" +
                "Enriched with Community Fair Trade organic coconut oil from Samoa"));
        list.add(new NewProduct("Matte Lip Butter", "$10.00", "4.5", R.drawable.img_5,"Our matte lip butters are specially formulated to glide on effortlessly like a gloss and set with the rich creamy color and velvety touch of matte lipstick. Available in 6 shades, our liquid lipstick is long-lasting, lightweight and lusciously soft. And like all our cruelty-free makeup, it's vegan too.\n" +
                "\n" +
                "Vegan\n" +
                "No gluten\n" +
                "No carmine\n" +
                "Lasting Matte Lip Butter with a velvety finish\n" +
                "Available in 6 intensely rich shades\n" +
                "Enriched with Community Fair Trade marula oil from Namibia"));
        list.add(new NewProduct("Happy Go Lash Mascara", "$16.00", "3.5", R.drawable.img_7, "Love your lashes! This everyday mascara thickens and defines while feeling gentle on lashes. The formula is easy to apply and remove and lasts all day without flaking. Enriched with 93% ingredients of natural origin, including organic beeswax and Community Fair Trade organic virgin coconut oil, Happy Go Lash feels gentle on application and helps to protect and enrich your lashes for a fuller-looking flutter.\n" +
                "Everyday mascara in black\n" +
                "Lashes look thicker and defined\n" +
                "Easy to use and remove\n" +
                "No fading or flaking\n" +
                "Feels gentle on lashes\n" +
                "93% ingredients of natural origin\n" +
                "Enriched with organic beeswax from Cameroon and Community Fair Trade organic virgin coconut oil from Samoa"));
        return  list;
    }
}