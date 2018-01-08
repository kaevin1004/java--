package com.example.st2personview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private  PersonView personView;
    private ImageView imageselect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageselect = findViewById(R.id.image_select);

        personView = findViewById(R.id.view_person);
        personView.setOnImageClickLinstener(new PersonView.OnImageClickLinstener() {
            @Override
            public void OnimageClick(PersonView view, PersonData person) {
                imageselect.setImageDrawable(person.getPhoto());
                imageselect.setVisibility(View.VISIBLE);

            }
        });
    }
}