package com.example.listviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private TextView textView1;
    private EditText edittext1;
    private Button button1;
    private ListView listview1;
    List<String> list;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textview1);
        edittext1 = findViewById(R.id.edittext1);
        button1 = findViewById(R.id.button1);
        listview1 = findViewById(R.id.listview1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input = edittext1.getText().toString();

                if (!TextUtils.isEmpty(input)){
                    //데이터 추가
                    adapter.add(input);
                    //adapter.notifyDataSetChanged(); // listView 새로고침
                    listview1.smoothScrollToPosition(list.size()-1);

                }

            }
        });

        listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String items = ((TextView)view).getText().toString();

                textView1.setText(items);


            }
        });
        // 데이터 만들기
        String [] items = getResources().getStringArray(R.array.items);
        //배열을 리스트로 변환
        list = new ArrayList<String>(Arrays.asList(items));

        //어댑터 생성
        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, list);


        //어탭터 연결
        listview1.setAdapter(adapter);

    }
}
