package com.example.administrator.scrollview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class AddButtonActivity extends AppCompatActivity {

    private Button btnAdd;
    private LinearLayout scroll;
    private Button btnAdd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_button);

        // 찾기
        btnAdd = findViewById(R.id.btnAdd);
        scroll = findViewById(R.id.scroll);
        btnAdd2 = findViewById(R.id.btnAdd2);

        //설정
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //추가되는 버튼에 대한 LayoutParam 설정. 뷰영역 설정

                //버튼 생성.

                //생성된 버튼을 LinearLayout에 추가 addView() 메서드 이용

                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT
                );
                //마진 추가
                lp.setMargins(10,10,10,10);

                //버튼 생성
                Button btn = new Button(getApplicationContext());

                btn.setText(R.string.app_name);
                btn.setText("push me");
                btn.setLayoutParams(lp);//생성된 버튼의 뷰 영역을 생성
                btn.setBackgroundColor(Color.BLUE);




                //생성된 버튼을 LinearLayout에 추가 addView() 메서드 이용
                scroll.addView(btn);

            }
        });

        btnAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*for (int i = 1; i <=5; i = i+1) {
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT
                    );

                    lp.setMargins(10,10,10,10);

                    Button btn2 = new Button(getApplicationContext());

                    btn2.setText(R.string.app_name);
                    btn2.setText("HELL!!!!!");
                    btn2.setLayoutParams(lp);
                    btn2.setBackgroundColor(Color.RED);

                    scroll.addView(btn2);*/

                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT
                );

                lp.setMargins(10, 10, 10, 10);

                Button btn2 = new Button(getApplicationContext());

                btn2.setText(R.string.app_name);
                btn2.setText("HELL!!!!!");
                btn2.setLayoutParams(lp);
                btn2.setBackgroundColor(Color.RED);

                Button btn3 = new Button(getApplicationContext());
                btn3.setText(R.string.app_name);
                btn3.setText("HELL!!!!!");
                btn3.setLayoutParams(lp);
                btn3.setBackgroundColor(Color.RED);

                Button btn4 = new Button(getApplicationContext());
                btn4.setText(R.string.app_name);
                btn4.setText("HELL!!!!!");
                btn4.setLayoutParams(lp);
                btn4.setBackgroundColor(Color.RED);

                Button btn5 = new Button(getApplicationContext());
                btn5.setText(R.string.app_name);
                btn5.setText("HELL!!!!!");
                btn5.setLayoutParams(lp);
                btn5.setBackgroundColor(Color.RED);

                Button btn6 = new Button(getApplicationContext());
                btn6.setText(R.string.app_name);
                btn6.setText("HELL!!!!!");
                btn6.setLayoutParams(lp);
                btn6.setBackgroundColor(Color.RED);

                scroll.addView(btn2);
                scroll.addView(btn3);
                scroll.addView(btn4);
                scroll.addView(btn5);
                scroll.addView(btn6);


            }
        /*}*/
        });
    }
}
