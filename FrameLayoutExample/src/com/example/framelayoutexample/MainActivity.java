package com.example.framelayoutexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	ImageView img1,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        img1 = (ImageView) findViewById(R.id.imageView1);
        img2 = (ImageView) findViewById(R.id.imageView2);
        img1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				img1.setVisibility(View.INVISIBLE);
				img2.setVisibility(View.VISIBLE);
			}
		});
        
        img2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				img1.setVisibility(View.VISIBLE);
				img2.setVisibility(View.INVISIBLE);
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
