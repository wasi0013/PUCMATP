package com.example.explicitintentexample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {
	
	Button explicitButton,implicitButton,intentFilterButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		explicitButton = (Button) findViewById(R.id.button1);
		implicitButton = (Button) findViewById(R.id.button2);
		intentFilterButton = (Button) findViewById(R.id.button3);
		
		explicitButton.setOnClickListener(new OnClickListener(){
		
			@Override
			public void onClick(View v){
				//first hour code explicit intent
//				Intent intent = new Intent( MainActivity.this,SecondActivity.class);
//				startActivity(intent);
				
				//data pass
				
				//we will pass data using names and retrieve or get those data using that name
				Intent intent = new Intent( MainActivity.this,SecondActivity.class);
				intent.putExtra("data", "this is value sent via intent");
				startActivity(intent);

			}
			
		});
		implicitButton.setOnClickListener(new OnClickListener(){
			
			@Override
			public void onClick(View v){
				
				Intent intent = new Intent(Intent.ACTION_VIEW, 
						Uri.parse("http://about.me/wasi0013")
						);
				startActivity(intent);    
				
				
			}
		});
		
		intentFilterButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				//new Intent("<package name>.LAUNCH",Uri.parse(<URL string>))
				Intent intent = new Intent("com.example.explicitintentexample.LAUNCH",
						Uri.parse("http://about.me/wasi0013"));
				startActivity(intent);
				
			}
			
			
		});
		
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
