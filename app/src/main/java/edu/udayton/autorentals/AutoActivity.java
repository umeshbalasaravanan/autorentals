package edu.udayton.autorentals;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;


public class AutoActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       //setContentView(R.layout.activity_auto);

        //Listview of autotype from strings.xml is fetched and placed in "activity_out" file
        List<String> autoTypes = Arrays.asList(getResources().getStringArray(R.array.autoTypes));
       setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_auto, R.id.autoTextView, autoTypes));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //super.onListItemClick(l, v, position, id);
        Intent intent;
        switch (position){
            case 0:
                //if List1 is clicked, it will direct to cartype_activity page
                intent = new Intent(AutoActivity.this, CartypesActivity.class);
                break;
            case 1:
                //if List2 is clicked, it will direct to Trucktype_activity page
                intent = new Intent(AutoActivity.this, TrucktypesActivity.class);
                break;
            case 2:
                //if List3 is clicked, it will direct to Motorbiketype_activity page
                intent = new Intent(AutoActivity.this, MotorbiketypesActivity.class);
                break;
            case 3:
                //if List2 is clicked, it will direct to Biketype_activity page
                intent = new Intent(AutoActivity.this, BiketypeActivity.class);
                break;
            default:
                //toast stating "Invalid choice made " will be displayed, if invalid choice was made
                Toast myToast = Toast.makeText(AutoActivity.this, "Invalid choice made", Toast.LENGTH_LONG);
                myToast.show();
                intent = null;
                break;
        }
        if(intent != null){
            startActivity(intent);
        }
    }
}