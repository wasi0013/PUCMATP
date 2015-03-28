package com.example.tweenanimationexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//accelerate_interpolator ==> t^2 time
		//linear_interpolator ==> t times
		//deAccelerate_interpolator ==> 1-t^2 (maybe)
		textView = (TextView)findViewById(R.id.textView1);
		textView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Animation rotate =  AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
				textView.startAnimation(rotate);
			}
		});
	}


}
