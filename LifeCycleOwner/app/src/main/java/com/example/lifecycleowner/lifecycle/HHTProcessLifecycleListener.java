package com.example.lifecycleowner.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

import com.orhanobut.logger.Logger;

import static androidx.lifecycle.Lifecycle.Event.ON_ANY;
import static androidx.lifecycle.Lifecycle.Event.ON_CREATE;
import static androidx.lifecycle.Lifecycle.Event.ON_START;
import static androidx.lifecycle.Lifecycle.Event.ON_RESUME;
import static androidx.lifecycle.Lifecycle.Event.ON_PAUSE;
import static androidx.lifecycle.Lifecycle.Event.ON_DESTROY;
import static androidx.lifecycle.Lifecycle.Event.ON_STOP;

public class HHTProcessLifecycleListener implements LifecycleObserver {
    @OnLifecycleEvent(ON_CREATE)
    public void onCreate(){
        Logger.d("onCreate");
    }

    @OnLifecycleEvent(ON_START)
    public void onStart(){
        Logger.i("onStart");
    }

    @OnLifecycleEvent(ON_RESUME)
    public void onResume(){
        Logger.v("onResume");
    }

    @OnLifecycleEvent(ON_PAUSE)
    public void onPause(){
        Logger.w("onPause");
    }

    @OnLifecycleEvent(ON_STOP)
    public void onStop(){
        Logger.e("onStop");
    }

    @OnLifecycleEvent(ON_DESTROY)
    public void onDestory(){
        Logger.wtf("onDestory");
    }

}
