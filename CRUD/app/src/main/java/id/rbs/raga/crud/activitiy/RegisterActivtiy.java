package id.rbs.raga.crud.activitiy;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import id.rbs.raga.crud.R;
import id.rbs.raga.crud.function.SessionManager;
import id.rbs.raga.crud.model.ModelUser;
import id.rbs.raga.crud.network.RestApi;
import id.rbs.raga.crud.network.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class RegisterActivtiy extends SessionManager {

    @BindView(R.id.edNama)
    EditText edNama;
    @BindView(R.id.edAlamat)
    EditText edAlamat;
    @BindView(R.id.edTelp)
    EditText edTelp;
    @BindView(R.id.spnJk)
    Spinner spnJk;
    @BindView(R.id.edUsername)
    EditText edUsername;
    @BindView(R.id.edPassword)
    TextInputEditText edPassword;
    @BindView(R.id.edConfirmPassword)
    TextInputEditText edConfirmPassword;
    @BindView(R.id.rbAdmin)
    RadioButton rbAdmin;
    @BindView(R.id.rbUserBiasa)
    RadioButton rbUserBiasa;
    @BindView(R.id.btnRegister)
    Button btnRegister;
    @BindView(R.id.btnErase)
    Button btnErase;

    String jeniskelamin[]= {
            "Laki-laki",
            "Perempuan"
    };

    String  strNama, strAlamat, strNoTelp, strPassword, strLevel, strConfirmPassword, strJenisKelamin, strUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        pilihlevel();
        ArrayAdapter adapter = new ArrayAdapter(c, android.R.layout.simple_spinner_item, jeniskelamin );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnJk.setAdapter(adapter);
        spnJk.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                strJenisKelamin=jeniskelamin[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    private void pilihlevel() {
        if (rbAdmin.isChecked()){
            strLevel="admin";

        }else {
            strLevel="admin biasa";
        }
    }

    @OnClick({R.id.rbAdmin, R.id.rbUserBiasa, R.id.btnRegister, R.id.btnErase})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rbAdmin:
                strLevel = "admin";
                break;
            case R.id.rbUserBiasa:
                strLevel = "user biasa";
                break;
            case R.id.btnRegister:
                strNama = edNama.getText().toString();
                strAlamat = edAlamat.getText().toString();
                strNoTelp = edTelp.getText().toString();
                strUsername = edUsername.getText().toString();
                strPassword = edPassword.getText().toString();
                strConfirmPassword = edConfirmPassword.getText().toString();
                if (TextUtils.isEmpty(strNama)){
                    edNama.setError("Silahkan isi terlebih dahulu");
                    edNama.requestFocus();
                    MyAnimation(edNama);
                } else if(TextUtils.isEmpty(strAlamat)){
                    edAlamat.setError("Silahkan isi terlebih dahulu");
                    edAlamat.requestFocus();
                    MyAnimation(edAlamat);

                }else if(TextUtils.isEmpty(strNoTelp)) {
                    edTelp.setError("Silahkan isi terlebih dahulu");
                    edTelp.requestFocus();
                    MyAnimation(edTelp);
                }
                else if(TextUtils.isEmpty(strUsername)) {
                    edUsername.setError("Silahkan isi terlebih dahulu");
                    edUsername.requestFocus();
                    MyAnimation(edUsername);
                }

                else if(TextUtils.isEmpty(strPassword)) {
                    edPassword.setError("Silahkan isi terlebih dahulu");
                    edPassword.requestFocus();
                    MyAnimation(edPassword);
                }

                else if(TextUtils.isEmpty(strConfirmPassword)) {
                    edConfirmPassword.setError("Silahkan isi terlebih dahulu");
                    edConfirmPassword.requestFocus();
                    MyAnimation(edConfirmPassword);
                }else{
                    registerUser();


                    MyIntent(LoginActivity.class);
                    MyToast("ini adalah button register");
                    ///{MyToast("Nama saya " + strNama + " asal saya dari " + strAlamat)
                    }



                break;
                case R.id.btnErase:
                break;
        }
        }

        private void registerUser() {
        final ProgressDialog dialog = ProgressDialog.show(RegisterActivtiy.this, "Progress pendaftaran", "Loading...");

        RestApi api = RetrofitClient.getInstaceRetrofit();
        Call<ModelUser> modelUsercall = api.registerUser(strNama, strAlamat, strNoTelp, strJenisKelamin, strUsername, strPassword, strLevel);

        modelUsercall.enqueue(new Callback<ModelUser>() {
            @Override
            public void onResponse(Call<ModelUser> call, Response<ModelUser> response) {
                if (response.isSuccessful()){
                    dialog.dismiss();

                    String status = response.body().getResult();
                    String pesan = response.body().getMsg();

                    if (status.equals(1)){
                        MyToast("Congratulation" + pesan);
                        MyIntent(LoginActivity.class);
                        finish();
                    }else {
                        MyToast(pesan);
                    }

                }
            }

            @Override
            public void onFailure(Call<ModelUser> call, Throwable t) {
                MyToast("Gagal terkoneksi, coba kembali!!!");
                dialog.dismiss();


            }
        });
    }
}
