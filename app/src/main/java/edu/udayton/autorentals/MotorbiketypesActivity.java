package edu.udayton.autorentals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MotorbiketypesActivity extends AppCompatActivity {

    private Boolean currState1= false;
    private Boolean currState2 = false;
    private Boolean currState3 = false;
    private Boolean currState4 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motorbiketypes);

        //getting the control of standardBikeLayout, when user clicks at any of the places, it will direct the user to CheckOutActivity page
        LinearLayout standardBikeLayout = (LinearLayout)findViewById(R.id.standardBikeLinearLayout);
        View.OnClickListener standardBikeLayoutListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MotorbiketypesActivity.this, CheckoutActivity.class);
                intent.putExtra(CheckoutActivity.SPEC_KEY, "Standards, also called naked bikes or roadsters, are versatile, general-purpose street motorcycles");
                intent.putExtra(CheckoutActivity.IMG_KEY, Integer.toString(R.drawable.triumph_small));
                intent.putExtra(CheckoutActivity.AUTO_TYPE_KEY, "triumph/similar");
                intent.putExtra(CheckoutActivity.AMOUNT_KEY, "55");
                intent.putExtra(CheckoutActivity.DESC_KEY, "motorbike image");
                startActivity(intent);
            }
        };
        standardBikeLayout.setOnClickListener(standardBikeLayoutListener);

        //user can click this image to make this item their favourite
        final ImageView standardBikeFavouriteView = (ImageView)findViewById(R.id.StandardBikeFavouriteView);
        standardBikeFavouriteView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(currState1){
                    standardBikeFavouriteView.setImageResource(R.drawable.ic_baseline_favorite_border_24);
                    currState1 = false;
                }else{
                    standardBikeFavouriteView.setImageResource(R.drawable.ic_baseline_favorite_24_red);
                    currState1 = true;
                }
            }
        });

        LinearLayout cruiserBikeLayout = (LinearLayout)findViewById(R.id.cruiserBikeLinearLayout);
        View.OnClickListener cruiserBikeLayoutListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MotorbiketypesActivity.this, CheckoutActivity.class);
                intent.putExtra(CheckoutActivity.SPEC_KEY, "A cruiser is a motorcycle in the style of American machines from the 1930s to the early 1960s, including those made by Harley-Davidson, Indian, Excelsior and Henderson.");
                intent.putExtra(CheckoutActivity.IMG_KEY, Integer.toString(R.drawable.cruiser_small));
                intent.putExtra(CheckoutActivity.AUTO_TYPE_KEY, "cruiser/similar");
                intent.putExtra(CheckoutActivity.AMOUNT_KEY, "86");
                intent.putExtra(CheckoutActivity.DESC_KEY, "motorbike image");
                startActivity(intent);
            }
        };
        cruiserBikeLayout.setOnClickListener(cruiserBikeLayoutListener);

        //user can click this image to make this item their favourite
        final ImageView cruiserBikeFavouriteView = (ImageView)findViewById(R.id.cruiserBikeFavouriteView);
        cruiserBikeFavouriteView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(currState2){
                    cruiserBikeFavouriteView.setImageResource(R.drawable.ic_baseline_favorite_border_24);
                    currState2 = false;
                }else{
                    cruiserBikeFavouriteView.setImageResource(R.drawable.ic_baseline_favorite_24_red);
                    currState2 = true;
                }
            }
        });

        LinearLayout sportBikeLayout = (LinearLayout)findViewById(R.id.sportBikeLinearLayout);
        View.OnClickListener sportBikeLayoutListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MotorbiketypesActivity.this, CheckoutActivity.class);
                intent.putExtra(CheckoutActivity.SPEC_KEY, "Sports bike is a motorcycle optimized for speed, acceleration, braking, and cornering on paved roads, typically at the expense of comfort and fuel economy by comparison with other motorcycles");
                intent.putExtra(CheckoutActivity.IMG_KEY, Integer.toString(R.drawable.sport_bike_small));
                intent.putExtra(CheckoutActivity.AUTO_TYPE_KEY, "R15/similar");
                intent.putExtra(CheckoutActivity.AMOUNT_KEY, "94");
                intent.putExtra(CheckoutActivity.DESC_KEY, "motorbike image");
                startActivity(intent);
            }
        };
        sportBikeLayout.setOnClickListener(sportBikeLayoutListener);

        //user can click this image to make this item their favourite
        final ImageView sportBikeFavouriteView = (ImageView)findViewById(R.id.sportBikeFavouriteView);
        sportBikeFavouriteView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(currState3){
                    sportBikeFavouriteView.setImageResource(R.drawable.ic_baseline_favorite_border_24);
                    currState3 = false;
                }else{
                    sportBikeFavouriteView.setImageResource(R.drawable.ic_baseline_favorite_24_red);
                    currState3 = true;
                }
            }
        });

        LinearLayout dirtBikeLayout = (LinearLayout)findViewById(R.id.dirtBikeLinearLayout);
        View.OnClickListener dirtBikeLayoutListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MotorbiketypesActivity.this, CheckoutActivity.class);
                intent.putExtra(CheckoutActivity.SPEC_KEY, "Dirt bikes are specially designed for off-road events. The term off-road refers to driving surfaces that are not conventionally paved. These are rough surfaces, often created naturally, such as sand, gravel, a river, mud or snow.");
                intent.putExtra(CheckoutActivity.IMG_KEY, Integer.toString(R.drawable.dirt_bike_small));
                intent.putExtra(CheckoutActivity.AUTO_TYPE_KEY, "Dirt Bike");
                intent.putExtra(CheckoutActivity.AMOUNT_KEY, "43");
                intent.putExtra(CheckoutActivity.DESC_KEY, "motorbike image");
                startActivity(intent);
            }
        };
        dirtBikeLayout.setOnClickListener(dirtBikeLayoutListener);

        //user can click this image to make this item their favourite
        final ImageView dirtBikeFavouriteView = (ImageView)findViewById(R.id.dirtBikeFavouriteView);
        dirtBikeFavouriteView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(currState4){
                    dirtBikeFavouriteView.setImageResource(R.drawable.ic_baseline_favorite_border_24);
                    currState4 = false;
                }else{
                    dirtBikeFavouriteView.setImageResource(R.drawable.ic_baseline_favorite_24_red);
                    currState4 = true;
                }
            }
        });
    }
}