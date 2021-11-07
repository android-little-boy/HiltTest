package com.huangwj.hilttest;

import android.util.Log;

import javax.inject.Inject;

public class GasEngine implements Engine {

    @Inject
    public GasEngine() {
    }

    @Override
    public void start() {
        Log.d(MainActivity.TAG, "Gas engine start: ");
    }

    @Override
    public void shutdown() {
        Log.d(MainActivity.TAG, "Gas engine shutdown: ");
    }
}
