package com.huangwj.hilttest;

import android.util.Log;

import javax.inject.Inject;

public class ElectricEngine implements Engine {

    @Inject
    public ElectricEngine() {
    }

    @Override
    public void start() {
        Log.d(MainActivity.TAG, "Electric Engine start: ");
    }

    @Override
    public void shutdown() {
        Log.d(MainActivity.TAG, "Electric Engine shutdown: ");
    }
}
