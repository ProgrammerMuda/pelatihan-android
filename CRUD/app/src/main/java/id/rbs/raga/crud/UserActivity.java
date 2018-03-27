package id.rbs.raga.crud;

import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import id.rbs.raga.crud.function.SessionManager;

public class UserActivity extends SessionManager {

    @BindView(R.id.btnLogout)
    Button btnLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnLogout)
    public void onViewClicked() {
        sessionManager.logOut();
    }
}
