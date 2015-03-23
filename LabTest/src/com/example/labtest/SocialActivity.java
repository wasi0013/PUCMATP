package com.example.labtest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SocialActivity extends Activity implements OnClickListener{
	Button facebook,google;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_social);
		facebook = (Button) findViewById(R.id.facebook);
		google = (Button) findViewById(R.id.google);
		facebook.setOnClickListener(this);
		google.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		String url="";
		if(v.getId()==R.id.facebook){
			url="http://facebook.com";
		}
		else if(v.getId()== R.id.google){
			
			url="http://google.com";
			
		}
		
		Intent intent = new Intent(Intent.ACTION_VIEW,
				Uri.parse(url)
				);
		startActivity(intent);
		return;
	}
}
