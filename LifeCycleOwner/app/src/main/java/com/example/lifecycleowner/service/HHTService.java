package com.example.lifecycleowner.service;

import androidx.lifecycle.LifecycleService;

import com.example.lifecycleowner.lifecycle.HHTServiceObserver;

public class HHTService extends LifecycleService {

    public HHTService() {
        getLifecycle().addObserver(new HHTServiceObserver());
    }
}
