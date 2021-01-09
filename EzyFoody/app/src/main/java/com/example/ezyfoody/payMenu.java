package com.example.ezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class payMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_menu);
    }

    public void openReceiptMenu(View view){
        Intent openReceipt = new Intent(this, receiptMenu.class);
        startActivity(openReceipt);
    }

}