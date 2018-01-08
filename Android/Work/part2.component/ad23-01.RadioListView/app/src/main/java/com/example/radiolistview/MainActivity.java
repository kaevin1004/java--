package com.example.radiolistview;

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

    private ListView listview1;
    private EditText edittext1;
    private Button add;
    private Button delete;
    private Button modify;
    List<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview1 = findViewById(R.id.listview1);
        edittext1 = findViewById(R.id.edittext1);
        add = findViewById(R.id.add);
        delete = findViewById(R.id.delete);
        modify = findViewById(R.id.modify);

        Handler handler = new Handler();

        add.setOnClickListener(handler);
        delete.setOnClickListener(handler);
        modify.setOnClickListener(handler);

        listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


            }
        });

        String[] items = getResources().getStringArray(R.array.items);

        list = new ArrayList<String>(Arrays.asList(items));

        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_single_choice, list);

        listview1.setAdapter(adapter);

    }

    public class Handler implements View.OnClickListener{

        @Override
        public void onClick(View view) {

            String input = edittext1.getText().toString();
            int position = listview1.getCheckedItemPosition();

            switch (view.getId()){
                case R.id.add:
                    if (!TextUtils.isEmpty(input)){

                        adapter.add(input);

                        listview1.smoothScrollToPosition(list.size()-1);
                    }

                    break;

                case R.id.delete:
                    if (position != -1) {

                        list.remove(position);

                        adapter.notifyDataSetChanged();

                        listview1.setItemChecked(position, false);


                    }
                    break;

                case R.id.modify:

                    if (!TextUtils.isEmpty(input) && position != -1){

                        list.set(position, input);

                        adapter.notifyDataSetChanged();

                    }

                    break;
            }
        }

    }


}