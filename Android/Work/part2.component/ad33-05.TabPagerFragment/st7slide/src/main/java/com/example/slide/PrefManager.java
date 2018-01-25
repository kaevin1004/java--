package com.example.slide;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Administrator on 2018-01-25.
 */

public class PrefManager {

    private static final String PREF_NAME = "welcome";
    private static final String IS_FIRST_TIME_LAUNCH = "isFirstTimeLaunch";

    private final Context mContext;
    private SharedPreferences mpref;
    private SharedPreferences.Editor meditor;


    public PrefManager(Context context){

        this.mContext = context;
        mpref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        meditor = mpref.edit();

    }

    public void setFirstTimeLaunch (boolean isFirstTime){

        meditor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        meditor.apply();
    }

    public boolean isFirstTimeLaunch(){

        return mpref.getBoolean(IS_FIRST_TIME_LAUNCH, false);

    }


}
