package com.footdirect;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class AccueilActivity extends Activity {

 ImageButton ligue_1_btn,ligue_2_btn,
 sn2_btn,sn1_btn;
  
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
    

ligue_1_btn=(ImageButton)findViewById(R.id.ligue_1_btn);
ligue_1_btn.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		Intent intent= new Intent(AccueilActivity.this,Ligue1Activity.class);
	    startActivity(intent);
		
	}
});

ligue_2_btn=(ImageButton)findViewById(R.id.ligue_2_btn);
ligue_2_btn.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		Intent intent= new Intent(AccueilActivity.this,Ligue2Activity.class);
	    startActivity(intent);
		
	}
});
sn1_btn=(ImageButton)findViewById(R.id.sn1_btn);
sn1_btn.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		
		Intent intent= new Intent(AccueilActivity.this,National1Activity.class);
	    startActivity(intent);
	}
});
sn2_btn=(ImageButton)findViewById(R.id.sn2_btn);
sn2_btn.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		Intent intent= new Intent(AccueilActivity.this,National2Activity.class);
	    startActivity(intent);
		
	}
});


}

public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.calendrier, menu);
	return true;
}
@Override
public boolean onOptionsItemSelected(MenuItem item) {
	if(item.getItemId()==R.id.menuStade){
		Intent intent=new Intent(AccueilActivity.this,StadeActivity.class);
		startActivity(intent);
	}
	return super.onOptionsItemSelected(item);

	
}
     
   
    
}
