package edu.udayton.autorentals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class CartypesActivity extends AppCompatActivity {

    private Boolean currState = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartypes);

        LinearLayout midSizeCarLayout = (LinearLayout)findViewById(R.id.midSizeCarLinearLayout);
        View.OnClickListener midSizeCarLayoutListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CartypesActivity.this, CheckoutActivity.class);
                intent.putExtra(CheckoutActivity.SPEC_KEY, "A mid-size car starts at 110 cubic feet and goes up to 120 cubic feet. According to the EPA, a mid-size car cannot have over 120 cubic feet of combined volume, and it has to have a maximum length of 196.8 inches");
                intent.putExtra(CheckoutActivity.IMG_KEY, Integer.toString(R.drawable.toyota_camry_small));
                intent.putExtra(CheckoutActivity.AUTO_TYPE_KEY, "Toyota camry/similar");
                intent.putExtra(CheckoutActivity.AMOUNT_KEY, "63");
                intent.putExtra(CheckoutActivity.DESC_KEY, "car image");
                startActivity(intent);
            }
        };
        midSizeCarLayout.setOnClickListener(midSizeCarLayoutListener);

        final ImageView midSizeCarFavouriteView = (ImageView)findViewById(R.id.midSizeFavouriteView);
        midSizeCarFavouriteView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(currState){
                    midSizeCarFavouriteView.setImageResource(R.drawable.ic_baseline_favorite_border_24);
                    currState = false;
                }else{
                    midSizeCarFavouriteView.setImageResource(R.drawable.ic_baseline_favorite_24_red);
                    currState = true;
                }
            }
        });

        LinearLayout fullSizeCarLayout = (LinearLayout)findViewById(R.id.fullSizeCarLinearLayout);
        View.OnClickListener fullSizeCarlayoutListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CartypesActivity.this, CheckoutActivity.class);
                intent.putExtra(CheckoutActivity.SPEC_KEY, "Based on the combined passenger and cargo volume, large cars (full-size cars) are defined as having an interior volume index of more than 120 cu ft (3.4 m3) for sedan models, or 160 cu ft (4.5 m3) for station wagons.");
                intent.putExtra(CheckoutActivity.IMG_KEY, Integer.toString(R.drawable.impala_small));
                intent.putExtra(CheckoutActivity.AUTO_TYPE_KEY, "Impala/similar");
                intent.putExtra(CheckoutActivity.AMOUNT_KEY, "75");
                intent.putExtra(CheckoutActivity.DESC_KEY, "car image");
                startActivity(intent);

            }
        };
        fullSizeCarLayout.setOnClickListener(fullSizeCarlayoutListener);

        LinearLayout premiumSizeCarLayout = (LinearLayout)findViewById(R.id.premiumCarLinearLayout);
        View.OnClickListener premiumSizeCarlayoutListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CartypesActivity.this, CheckoutActivity.class);
                intent.putExtra(CheckoutActivity.SPEC_KEY, "A premium car is a top-of-the-line model that offers all the bells and whistles available in its class. Premium cars are similar to luxury cars in technology and safety features. They also have the same high-end materials and finishes. So when you rent a premium car, you’re getting the comfort and high-end feel of a luxury car without the price.");
                intent.putExtra(CheckoutActivity.IMG_KEY, Integer.toString(R.drawable.audi_small));
                intent.putExtra(CheckoutActivity.AUTO_TYPE_KEY, "Audi/similar");
                intent.putExtra(CheckoutActivity.AMOUNT_KEY, "103");
                intent.putExtra(CheckoutActivity.DESC_KEY, "car image");
                startActivity(intent);

            }
        };
        premiumSizeCarLayout.setOnClickListener(premiumSizeCarlayoutListener);

        LinearLayout luxuryCarLayout = (LinearLayout)findViewById(R.id.luxuryCarLinearLayout);
        View.OnClickListener luxuryCarlayoutListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CartypesActivity.this, CheckoutActivity.class);
                intent.putExtra(CheckoutActivity.SPEC_KEY, "A luxury vehicle provides increased levels of comfort, equipment, amenities, quality, performance, and status relative to regular cars for an increased price.");
                intent.putExtra(CheckoutActivity.IMG_KEY, Integer.toString(R.drawable.royce_small));
                intent.putExtra(CheckoutActivity.AUTO_TYPE_KEY, "Rolls royce/similar");
                intent.putExtra(CheckoutActivity.AMOUNT_KEY, "206");
                intent.putExtra(CheckoutActivity.DESC_KEY, "car image");
                startActivity(intent);

            }
        };
       luxuryCarLayout.setOnClickListener(luxuryCarlayoutListener);

    }
}