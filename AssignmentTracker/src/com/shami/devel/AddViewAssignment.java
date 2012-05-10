package com.shami.devel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.shami.devel.R.id;

public class AddViewAssignment extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_view_assignment);
        
        
        Button view_assignments = (Button) findViewById(id.btn_view_assignment);
        
        view_assignments.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent call_assignment_traker_activity = new Intent(AddViewAssignment.this, AssignmentTrackerActivity.class);
				startActivity(call_assignment_traker_activity);
			}
		});
    }
}