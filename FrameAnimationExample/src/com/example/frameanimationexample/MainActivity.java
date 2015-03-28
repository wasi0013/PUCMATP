package com.example.frameanimationexample;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView imageView;
	AnimationDrawable myDrawable;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//frame animation resources in drawable folder
		//tween animation resources in anim folder
		//oneshot=false for continuous anime (in the frameanimation.xml file)
		imageView = (ImageView) findViewById(R.id.imageView1);
		//all the drawables are set in the frameanimation.xml hence the source must be it
		
		imageView.setImageResource(R.drawable.frameanimation);
		
		myDrawable = (AnimationDrawable)imageView.getDrawable();
		myDrawable.start();
	}
	

}
