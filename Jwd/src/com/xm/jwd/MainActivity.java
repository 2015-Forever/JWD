package com.xm.jwd;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.xm.bean.Problem;
import com.xm.jwd.adapter.CollectAdapter;

public class MainActivity extends Activity implements OnItemClickListener {

	private ListView mListView;
	private List<Problem> mList;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.fragment_collect);
        initView();
    }

	private void initView() {
		mListView = (ListView) findViewById(R.id.collect_lv);
		mList = new ArrayList<Problem>();
		Problem problem;
		for (int i = 0; i < 10; i++) {
			problem = new Problem();
			problem.time = "2015-06-08 15:30" ;
			problem.techerName = "三胖子" ;
			problem.messageState = "已解答";
			mList.add(problem);
		}
		CollectAdapter adapter = new CollectAdapter(MainActivity.this, mList);
		mListView.setAdapter(adapter);
		mListView.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parents, View view, int position, long id) {
		Toast.makeText(MainActivity.this, mList.get(position).techerName, Toast.LENGTH_SHORT).show();
	}
    
}
