package smk_raga.adab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detailadab extends AppCompatActivity {

    TextView text1;
    ImageView image22;
    TextView tex2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailadab);
        text1 = (TextView)findViewById(R.id.tex3);
        image22 = (ImageView) findViewById(R.id.gambar2);
        tex2 =(TextView) findViewById(R.id.tex11);

        Bundle tampungdata = getIntent().getExtras();
        String text2 = tampungdata.getString("judul");
        Integer gambar2 = tampungdata.getInt("image");
        String text3 = tampungdata.getString("isi");
        text1.setText(text2);
        image22.setImageResource(gambar2);
        tex2.setText(text3);
    }
}
