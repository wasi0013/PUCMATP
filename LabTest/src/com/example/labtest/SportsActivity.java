package com.example.labtest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SportsActivity extends Activity implements OnClickListener{
	Button cricinfo,cricbuzz;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sports);
		cricinfo = (Button) findViewById(R.id.cricinfo);
		cricbuzz = (Button) findViewById(R.id.cricbuzz);
		cricinfo.setOnClickListener(this);
		cricbuzz.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		String url="";
		if(v.getId()==R.id.cricinfo){
			url="http://cricinfo.com";
		}
		else if(v.getId()== R.id.cricbuzz){
			
			url="http://cricbuzz.com";
			
		}
		
		Intent intent = new Intent(Intent.ACTION_VIEW,
				Uri.parse(url)
				);
		startActivity(intent);
		return;
		
		
	}
	

}
