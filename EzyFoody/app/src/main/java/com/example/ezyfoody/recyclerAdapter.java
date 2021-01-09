package com.example.ezyfoody;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder> {
    private ArrayList<Drink> drinkCatalog;
    private RecyclerViewClickListener listener;

    public recyclerAdapter(ArrayList<Drink> drinkCatalog, RecyclerViewClickListener listener){
        this.drinkCatalog = drinkCatalog;
        this.listener = listener;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView nameTxt;

        public MyViewHolder(final View view){
            super(view);
            nameTxt = view.findViewById(R.id.drinksName);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());
        }
    }

    @NonNull
    @Override
    public recyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_drink_catalog, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter.MyViewHolder holder, int position) {
        String name = drinkCatalog.get(position).getDrinksName();
        holder.nameTxt.setText(name);
    }

    @Override
    public int getItemCount() {
        return drinkCatalog.size();
    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }

}
