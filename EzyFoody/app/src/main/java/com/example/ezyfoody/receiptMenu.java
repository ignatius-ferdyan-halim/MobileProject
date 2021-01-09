package com.example.ezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class receiptMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt_menu);
    }

    public void openMainActivity(View view){
        Intent openMain = new Intent(this, MainActivity.class);
        startActivity(openMain);
    }
}