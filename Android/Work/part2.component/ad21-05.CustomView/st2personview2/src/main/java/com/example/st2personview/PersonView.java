package com.example.st2personview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2017-12-26.
 */

public class PersonView extends RelativeLayout{

    private TextView textname;
    private TextView textage;
    private ImageView imagePhoto;
    private ImageView imageCheck;

    // OnImageClickListener 이벤트 발생시 전달할 데이터
    private PersonData personData = null;

    //인터페이스 정의
    public interface OnImageClickLinstener{
        void OnimageClick(PersonView view, PersonData person);
    }
    //인터페이스 선언
    OnImageClickLinstener imageClickLinstener;
    public void setOnImageClickLinstener(OnImageClickLinstener linstener){
        this.imageClickLinstener = linstener;
    }

    public PersonView(Context context) {
        super(context);

        init(context, null, 0);
    }

    public PersonView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context, attrs, 0);
    }

    public PersonView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {

        //LinearLayout 관련 속성 설정.
        //없음.

        //커스텀뷰 디자인 xml 파일 inflation 하기.

        //xml을 자바 인스턴스로 바꾸기
        //res.layout/view_person.xml
        LayoutInflater.from(context).inflate(R.layout.view_person, this, true);

        //위젯 찾기
        textname = findViewById(R.id.text_name);
        textage = findViewById(R.id.text_age);
        imagePhoto = findViewById(R.id.image_pohoto);
        imageCheck = findViewById(R.id.image_check);


        //커스텀뷰 디자인에서 attrs로 정의한 속성 값 가져오기.
        if (attrs != null){
            TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.PersonView, defStyleAttr, 0);
            // app:my_name 에서 설정한 속성 값
            String name = ta.getString(R.styleable.PersonView_my_name);
            textname.setText(name);

            //app:my_age 에서 설정한 속성 값
            int age = ta.getInt(R.styleable.PersonView_my_age, -1);
            textage.setText(age+"");

            //app:my_photo 에서 설정한 속성 값
            Drawable photo = ta.getDrawable(R.styleable.PersonView_my_photo);
            imagePhoto.setImageDrawable(photo);

            // 재사용. 반드시 호출
            ta.recycle();

            personData = new PersonData(name, age, photo);

            personData.setAge(age);
            personData.setName(name);
            personData.setPhoto(photo);


        }


        imagePhoto.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PersonView.this.imageClickLinstener != null){
                    // 컨테이너 위젯으로 이벤트 발생.
                    //부모로 이벤트 발생시킴


                    imageClickLinstener.OnimageClick(PersonView.this, personData);

                }
            }
        });


    }
}
