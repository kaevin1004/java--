package com.example.administrator.petapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2;
    CheckBox checkBox1;
    RadioGroup RadioGroup;
    RadioButton radioButton1, radioButton2, radioButton3;
    Button button1;
    ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        textView1 = (TextView) findViewById(R.id.textView1);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        textView2 = (TextView) findViewById(R.id.textView2);
        RadioGroup = (RadioGroup) findViewById(R.id.RadioGroup);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        button1 = (Button)  findViewById(R.id.button1);
        imageView1 = (ImageView)  findViewById(R.id.imageView1);

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (checkBox1.isChecked() == true){

                    textView2.setVisibility(View.VISIBLE);
                    RadioGroup.setVisibility(View.VISIBLE);
                    button1.setVisibility(View.VISIBLE);
                    imageView1.setVisibility(View.VISIBLE);
                }
                else {
                    textView2.setVisibility(View.INVISIBLE);
                    RadioGroup.setVisibility(View.INVISIBLE);
                    button1.setVisibility(View.INVISIBLE);
                    imageView1.setVisibility(View.INVISIBLE);

                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (RadioGroup.getCheckedRadioButtonId()){

                    case R.id.radioButton1 :
                        imageView1.setImageResource(R.drawable.dog);
                        break;

                    case R.id.radioButton2 :
                        imageView1.setImageResource(R.drawable.cat);
                        break;

                    case R.id.radioButton3 :
                        imageView1.setImageResource(R.drawable.rabbit);
                        break;

                        default:

                            Toast.makeText(getApplicationContext(), "동물 먼저 선택하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
