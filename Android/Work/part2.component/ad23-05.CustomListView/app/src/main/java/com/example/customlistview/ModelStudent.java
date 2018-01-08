package com.example.customlistview;

import android.os.Parcel;
import android.os.Parcelable;

import org.apache.commons.collections.Predicate;

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

    public ModelStudent(Parcel in) {

        name = in.readString();
        number = in.readString();
        department = in.readString();

    }

    public ModelStudent() {
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

    public static class NameCompare implements Comparator<ModelStudent>{

        private int mode = 1;

        public NameCompare(Boolean desc){
            if (desc){
                mode = -1;
            }
        }


        @Override
        public int compare(ModelStudent modelStudent, ModelStudent t1) {
            return modelStudent.getName().compareTo(t1.getName()) * mode;
        }

    }

    public static class NumberCompare implements Comparator<ModelStudent>{

        private int mode = 1;

        public NumberCompare(Boolean desc){
            if (desc){
                mode = -1;
            }
        }

        @Override
        public int compare(ModelStudent modelStudent, ModelStudent t1) {
            return modelStudent.getNumber().compareTo(t1.getNumber()) * mode;
        }
    }

    public static class DeptCompare implements Comparator<ModelStudent>{

        private int mode = 1;

        public DeptCompare(Boolean desc){
            if (desc){
                mode = -1;
            }
        }

        @Override
        public int compare(ModelStudent modelStudent, ModelStudent t1) {
            return modelStudent.getDepartment().compareTo(t1.getDepartment()) * mode;
        }
    }




        public static class MyPredicate implements Predicate {

        private String fieldName;
        private Object value;

        public MyPredicate(String fieldName, Object value) {
            this.fieldName = fieldName;
            this.value = value;
        }

        @Override
        public boolean evaluate(Object object) {

            if (fieldName.equals("name")) {
                return ((ModelStudent)object).getName().contains(value.toString());


            } else if (fieldName.equals("number")) {

                return ((ModelStudent)object).getNumber().contains(value.toString());

            } else if (fieldName.equals("deparment")) {

                return ((ModelStudent)object).getDepartment().contains(value.toString());

            } else {

                return false;

            }

        }

    }

}

