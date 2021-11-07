package com.huangwj.hilttest;

import android.util.Log;

import javax.inject.Inject;

public class Truck2 {
    private Driver driver;

    @BindGasEngine
    @Inject
    public Engine gasEngine;

    @BindElectricEngine
    @Inject
    public Engine electricEngine;

    @Inject
    public Truck2(Driver driver) {
        this.driver = driver;
    }

    public void deliver() {
        gasEngine.start();
        electricEngine.start();
        Log.d(MainActivity.TAG, "deliver by driver");
        gasEngine.shutdown();
        electricEngine.shutdown();
    }
}
