package com.funyoung.androidmemoryleak.samples;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

import com.funyoung.androidmemoryleak.R;

// https://www.androiddesignpatterns.com/2013/01/inner-class-handler-memory-leak.html
public class HandlerInActivity extends AppCompatActivity {
    /**
     * Instances of anonymous classes do hold an implicit
     * reference to their outer class when they are not "static".
     */
    private final Handler leakHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            // need to do nothing, here.
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        buildLeakCase();
    }

    // Post a message and delay its execution for 10 minutes，then finish this activity.
    private void buildLeakCase() {
        /**
         * Instances of anonymous classes do hold an implicit
         * reference to their outer class when they are not "static".
         */
        leakHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        }, 10 * 60 * 1000);

        // Go back to the previous Activity.
        finish();
    }
}
