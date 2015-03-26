package com.example.listviewexample;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	ListView list;
	ArrayList<String> items = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.listView1);
        
        items.add("Chittagong");
        items.add("Dhaka");
        items.add("Barisal");
        items.add("Commilla");
        items.add("Sylhet");
        items.add("Rangpur");
        items.add("Khulna");
        
        //Three types of adapter: array adapter, cursor adapter, and base adapter
        //advanced list and normal list differs in adapter
        //Base Adapter must be extended to create custom adapter with custom designs
        
        //we will use array adapter to control all the list items
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapter, View view, int position,
					long id) {
				String value = items.get(position);
				Intent intent = new Intent(MainActivity.this,SecondActivity.class);
				intent.putExtra("data", value);
				startActivity(intent);
				
				
			}
		});
        
        
        
        
    }


    
}

