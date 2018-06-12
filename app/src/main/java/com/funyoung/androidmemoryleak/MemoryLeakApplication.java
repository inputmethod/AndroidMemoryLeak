package com.funyoung.androidmemoryleak;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

public class MemoryLeakApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        if (!LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            LeakCanary.install(this);
        }
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
