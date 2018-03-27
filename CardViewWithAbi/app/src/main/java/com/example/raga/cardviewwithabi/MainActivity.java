package com.example.raga.cardviewwithabi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] sosmed = {
            "facebook",
            "instagram",
            "twitter",
            "telegram",
            "line",
            "path",
            "whats app",
            "ask.fm",
            "BBM",
            "litebig",
            "snapchat",
            "skype",
    };

    Integer[] gambarsosmed = {
            R.drawable.facebook,
            R.drawable.instagram,
            R.drawable.twitter,
            R.drawable.telegram,
            R.drawable.line,
            R.drawable.path,
            R.drawable.whatsapp,
            R.drawable.askfm,
            R.drawable.bbm,
            R.drawable.lb,
            R.drawable.snapchat,
            R.drawable.skype,
    };

    RecyclerView recyclerView;
    ArrayList<data> dataArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.rv_sosmed);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new adapter(this, dataArrayList));

        for (int urutan = 0; urutan <sosmed.length; ++urutan){
            dataArrayList.add(new data(sosmed[urutan], gambarsosmed[urutan]));
        }
    }
}
