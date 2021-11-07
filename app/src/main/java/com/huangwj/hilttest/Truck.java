package com.huangwj.hilttest;

import android.util.Log;

import javax.inject.Inject;

public class Truck {
    @Inject
    public Truck() {
    }

    public void deliver(){
        Log.d(MainActivity.TAG, "deliver: ");
    }
}
