package com.huangwj.hilttest;

import android.util.Log;

import javax.inject.Inject;

public class Truck {
    private static final String TAG = "Truck";
    @Inject
    public Truck() {
    }

    public void deliver(){
        Log.d(TAG, "deliver: ");
    }
}
