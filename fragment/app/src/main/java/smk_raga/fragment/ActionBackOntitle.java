package smk_raga.fragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActionBackOntitle extends AppCompatActivity {
    Button bt1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_back_ontitle);
        bt1 =(Button)findViewById(R.id.btnpindah);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActionBackOntitle.this, layout2.class));
            }
        });
    }
}
