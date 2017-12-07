package com.example.administrator.textatribute;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text1 = null;
    private TextView text2 = null;
    private TextView text3 = null;
    private TextView text4 = null;
    private TextView text5 = null;
    private TextView text6 = null;

    private Button button = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        text5 = findViewById(R.id.text5);
        text6 = findViewById(R.id.text6);

        button = findViewById(R.id.button);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 타이틀 변경
                setTitle(R.string.app_name2);
                //사이즈변경
                text1.setTextSize(30);
                //컬러변경
                text2.setTextColor(Color.CYAN);
                //스타일 Italic 적용
                text4.setTypeface(text3.getTypeface(), Typeface.BOLD | Typeface.ITALIC);
                text4.setTypeface(text3.getTypeface(), Typeface.BOLD_ITALIC);
                // singleLine 적용
            }
        });


    }
}
