package edu.udayton.autorentals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MotorbiketypesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motorbiketypes);

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
    }
}