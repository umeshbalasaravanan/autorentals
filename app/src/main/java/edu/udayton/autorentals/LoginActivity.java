package edu.udayton.autorentals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //if the user is new to this application, it asks the user to clicke "create one" to create an account.
        TextView registrationLinkView = (TextView)findViewById(R.id.registrationLinkView);

        View.OnTouchListener registrationLinkViewListener = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
                return true;
            }
        };
        registrationLinkView.setOnTouchListener(registrationLinkViewListener);

        // user clicks login to view the types of autos that are available
        Button login = (Button)findViewById(R.id.loginButtonView);
        View.OnClickListener loginOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, AutoActivity.class);
                startActivity(intent);
            }
        };
        login.setOnClickListener(loginOnClickListener);
    }
}