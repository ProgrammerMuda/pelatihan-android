package smk_raga.adab;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        popup();

    }

    public void popup(){
        AlertDialog.Builder alrtbuild = new AlertDialog.Builder(profile.this);
        alrtbuild
                .setMessage("Klik data untuk mengetahui lebih lanjut.")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        AlertDialog alrt = alrtbuild.create();
        alrt.show();
    }
}


