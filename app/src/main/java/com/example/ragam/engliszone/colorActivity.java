package com.example.ragam.engliszone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class colorActivity extends AppCompatActivity {

    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        bt1 = (Button)findViewById(R.id.button);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(colorActivity.this, RedActivity.class));
            }
        });
        bt2 = (Button)findViewById(R.id.button2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(colorActivity.this, YellowActivity.class));
            }
        });
        bt3 = (Button)findViewById(R.id.button3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(colorActivity.this, GreenActivity.class));
            }
        });
        bt4 = (Button)findViewById(R.id.button4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(colorActivity.this, OrangeActivity.class));
            }
        });
        bt5 = (Button)findViewById(R.id.button5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(colorActivity.this, BlueActivity.class));
            }
        });
        bt6 = (Button)findViewById(R.id.button6);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(colorActivity.this, BlackActivity.class));
            }
        });
        bt7 = (Button)findViewById(R.id.button7);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(colorActivity.this, WhiteActivity.class));
            }
        });
        bt8 = (Button)findViewById(R.id.button8);
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(colorActivity.this, GrayActivity.class));
            }
        });
        bt9 = (Button)findViewById(R.id.button9);
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(colorActivity.this, BrownActivity.class));
            }
        });
        bt10 = (Button)findViewById(R.id.button10);
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(colorActivity.this, PinkActivity.class));
            }
        });
        bt11 = (Button)findViewById(R.id.button11);
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(colorActivity.this, PurpleActivity.class));
            }
        });

        img = (ImageView) findViewById(R.id.back);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(colorActivity.this, HomeActivity.class));
                finish();
            }
        });

    }
}
