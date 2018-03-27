package id.rbs.raga.crud.activitiy;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import id.rbs.raga.crud.MainActivity;
import id.rbs.raga.crud.R;
import id.rbs.raga.crud.UserActivity;
import id.rbs.raga.crud.function.SessionManager;
import id.rbs.raga.crud.model.ModelUser;
import id.rbs.raga.crud.network.RestApi;
import id.rbs.raga.crud.network.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends SessionManager {

    @BindView(R.id.edtUsername)
    EditText edtUsername;
    @BindView(R.id.edtPassword)
    EditText edtPassword;
    @BindView(R.id.rbtAdmin)
    RadioButton rbtAdmin;
    @BindView(R.id.rbtUserBiasa)
    RadioButton rbtUserBiasa;
    @BindView(R.id.btnLogin)
    Button btnLogin;
    @BindView(R.id.btnRegister)
    Button btnRegister;
    String strusername, strpassword, strlevel;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);
        if (rbtAdmin.isChecked()) {
            strlevel = "admin";
        } else {
            strlevel = "user biasa";
        }

    }

    @OnClick({R.id.rbtAdmin, R.id.rbtUserBiasa, R.id.btnLogin, R.id.btnRegister})
    public void onViewClicked(View view) {

        switch (view.getId()) {

            case R.id.rbtAdmin:
                strlevel= "admin";
                //Aksi Login

                break;

            case R.id.rbtUserBiasa:
                strlevel = "user biasa";
                //Aksi Login

                break;

            case R.id.btnLogin:

                strusername = edtUsername.getText().toString();
                strpassword = edtPassword.getText().toString();
                if(TextUtils.isEmpty(strusername)){
                    edtUsername.requestFocus();
                    MyAnimation(edtUsername);
                    edtUsername.setError("Username tidak boleh kosong!");
                }else if (TextUtils.isEmpty(strpassword)){
                    edtPassword.requestFocus();
                    MyAnimation(edtPassword);
                    edtPassword.setError("Password tidak boleh kosong");
                }else {

                    loginUser();

                }
                //Aksi Login

                break;
            case R.id.btnRegister:
                MyIntent(RegisterActivtiy.class);
                //Aksi Register

                break;
        }

    }



    private void loginUser() {

        final ProgressDialog dialog = ProgressDialog.show(LoginActivity.this, "Progress login user", "loading");
        RestApi api = RetrofitClient.getInstaceRetrofit();

        Call<ModelUser> modelUserCall = api.loginUser(strusername, strpassword, strlevel);

        modelUserCall.enqueue(new Callback<ModelUser>() {
            @Override
            public void onResponse(Call<ModelUser> call, Response<ModelUser> response) {


                if (response.isSuccessful()) {
                    dialog.dismiss();

                    String status = response.body().getResult();
                    String pesan = response.body().getMsg();
                    String level = response.body().getUser().getLevelUser();

                    if (status.equals("1")) {
                        MyToast(pesan);
                        if (level.equals("admin")) {
                            MyToast("Level user anda adalah " + level + " Welcome!");
                            MyIntent(MainActivity.class);
                            finish();

                            sessionManager.createSession(strusername);
                            String iduser = response.body().getUser().getIdUser();
                            sessionManager.setIdUser(iduser);
                        } else {
                            MyToast("Level user anda adalah " + level + " Welcome!");
                            MyIntent(UserActivity.class);

                            sessionManager.createSession(strusername);
                            String iduser = response.body().getUser().getIdUser();
                            sessionManager.setIdUser(iduser);
                        }
                    } else {
                        MyToast(pesan + " Cek lagi username, password & hak akses user anda!");
                    }

            }


        }

            @Override
            public void onFailure(Call<ModelUser> call, Throwable t) {

                MyToast("Gagal koneksi " + t.getMessage());
                dialog.dismiss();

            }

    });
}}
