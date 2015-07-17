package com.xm.jwd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;

public class ComplaintActivity extends Activity implements OnClickListener{
	
	private TextView send_complaint_tv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_complaint);
		init();
		initListener();
	}

	private void initListener() {
		send_complaint_tv.setOnClickListener(this);
	}

	private void init() {
		send_complaint_tv = (TextView) findViewById(R.id.send_complaint_tv);
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.send_complaint_tv:
			Intent _Intent = new Intent(ComplaintActivity.this, SuccessComplaintActivity.class);
			startActivity(_Intent);
			break;
		}
	}

}
