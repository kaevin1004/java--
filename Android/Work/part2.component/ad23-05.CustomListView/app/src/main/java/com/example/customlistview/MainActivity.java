package com.example.customlistview;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.commons.collections.CollectionUtils;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        btn_del.setOnClickListener(buttonHanlder);
        btn_all_del.setOnClickListener(buttonHanlder);
        btn_init.setOnClickListener(buttonHanlder);

        List<ModelStudent> data = new ArrayList<>();
        for (int i = 0; i < 5; i = i + 1) {

            ModelStudent student = new ModelStudent();

            student.setName("aaa" + i);
            student.setNumber("bbb" + i);
            student.setDepartment(i + "" + i + "" + "-" + i + "" + i);
            data.add(student);
        }

        adapter = new AdapterStudent(this, R.layout.view_student, data);

        list_view.setAdapter(adapter);

        View headerView = getLayoutInflater().inflate(R.layout.list_view_header, null);
        TextView headerTv = (TextView) headerView.findViewById(R.id.header_footer_text);
        headerTv.setText("리스트의 시작");
        list_view.addHeaderView(headerView, null, true);

        View footerTvView = getLayoutInflater().inflate(R.layout.list_view_footer, null);
        TextView footerTv = (TextView) footerTvView.findViewById(R.id.header_footer_text);
        footerTv.setText("로딩 중 ");
        list_view.addFooterView(footerTvView, null, false);

        list_view.setOnItemClickListener(new ListViewHandler());
        list_view.setOnItemLongClickListener(new ListViewHandler());
        list_view.setOnItemSelectedListener(new ListViewHandler());

        list_view.setDivider(new ColorDrawable(Color.GRAY));
        list_view.setDividerHeight(3);

        String[] student_category = getResources().getStringArray(R.array.items);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, student_category);

        spinner.setAdapter(adapter);
    }

    private class ListViewHandler implements ListView.OnItemClickListener, ListView.OnItemLongClickListener, ListView.OnItemSelectedListener {

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            ModelStudent s = (ModelStudent) adapterView.getItemAtPosition(i);

            if (s != null) {
                String msg = "";
                msg += "Adapter Item Count : " + adapter.getCount() + "\n";
                msg += "ListView Item Count : " + list_view.getCount() + "\n";
                msg += "Name : " + s.getName() + "\n";
                msg += "Number : " + s.getNumber() + "\n";
                msg += "Department : " + s.getDepartment() + "\n";

                edit_name.setText(s.getName());
                edit_number.setText(s.getNumber());
                edit_department.setText(s.getDepartment());


                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }

        }

        @Override
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {


            AlertDialog.Builder dig = new AlertDialog.Builder(MainActivity.this);
            dig.setTitle("삭제 확인");
            dig.setMessage("정말로 삭제하시겠습니까?");
            dig.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    data.remove(i - list_view.getHeaderViewsCount());
                    adapter.notifyDataSetChanged();
                }
            });


            dig.setNegativeButton("취소", null);
            return false;
        }

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            String msg = "onItemSelected Item : " + i + ", " + l;
            Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

            Toast.makeText(MainActivity.this, "onNothingSelected", Toast.LENGTH_SHORT).show();

        }
    }


    private class ButtonHanlder implements View.OnClickListener {

        @Override
        public void onClick(View view) {

            String searchitem = "";
            String searchvalue = "";

            switch (view.getId()) {
                case R.id.btn_add:
                    ModelStudent student = new ModelStudent(edit_name.getText().toString(), edit_number.getText().toString(), edit_department.getText().toString());

                    adapter.add(student);

                    list_view.smoothScrollToPosition(adapter.getCount() - 1);

                    init();

                    break;

                case R.id.btn_all_del:
                    adapter.clear();

                    init();
                    break;
                case R.id.btn_search:

                    //spinner에서 선택된 값 가져오기

                    searchitem = getFieldName(spinner.getSelectedItem());
                    searchvalue = edit_itme.getText().toString();

                    ModelStudent.MyPredicate predicate = new ModelStudent.MyPredicate(searchitem, searchvalue);
                    List<ModelStudent> rs = (List<ModelStudent>) CollectionUtils.select(data, predicate);
                    AdapterStudent aa = new AdapterStudent(MainActivity.this, R.layout.view_student, rs);
                    list_view.setAdapter(aa);
                case R.id.btn_sort:
                    searchitem = getFieldName(spinner.getSelectedItem().toString());
                    searchvalue = edit_itme.getText().toString();

                    RadioGroup rgpAscDesc = findViewById(R.id.rgpAscDesc);
                    int ascdesc = rgpAscDesc.getCheckedRadioButtonId();

                    Boolean mode = false;

                    switch (ascdesc){
                        case R.id.radioButton:
                            mode = false;
                            break;

                        case R.id.radioButton2:
                            mode = true;
                            break;

                            default:
                                mode = false;
                                break;
                    }

                    Comparator<ModelStudent> comparator = null;

                    if (searchitem.equals("name") && mode == false){
                        comparator = new ModelStudent.NameCompare(mode);
                    }

                    else if (searchitem.equals("number") && mode == false){
                        comparator = new ModelStudent.NumberCompare(mode);
                    }
                    else if (searchitem.equals("department") && mode == false){
                        comparator = new ModelStudent.DeptCompare(mode);
                    }

                    Collections.sort(data, comparator);
                    adapter.notifyDataSetChanged();

                    break;
                case R.id.btn_init:
                    init();
                    break;
            }
        }


        private String getFieldName(Object selectedItem) {
            if (selectedItem.equals("이름")) {

                return "name";

            } else if (selectedItem.equals("학번")) {

                return "number";

            } else if (selectedItem.equals("학과")) {

                return "department";

            } else {

                return null;

            }
        }


    }



    private void init() {
        edit_name.setText("");
        edit_number.setText("");
        edit_department.setText("");
        edit_itme.setText("");


    }



}


