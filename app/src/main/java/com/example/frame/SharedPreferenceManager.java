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

    public Float getFloat(final String key) {
        return this.mContext.getSharedPreferences(SharedPreferenceManager.PERFERENCE_NAME, Context.MODE_PRIVATE).getFloat(key, 0.0f);
    }

    public boolean putFloat(final String key, final Float value) {
        return this.mContext.getSharedPreferences(SharedPreferenceManager.PERFERENCE_NAME, Context.MODE_PRIVATE).edit().putFloat(key, value).commit();
    }

    public int getInt(final String key) {
        return this.mContext.getSharedPreferences(SharedPreferenceManager.PERFERENCE_NAME, Context.MODE_PRIVATE).getInt(key, 0);
    }

    public boolean putInt(final String key, final int value) {
        return this.mContext.getSharedPreferences(SharedPreferenceManager.PERFERENCE_NAME, Context.MODE_PRIVATE).edit().putInt(key, value).commit();
    }

    public long getLong(final String key) {
        return this.mContext.getSharedPreferences(SharedPreferenceManager.PERFERENCE_NAME, Context.MODE_PRIVATE).getLong(key, 0L);
    }

    public boolean putLong(final String key, final Long value) {
        return this.mContext.getSharedPreferences(SharedPreferenceManager.PERFERENCE_NAME, Context.MODE_PRIVATE).edit().putLong(key, value).commit();
    }

    public String getString(final String key) {
        return this.mContext.getSharedPreferences(SharedPreferenceManager.PERFERENCE_NAME, Context.MODE_PRIVATE).getString(key, "");
    }

    public boolean putString(final String key, final String value) {
        return this.mContext.getSharedPreferences(SharedPreferenceManager.PERFERENCE_NAME, Context.MODE_PRIVATE).edit().putString(key, value).commit();
    }









}
