package com.example.administrator.scrollview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;

public class AutoIncrementScrollViewActivity extends AppCompatActivity {

    private ScrollView  scroll;
    private LinearLayout  layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_increment_scroll_view);

        // 찾기
        scroll = findViewById(R.id.scroll);
        layout = findViewById(R.id.layout);

        //설정 ScrollView.OnScrollChangedListener 핸들러 작성.
        scroll.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public void onScrollChanged() {

                //바닥에 도달하면 if를 사용
                if (layout.getHeight() == scroll.getScrollY() + scroll.getHeight()) {
                    for (int i = 1; i <= 5; i = i + 1) {
                        LayoutParams lp = new LayoutParams(
                                LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);

                        lp.setMargins(10, 10, 10, 10);

                        Button btn = new Button(getApplicationContext());

                        btn.setText(R.string.app_name);
                        btn.setText("GO To HELL!!!!!!!!");
                        btn.setLayoutParams(lp);//생성된 버튼의 뷰 영역을 생성
                        btn.setBackgroundColor(Color.RED);

                        layout.addView(btn);
                    }
                }
            }
        });


    }
}
