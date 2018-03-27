package com.example.raga.cardviewwithabi;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ImageView;
        import android.widget.TextView;

public class detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = (ImageView)findViewById(R.id.icondetail);
        TextView textView = (TextView)findViewById(R.id.sosmed_detail);

        Intent getdata= getIntent();

        imageView.setImageResource(getIntent().getExtras().getInt("gambar"));
        textView.setText(getIntent().getExtras().getString("sosmed"));
    }
}
