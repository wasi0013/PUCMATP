package com.example.linker;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	Button btn1,btn2,btn3,btn4,btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn1.setOnClickListener(MainActivity.this);
        btn2.setOnClickListener(MainActivity.this);
        btn3.setOnClickListener(MainActivity.this);
        btn4.setOnClickListener(MainActivity.this);
        btn5.setOnClickListener(MainActivity.this);
        
    }




	@Override
	public void onClick(View v) {
		int key=v.getId();
		String url="";
		switch (key) {
		case R.id.button1:
			url="http://www.puc.ac.bd";
			break;
		case R.id.button2:
			url ="http://www.cuet.ac.bd";
			break;
		case R.id.button3:
			url ="http://www.du.ac.bd";
			break;
		case R.id.button4:
			url ="http://www.buet.ac.bd";
			break;
			
		case R.id.button5:
			url ="http://github.com/wasi0013/PUCMATP";
			break;
		default: 
			url ="http://github.com/wasi0013/PUCMATP";
			break;
		
		
		}
		Intent intent = new Intent(Intent.ACTION_VIEW,
				Uri.parse(url));
		startActivity(intent);
		return;
		
	}
    
}
