package smk_raga.adab;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class menu extends AppCompatActivity {
    Button button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        button1 = (Button)findViewById(R.id.bt1);
        button2 = (Button)findViewById(R.id.bt2);
        button3 = (Button)findViewById(R.id.bt3);
        button4 = (Button)findViewById(R.id.bt4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this, adab.class));
                Toast.makeText(menu.this, "macam-macam adab", Toast.LENGTH_SHORT).show();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://id.wikipedia.org/wiki/Adab");
                Intent perpindahan = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(perpindahan);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this, AboutApps.class));
                Toast.makeText(menu.this, "Tentang Aplikasi", Toast.LENGTH_SHORT).show();

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this, profile.class));
                Toast.makeText(menu.this, "Profile", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
