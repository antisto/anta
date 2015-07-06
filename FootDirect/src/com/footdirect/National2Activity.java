package com.footdirect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class National2Activity extends Activity {

	ImageButton butoncalnat2,butonclassnat2,butonresulnat2;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_national2);

		butoncalnat2=(ImageButton)findViewById(R.id.butoncalnat2);
		butoncalnat2.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			Intent intent= new Intent(National2Activity.this,Calendrn2Activity.class);
		    startActivity(intent);
			
		}
	});
		butonclassnat2=(ImageButton)findViewById(R.id.butonclassnat2);
	butonclassnat2.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent intent= new Intent(National2Activity.this,Classementnat2Activity.class);
		    startActivity(intent);
			
		}
	});
	butonresulnat2=(ImageButton)findViewById(R.id.butonresulnat2);
	butonresulnat2.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent intent= new Intent(National2Activity.this,ResultatActivity.class);
		    startActivity(intent);
			
		}
	});

	}

	

}
