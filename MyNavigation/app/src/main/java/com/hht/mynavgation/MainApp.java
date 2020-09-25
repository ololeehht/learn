package com.hht.mynavgation;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

public class MainApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PrettyFormatStrategy strategy = PrettyFormatStrategy.newBuilder()
                        .showThreadInfo(false)
                        .methodCount(0)
                        .methodOffset(2)
                        .build();
        AndroidLogAdapter androidLogAdapter = new AndroidLogAdapter(strategy);
        Logger.addLogAdapter(androidLogAdapter);
    }
}
