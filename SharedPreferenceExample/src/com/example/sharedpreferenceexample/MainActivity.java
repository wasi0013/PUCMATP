package com.example.sharedpreferenceexample;

import java.util.Random;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	TextView textScore,textHighScore;
	Button buttonGenerate,buttonReset;
	
	//for showing scores
	SharedPreferences preferences;
	
	//for updating scores
	SharedPreferences.Editor preferencesEditor;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textHighScore = (TextView) findViewById(R.id.textView1);
		textScore = (TextView) findViewById(R.id.textView2);
		buttonGenerate = (Button)findViewById(R.id.button1);
		buttonReset = (Button) findViewById(R.id.button2);
		preferences = getSharedPreferences("game", MODE_PRIVATE);
		preferencesEditor = preferences.edit(); 
	    
		// Here getInt will return the 2nd parameter(-1) if the query of highScore fails 
		int highScore=preferences.getInt("highScore", -1);
		textHighScore.setText("High Score: "+highScore);
		
		buttonGenerate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Random random = new Random();
				
				int score = random.nextInt(1000);
				textScore.setText("Score: "+score);
				
				int highScore = preferences.getInt("highScore", -1);
				
				if(score>highScore){
					
					highScore=score;
					
					textHighScore.setText("High Score: "+highScore);
					preferencesEditor.putInt("highScore", highScore);
					preferencesEditor.commit();
				}
				
			}
		});
		buttonReset.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				textHighScore.setText("High Score Reseted: -1");
				preferencesEditor.putInt("highScore", -1);
				preferencesEditor.commit();
				
				
			}
		});

	}


}
