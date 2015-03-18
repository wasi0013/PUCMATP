package com.example.eventlistenerexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	
	Button btn1,btn2;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //button initialization needs type casting
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        //button1 click listener implementation
//        btn1.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				Toast.makeText(getApplicationContext(),"Yay! Button Clicked", Toast.LENGTH_SHORT).show();
//			}
//		});
        
        
    }

	@Override
	public void onClick(View view) {
		
		if(view.getId()==R.id.button1){
			
			Toast.makeText(getApplicationContext(), "Yay! Button1 Clicked", Toast.LENGTH_SHORT).show();
			return;
		}
		else if (view.getId() == R.id.button2){
			
			Toast.makeText(getApplicationContext(),"Yay! Button2 clicked",Toast.LENGTH_SHORT).show();
			return;
		}
	}
//3rd method
//	public void methodForButton1(View v){
//		
//		return;
//	}
//	public void methodForButton2(View v){
//		
//		return;
//	}
// //and edit acitivity_main.xml with this android:onClick="methodForButton1"	

	/* challenge:
	 * one method that can detect two different button press
	 */ 
	 
    
}
