package id.rbs.raga.crud.function;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.Toast;

import id.rbs.raga.crud.R;

/**
 * Created by RAGA on 21/03/2018.
 */



public class myfunction extends AppCompatActivity {
    public static Context c;

    Animation animation;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        c = myfunction.this;
    }

    public void MyAnimation(EditText edAnimasi){
        animation = AnimationUtils.loadAnimation(c, R.anim.animasigetar);
        edAnimasi.setAnimation(animation);
    }
    public void MyToast(String isiPesan){
        Toast.makeText(c, isiPesan, Toast.LENGTH_SHORT).show();
    }

    public void MyIntent(Class classTujuan){
        startActivity(new Intent(c , classTujuan));
    }


}
