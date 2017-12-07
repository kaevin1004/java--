package com.example.administrator.senddata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 위젯 선언
    EditText test = null;
    Button Send = null;
    TextView TestView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 위젯 찾기
        test = findViewById( R.id.test );
        Send = findViewById( R.id.Send );
        TestView = findViewById( R.id.TestView );

        //위젯 설정
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // test에서 값을 가져오기
                String tmp =  test.getText().toString();

                // txtMsg 에 값을 설정하기
                test.setText( tmp );

            }
        });

        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
