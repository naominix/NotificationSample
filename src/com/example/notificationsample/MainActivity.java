package com.example.notificationsample;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void fireNotification(View view) {
    	Notification notification = new NotificationCompat.Builder(this)
    	.setContentTitle("タイトル")
    	.setContentText("わんわん！")
    	.setTicker("一瞬出るヤツ")
    	.setAutoCancel(true)
    	.setSmallIcon(android.R.drawable.ic_dialog_info)
    	.build();
    	
    	NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    	manager.notify(1,notification);
    }
}
