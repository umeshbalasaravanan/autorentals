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

        List<String> autoTypes = Arrays.asList(getResources().getStringArray(R.array.autoTypes));
       setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_auto, R.id.autoTextView, autoTypes));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //super.onListItemClick(l, v, position, id);
        Intent intent;
        switch (position){
            case 0:
                intent = new Intent(AutoActivity.this, CartypesActivity.class);
                break;
            case 1:
                intent = new Intent(AutoActivity.this, TrucktypesActivity.class);
                break;
            case 2:
                intent = new Intent(AutoActivity.this, MotorbiketypesActivity.class);
                break;
            case 3:
                intent = new Intent(AutoActivity.this, BiketypeActivity.class);
                break;
            default:
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