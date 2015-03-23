package com.example.labtest;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button sports,news,social;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sports = (Button) findViewById(R.id.sports);
        news = (Button) findViewById(R.id.news);
        social = (Button) findViewById(R.id.social);
        news.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent( Intent.ACTION_VIEW,
						Uri.parse("http://google.com")
						
						);
				startActivity(intent);
				
			}
		});
        
        sports.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MainActivity.this,SportsActivity.class);
				startActivity(intent);
			}
		});
        
        social.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, SocialActivity.class);
				startActivity(intent);
				
				
			}
		});
    }


    
}
