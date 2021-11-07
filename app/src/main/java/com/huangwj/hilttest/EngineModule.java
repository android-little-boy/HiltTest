package com.huangwj.hilttest;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public abstract class EngineModule {
    @BindGasEngine
    @Binds
    public abstract Engine bindEngine(GasEngine gasEngine);

    @BindElectricEngine
    @Binds
    public abstract Engine bindElectricEngine(ElectricEngine electricEngine);
}
