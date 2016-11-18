package rukina.newrie;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Nandha on 27-07-2016.
 */
public class InitialActivity extends AppCompatActivity implements View.OnClickListener {

    Button SignIn, NewAccount, Skip;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);

        SignIn = (Button) findViewById(R.id.btn_signin);
        SignIn.setOnClickListener(this);
        NewAccount = (Button) findViewById(R.id.btn_new_acc);
        NewAccount.setOnClickListener(this);
        Skip = (Button) findViewById(R.id.btn_skip);
        Skip.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == SignIn) {
            Intent signUpIntent = new Intent(this, LoginActivity.class);
            startActivity(signUpIntent);
            finish();
        } else if (view == NewAccount) {
            Intent signUpIntent = new Intent(this, CreateAccountActivity.class);
            startActivity(signUpIntent);
        } else if (view == Skip) {
            Intent signUpIntent = new Intent(this, MainActivity.class);
            startActivity(signUpIntent);
            finish();
        }
    }
}
