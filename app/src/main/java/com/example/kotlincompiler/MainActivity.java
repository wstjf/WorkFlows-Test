package com.example.kotlincompiler;

import android.app.Activity;
import android.os.Bundle;
import com.itsaky.androidide.logsender.LogSender;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
		// Remove this line if you don't want AndroidIDE to show this app's logs
		LogSender.startLogging(this);
		
        super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
}
