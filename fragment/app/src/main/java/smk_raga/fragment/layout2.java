package smk_raga.fragment;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class layout2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setHomeButtonEnabled(true);
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_white_24dp);
        actionbar.setDisplayShowHomeEnabled(true);
    }

    public boolean onOptionsItemSelected(MenuItem item ){
        Intent  goback = new Intent(getApplicationContext(), ActionBackOntitle.class);
        startActivityForResult(goback, 0);
        return  true;

    }
}
