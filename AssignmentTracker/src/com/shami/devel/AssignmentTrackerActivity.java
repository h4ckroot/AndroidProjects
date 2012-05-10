package com.shami.devel;

import com.shami.devel.R.id;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AssignmentTrackerActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button addAssignment = (Button) findViewById(id.btn_add_assignemnt_main);
        
        addAssignment.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent call_add_view_activity_intent = new Intent(AssignmentTrackerActivity.this, AddViewAssignment.class);
				startActivity(call_add_view_activity_intent);
			}
		});
        
    }
}