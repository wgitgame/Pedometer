package com.example.frame;

import android.app.Activity;
import android.app.Application;

import java.util.LinkedList;

public class FrameApplication extends Application {

    private static LinkedList<Activity> activityList = new LinkedList<Activity>();

    public static LinkedList<Activity> getActivityList() {

        return activityList;
    }

    public static void addToActivityList(final Activity activity){

        if(activity != null){
            activityList.add(activity);
        }
    }

    public static void removeFromActivityList(final Activity activity){

        if(activityList!=null && activityList.size()>0 && activityList.indexOf(activity)!=-1){
            activityList.remove(activity);
        }
    }

    /**
     * 清理所有 Activity
     */
    public static void clearActivityList(){

        for(int i=activityList.size()-1; i>=0; i--){
            final Activity activity = activityList.get(i);
            if(activity != null){
                activity.finish();
            }
        }
    }

    public static void exitApp(){

        try {
            clearActivityList();
        } catch (Exception e){

        } finally {
            System.exit(0);
            android.os.Process.killProcess(android.os.Process.myPid());
        }
    }
}
