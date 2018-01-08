package com.example.checkablelistview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ViewPerson extends RelativeLayout implements Checkable {

    // 인터페이스 정의
    public static interface OnCheckedChangedListener {
        void onCheckedChanged(ViewPerson checkableView, ModelPerson person);
    }

    // 인터페이스 리스너 선언
    private OnCheckedChangedListener  checkedChangedListener;
    public void setOnCheckedChangedListener( OnCheckedChangedListener listener ) {
        this.checkedChangedListener = listener;
    }

    // 위젯 선언
    private ImageView imagePhoto, imageSelect;
    private TextView textName, textAge;
    CheckBox  imageCheck;

    public ViewPerson(Context context) {
        this(context, null, 0);
    }

    public ViewPerson(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ViewPerson(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        // Layout 관련 필수 속성 설정.
        // 없음.

        // 커스텀뷰 디자인 파일 inflation 하기.
        // inflation이란 xml 을 자바 인스턴스로 바꾸는 것.
        // res/layout/view_person.xml
        LayoutInflater.from( context )
                      .inflate(R.layout.view_person, this,true );

        // 위젯 찾기
        textName    = findViewById(R.id.text_name  );
        textAge     = findViewById(R.id.text_age   );
        imagePhoto  = findViewById(R.id.image_photo);
        imageCheck  = findViewById(R.id.image_check);
        imageSelect = findViewById(R.id.image_select);

        imageCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkedChangedListener.onCheckedChanged(ViewPerson.this, person);
            }
        });
    }


    boolean isChecked;

    @Override
    public void setChecked(boolean checked) {
        if( isChecked != checked ) {
            this.isChecked = checked;
            drawCheck();
        }
    }

    @Override
    public boolean isChecked() {
        return false;
    }

    @Override
    public void toggle() {
        // this.isChecked == true --> false 로 바꾸시오
        // this.isChecked == false --> true 로 바꾸시오
        this.setChecked(  ! this.isChecked );
    }

    private void drawCheck() {
        imageCheck.setChecked( this.isChecked );
        if( this.isChecked ) {
            this.setBackgroundColor(Color.MAGENTA );
        }
        else {
            this.setBackgroundColor(Color.TRANSPARENT );
        }

        Log.d("ViewPerson", isChecked + "" );
    }


    // ModelPerson 데이터 선언
    ModelPerson person;

    public ModelPerson getPerson() {
        return person;
    }

    public void setPerson(ModelPerson person) {
        this.person = person;

        // 추가
        imagePhoto.setImageDrawable( person.getPhoto() );
        textName  .setText( person.getName() );
        textAge   .setText( person.getAge() + "" );
        this.setChecked(  person.isCheck()  );
    }

}
