package com.example.cityinfo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PortCityActivity extends Activity{
	Button btn1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_port_city);
		btn1 = (Button) findViewById(R.id.portcity);
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent= new Intent(Intent.ACTION_VIEW,
						Uri.parse("http://en.wikipedia.org/wiki/Chittagong"));
				
			    startActivity(intent);	
			}
		});
		
	}

}
