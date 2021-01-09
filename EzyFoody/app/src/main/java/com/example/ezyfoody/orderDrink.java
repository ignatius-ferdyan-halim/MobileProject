package com.example.ezyfoody;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class orderDrink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_drink);
        TextView nameTxt = findViewById(R.id.drinksTextView);

        String drinksName = "Drink name is not set";

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            drinksName = extras.getString("drinksName");
        }

        nameTxt.setText(drinksName);
    }

    public void openPayMenu(View view){
        Intent openPayMenu = new Intent(this, payMenu.class);
        startActivity(openPayMenu);
    }

}
