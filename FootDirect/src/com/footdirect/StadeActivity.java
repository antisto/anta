package com.footdirect;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class StadeActivity extends Activity {



	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.stade, menu);
		return true;
	}
*/
	// *****************************************************************************
			private final LatLng LOCATION_BURNABY = new LatLng(14.667688, -17.437300);
			private final LatLng LOCATION_SURREY = new LatLng(14.730000, -17.444932);

			private GoogleMap map;

			// *****************************************************************************

			

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_stade);
			
			// *****************************************************************************
			map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
					.getMap();
			map.addMarker(new MarkerOptions().position(LOCATION_SURREY).title(
					"Ma Ligne1"));
			map.addMarker(new MarkerOptions().position(LOCATION_BURNABY).title(
					"Ma Ligne10"));
			// *****************************************************************************
		   
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.stade, menu);
			return true;
		}
		
		// *****************************************************************************
			public void onClick_City(View v) {
				// CameraUpdate update =
				// CameraUpdateFactory.newLatLng(LOCATION_BURNABY);
				map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
				CameraUpdate update = CameraUpdateFactory.newLatLngZoom(
						LOCATION_BURNABY, 10);
				map.animateCamera(update);
			}

			public void onClick_Burnaby(View v) {
				map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
				CameraUpdate update = CameraUpdateFactory.newLatLngZoom(
						LOCATION_BURNABY, 10);
				map.animateCamera(update);

			}

			public void onClick_Surrey(View v) {
				map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
				CameraUpdate update = CameraUpdateFactory.newLatLngZoom(
						LOCATION_BURNABY, 10);
				map.animateCamera(update);

			}
			// *****************************************************************************

	}
