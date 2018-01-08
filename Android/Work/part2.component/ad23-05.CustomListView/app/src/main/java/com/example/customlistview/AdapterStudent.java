package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
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


    private Context context;

    public AdapterStudent(@NonNull Context context, int resource, @NonNull List<ModelStudent> objects) {

        super(context, resource, objects);
        this.context = context;
    }

    class ViewHolder {

        TextView name;
        TextView number;
        TextView department;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View itemLayout = LayoutInflater.from(context).inflate(R.layout.view_student, parent, false);

        ViewHolder viewHolder = (ViewHolder) itemLayout.getTag();

        if (viewHolder == null) {
            viewHolder = new ViewHolder();
            viewHolder.name = itemLayout.findViewById(R.id.text_name);
            viewHolder.number = itemLayout.findViewById(R.id.text_number);
            viewHolder.department = itemLayout.findViewById(R.id.text_department);
            itemLayout.setTag(viewHolder);


        }

        viewHolder.name.setText(getItem(position).getName());
        viewHolder.number.setText(getItem(position).getNumber());
        viewHolder.department.setText(getItem(position).getDepartment());

        return itemLayout;

    }
}
