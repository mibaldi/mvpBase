package com.mibaldi.mosbyviewstate.router;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import com.mibaldi.mosbyviewstate.base.baseMosby.activity.BaseMVPActivity;
import com.mibaldi.mosbyviewstate.ui.activities.MainActivity;
import com.mibaldi.mosbyviewstate.ui.activities.SecondActivity;

import javax.inject.Inject;

public class Router {
    private Context context;
    @Inject
    public Router(Context context) {
        this.context = context;
    }

    public void finishActivity(Context activityContext) {
        if (activityContext != null) {
            ((AppCompatActivity) (activityContext)).finish();
        }
    }
    public void goToSecondActivity(){
        if (context != null){
            Intent intent = SecondActivity.getCallingIntent(context,SecondActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        }
    }
}
