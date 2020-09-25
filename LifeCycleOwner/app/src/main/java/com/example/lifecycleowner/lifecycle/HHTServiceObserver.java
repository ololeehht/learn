package com.example.lifecycleowner.lifecycle;

import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import com.orhanobut.logger.Logger;

import static androidx.lifecycle.Lifecycle.Event.ON_ANY;
import static androidx.lifecycle.Lifecycle.Event.ON_CREATE;
import static androidx.lifecycle.Lifecycle.Event.ON_START;
import static androidx.lifecycle.Lifecycle.Event.ON_RESUME;
import static androidx.lifecycle.Lifecycle.Event.ON_PAUSE;
import static androidx.lifecycle.Lifecycle.Event.ON_DESTROY;

public class HHTServiceObserver implements LifecycleObserver {

    @OnLifecycleEvent(ON_CREATE)
    public void onCreate(){
        Logger.wtf("service====onCreate");
    }

    @OnLifecycleEvent(ON_DESTROY)
    public void onDestory(){
        Logger.wtf("service====onDestory");
    }
}
