package com.example.explicitintentexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		//retrieving data from main activity using intent
		//first we get intent after that we get extras then we get the value searching with keys
//		String value=getIntent().getExtras().getString("data");
//		Toast.makeText(getApplication(), value, Toast.LENGTH_SHORT).show();
//		
		
	}
	
	

}
