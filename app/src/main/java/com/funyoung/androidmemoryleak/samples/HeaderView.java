package com.funyoung.androidmemoryleak.samples;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class HeaderView extends FrameLayout {
//    private final Authenticator authenticator;
//    private Subscription usernameSubscription;

    public HeaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override protected void onFinishInflate() {
        super.onFinishInflate();
//        final TextView usernameView = findViewById(R.id.username);
//        usernameSubscription = authenticator.username().subscribe(new Action1<String>() {
//            @Override public void call(String username) {
//                // nothing need to do here
//            }
//        });
    }

    @Override protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
//        usernameSubscription.unsubscribe();
    }
}
