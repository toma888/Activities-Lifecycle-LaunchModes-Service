package com.example.androidbasics;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

public class BasicApplication extends Application implements Application.ActivityLifecycleCallbacks {

    private static final String TAG = "lifecycle";

    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(this);
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        Log.i(TAG, activity.getLocalClassName() + " created");
    }

    @Override
    public void onActivityStarted(Activity activity) {
        Log.i(TAG, activity.getLocalClassName() + " started");
    }

    @Override
    public void onActivityResumed(Activity activity) {
        Log.i(TAG, activity.getLocalClassName() + " resumed");
    }

    @Override
    public void onActivityPaused(Activity activity) {
        Log.i(TAG, activity.getLocalClassName() + " paused");
    }

    @Override
    public void onActivityStopped(Activity activity) {
        Log.i(TAG, activity.getLocalClassName() + " stopped");
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Log.i(TAG, activity.getLocalClassName() + " savedInstance");
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        Log.i(TAG, activity.getLocalClassName() + " destroyed");
    }
}
