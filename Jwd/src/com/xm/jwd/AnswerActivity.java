package com.xm.jwd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class AnswerActivity extends Activity implements OnClickListener{
	
	private Button complaint_btn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_answer);
		
		init();
		initListener();
		
	}

	private void initListener() {
		complaint_btn.setOnClickListener(this);
	}

	private void init() {
		complaint_btn = (Button) findViewById(R.id.complaint_btn);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.complaint_btn:
			Intent _Intent = new Intent(AnswerActivity.this,ComplaintActivity.class);
			startActivity(_Intent);
			break;
		}
	}

}
