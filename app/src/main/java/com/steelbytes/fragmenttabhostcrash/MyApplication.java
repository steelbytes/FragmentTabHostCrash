package com.steelbytes.fragmenttabhostcrash;

import android.app.Application;

/**
 * Created by louis on 18/01/2017.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        try {
            // simulate slow initialisation of various third party librarys
            Thread.sleep(1000);
        } catch (InterruptedException ignore) {
        }
    }
}
