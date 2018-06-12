package com.funyoung.androidmemoryleak;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.funyoung.androidmemoryleak.samples.HandlerInActivity;
import com.funyoung.androidmemoryleak.samples.SubscribedViewActivity;

public class HomeActivity extends AppCompatActivity {
    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (R.id.tv_handler == view.getId()) {
                gotoActivity(HandlerInActivity.class);
            } else if (R.id.tv_subscribed_view == view.getId()) {
                gotoActivity(SubscribedViewActivity.class);
            }
        }
    };

    private void gotoActivity(Class<? extends Activity> targetClass) {
        Intent intent = new Intent(this, targetClass);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.tv_handler).setOnClickListener(onClickListener);
        findViewById(R.id.tv_subscribed_view).setOnClickListener(onClickListener);
    }
}
