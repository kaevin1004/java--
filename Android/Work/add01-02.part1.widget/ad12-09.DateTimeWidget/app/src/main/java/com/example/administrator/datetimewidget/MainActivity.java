package com.example.administrator.datetimewidget;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.DigitalClock;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private AnalogClock aclock = null;
    private DigitalClock bclock = null;
    private Chronometer chrono = null;
    private TimePicker tpicker1 = null;
    private TimePicker  tpicker2 = null;
    private DatePicker dpicker1 = null;
    private DatePicker  dpicker2 = null;
    private CalendarView calview = null;
    private Button       btn1 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aclock = findViewById(R.id.aclock);
        bclock = findViewById(R.id.bclock);
        chrono = findViewById(R.id.chrono);
        tpicker1 = findViewById(R.id.tpicker1);
        tpicker2 = findViewById(R.id.tpicker2);
        dpicker1 = findViewById(R.id.dpicker1);
        dpicker2 = findViewById(R.id.dpicker2);
        calview = findViewById(R.id.calview);
        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date d = new Date();
                d.setTime(calview.getDate());

                String msg = "";

                msg += "aclock = " + aclock.toString() + "\n";
                msg += "bclock = " + bclock.getText() + "\n";
                msg += "chrono = " + chrono.getText() + "\n";
                msg += "tpicker1 = " + tpicker1.getCurrentHour() + " : " + tpicker1.getCurrentMinute() + "\n";
                msg += "tpicker2 = " + tpicker2.getCurrentHour() + " : " + tpicker2.getCurrentMinute() + "\n";
                msg += "dpicker1 = " + dpicker1.getYear() + "-" + dpicker1.getMonth() + "-" + dpicker1.getDayOfMonth() + "\n";
                msg += "dpicker2 = " + dpicker2.getYear() + "-" + dpicker2.getMonth() + "-" + dpicker2.getDayOfMonth() + "\n";
                msg += "calview = " + d;


                Toast.makeText(MainActivity.this, "str", Toast.LENGTH_SHORT).show();
            }
        });

        // Chronoment 중지 시작

        chrono.stop();//중지
        chrono.setBase(SystemClock.elapsedRealtime());// 0부터 시작해서 경과된 시간.
        chrono.start();//시작


        //tpicker1 에 시간 설정

        tpicker1.setCurrentHour(13);
        tpicker1.setCurrentMinute(35);

        //dpicker1 에 날짜 설정
        //자바에서 날짜를 처리하는 클래스
        //java.util.Date 클래스
        //java.util.Calendar 글래스

        java.util.Calendar c = Calendar.getInstance();
        //dpicker1.updateDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.YEAR) );
        dpicker1.updateDate(2017, 11, 13);
        //calview 에 날짜 설정
        Date date = null;
        date = new Date(114, 2, 18);
        calview.setDate(date.getTime());
    }
}
