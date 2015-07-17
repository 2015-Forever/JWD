package com.xm.jwd;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class SuccessComplaintActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_complaint_success);
	}

}
