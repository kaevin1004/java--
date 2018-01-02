package com.example.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
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
    AdapterStudent adapter;
    private List<ModelStudent> data;


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

        ButtonHanlder buttonHanlder = new ButtonHanlder();

        btn_add.setOnClickListener(buttonHanlder);
        btn_search.setOnClickListener(buttonHanlder);
        btn_sort.setOnClickListener(buttonHanlder);
        btn_del.setOnClickListener(buttonHanlder);]
        btn_all_del.setOnClickListener(buttonHanlder);
        btn_init.setOnClickListener(buttonHanlder);

        List<ModelStudent> data = new ArrayList<>();
        for (int i = 0; i < 5; i=i+1){
            ModelStudent student = new ModelStudent();
            student.setName("aaa"+i);
            student.setNumber("bbb"+i);
            student.setDepartment(i+""+i+""+"-"+i+""+i);

        }

    }
}
