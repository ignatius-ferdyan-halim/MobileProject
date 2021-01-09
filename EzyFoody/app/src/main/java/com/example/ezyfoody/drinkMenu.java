package com.example.ezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class drinkMenu extends AppCompatActivity {

    private ArrayList<Drink> drinkCatalog;

    private RecyclerView recyclerView;
    private recyclerAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_menu);
        recyclerView = findViewById(R.id.recyclerView);
        drinkCatalog = new ArrayList<>();

        setDrinksInfo();
        setAdapter();
    }

    private void setAdapter() {
        setOnClickListener();
        recyclerAdapter adapter = new recyclerAdapter(drinkCatalog, listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setOnClickListener() {
        listener = new recyclerAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), orderDrink.class);
                intent.putExtra("drinksName", drinkCatalog.get(position).getDrinksName());
                startActivity(intent);
            }
        };
    }

    private void setDrinksInfo(){
        drinkCatalog.add(new Drink("Air Mineral  Rp. 123"));
        drinkCatalog.add(new Drink("Jus Mangga   Rp. 123"));
        drinkCatalog.add(new Drink("Jus Alpukat  Rp. 123"));
        drinkCatalog.add(new Drink("Jus Apel     Rp. 123"));
    }


}