package com.example.adapterview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textview1;
    private Spinner spinner1;
    private AutoCompleteTextView autoComplete1;
    private ListView listView1;
    private String[] items = {"1","2","3","4","5"};
    private String[] months = {"january", "February","March","April","May","June","July","August","September","October","Novermber","December"};
    private String[] itemsLV = {"a","b","c","d","e"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview1 = findViewById(R.id.textveiw1);
        spinner1 = findViewById(R.id.spinner1);
        autoComplete1 = findViewById(R.id.autocomplete1);
        listView1 = findViewById(R.id.listview1);

        // adaper 생성

        ArrayAdapter<String> adapterSpinner = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, items);

        // spinner와 adapter 연결
        spinner1.setAdapter(adapterSpinner);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //positionb : 현재 선택된 배열의 방번호
                String selecteditem = items[i];

                textview1.setText(selecteditem);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        /*AutoCompleteTextView 와 adapter 연동.
        1. 데이터 생성
        2. adapter 생성
        3. AutoCompleteTextView 와 adapter 연결
        4. 리스너 설정
        */



        ArrayAdapter<String> adapterMonth = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, months);

        autoComplete1.setAdapter(adapterMonth);
        autoComplete1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selecteditem = ((TextView)view).getText().toString();
                textview1.setText(selecteditem);
            }
        });

        /*ListView 와 ArrayAdapter 연동.
        1. 데이터 생성
        2. adapter 생성
        3. AutoCompleteTextView 와 adapter 연결
        4. 리스너 설정
        */



        ArrayAdapter<String> adapterLV = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, itemsLV);

        listView1.setAdapter(adapterLV);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String selecteditem = ((TextView)view).getText().toString();
                textview1.setText(selecteditem);
            }
        });

    }
}
