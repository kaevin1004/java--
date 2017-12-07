package com.example.administrator.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Edit1, Edit2;
    Button BtnAdd, BtnSub, BtnMul, BtnDiv;
    TextView TextResult;
    int num1, num2;
    Integer Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("계산기 만들기 어렵욧욧욧");

        Edit1 = (EditText) findViewById(R.id.Edit1);
        Edit2 = (EditText) findViewById(R.id.Edit2);
        BtnAdd = (Button) findViewById(R.id.BtnAdd);
        BtnSub = (Button) findViewById(R.id.BtnSub);
        BtnMul = (Button) findViewById(R.id.BtnMul);
        BtnDiv = (Button) findViewById(R.id.BtnDiv);
        TextResult = (TextView) findViewById(R.id.TextResult);

        View.OnClickListener clisten = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(Edit1.getText().toString());
                num2 = Integer.parseInt(Edit2.getText().toString());
                switch (view.getId()){
                    case R.id.BtnAdd :
                        Result = num1+num2;
                        break;

                    case R.id.BtnSub :
                        Result = num1-num2;
                        break;

                    case R.id.BtnMul :
                        Result = num1*num2;
                        break;

                    case R.id.BtnDiv :
                        Result = num1/num2;
                        break;
                }

                TextResult.setText("계산결과 : "+Result);
            }
        };

        BtnAdd.setOnClickListener(clisten);
        BtnSub.setOnClickListener(clisten);
        BtnMul.setOnClickListener(clisten);
        BtnDiv.setOnClickListener(clisten);
    }
}
