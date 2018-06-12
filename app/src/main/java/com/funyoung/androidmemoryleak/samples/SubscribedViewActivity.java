package com.funyoung.androidmemoryleak.samples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.funyoung.androidmemoryleak.R;

// https://medium.com/square-corner-blog/android-leak-pattern-subscriptions-in-views-18f0860aa74c
public class SubscribedViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribedview);

        if (!intentValid(getIntent())) {
            setResult(Activity.RESULT_CANCELED, null);
            finish();
        }
    }

    private boolean intentValid(Intent intent) {
        return null == intent || null == intent.getExtras();
    }
}
