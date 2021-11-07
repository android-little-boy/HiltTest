package com.huangwj.hilttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    @Inject
    public Truck truck;
    @Inject
    public Truck2 truck2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        truck.deliver();
        truck2.deliver();
    }
}