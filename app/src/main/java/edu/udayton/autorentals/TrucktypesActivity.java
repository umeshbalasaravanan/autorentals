package edu.udayton.autorentals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class TrucktypesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trucktypes);

        LinearLayout semiTrailerTruckLayout = (LinearLayout)findViewById(R.id.semiTrailerLinearLayout);
        View.OnClickListener semiTrailerTruckLayoutListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrucktypesActivity.this, CheckoutActivity.class);
                intent.putExtra(CheckoutActivity.SPEC_KEY, "A semi-tractor-trailer truck is the combination of a tractor unit and one, or more, semi-trailers to carry freight. A semi-trailer attaches to the tractor with a type of hitch called a fifth-wheel.");
                intent.putExtra(CheckoutActivity.IMG_KEY, Integer.toString(R.drawable.semi_trailer_truck_small));
                intent.putExtra(CheckoutActivity.AUTO_TYPE_KEY, "Semi-trailer truck");
                intent.putExtra(CheckoutActivity.AMOUNT_KEY, "200");
                intent.putExtra(CheckoutActivity.DESC_KEY, "truck image");
                startActivity(intent);
            }
        };
        semiTrailerTruckLayout.setOnClickListener(semiTrailerTruckLayoutListener);

        LinearLayout flatBedTruckLayout = (LinearLayout)findViewById(R.id.flatBedTruckLinearLayout);
        View.OnClickListener flatBedTruckLayoutListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrucktypesActivity.this, CheckoutActivity.class);
                intent.putExtra(CheckoutActivity.SPEC_KEY, "A flatbed has a solid bed, usually of wooden planks. There is no roof and no fixed sides. To retain the load there are often low sides which may be hinged down for loading, as a 'drop-side' truck. A 'stake truck' has no sides but has steel upright pillars, which may be removable, again used to retain the load.");
                intent.putExtra(CheckoutActivity.IMG_KEY, Integer.toString(R.drawable.flat_bed_truck_small));
                intent.putExtra(CheckoutActivity.AUTO_TYPE_KEY, "Flat bed truck");
                intent.putExtra(CheckoutActivity.AMOUNT_KEY, "170");
                intent.putExtra(CheckoutActivity.DESC_KEY, "truck image");
                startActivity(intent);
            }
        };
        flatBedTruckLayout.setOnClickListener(flatBedTruckLayoutListener);

        LinearLayout straightTruckLayout = (LinearLayout)findViewById(R.id.straightTruckLinearLayout);
        View.OnClickListener straightTruckLayoutListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrucktypesActivity.this, CheckoutActivity.class);
                intent.putExtra(CheckoutActivity.SPEC_KEY, "A straight truck is one in which all axles are attached to a single frame. An articulated vehicle is one that consists of two or more separate frames connected by suitable couplings.");
                intent.putExtra(CheckoutActivity.IMG_KEY, Integer.toString(R.drawable.straight_truck_small));
                intent.putExtra(CheckoutActivity.AUTO_TYPE_KEY, "Straight truck");
                intent.putExtra(CheckoutActivity.AMOUNT_KEY, "163");
                intent.putExtra(CheckoutActivity.DESC_KEY, "truck image");
                startActivity(intent);
            }
        };
        straightTruckLayout.setOnClickListener(straightTruckLayoutListener);
    }
}