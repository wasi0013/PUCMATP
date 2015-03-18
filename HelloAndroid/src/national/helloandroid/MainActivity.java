package national.helloandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //toasting in android these will be displayed for a certain interval or duration
        Toast.makeText(getApplicationContext(), "onCreate() Called", Toast.LENGTH_SHORT).show();
        
        
    }

    @Override
    protected void onResume() {

    	//toasting in android these will be displayed for a certain interval or duration
        Toast.makeText(getApplicationContext(), "onResume() Called", Toast.LENGTH_SHORT).show();
        
        super.onResume();
        
    	
    }
    @Override
    protected void onPause() {

    	//toasting in android these will be displayed for a certain interval or duration
        Toast.makeText(getApplicationContext(), "onPause() Called", Toast.LENGTH_SHORT).show();
        
        super.onPause();
    }
    @Override
    protected void onRestart() {
    	
    	//toasting in android these will be displayed for a certain interval or duration
        Toast.makeText(getApplicationContext(), "onRestart() Called", Toast.LENGTH_SHORT).show();
        
        super.onRestart();
        
    }
    @Override
    protected void onStart() {
    	
    	//toasting in android these will be displayed for a certain interval or duration
        Toast.makeText(getApplicationContext(), "onStart() Called", Toast.LENGTH_SHORT).show();
        
        super.onStart();
        
    }
    @Override
    protected void onStop() {
    	
    	//toasting in android these will be displayed for a certain interval or duration
        Toast.makeText(getApplicationContext(), "onStop() Called", Toast.LENGTH_SHORT).show();

        super.onStop();
        
    }
    @Override
    protected void onDestroy() {

    	//toasting in android these will be displayed for a certain interval or duration
        Toast.makeText(getApplicationContext(), "onDestroy() Called", Toast.LENGTH_SHORT).show();
        
        super.onDestroy();
        
    }
}
