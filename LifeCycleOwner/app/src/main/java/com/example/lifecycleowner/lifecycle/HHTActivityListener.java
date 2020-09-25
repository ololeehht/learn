package com.example.lifecycleowner.lifecycle;

import android.content.Intent;

import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import com.orhanobut.logger.Logger;

import static androidx.lifecycle.Lifecycle.Event.ON_ANY;
import static androidx.lifecycle.Lifecycle.Event.ON_CREATE;
import static androidx.lifecycle.Lifecycle.Event.ON_START;
import static androidx.lifecycle.Lifecycle.Event.ON_RESUME;
import static androidx.lifecycle.Lifecycle.Event.ON_PAUSE;
import static androidx.lifecycle.Lifecycle.Event.ON_DESTROY;

public class HHTActivityListener implements LifecycleObserver {


    @OnLifecycleEvent(ON_CREATE)
    public void onCreate(){
        Logger.d("Activity=====onCreate");
        //Intent intent=new Intent()
    }

    @OnLifecycleEvent(ON_DESTROY)
    public void onDestory(){
        Logger.w("Activity=====onDestory");
    }
}
