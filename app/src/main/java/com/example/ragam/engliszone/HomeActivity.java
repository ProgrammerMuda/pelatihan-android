package com.example.ragam.engliszone;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6;
    ImageView img ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button1 = (Button)findViewById(R.id.bt1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HomeActivity.this, colorActivity.class));


            }
        });

        button2 = (Button)findViewById(R.id.bt2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HomeActivity.this, ShapeActivity.class));


            }
        });

        button3 = (Button)findViewById(R.id.bt3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HomeActivity.this, AnimalActivity.class));


            }
        });

        button4 = (Button)findViewById(R.id.bt4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HomeActivity.this, transportActivity.class));


            }
        });

        button5 = (Button)findViewById(R.id.bt5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HomeActivity.this, FoodActivity.class));


            }
        });

        button6 = (Button)findViewById(R.id.bt6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HomeActivity.this, BajuActivity.class));


            }
        });

        img=(ImageView)findViewById(R.id.exit);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
                builder
                        .setMessage("Shutdown app???")
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();

            }
        });
    }
}
