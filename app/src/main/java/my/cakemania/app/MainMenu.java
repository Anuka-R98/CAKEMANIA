package my.cakemania.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainMenu extends AppCompatActivity {

    Button signinmail, signup;
    ImageView bgimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);



        signinmail = (Button)findViewById(R.id.SignwithEmail);
        signup = (Button)findViewById(R.id.SignUp);


        //For sing with email activity
        signinmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent signmail = new Intent(MainMenu.this, ChooseOne.class);
                signmail.putExtra("Home", "Email");
                startActivity(signmail);
                finish();
            }
        });


        //For signup activity
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent signup = new Intent(MainMenu.this, ChooseOne.class);
                signup.putExtra("Home", "Signup");
                startActivity(signup);
                finish();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.gc();
        /*
        gc() method runs the garbage collector. Calling this suggests that the Java Virtual
        Machine expend effort toward recycling unused objects in order to make the memory
        they currently occupy available for quick reuse
         */
    }
}