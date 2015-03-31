package com.leo.sqlitehomework;


import android.app.Activity;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends Activity {

	Button insert, show, delete;
	String tableName="student";
	SharedPreferences pref;
	SharedPreferences.Editor editPref;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		pref = getSharedPreferences("db", MODE_PRIVATE);
		editPref = pref.edit();
		
		boolean isCreated= pref.getBoolean("isCreated", false);
		if(!isCreated)createDatabase();
		
		insert = (Button) findViewById(R.id.button1);
		show = (Button) findViewById(R.id.button2);
		delete = (Button) findViewById(R.id.button3);
		
		
		insert.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				SQLiteDatabase db= openOrCreateDatabase("MyDB", 0, null);
				String sql = "INSERT INTO "+tableName+" VALUES(1,'Leo','37136072710')";
				
				db.execSQL(sql);
				
				sql = "INSERT INTO "+tableName+" VALUES(1,'Oel','37136072710')";
				
				db.execSQL(sql);
				
				Toast.makeText(getApplicationContext(), "Data Inserted Yay!", Toast.LENGTH_LONG).show();
				db.close();
			}
		});
		
		show.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				SQLiteDatabase db = openOrCreateDatabase("MyDB", 0, null);
				Cursor cursor = db.rawQuery("SELECT * FROM "+tableName+";",null);

				int rowCount=cursor.getCount();
				if(rowCount<1){
					Toast.makeText(getApplicationContext(),"No Data Available",Toast.LENGTH_LONG).show();
				}
				else{
					cursor.moveToFirst();
					String allData="";
					do {
						String name = cursor.getString(cursor.getColumnIndex("name"));
						String phone = cursor.getString(cursor.getColumnIndex("phone"));
						allData+=name+" "+phone+"\n";
						
						Toast.makeText(getApplicationContext(), allData, Toast.LENGTH_LONG).show();
						
					} while (cursor.moveToNext());
					
				}
				db.close();
				
			}
		});
		
		delete.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				SQLiteDatabase db = openOrCreateDatabase("MyDB",0,null);
				String sql = "DELETE FROM "+tableName+";";
				db.execSQL(sql);
				db.close();
				Toast.makeText(getApplicationContext(), "Data deleted ", Toast.LENGTH_SHORT).show();
			}
		});
		
		
		
	}
	
	public void createDatabase(){
		
		SQLiteDatabase db = openOrCreateDatabase("MyDB",0,null);
		String sql ="CREATE TABLE IF NOT EXISTS "+tableName+"(id INTEGER,name VARCHAR,phone VARCHAR);";
		db.execSQL(sql);
		db.close();
		Toast.makeText(getApplicationContext(), "Database Created Yay!", Toast.LENGTH_LONG).show();
		editPref.putBoolean("isCreated", true);
		editPref.commit();
	}


}
