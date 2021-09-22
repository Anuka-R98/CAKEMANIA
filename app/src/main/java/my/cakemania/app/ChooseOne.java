package my.cakemania.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseOne extends AppCompatActivity {

    Button Chef, Customer, DeliveryPerson;
    Intent intent;
    String type;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_one);


        intent = getIntent();
        type = intent.getStringExtra("Home").toString().trim();

        Customer = (Button)findViewById(R.id.Customer);
        Chef = (Button)findViewById(R.id.Chef);
        DeliveryPerson = (Button)findViewById(R.id.Delivery);

        //handle Chef login
        Chef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //chef login
                if(type.equals("Emails")){
                    Intent loginChef = new Intent(ChooseOne.this, ChefLogin.class);
                    startActivity(loginChef);
                    finish();
                }
                //chef register
                if(type.equals("SignUp")){
                    Intent registerChef = new Intent(ChooseOne.this, ChefRegister.class);
                    startActivity(registerChef);
                    finish();
                }
            }
        });

        //handle Customer login
        Customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Cus login
                if(type.equals("Emails")){
                    Intent loginCus = new Intent(ChooseOne.this, CusLogin.class);
                    startActivity(loginCus);
                    finish();
                }
                //Cus register
                if(type.equals("SignUp")){
                    Intent registerCus = new Intent(ChooseOne.this, CusRegister.class);
                    startActivity(registerCus);
                    finish();
                }
            }
        });

        //handle Delivery person login
        DeliveryPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //DP login
                if(type.equals("Emails")){
                    Intent loginDP = new Intent(ChooseOne.this, DPLogin.class);
                    startActivity(loginDP);
                    finish();
                }
                //DP register
                if(type.equals("SignUp")){
                    Intent registerDP = new Intent(ChooseOne.this, DPRegister.class);
                    startActivity(registerDP);
                    finish();
                }
            }
        });

    }
}