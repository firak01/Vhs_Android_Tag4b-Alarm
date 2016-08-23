package com.example.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

	public class SimpleReciever extends BroadcastReceiver {
		
		

		@Override
		public void onReceive(Context context, Intent intent) {
			// TODO Auto-generated method stub
			//Log.v(ALARM_SERVICE, "Alarm received");

			Toast toast = Toast.makeText(context,  "TEST",  Toast.LENGTH_LONG);
			toast.show();
			
			//Nun die eigentliche App starten
		 Intent explicitIntent = new Intent(context, MainActivity.class);
			 explicitIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); //Notwenig, da der Receiver keine Aktivität ist.
			 context.startActivity(explicitIntent);
			 
		}
	}

