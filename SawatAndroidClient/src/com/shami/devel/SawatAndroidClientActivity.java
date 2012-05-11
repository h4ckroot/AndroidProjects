package com.shami.devel;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.shami.devel.R.id;

public class SawatAndroidClientActivity extends Activity {
	/** Called when the activity is first created. */
	private  String voted_for = "";
	private String Device_UUID = "";
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		//Getting the UUID of the Device.
		DeviceUuidFactory uuidInstance = new DeviceUuidFactory(getApplicationContext());
		Device_UUID = uuidInstance.getDeviceUuid().toString();
		
		Button Vote = (Button) findViewById(id.Btn_Vote);

		Vote.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO get the UUID of the Device
				// TODO Set a new Record for this UUID in the Database along with the
				// TODO Selection
				// TODO increment number of voters for the selected Voter by one
				
				// Showing a Toast of the selected Candidate
				Context context = getApplicationContext();
				CharSequence text = "You have voted for " + "\n" + voted_for + "\n"
						+ "Your UUDI is " + " " + Device_UUID;
				int duration = Toast.LENGTH_SHORT;
				Toast toast = Toast.makeText(context, text, duration);
				toast.show();

				
				
			}
		});

		final RadioButton candidate_1 = (RadioButton) findViewById(id.RB_candidate_1);
		final RadioButton candidate_2 = (RadioButton) findViewById(id.RB_candidate_2);
		final RadioButton candidate_3 = (RadioButton) findViewById(id.RB_candidate_3);
		final RadioButton candidate_4 = (RadioButton) findViewById(id.RB_candidate_4);
		final RadioButton candidate_5 = (RadioButton) findViewById(id.RB_candidate_5);
		final RadioButton candidate_6 = (RadioButton) findViewById(id.RB_candidate_6);
		final RadioButton candidate_7 = (RadioButton) findViewById(id.RB_candidate_7);
		final RadioButton candidate_8 = (RadioButton) findViewById(id.RB_candidate_8);
		final RadioButton candidate_9 = (RadioButton) findViewById(id.RB_candidate_9);
		final RadioButton candidate_10 = (RadioButton) findViewById(id.RB_candidate_10);
		final RadioButton candidate_11 = (RadioButton) findViewById(id.RB_candidate_11);
		final RadioButton candidate_12 = (RadioButton) findViewById(id.RB_candidate_12);
		final RadioButton candidate_13 = (RadioButton) findViewById(id.RB_candidate_13);
		
		

		candidate_1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				candidate_2.setChecked(false);
				candidate_3.setChecked(false);
				candidate_4.setChecked(false);
				candidate_5.setChecked(false);
				candidate_6.setChecked(false);
				candidate_7.setChecked(false);
				candidate_8.setChecked(false);
				candidate_9.setChecked(false);
				candidate_10.setChecked(false);
				candidate_11.setChecked(false);
				candidate_12.setChecked(false);
				candidate_13.setChecked(false);
				voted_for = getString(R.string.candidate_1_txt);
			}
		});

		candidate_2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				candidate_1.setChecked(false);
				candidate_3.setChecked(false);
				candidate_4.setChecked(false);
				candidate_5.setChecked(false);
				candidate_6.setChecked(false);
				candidate_7.setChecked(false);
				candidate_8.setChecked(false);
				candidate_9.setChecked(false);
				candidate_10.setChecked(false);
				candidate_11.setChecked(false);
				candidate_12.setChecked(false);
				candidate_13.setChecked(false);
				voted_for = getString(R.string.candidate_2_txt);
			}
		});

		candidate_3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				candidate_2.setChecked(false);
				candidate_1.setChecked(false);
				candidate_4.setChecked(false);
				candidate_5.setChecked(false);
				candidate_6.setChecked(false);
				candidate_7.setChecked(false);
				candidate_8.setChecked(false);
				candidate_9.setChecked(false);
				candidate_10.setChecked(false);
				candidate_11.setChecked(false);
				candidate_12.setChecked(false);
				candidate_13.setChecked(false);
				voted_for = getString(R.string.candidate_3_txt);
			}
		});

		candidate_4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				candidate_2.setChecked(false);
				candidate_3.setChecked(false);
				candidate_1.setChecked(false);
				candidate_5.setChecked(false);
				candidate_6.setChecked(false);
				candidate_7.setChecked(false);
				candidate_8.setChecked(false);
				candidate_9.setChecked(false);
				candidate_10.setChecked(false);
				candidate_11.setChecked(false);
				candidate_12.setChecked(false);
				candidate_13.setChecked(false);
				voted_for = getString(R.string.candidate_4_txt);
			}
		});

		candidate_5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				candidate_2.setChecked(false);
				candidate_3.setChecked(false);
				candidate_4.setChecked(false);
				candidate_1.setChecked(false);
				candidate_6.setChecked(false);
				candidate_7.setChecked(false);
				candidate_8.setChecked(false);
				candidate_9.setChecked(false);
				candidate_10.setChecked(false);
				candidate_11.setChecked(false);
				candidate_12.setChecked(false);
				candidate_13.setChecked(false);
				voted_for = getString(R.string.candidate_5_txt);
			}
		});
		candidate_6.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				candidate_2.setChecked(false);
				candidate_3.setChecked(false);
				candidate_4.setChecked(false);
				candidate_5.setChecked(false);
				candidate_1.setChecked(false);
				candidate_7.setChecked(false);
				candidate_8.setChecked(false);
				candidate_9.setChecked(false);
				candidate_10.setChecked(false);
				candidate_11.setChecked(false);
				candidate_12.setChecked(false);
				candidate_13.setChecked(false);
				voted_for = getString(R.string.candidate_6_txt);
			}
		});
		candidate_7.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				candidate_2.setChecked(false);
				candidate_3.setChecked(false);
				candidate_4.setChecked(false);
				candidate_1.setChecked(false);
				candidate_6.setChecked(false);
				candidate_5.setChecked(false);
				candidate_8.setChecked(false);
				candidate_9.setChecked(false);
				candidate_10.setChecked(false);
				candidate_11.setChecked(false);
				candidate_12.setChecked(false);
				candidate_13.setChecked(false);
				voted_for = getString(R.string.candidate_7_txt);
			}
		});
		candidate_8.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				candidate_2.setChecked(false);
				candidate_3.setChecked(false);
				candidate_4.setChecked(false);
				candidate_1.setChecked(false);
				candidate_6.setChecked(false);
				candidate_7.setChecked(false);
				candidate_5.setChecked(false);
				candidate_9.setChecked(false);
				candidate_10.setChecked(false);
				candidate_11.setChecked(false);
				candidate_12.setChecked(false);
				candidate_13.setChecked(false);
				voted_for = getString(R.string.candidate_8_txt);
			}
		});
		candidate_9.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				candidate_2.setChecked(false);
				candidate_3.setChecked(false);
				candidate_4.setChecked(false);
				candidate_1.setChecked(false);
				candidate_6.setChecked(false);
				candidate_7.setChecked(false);
				candidate_8.setChecked(false);
				candidate_5.setChecked(false);
				candidate_10.setChecked(false);
				candidate_11.setChecked(false);
				candidate_12.setChecked(false);
				candidate_13.setChecked(false);
				voted_for = getString(R.string.candidate_9_txt);
			}
		});
		candidate_10.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				candidate_2.setChecked(false);
				candidate_3.setChecked(false);
				candidate_4.setChecked(false);
				candidate_1.setChecked(false);
				candidate_6.setChecked(false);
				candidate_7.setChecked(false);
				candidate_8.setChecked(false);
				candidate_9.setChecked(false);
				candidate_5.setChecked(false);
				candidate_11.setChecked(false);
				candidate_12.setChecked(false);
				candidate_13.setChecked(false);
				voted_for = getString(R.string.candidate_10_txt);
			}
		});
		candidate_11.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				candidate_2.setChecked(false);
				candidate_3.setChecked(false);
				candidate_4.setChecked(false);
				candidate_1.setChecked(false);
				candidate_6.setChecked(false);
				candidate_7.setChecked(false);
				candidate_8.setChecked(false);
				candidate_9.setChecked(false);
				candidate_10.setChecked(false);
				candidate_5.setChecked(false);
				candidate_12.setChecked(false);
				candidate_13.setChecked(false);
				voted_for = getString(R.string.candidate_11_txt);
			}
		});
		candidate_12.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				candidate_2.setChecked(false);
				candidate_3.setChecked(false);
				candidate_4.setChecked(false);
				candidate_1.setChecked(false);
				candidate_6.setChecked(false);
				candidate_7.setChecked(false);
				candidate_8.setChecked(false);
				candidate_9.setChecked(false);
				candidate_10.setChecked(false);
				candidate_11.setChecked(false);
				candidate_5.setChecked(false);
				candidate_13.setChecked(false);
				voted_for = getString(R.string.candidate_12_txt);
			}
		});
		candidate_13.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				candidate_2.setChecked(false);
				candidate_3.setChecked(false);
				candidate_4.setChecked(false);
				candidate_1.setChecked(false);
				candidate_6.setChecked(false);
				candidate_7.setChecked(false);
				candidate_8.setChecked(false);
				candidate_9.setChecked(false);
				candidate_10.setChecked(false);
				candidate_11.setChecked(false);
				candidate_12.setChecked(false);
				candidate_5.setChecked(false);
				voted_for = getString(R.string.candidate_13_txt);
			}
		});

	}
}