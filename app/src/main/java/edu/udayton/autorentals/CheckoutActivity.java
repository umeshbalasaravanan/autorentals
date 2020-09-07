package edu.udayton.autorentals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class CheckoutActivity extends AppCompatActivity {

    public static final String SPEC_KEY = "SPEC_ID";
    public static final String IMG_KEY = "IMG";
    public static final String AUTO_TYPE_KEY = "AUTO_TYPE";
    public static final String AMOUNT_KEY = "AMOUNT";
    public static final String DESC_KEY = "DESC";

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        Intent intent = getIntent();
        Bundle myExtras = intent.getExtras();

        if(myExtras!= null){
            //gets the specification of the Auto
            String spec = myExtras.getString(SPEC_KEY);
            TextView specTextView = (TextView)findViewById(R.id.autoSpecTextView);
            specTextView.setText(spec);

            //gets the image of the Auto
            String img = myExtras.getString(IMG_KEY);
            int image = Integer.parseInt(img);
            String contentDesc = myExtras.getString(DESC_KEY);
            ImageView imageView = (ImageView)findViewById(R.id.autoImageView);
            imageView.setImageResource(image);
            imageView.setContentDescription(contentDesc);

            //gets the Auto type
            String autoType = myExtras.getString(AUTO_TYPE_KEY);
            TextView autoTypeTextView = (TextView)findViewById(R.id.autoTypeTextView);
            autoTypeTextView.setText(autoType);

            //gets the amount that has to be charged for one day
            final String amount = myExtras.getString(AMOUNT_KEY);
            final TextView amountTextView = (TextView)findViewById(R.id.amountTextView);
            amountTextView.setText("$ "+amount);

            //user can choose number of days between 1 and 3 and based on that, the base amount will be increased and displayed in the amountTexview
            Spinner daySpinner = (Spinner)findViewById(R.id.daySpinner);
            daySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    //Toast.makeText(adapterView.getContext(), adapterView.getItemAtPosition(i).toString(),Toast.LENGTH_LONG).show();
                    int no_of_days = Integer.parseInt(adapterView.getItemAtPosition(i).toString());
                    int amnt = Integer.parseInt(amount);
                    int total = no_of_days * amnt;
                    String tl = Integer.toString(total);
                    amountTextView.setText("$ " + tl);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }
        //When user clicks this button, it navigates to BookingConfirmationActvity page
        Button confirmButton = (Button)findViewById(R.id.confirmButtonView);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(CheckoutActivity.this, BookingconfirmationActivity.class);
                startActivity(myIntent);
            }
        });
    }
}