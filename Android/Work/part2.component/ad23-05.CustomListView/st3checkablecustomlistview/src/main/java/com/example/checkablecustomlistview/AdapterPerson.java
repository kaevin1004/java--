package com.example.checkablecustomlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2018-01-08.
 */

public class AdapterPerson extends ArrayAdapter<ModelPerson>{

    private Context context;
    private List<ModelPerson> lists = null;

    public AdapterPerson(@NonNull Context context, int resource, @NonNull List<ModelPerson> objects) {
        super(context, resource, objects);

        this.context = context;
        this.lists = objects;
    }

    private class ViewHoloder {
        ImageView imagePhoto;
        TextView textName;
        TextView textAge;
        ImageView imageCheck;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView = convertView;

        ViewHoloder holder = null;

        if (rowView == null){
            rowView = LayoutInflater.from(this.context).inflate(R.layout.view_person, parent, false);

            holder = new ViewHoloder();

            holder.imagePhoto = rowView.findViewById(R.id.image_photo);
            holder.textName = rowView.findViewById(R.id.text_name);
            holder.textAge = rowView.findViewById(R.id.text_age);
            holder.imageCheck = rowView.findViewById(R.id.image_check);

            rowView.setTag(holder);

        }
        else {

            holder = (ViewHoloder) rowView.getTag();

        }
        ModelPerson p lists.get(position);

        holder.imagePhoto.setImageDrawable(p.getImagePhoto());
        holder.textName.setText(p.getTextName());
        holder.textAge.setText(p.getTextAge());
        holder.imageCheck.(p.getImageCheck());


        return rowView;

    }
}
