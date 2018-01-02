package com.example.customlistview;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2018-01-02.
 */

public class AdapterStudent extends ArrayAdapter<ModelStudent> {

    public AdapterStudent(@NonNull Context context, int resource, @NonNull List<ModelStudent> objects) {

        super(context, resource, objects);
    }

    class ViewHolder {

        TextView mNameTv;
        TextView mNumberTv;
        TextView mDepartmentTv;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View itemLayout = super.getView(position, convertView, parent);

        ViewHolder viewHolder = (ViewHolder) itemLayout.getTag();

        if (viewHolder == null) {
            viewHolder = new ViewHolder();
            viewHolder.mNameTv = (TextView) itemLayout.findViewById(R.id.text_name);
            viewHolder.mNumberTv = (TextView) itemLayout.findViewById(R.id.text_number);
            viewHolder.mDepartmentTv = (TextView)
                    itemLayout.findViewById(R.id.text_department);
            itemLayout.setTag(viewHolder);


        }

        viewHolder.mNameTv.setText(getItem(position).getName());
        viewHolder.mNumberTv.setText(getItem(position).getNumber());
        viewHolder.mDepartmentTv.setText(getItem(position).getDepartment());

        return itemLayout;

    }
}
