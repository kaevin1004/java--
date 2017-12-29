package com.example.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    private EditText edit_name;
    private EditText edit_number;
    private EditText edit_department;
    private Button btn_add;
    private Spinner spinner;
    private EditText edit_itme;
    private Button btn_search;
    private TextView textView;
    private RadioButton radioButton;
    private RadioButton radioButton2;
    private Button btn_sort;
    private Button btn_del;
    private Button btn_all_del;
    private Button btn_init;
    private ListView list_view;
    ArrayAdapter<String> adapter;
    private List<String> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_name = findViewById(R.id.edit_name);
        edit_number = findViewById(R.id.edit_number);
        edit_department = findViewById(R.id.edit_department);
        btn_add = findViewById(R.id.btn_add);
        spinner = findViewById(R.id.spinner);
        edit_itme = findViewById(R.id.edit_itme);
        btn_search = findViewById(R.id.btn_search);
        textView = findViewById(R.id.textView);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        btn_sort = findViewById(R.id.btn_sort);
        btn_del = findViewById(R.id.btn_del);
        btn_all_del = findViewById(R.id.btn_all_del);
        btn_init = findViewById(R.id.btn_init);
        list_view = findViewById(R.id.list_view);

        Handler handler = new Handler();

        btn_add.setOnClickListener(handler);


        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

        list_view.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                return false;
            }
        });

        String[] items = getResources().getStringArray(R.array.items);

        data = new ArrayList<String>(Arrays.asList(items));

        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, data);

    }

    public class Handler implements View.OnClickListener{
        @Override
        public void onClick(View view) {

            String a = edit_name.getText().toString();
            String c = edit_number.getText().toString();
            String b = edit_department.getText().toString();


            switch (view.getId()){

                case R.id.btn_add:
                    if (!TextUtils.isEmpty(a)){

                        adapter.btn_add(a);
                    }
            }
        }
    }
}
