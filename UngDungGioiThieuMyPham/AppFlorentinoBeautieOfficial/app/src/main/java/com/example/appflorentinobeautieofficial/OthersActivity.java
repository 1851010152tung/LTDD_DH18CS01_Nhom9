package com.example.appflorentinobeautieofficial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.appflorentinobeautieofficial.adapter.HairCareAdapter;
import com.example.appflorentinobeautieofficial.adapter.OthersAdapter;
import com.example.appflorentinobeautieofficial.model.NewProduct;

import java.util.ArrayList;
import java.util.List;

public class OthersActivity extends AppCompatActivity {

    private RecyclerView rcvOthers;
    private OthersAdapter othersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);

        rcvOthers = findViewById(R.id.rcv_Others);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvOthers.setLayoutManager(linearLayoutManager);
        othersAdapter = new OthersAdapter(getListOthers());
        rcvOthers.setAdapter(othersAdapter);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        rcvOthers.addItemDecoration(itemDecoration);
    }

    private List<NewProduct> getListOthers() {
        List<NewProduct> list = new ArrayList<>();
        list.add(new NewProduct("Hand Held Mirror","$20.00","4.5",R.drawable.img_10, "An elegant wooden hand mirror with a long, easy-grip handle—the perfect get-ready accessory that doubles as a vanity or bathroom centerpiece.\n" +
                "Details\n" +
                "Extra-long handle is easy to hold and fits comfortably in your hand.\n" +
                "Made of smooth, lightweight beechwood in a modern soft peach finish—making it the perfect addition to your bathroom or vanity.\n" +
                "Imprinted with a subtle “I am beautiful” that reflects back at you as a daily #RareReminder\n" +
                "11.8” H x 6” W x 0.5” D\n" +
                "Available only on RareBeauty.com"));
        list.add(new NewProduct("DIOR VERNIS","$22.00","3.8",R.drawable.img_13, "True colour, ultra-shiny, long wear\n" +
                "Discover the new-generation Dior Vernis and its ingenious formula that plays up the gel effect.\n" +
                "APPLICATION TIPS\n" +
                "1. Apply a thin coat of Base Coat Abricot.\n" +
                "2. Apply an initial, very thin coat of Dior Vernis, starting in the center of the nail and then continuing to the sides. Follow with a second, more generous coat to add depth to the colour.\n" +
                "3. Maximize shine with a coat of Top Coat Abricot or Gel Coat."));
        list.add(new NewProduct("CREME ABRICOT","$22.00","3.5",R.drawable.img_15, "Nail cream\n" +
                "The iconic Dior Manicure nail care since 1963, renowned for its nourishing and moisturising properties. Its highly rich formula fortifies nails and improves resistance with visible results in just one month.\n" +
                "APPLICATION TIPS\n" +
                "Apply around the nail, gently massaging until absorbed. Best used in the evening to let it work all night long."));
        list.add(new NewProduct("Eyebrow Duo Brush","$10.00","4.0",R.drawable.img_6, "This clever double-ended eyebrow brush will help you on your way to perfectly groomed power brows. Grab your Brow and Liner Kit and use the spoolie end of your brush to comb through the brows. Then, use the brush end to pick up some product and lightly fill in for thick, luscious-looking brows. Best of all, the makeup brush is cruelty-free.\n" +
                "\n" +
                "Double ended eyebrow brush\n" +
                "Made from bamboo and aluminium\n" +
                "Nylon bristles\n" +
                "Vegan and cruelty-free\n" +
                "Perfect with our Brow and Eyeliner Kit"));
        return  list;
    }
}