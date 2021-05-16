package com.example.appflorentinobeautieofficial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.appflorentinobeautieofficial.adapter.MakeUpAdapter;
import com.example.appflorentinobeautieofficial.adapter.SkinCareAdapter;
import com.example.appflorentinobeautieofficial.model.NewProduct;

import java.util.ArrayList;
import java.util.List;

public class SkinCareActivity extends AppCompatActivity {

    private RecyclerView rcvSkinCare;
    private SkinCareAdapter skinCareAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_care);

        rcvSkinCare = findViewById(R.id.rcv_skinCare);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvSkinCare.setLayoutManager(linearLayoutManager);
        skinCareAdapter = new SkinCareAdapter(getListSkinCare());
        rcvSkinCare.setAdapter(skinCareAdapter);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        rcvSkinCare.addItemDecoration(itemDecoration);
    }

    private List<NewProduct> getListSkinCare() {
        List<NewProduct> list = new ArrayList<>();
        list.add(new NewProduct("Pear Bath Blend", "$10,00 ", "4.0", R.drawable.img_8,"Give your bath time a boost with our deliciously-scented, velvety Bath Blends. More than your average bath soak, we’ve blended super fruits and vegetables rich in vitamins and antioxidants that make your skin look healthier. Our Pear Bath Blend leaves dry skin feeling hydrated, nourished and comforted.  Best of all, notes of green apple, kale, pear & rose leave your skin sweetly scented. Self-care never smelled so good. Lock the door, queue up a playlist and enjoy.\n" +
                "Velvety bath blend\n" +
                "Dry skin feels hydrated, nourished and comforted\n" +
                "With vitamins, antioxidants and minerals to make dull skin look healthier\n" +
                "Dermatologically tested\n" +
                "Enriched with Community Fair Trade aloe vera from Mexico and second-choice pears leftover from the food industry\n" +
                "Notes of green apple, kale, pear & rose\n" +
                "Made with 50% recycled plastic\n" +
                "100% recyclable"));
        list.add(new NewProduct("Mango Exfoliating Sugar Body Scrub", "$24.00 ", "3.0", R.drawable.img_9, "Our Mango Exfoliating Body Scrub gives your skin that invigorating clean feeling, with an uplifting exotic scent. If you’re seeking a deep exfoliation with all the benefits of sugar scrubs, then this body exfoliator is about to become your new best friend.\n" +
                "Our sugar scrub is a hard-working formula, enriched with Community Fair Trade mango seed oil from India. It’s also loaded with sugar granules to help lift dead skin cells and grime from the skin’s surface, leaving your skin feeling smoother and more refined. The tropical scent is just the, er, cherry on top.\n" +
                "Like many of The Body Shop’s body scrubs and exfoliators, it feels ever so luxurious against your skin. Whether you're scrubbing up in the shower or treating yourself to a few precious minutes of bathtub bliss, this bath and shower scrub is a real treat. A treat you most definitely deserve.\n" +
                "A luxurious scrub for skin that feels smooth all over\n" +
                "Enriched with mango seed oil\n" +
                "Made with sugar that softly scrubs away dead skin\n" +
                "Smells like a tropical paradise"));
        list.add(new NewProduct("DIOR HYDRA LIFE", "$29.00", "5.0", R.drawable.img_11,"Fresh reviver - sorbet water mist\n" +
                "The Sorbet Water Mist encourages cutaneous hydration and energizes the skin while promoting long-lasting makeup hold and reviving its radiance.\n" +
                "BENEFITS:\n" +
                "The skin is deeply moisturized, sheerly clarified and revitalized. Prolongs makeup hold.\n" +
                "APPLICATION TIPS:\n" +
                "Multiple uses:\n" +
                "1. Hold the bottle 20 cm (8 inches) from the face, close the eyes and spray the whole face, or spray into one hand and then apply evenly on the face to avoid contact with the eyes.\n" +
                "2. Apply this mist daily, or as required, morning and night, to dehydrated areas of the face.\n" +
                "3. Spray on the Sorbet Water Mist as a complement to your skincare routine or as a final touch to set makeup and revive its radiance.\n"));
        list.add(new NewProduct("DIOR PRESTIGE", "$325.00", "2.5", R.drawable.img_12,"Le nectar de nuit\n" +
                "Dior Prestige Le Nectar de Nuit is concentrated in the most precious fraction of Rose de Granville: its very first buds. They potentiate the skin's nighttime cell regeneration for 8 hours*. Signs of aging are more rapidly, intensely and deeply corrected.\n" +
                "Upon the first application, the skin regains a fine, even texture and its radiance is boosted. Wrinkles are smoothed and signs of fatigue are diminished.\n" +
                "Night after night, the skin looks visibly younger.\n" +
                "*In vitro tests on ingredients\n" +
                "BENEFITS:\n" +
                "AN EXCEPTIONAL REJUVENATING PERFORMANCE\n" +
                "Results clinically measured by a dermatologist*\n" +
                "Upon the first night:\n" +
                "- The skin is more radiant: +23%\n" +
                "- The skin's texture is finer: +23%\n" +
                "- The skin is more supple +28%\n" +
                "After one month:\n" +
                "- The skin is smoother: +20%\n" +
                "- The skin is more supple: +33%\n" +
                "- The skin is firmer: +28%\n" +
                "Results felt by women**\n" +
                "- The skin is soothed: 100%\n" +
                "- Signs of fatigue are reduced: 100%\n" +
                "- Deep wrinkles appear diminished: 97%\n" +
                "- The skin appears renewed: 95%\n" +
                "- The skin appears younger: 100%\n" +
                "* Clinical assessment of 41 women on the 1st morning and after 1 month of daily application\n" +
                "** Self-evaluation by 39 women after 1 month of daily application.\n" +
                "\n"));
        list.add(new NewProduct("HUILE ABRICOT", "$22.00", "4.5", R.drawable.img_14,"Daily nutritive serum\n" +
                "All the power of the legendary Crème Abricot in an exquisite, travel-size nail care oil. Day after day, the Huile Abricot intensely nourishes, smoothes and strengthens nails, while deeply moisturising cuticles.\n" +
                "APPLICATION TIPS\n" +
                "Every day, morning or night, use the high-precision dispenser to apply a drop to each finger, and then massage gently until absorbed."));

        return  list;
    }
}