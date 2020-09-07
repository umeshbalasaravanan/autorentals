package edu.udayton.autorentals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class BiketypeActivity extends AppCompatActivity {
    private Boolean currState = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biketype);

        LinearLayout hybridBikeLayout = (LinearLayout)findViewById(R.id.hybridBikeLinearLayout);
        View.OnClickListener standardBikeLayoutListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BiketypeActivity.this, CheckoutActivity.class);
                intent.putExtra(CheckoutActivity.SPEC_KEY, " Hybrid bike is a general-purpose bike that can tolerate a wide range of riding conditions and applications. Their stability, comfort and ease of use make them popular with novice cyclists, casual riders, commuters, and children.");
                intent.putExtra(CheckoutActivity.IMG_KEY, Integer.toString(R.drawable.hybrid_bike_small));
                intent.putExtra(CheckoutActivity.AUTO_TYPE_KEY, "Hybrid Bikes");
                intent.putExtra(CheckoutActivity.AMOUNT_KEY, "24");
                intent.putExtra(CheckoutActivity.DESC_KEY, "bicycle image");
                startActivity(intent);
            }
        };
        hybridBikeLayout.setOnClickListener(standardBikeLayoutListener);

        final ImageView hybridBikeFavouriteView = (ImageView)findViewById(R.id.hybridBikeFavouriteView);
        hybridBikeFavouriteView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(currState){
                    hybridBikeFavouriteView.setImageResource(R.drawable.ic_baseline_favorite_border_24);
                    currState = false;
                }else{
                    hybridBikeFavouriteView.setImageResource(R.drawable.ic_baseline_favorite_24_red);
                    currState = true;
                }
            }
        });

        LinearLayout roadBikeLayout = (LinearLayout)findViewById(R.id.roadBikeLinearLayout);
        View.OnClickListener roadBikeLayoutListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BiketypeActivity.this, CheckoutActivity.class);
                intent.putExtra(CheckoutActivity.SPEC_KEY, "The tires are narrow, high-pressure (100 psi (700 kPa) or higher), and smooth to decrease rolling resistance. The handlebars are bent dropped to allow the rider position to be leaned forward and downward, which reduces the forward vertical cross sectional area and thus highly reduces the air resistance");
                intent.putExtra(CheckoutActivity.IMG_KEY, Integer.toString(R.drawable.road_bike_small));
                intent.putExtra(CheckoutActivity.AUTO_TYPE_KEY, "Road Bikes");
                intent.putExtra(CheckoutActivity.AMOUNT_KEY, "33");
                intent.putExtra(CheckoutActivity.DESC_KEY, "bicycle image");
                startActivity(intent);
            }
        };
        roadBikeLayout.setOnClickListener(roadBikeLayoutListener);

        final ImageView roadBikeFavouriteView = (ImageView)findViewById(R.id.roadBikeFavouriteView);
        roadBikeFavouriteView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(currState){
                    roadBikeFavouriteView.setImageResource(R.drawable.ic_baseline_favorite_border_24);
                    currState = false;
                }else{
                    roadBikeFavouriteView.setImageResource(R.drawable.ic_baseline_favorite_24_red);
                    currState = true;
                }
            }
        });

        LinearLayout timeRailBikeLayout = (LinearLayout)findViewById(R.id.timeRailBikeLinearLayout);
        View.OnClickListener timeRailBikeLayoutListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BiketypeActivity.this, CheckoutActivity.class);
                intent.putExtra(CheckoutActivity.SPEC_KEY, "A time trial bicycle is a racing bicycle designed for use in an individual race against the clock. Compared to a road bike, a time trial bike is more aerodynamic, has a shorter wheelbase, and puts the rider closer to the front of the bicycle. It may have either solid disc or spoked wheels.");
                intent.putExtra(CheckoutActivity.IMG_KEY, Integer.toString(R.drawable.time_trail_bike_small));
                intent.putExtra(CheckoutActivity.AUTO_TYPE_KEY, "Time-trail Bikes");
                intent.putExtra(CheckoutActivity.AMOUNT_KEY, "42");
                intent.putExtra(CheckoutActivity.DESC_KEY, "bicycle image");
                startActivity(intent);
            }
        };
        timeRailBikeLayout.setOnClickListener(timeRailBikeLayoutListener);

        final ImageView timeTrailBikeFavouriteView = (ImageView)findViewById(R.id.timeTrailBikeFavouriteView);
        timeTrailBikeFavouriteView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(currState){
                    timeTrailBikeFavouriteView.setImageResource(R.drawable.ic_baseline_favorite_border_24);
                    currState = false;
                }else{
                    timeTrailBikeFavouriteView.setImageResource(R.drawable.ic_baseline_favorite_24_red);
                    currState = true;
                }
            }
        });
    }
}