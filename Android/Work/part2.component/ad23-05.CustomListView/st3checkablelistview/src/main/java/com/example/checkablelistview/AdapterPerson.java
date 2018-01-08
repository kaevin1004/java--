package com.example.checkablelistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by Administrator on 2018-01-05.
 */

public class AdapterPerson extends ArrayAdapter<ModelPerson> {

    private final Context context;

    public AdapterPerson(@NonNull Context context, int resource, @NonNull List<ModelPerson> objects) {
        super(context, resource, objects);

        this.context = context;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewPerson view = null;

        if( convertView == null ){
            view = new ViewPerson( context );
        }
        else {
            view = (ViewPerson) convertView;
            view.setOnCheckedChangedListener(new ViewPerson.OnCheckedChangedListener() {
                @Override
                public void onCheckedChanged(ViewPerson checkableView, ModelPerson person) {
                    ModelPerson person1 = getItem(position);
                    person1 = person;
                }
            });
        }

        // ViewPerson 인스턴스에 값 설정
        view.setPerson(  getItem(position) );

        return view;
    }

/*
    // 인터페이스 정의
    public static interface OnCheckedChangedListener {
        void onCheckedChanged(AdapterPerson adapter, ViewPerson checkableView, ModelPerson person);
    }
    // 인터페이스 리스너 선언
    private OnCheckedChangedListener adapterListener;
    public void setOnCheckedChangedListener( OnCheckedChangedListener listener ) {
        this.adapterListener = listener;
    }

    @Override
    public void onCheckedChanged(ViewPerson checkableView, ModelPerson person) {
        if( adapterListener != null) {
            adapterListener.onCheckedChanged(this, checkableView, person);
        }
    }*/
}
