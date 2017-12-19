package com.example.menuwidget;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private Button btnlogin;
    private EditText idText;
    private EditText passwordText;
    SharedPreferences pref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        idText = findViewById(R.id.idText);
        passwordText = findViewById(R.id.passwordText);
        btnlogin = findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = pref.edit();
                editor.putString("Login_ID", idText.getText().toString());
                editor.putString("Password", passwordText.getText().toString());
                editor.apply();
            }
        });
        pref = getSharedPreferences("Settings", MODE_PRIVATE);
        String id = pref.getString("Login_ID", "");
        String password = pref.getString("Password", "");

        idText.setText(id);
        passwordText.setText(password);
    }
}
