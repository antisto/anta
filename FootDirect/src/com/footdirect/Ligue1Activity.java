package com.footdirect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Ligue1Activity extends Activity {

	ImageButton butoncallig1,butonclasslig1,butonresulig1;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ligue1);
		
		
		butoncallig1=(ImageButton)findViewById(R.id.butoncallig1);
		butoncallig1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent= new Intent(Ligue1Activity.this,CalendrierActivity.class);
			    startActivity(intent);
				
			}
		});
		butonclasslig1=(ImageButton)findViewById(R.id.butonclasslig1);
		butonclasslig1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent= new Intent(Ligue1Activity.this,ClassementActivity.class);
			    startActivity(intent);
				
			}
		});
		butonresulig1=(ImageButton)findViewById(R.id.butonresulig1);
		butonresulig1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent= new Intent(Ligue1Activity.this,ResultatActivity.class);
			    startActivity(intent);
				
			}
		});

	}
	
}
