package com.example.frame;

import android.content.Context;

public class SharedPreferenceManager {

    private final Context mContext;
    private static final String PERFERENCE_NAME = "example_pedometer";

    public SharedPreferenceManager(Context mContext) {
        this.mContext = mContext;
    }

    public boolean clear(){
        return mContext.getSharedPreferences(SharedPreferenceManager.PERFERENCE_NAME, Context.MODE_PRIVATE).edit().clear().commit();
    }

    public boolean contains(){
        return mContext.getSharedPreferences(SharedPreferenceManager.PERFERENCE_NAME,Context.MODE_PRIVATE).contains(SharedPreferenceManager.PERFERENCE_NAME);
    }

    public boolean getBoolean(final String key){

        return this.mContext.getSharedPreferences(SharedPreferenceManager.PERFERENCE_NAME, Context.MODE_PRIVATE).getBoolean(key, false);
    }

    public boolean getBooleanDefaultTrue(final String key){

        return this.mContext.getSharedPreferences(SharedPreferenceManager.PERFERENCE_NAME, Context.MODE_PRIVATE).getBoolean(key, true);
    }

    public boolean putBoolean(final String key, final boolean value){
        return this.mContext.getSharedPreferences(SharedPreferenceManager.PERFERENCE_NAME, Context.MODE_PRIVATE).edit().putBoolean(key, value).commit();
    }

}
