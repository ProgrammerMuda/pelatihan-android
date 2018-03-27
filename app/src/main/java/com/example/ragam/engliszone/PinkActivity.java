package com.example.ragam.engliszone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PinkActivity extends AppCompatActivity {

    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pink);

        img1 = (ImageView)findViewById(R.id.bt1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PinkActivity.this, colorActivity.class));
                finish();
            }
        });
    }
}
