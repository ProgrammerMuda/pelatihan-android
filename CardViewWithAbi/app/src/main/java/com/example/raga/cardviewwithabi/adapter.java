package com.example.raga.cardviewwithabi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.raga.cardviewwithabi.R.*;

/**
 * Created by RAGA on 24/10/2017.
 */

public class adapter extends RecyclerView.Adapter<adapter.CustomViewHolder> {

    private ArrayList<data> dataArrayList;
    public adapter(MainActivity mainActivity, ArrayList<data> arrayList){
        this.dataArrayList = arrayList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.LayoutParams layoutParams;
        layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, null);
        view.setLayoutParams(layoutParams);

        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, final int position) {
        holder.gambar.setImageResource(dataArrayList.get(position).getGambar());
        holder.sosmed.setText(dataArrayList.get(position).getSosmed());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          ///      Toast.makeText(v.getContext(), "Anda Memilih sosmed " + dataArrayList.get(position).getSosmed(), Toast.LENGTH_SHORT).show();
               Bundle pkg = new Bundle();
                pkg.putInt("gambar" ,dataArrayList.get(position).getGambar());
                pkg.putString("sosmed" ,dataArrayList.get(position).getSosmed());
                v
                        .getContext()
                        .startActivity(new Intent(v.getContext(), detail.class).putExtras(pkg));


            }
        });

    }

    @Override
    public int getItemCount() {
        return dataArrayList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        public  TextView sosmed;
        public ImageView gambar;
        public CardView cardView;

        public CustomViewHolder(View itemView) {
            super(itemView);

            sosmed = (TextView) itemView.findViewById(id.sosmed_cv);
            gambar = (ImageView) itemView.findViewById(id.gambar);
            cardView = (CardView) itemView.findViewById(id.cardview);
        }
    }
}
