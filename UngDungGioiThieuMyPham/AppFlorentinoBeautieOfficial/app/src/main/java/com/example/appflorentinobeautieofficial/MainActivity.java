package com.example.appflorentinobeautieofficial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;


import com.example.appflorentinobeautieofficial.adapter.FlashSaleAdapterMain;
import com.example.appflorentinobeautieofficial.adapter.NewProductAdapter;
import com.example.appflorentinobeautieofficial.fragment.AboutUsFragment;
import com.example.appflorentinobeautieofficial.fragment.CategoryFragment;
import com.example.appflorentinobeautieofficial.fragment.FlashSalesFragment;
import com.example.appflorentinobeautieofficial.fragment.HomeFragment;
import com.example.appflorentinobeautieofficial.fragment.MyCartFragment;
import com.example.appflorentinobeautieofficial.fragment.MyOrderFragment;
import com.example.appflorentinobeautieofficial.fragment.NewProductsFragment;
import com.example.appflorentinobeautieofficial.fragment.PopularProductsFragment;
import com.example.appflorentinobeautieofficial.model.FlashSales;
import com.example.appflorentinobeautieofficial.model.NewProduct;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    ImageView imageView;
    LinearLayout linearLayout, llFlashSale, llNewProduct;


    //recyclerview newProductRecycler
    RecyclerView newProductRecycler;
    NewProductAdapter newProductAdapter;

    //recyclerview flashSalesRecycler
    RecyclerView flashSalesRecycler;
    FlashSaleAdapterMain flashSalesAdapterMain;

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*----------------Hooks--------------------*/
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_drawer_view);
        toolbar = findViewById(R.id.toolbar);

        /*---------------Tool Bar-----------------*/
        setSupportActionBar(toolbar);

        /*--------Navigation Drawer Menu--------*/
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        //chuyen trang flash sale
        llFlashSale = findViewById(R.id.ll_flashSaleMain);
        llFlashSale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FlashSaleActivity.class));
            }
        });

        //chuyen trang new product
        llNewProduct = findViewById(R.id.ll_newProductMain);
        llNewProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NewProductActivity.class));
            }
        });


        //Chuyen vao tung trang categories
        linearLayout = findViewById(R.id.makeup);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IntroActivity.class);
                startActivity(intent);
            }
        });

        //Chuyen vao tung trang categories

        //Chuyen vao tung trang make up
        linearLayout = findViewById(R.id.makeup);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MakeUpActivity.class));
            }
        });

        //Chuyen vao tung trang skincare

        linearLayout = findViewById(R.id.skincare);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SkinCareActivity.class));
            }
        });

        //Chuyen vao tung trang haircare

        linearLayout = findViewById(R.id.haircare);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HairCareActivity.class));
            }
        });

        //Chuyen vao tung trang others

        linearLayout = findViewById(R.id.others);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, OthersActivity.class));
            }
        });

        //here we will add data to our model class
        // New Product
        List<NewProduct> newProductList = new ArrayList<>();
        newProductList.add(new NewProduct("Matte Lip Butter","$10.00","4.5",R.drawable.img_5,"\"Introducing a new make-up must-have for blemish-prone skin. Conceal skin imperfections throughout the day with our 100% vegan Matte Clay Concealer. This lightweight concealer is enriched with skin-clearing tea tree and leaves a breathable, yet full-coverage matte finish. For skin that looks visibly clearer, use this beauty essential alone for a fast-drying natural finish or team with our Matte Clay Foundation for a lasting flawless finish look.\n" +
                "\n" +
                "Full-coverage, matte finish\n" +
                "Conceals imperfections, blemishes, and dark circles\n" +
                "Enriched with Community Fair Trade Tea Tree Oil\n" +
                "Sweat & humidity resistant\n" +
                "Ideal for any skin type\n" +
                "Breathable 24-hour coverage\"\t"));
        newProductList.add(new NewProduct("Coconut Bronze Shimmering Dry Oil","$22.00","4.0",R.drawable.img_3,"\"Get natural-looking summer skin all year round with our Coconut Bronze Glistening Glow Powder. This lightweight bronzer and highlighter gives skin an instant shimmering finish. It also has an easy-to-use puff for touching up your radiant tan effect whenever and wherever you want.\n" +
                "Shimmering bronzer and highlighter\n" +
                "For a natural-looking, sun-kissed glow in seconds\n" +
                "Non-cakey formula\n" +
                "Blends seamlessly into skin\n" +
                "Enriched with Community Fair Trade organic virgin coconut oil from Samoa\n" +
                "Suitable for sensitive skin\n" +
                "Dermatologically tested\n" +
                "100% recyclable packaging\"\t"));
        newProductList.add(new NewProduct("Pear Bath Blend","$10.00","2.5",R.drawable.img_8,"\"Give your skin a natural-looking, sun-kissed glow with our Coconut Bronze Shimmering Dry Oil. This non-greasy formula enhances your natural tan with a warm hint of shimmering color. It can also be used all year round to give every skin tone a little boost of holiday radiance.\n" +
                "- Dry shimmering oil\n" +
                "- For a tan-enhancing glow\n" +
                "- Non-greasy finish\n" +
                "Enriched with Community Fair Trade organic virgin coconut oil from Samoa\n" +
                "Suitable for sensitive skin Dermatologically tested\"\t"));
        newProductList.add(new NewProduct("Happy Go Lash Mascara","$16.00","4.5",R.drawable.img_7,"tung"));
        newProductList.add(new NewProduct("Dior Hydra Life","$29.00","5.0",R.drawable.img_11,"Tung"));
        newProductList.add(new NewProduct("Creme Abricot","$15.00","4.5",R.drawable.img_15,"Tung"));

        setNewProductRecycler(newProductList);




        //Flash Sales

        List<FlashSales> flashSalesList = new ArrayList<>();
        flashSalesList.add(new FlashSales("Matte Lip Butter","$10.00","14% OFF",R.drawable.img_5, "\"Our matte lip butters are specially formulated to glide on effortlessly like a gloss and set with the rich creamy color and velvety touch of matte lipstick. Available in 6 shades, our liquid lipstick is long-lasting, lightweight and lusciously soft. And like all our cruelty-free makeup, it's vegan too.\n" +
                "\n" +
                "Vegan\n" +
                "No gluten\n" +
                "No carmine\n" +
                "Lasting Matte Lip Butter with a velvety finish\n" +
                "Available in 6 intensely rich shades\n" +
                "Enriched with Community Fair Trade marula oil from Namibia\"\t"));
        flashSalesList.add(new FlashSales("Coconut Bronze Shimmering Dry Oil","$22.00","20% OFF",R.drawable.img_3,"\"Give your skin a natural-looking, sun-kissed glow with our Coconut Bronze Shimmering Dry Oil. This non-greasy formula enhances your natural tan with a warm hint of shimmering color. It can also be used all year round to give every skin tone a little boost of holiday radiance.\n" +
                "- Dry shimmering oil\n" +
                "- For a tan-enhancing glow\n" +
                "- Non-greasy finish\n" +
                "Enriched with Community Fair Trade organic virgin coconut oil from Samoa\n" +
                "Suitable for sensitive skin Dermatologically tested\"\t"));
        flashSalesList.add(new FlashSales("Pear Bath Blend","$10.00","30% OFF",R.drawable.img_8,"\"Give your bath time a boost with our deliciously-scented, velvety Bath Blends. More than your average bath soak, we’ve blended super fruits and vegetables rich in vitamins and antioxidants that make your skin look healthier. Our Pear Bath Blend leaves dry skin feeling hydrated, nourished and comforted.  Best of all, notes of green apple, kale, pear & rose leave your skin sweetly scented. Self-care never smelled so good. Lock the door, queue up a playlist and enjoy.\n" +
                "Velvety bath blend\n" +
                "Dry skin feels hydrated, nourished and comforted\n" +
                "With vitamins, antioxidants and minerals to make dull skin look healthier\n" +
                "Dermatologically tested\n" +
                "Enriched with Community Fair Trade aloe vera from Mexico and second-choice pears leftover from the food industry\n" +
                "Notes of green apple, kale, pear & rose\n" +
                "Made with 50% recycled plastic\n" +
                "100% recyclable\"\t"));
        flashSalesList.add(new FlashSales("Happy Go Lash Mascara","$16.00","30% OFF",R.drawable.img_7, "\"Love your lashes! This everyday mascara thickens and defines while feeling gentle on lashes. The formula is easy to apply and remove and lasts all day without flaking. Enriched with 93% ingredients of natural origin, including organic beeswax and Community Fair Trade organic virgin coconut oil, Happy Go Lash feels gentle on application and helps to protect and enrich your lashes for a fuller-looking flutter.\n" +
                "Everyday mascara in black\n" +
                "Lashes look thicker and defined\n" +
                "Easy to use and remove\n" +
                "No fading or flaking\n" +
                "Feels gentle on lashes\n" +
                "93% ingredients of natural origin\n" +
                "Enriched with organic beeswax from Cameroon and Community Fair Trade organic virgin coconut oil from Samoa\"\t"));
        flashSalesList.add(new FlashSales("Dior Hydra Life","$29.00","10% OFF",R.drawable.img_15, "\"Nail cream\n" +
                "The iconic Dior Manicure nail care since 1963, renowned for its nourishing and moisturising properties. Its highly rich formula fortifies nails and improves resistance with visible results in just one month.\n" +
                "APPLICATION TIPS\n" +
                "Apply around the nail, gently massaging until absorbed. Best used in the evening to let it work all night long.\"\t"));

        setFlashSalesRecycler(flashSalesList);




    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return true;
    }

