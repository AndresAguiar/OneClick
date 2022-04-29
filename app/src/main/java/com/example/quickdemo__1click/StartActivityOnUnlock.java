package com.example.quickdemo__1click;

/*import android.accessibilityservice.AccessibilityService;*/
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class StartActivityOnUnlock extends BroadcastReceiver {

    /*private AccessibilityService context;*/
    @Override
        public void onReceive(Context context, Intent intent) {
            if (Intent.ACTION_USER_UNLOCKED .equals(intent.getAction())) {
                Intent i = new Intent(context, MainActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
            }
        }
    /*KeyguardManager myKM = (KeyguardManager) context.getSystemService(Context.KEYGUARD_SERVICE);
if( myKM.isDeviceLocked()()()) {
        //it is locked
    } else {
        //it is not locked
    }*/
}