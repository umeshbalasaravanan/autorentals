package edu.udayton.autorentals;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {

    EditText firstName, lastName, emailAddress, confirmEmailAddress, password, confirmPassword;
    FirebaseDatabase database;
    DatabaseReference mDatabase;
    FirebaseAuth auth;
    User user;
    String userId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //tried connecting the application to firebase database using google-services.json file.

        firstName = (EditText)findViewById(R.id.editTextTextFirstName);
        lastName = (EditText)findViewById(R.id.editTextTextLastName);
        emailAddress = (EditText)findViewById(R.id.editTextTextEmailAddress);
        confirmEmailAddress = (EditText)findViewById(R.id.editTextTextConfirmPassword);
        password = (EditText)findViewById(R.id.editTextTextPassword);
        confirmPassword = (EditText)findViewById(R.id.editTextTextConfirmPassword);
        Button registerButtonView = (Button)findViewById(R.id.registerButtonView);
        Button cancelButtonView = (Button)findViewById(R.id.cancelButtonView);

        database = FirebaseDatabase.getInstance();
        mDatabase = database.getReference("users");
        auth = FirebaseAuth.getInstance();

        //once registered, moved to login page
        View.OnClickListener registerButtonViewListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fName = firstName.getText().toString();
                String lName = lastName.getText().toString();
                String em = emailAddress.getText().toString();
                String confirmEm = confirmEmailAddress.getText().toString();
                String pw = password.getText().toString();
                String conf_pw = password.getText().toString();
                user = new User(fName, lName, em, confirmEm, pw, conf_pw);
                //registerUser(em, pw);
                Intent myIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(myIntent);
            }
        };
    registerButtonView.setOnClickListener(registerButtonViewListener);

    //reloads the registration page
    View.OnClickListener cancelButtonViewListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent myIntent = new Intent(RegisterActivity.this, RegisterActivity.class);
            startActivity(myIntent);
        }
    };
    cancelButtonView.setOnClickListener(cancelButtonViewListener);
    }

    private void registerUser(String email, String password) {
        auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()) {
                            FirebaseUser user = auth.getCurrentUser();
                            updateUI(user);
                            Toast.makeText(RegisterActivity.this, "registration success", Toast.LENGTH_LONG).show();
                        }else{
                            Toast.makeText(RegisterActivity.this, "registration failed", Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }

    private void updateUI(FirebaseUser currentUser) {

        String keyId = mDatabase.push().getKey();
        mDatabase.child(keyId).setValue(user);
    }
}