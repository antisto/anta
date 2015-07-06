package com.footdirect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class National1Activity extends Activity {
	
	ImageButton boutoncalnat1,buttonclassnat1,buttonresulnat1;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_national1);
	
		boutoncalnat1=(ImageButton)findViewById(R.id.boutoncalnat1);
		boutoncalnat1.setOnClickListener(new OnClickListener() {
	
		@Override
		public void onClick(View arg0) {
			Intent intent= new Intent(National1Activity.this,Calendrn1Activity.class);
		    startActivity(intent);
			
		}
	});
		buttonclassnat1=(ImageButton)findViewById(R.id.buttonclassnat1);
		buttonclassnat1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent intent= new Intent(National1Activity.this,Classementnat1Activity.class);
		    startActivity(intent);
			
		}
	});
		buttonresulnat1=(ImageButton)findViewById(R.id.buttonresulnat1);
		buttonresulnat1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent intent= new Intent(National1Activity.this,ResultatActivity.class);
		    startActivity(intent);
			
		}
	});

	}

	
}
