package com.example.listviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity{
	TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		textView = (TextView) findViewById(R.id.textView1);
		String value = getIntent().getExtras().getString("data");
		textView.setText("Hello From "+value);
	}

}
