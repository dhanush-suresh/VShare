package a.b.vshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.*;
import android.widget.EditText;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {

    private Button button2;
    Button login;
    EditText user;
    EditText pwd;
    TextView emsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = findViewById(R.id.txtu);
        pwd = findViewById(R.id.txtp);
        login = findViewById(R.id.button);
        emsg = findViewById(R.id.error);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                opensignUpActivity();

            }


        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = user.getText().toString();
                String pass = pwd.getText().toString();
                if (uname.isEmpty())
                    emsg.setText("Username is mandatory");
                else if (pass.isEmpty())
                    emsg.setText("Password is mandatory");
                else {
                    Intent i = new Intent(loginActivity.this, locationActivity.class);
                    startActivity(i);

                }
            }
        });
    }

    public void opensignUpActivity(){
        Intent intent= new Intent(loginActivity.this,signUpActivity.class);
        startActivity(intent);
    }


}

