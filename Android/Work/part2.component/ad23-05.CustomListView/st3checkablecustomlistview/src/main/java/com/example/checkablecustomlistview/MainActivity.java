package com.example.checkablecustomlistview;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView3 = null;
    private List<ModelPerson> lists;
    private int[] images = {

            R.drawable.sample_0
            ,R.drawable.sample_1
            ,R.drawable.sample_2
            ,R.drawable.sample_3
            ,R.drawable.sample_4
            ,R.drawable.sample_5
            ,R.drawable.sample_6
            ,R.drawable.sample_7

    };
    private AdapterPerson adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView3 = findViewById(R.id.listView3);

        //위젯 설정. 리스너 생략

        //데이터 만들기

        lists = makeData();

        //어댑터 생성
        adapter = new AdapterPerson(MainActivity.this, R.layout.view_person, lists);

        //리스트 뷰와 어댑터연결
        listView3.setAdapter(adapter);

    }

    private List<ModelPerson> makeData() {

        List<ModelPerson> items = new ArrayList<>();

        ModelPerson person;

        for(int i=0; i<20; i=i+1){

            person = new ModelPerson();
            person.setImageCheck(false);
            person.setTextAge(i+"");
            Drawable d = getResources().getDrawable(images[images[i] % images.length], null);
            person.setImagePhoto(d);
            person.setTextName("name"+i);
        }
        return items;
    }
}
