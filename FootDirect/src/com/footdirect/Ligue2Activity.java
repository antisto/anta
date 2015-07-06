package com.footdirect;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Ligue2Activity extends Activity {
	ImageButton butoncalig2,butonclasslig2,butonresulig2;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ligue2);
		butoncalig2=(ImageButton)findViewById(R.id.butoncalig2);
		butoncalig2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent= new Intent(Ligue2Activity.this,Calendrl2Activity.class);
			    startActivity(intent);
				
			}
		});
		butonclasslig2=(ImageButton)findViewById(R.id.butonclasslig2);
		butonclasslig2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent= new Intent(Ligue2Activity.this,Classementl2Activity.class);
			    startActivity(intent);
				
			}
		});
		butonresulig2=(ImageButton)findViewById(R.id.butonresulig2);
		butonresulig2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent= new Intent(Ligue2Activity.this,ResultatActivity.class);
			    startActivity(intent);
				
			}
		});

	}

	
	

}
