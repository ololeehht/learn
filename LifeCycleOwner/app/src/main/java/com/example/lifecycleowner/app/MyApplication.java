package com.example.lifecycleowner.app;

import android.app.Application;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;

import com.example.lifecycleowner.lifecycle.HHTProcessLifecycleListener;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new HHTProcessLifecycleListener());
        PrettyFormatStrategy strategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)
                .methodCount(0)
                .methodOffset(2)
                .build();
        AndroidLogAdapter androidLogAdapter = new AndroidLogAdapter(strategy);
        Logger.addLogAdapter(androidLogAdapter);
        super.onCreate();
    }
}
