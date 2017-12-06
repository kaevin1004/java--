package com.example.administrator.basicwidget;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 이벤트 핸들러 설정. 선언. 찾기. 설정
        Button button1 = null;
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), RadioActivity.class);
                startActivity(i);//새창 띄우기
            }
        });
        Button button2 = null;
        button1 = findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WIDTHActivity.class);
                startActivity(i);//새창 띄우기
            }
        });

        Button button3 = null;
        button1 = findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), HEIGHTActivity.class);
                startActivity(i);//새창 띄우기
            }
        });

        Button button4 = null;
        button1 = findViewById(R.id.button4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), COLORActivity.class);
                startActivity(i);//새창 띄우기
            }
        });

        Button button5 = null;
        button1 = findViewById(R.id.button5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MARGINActivity.class);
                startActivity(i);//새창 띄우기
            }
        });

        Button button6 = null;
        button1 = findViewById(R.id.button6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PADDINGActivity.class);
                startActivity(i);//새창 띄우기
            }
        });

        Button button7 = null;
        button1 = findViewById(R.id.button7);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), VISIBLEActivity.class);
                startActivity(i);//새창 띄우기
            }
        });


    }
}
