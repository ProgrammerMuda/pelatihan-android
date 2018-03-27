package id.rbs.raga.crud.function;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.VisibleForTesting;

import id.rbs.raga.crud.MainActivity;
import id.rbs.raga.crud.activitiy.LoginActivity;

public class SessionManager extends myfunction{

    @VisibleForTesting
    SharedPreferences pref;

    public SharedPreferences.Editor editor;
    public SessionManager sessionManager;

    int mode = 0;

    private static final String pref_name = "crudpref";
    private static final String is_login = "isLogin";
    private static final String kunci_email = "keyMail";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sessionManager = new SessionManager(getApplicationContext());
    }

    public SessionManager(){

    }


    public SessionManager(Context context) {

        c =context;

        pref = context.getSharedPreferences(pref_name, mode);
        editor = pref.edit();

    }

    public void createSession(String email){
        editor.putBoolean(is_login,true);
        editor.putString(kunci_email, email);
        editor.commit();
    }

    public void setIdUser(String iduser){
        editor.putBoolean(is_login, true);
        editor.putString("iduser", iduser);
        editor.commit();
    }

    public String getIdUser(){
        return pref.getString("iduser", "");
    }


    // TODO : checkLogin
    public boolean isLogin(){
        return pref.getBoolean(is_login, false);
    }

    //TODO 72: Membuat Cek Login Method
    public void checkLogin(){{}
        if (!this.isLogin()) {
            Intent i = new Intent(c, LoginActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            c.startActivity(i);
        } else {
            Intent i = new Intent(c, MainActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            c.startActivity(i);
        }
    }

    public void logOut(){
        editor.clear();
        editor.commit();

        Intent i = new Intent(c, LoginActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        c.startActivity(i);
    }

}