/*

    private void displaySelectedScreen(int itemId) {

        //creating fragment object
        Fragment fragment = null;

        //initializing the fragment object which is selected
        switch (itemId) {
            case R.id.nav_home:
                fragment = new HomeFragment();
                break;
            case R.id.nav_about_us:
                fragment = new AboutUsFragment();
                break;
            case R.id.nav_category:
                fragment = new CategoryFragment();
                break;
            case R.id.nav_popular_products:
                fragment = new PopularProductsFragment();
                break;
            case R.id.nav_new_product:
                fragment = new NewProductsFragment();
                break;

            case R.id.nav_flashsale:
                fragment = new FlashSalesFragment();
                break;

            case R.id.nav_my_order:
                fragment = new MyOrderFragment();
                break;
            case R.id.nav_my_cart:
                fragment = new MyCartFragment();
                break;

        }

        //replacing the fragment
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.setCustomAnimations(R.anim.slide_from_right, R.anim.slide_to_left);
            ft.replace(R.id.content_frame, fragment);
            ft.commit();

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }
*/



    //new product recyclerview

    private void setNewProductRecycler(List<NewProduct> newProductList){
        newProductRecycler = findViewById(R.id.new_product_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        newProductRecycler.setLayoutManager(layoutManager);
        newProductAdapter = new NewProductAdapter(this, newProductList);
        newProductRecycler.setAdapter(newProductAdapter);
    }

    //flash sales recyclerview

    private void setFlashSalesRecycler(List<FlashSales> flashSalesList){
        flashSalesRecycler = findViewById(R.id.flash_sales_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        flashSalesRecycler.setLayoutManager(layoutManager);
        flashSalesAdapterMain = new FlashSaleAdapterMain(this, flashSalesList);
        flashSalesRecycler.setAdapter(flashSalesAdapterMain);
    }

}