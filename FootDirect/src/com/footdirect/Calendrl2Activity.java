package com.footdirect;

import java.util.StringTokenizer;
import java.util.Vector;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.ListActivity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Toast;

//import com.footdirect.CalendrierActivity.Downloader;

public class Calendrl2Activity extends ListActivity {

	

		String[] items;
		
		public void onCreate(Bundle icicle) {
			super.onCreate(icicle);
			setContentView(R.layout.activity_calendrl2);
			Toast.makeText(Calendrl2Activity.this,"Veuillez patienter", Toast.LENGTH_SHORT).show();
			Downloader downloader = new Downloader();
			downloader.execute("http://10.0.2.2/codephp/cl2.php");
			
			

		}

		protected class Downloader extends AsyncTask<String, Void, String> {

			@Override
			protected String doInBackground(String... args) {

				HttpClient client = new DefaultHttpClient();
				HttpGet get = new HttpGet(args[0]);
				
				try {
					String resultat = client.execute(get,
							new BasicResponseHandler());
					
					return resultat;
				} catch (Exception e) {
					
				}
				return null;
				
			}

			@Override
			protected void onPostExecute(String result) {
				
			Vector v = new Vector();
				StringTokenizer st = new StringTokenizer(result.substring(0,
						result.indexOf("!")), "#");
				
				while (st.hasMoreTokens()) {
					v.add(st.nextToken());
					
				}
	                items = new String[v.size()];
	for (int i = 0; i < v.size(); i++) {
					items[i] = v.elementAt(i).toString();
					Log.v("Chaine=", v.elementAt(i).toString());
				}
	setListAdapter(new ArrayAdapter<String>(Calendrl2Activity.this,
			android.R.layout.simple_list_item_1, items));

			}

			}


		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.calendrl2, menu);
			return true;
		}
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			if(item.getItemId()==R.id.menuStade){
				Intent intent=new Intent(Calendrl2Activity.this,StadeActivity.class);
				startActivity(intent);
			}
			return super.onOptionsItemSelected(item);
}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

