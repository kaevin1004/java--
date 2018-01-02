package com.example.customlistview;

import android.os.Parcel;
import android.os.Parcelable;

import java.text.Collator;
import java.util.Comparator;

/**
 * Created by Administrator on 2018-01-02.
 */

public class ModelStudent implements Parcelable{

    private String name = "";
    private String number = "";
    private String department = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ModelStudent{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public ModelStudent() {

        name = in.readString();
        number = in.readString();
        department = in.readString();

    }

    public ModelStudent(String name, String number, String department) {
        this.name = name;
        this.number = number;
        this.department = department;
    }

    public static final Comparator<ModelStudent> ALPHA_COMPARATOR = new
            Comparator<ModelStudent>() {
                private final Collator collator = Collator.getInstance();
                @Override
                public int compare(ModelStudent mListDate_1, ModelStudent mListDate_2) {
                    return collator.compare(mListDate_1.name, mListDate_2.name);
                }
            };



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeString(name);
        parcel.writeString(number);
        parcel.writeString(department);

    }
    public static final Creator<ModelStudent> CREATOR = new Creator<ModelStudent>() {
        @Override
        public ModelStudent createFromParcel(Parcel in) {
            return new ModelStudent(in);
        }
        @Override
        public ModelStudent[] newArray(int size) {
            return new ModelStudent[size];
        }
    };

}

