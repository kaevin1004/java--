package com.example.st5infationcustomtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View child = LayoutInflater.from(MainActivity.this).inflate(R.layout.layout_toastborder, null, false);

        TextView textView = child.findViewById(R.id.textview);

        textView.setText("hello");

        Toast to = new Toast(MainActivity.this);
        to.setGravity(Gravity.CENTER, 0, 0);
        to.setDuration(Toast.LENGTH_LONG);
        to.setView(child);
        to.show();
    }
}
