package com.example.appflorentinobeautieofficial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.appflorentinobeautieofficial.adapter.HairCareAdapter;
import com.example.appflorentinobeautieofficial.model.NewProduct;

import java.util.ArrayList;
import java.util.List;

public class HairCareActivity extends AppCompatActivity {

    private RecyclerView rcvHairCare;
    private HairCareAdapter hairCareAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair_care);

        rcvHairCare = findViewById(R.id.rcv_HairCare);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvHairCare.setLayoutManager(linearLayoutManager);
        hairCareAdapter = new HairCareAdapter(getlistHairCares());
        rcvHairCare.setAdapter(hairCareAdapter);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        rcvHairCare.addItemDecoration(itemDecoration);
    }

    private List<NewProduct> getlistHairCares() {
        List<NewProduct> list = new ArrayList<>();
        list.add(new NewProduct("T/Gel® Therapeutic Shampoo-Original Formula","$11.49","4.5",R.drawable.img_16,"Benefits\n" +
                "Our gentle dandruff shampoo starts to work on contact, so it controls itchy and flaky scalp conditions from the first use. And the shampoo continues to work for hours even after it's rinsed off.\n" +
                "Recommended by dermatologists to effectively control chronic Scalp Psoriasis, Seborrheic Dermatitis and even common Dandruff.\n" +
                "0.5% Coal Tar\n" +
                "How to Use\n" +
                "For best results, use at least twice a week or as directed by a doctor.\n" +
                "Wet hair thoroughly.\n" +
                "Massage shampoo into your scalp.\n" +
                "Lather, leaving on your hair and scalp for a few minutes.\n" +
                "Rinse and repeat."));
        list.add(new NewProduct("HAIRBURST SHAMPOO & CONDITIONER FOR LONGER STRONGER HAIR","$34.99","4.5",R.drawable.img_17,"Use Hairburst Shampoo & Conditioner if you want to achieve:\n" +
                "Healthier Hair; Amino acids help add moisture to the hair.\n" +
                "Reduced Shedding; Designed to wash away excess sebum. Too much of this oil on your scalp can shrink hair follicles and lead to hair loss and excess shedding.\n" +
                "Thicker & Fuller looking hair; Panthenol retains water on the hair shaft, helping to improve the appearance and feel of the hair while also providing more body.\n" +
                "Safe with no nasties; Sodium Lauryl Sulfate free and paraben-free, our Shampoo & Conditioner is perfectly safe for everyday use.\n" +
                "Suitable for Vegans\n" +
                "\n" +
                "DESCRIPTION\n" +
                "The Hairburst shampoo and conditioner set is perfect for achieving longer stronger and healthier hair. Specially formulated to give optimum results whilst washing, achieving your hair goals is easier than ever.\n" +
                "\n" +
                "Sodium Lauryl Sulfate and paraben free, our Shampoo & Conditioner are perfectly safe for everyday use and will continue to boost healthy hair growth every time. Your hair routine has never been easier and the delicious subtle scent of coconut and avocado is sure to boost your mood.\n" +
                "\n" +
                "For best restults, use the Hairburst Shampoo & Conditioner together and follow with our Volume & Growth Elixir."));
        list.add(new NewProduct("HairBurst Long and Healthy Hair Mask","$38.36","3.5",R.drawable.img_18, "A deeply nourishing and hydrating hair mask that improves shine and softness, controls frizz and protects hair to encourage longer, stronger hair growth.\n" +
                "The Benefits\n" +
                "Encourages visibly thicker and healthier looking hair.\n" +
                "Supports hair fibre repair and reduces breakage.\n" +
                "Helps to detangle and control frizz.\n" +
                "Improves shine, manageability and softness.\n" +
                "Hydrating, nourishing and conditioning.\n" +
                "How to use\n" +
                "After shampooing, squeeze water from hair and apply our nourishing mask generously through the mid lengths and ends (and roots if you feel your hair needs extra oil).\n" +
                "Leave the mask on for 5-10 minutes minimum. Rinse thoroughly and dry hair as normal (we recommend using our elixir and turning upside down for added volume!) to reveal shinier, softer and luscious looking locks!"));
        list.add(new NewProduct("HYDRATING GLOW SHAMPOO WITH BAOBAB ESSENCE, SULFATE FREE","$7.99","4.5",R.drawable.img_19,"Enjoy the fresh botanical fragrance and the hydrating lather of the nutrient infused sulfate free, silicone free shampoo, with a blend of pro vitamin B5, antioxidant and Baobab Essence. Nourishing formula gently cleanses without stripping for a healthy natural glow.\n" +
                "\n" +
                "Thanks to its hydrating properties, baobab essence has been used by Tanzanian women to treat skin issues, hydrate and elongate curls and protect skin and hair from the sun for centuries.\n" +
                "\n" +
                "PRODUCT DETAILS\n" +
                "0% Sulfates, Silicones, Parabens, Dyes, & Mineral Oil\n" +
                "\n" +
                "DIRECTIONS: Massage into wet hair & scalp. Lather. Rinse. Gentle enough for permed or color treated hair."));
        return  list;
    }
}