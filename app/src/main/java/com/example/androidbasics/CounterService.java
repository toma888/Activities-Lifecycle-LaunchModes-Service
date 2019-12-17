package com.example.androidbasics;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class CounterService extends Service {
    private final IBinder binder = new CounterBinder();
    private int currentNumber;

    public class CounterBinder extends Binder {
        CounterService getCounterService() {
            return CounterService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    public int getHowManyTimesWasAccessed() {
        return currentNumber++;
    }
}
