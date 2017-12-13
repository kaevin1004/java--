package com.example.administrator.gridcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

     TextView saveTextView;
     TextView resultTextView;
     Button one, two, three, four, five, six, seven, eight, nine, zero;
     Button add, mul, sub, div, result, AC, c;

     private static Stack stack = new Stack();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveTextView = (TextView) findViewById(R.id.saveTextView);
        resultTextView = (TextView) findViewById(R.id.resultTextView);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);

        add = (Button) findViewById(R.id.add);
        mul = (Button) findViewById(R.id.mul);
        sub = (Button) findViewById(R.id.sub);
        div = (Button) findViewById(R.id.div);
        result = (Button) findViewById(R.id.result);
        AC = (Button) findViewById(R.id.AC);
        c = (Button) findViewById(R.id.c);





        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(v.getContext(), ((Button) v).getText(), Toast.LENGTH_SHORT).show();


                 }
        };

        one.setOnClickListener(clickListener);
        two.setOnClickListener(clickListener);
        three.setOnClickListener(clickListener);
        four.setOnClickListener(clickListener);
        five.setOnClickListener(clickListener);
        six.setOnClickListener(clickListener);
        seven.setOnClickListener(clickListener);
        eight.setOnClickListener(clickListener);
        nine.setOnClickListener(clickListener);
        zero.setOnClickListener(clickListener);

        add.setOnClickListener(clickListener);
        mul.setOnClickListener(clickListener);
        sub.setOnClickListener(clickListener);
        div.setOnClickListener(clickListener);
        result.setOnClickListener(clickListener);
        AC.setOnClickListener(clickListener);
        c.setOnClickListener(clickListener);

    }


}
