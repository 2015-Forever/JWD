package com.xm.jwd.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.xm.bean.Problem;
import com.xm.jwd.R;

public class CollectAdapter extends BaseAdapter{
	
	private List<Problem> mList;
	private LayoutInflater mInflater;
	
	public CollectAdapter(Context context, List<Problem> data) {
		mList = data;
		mInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return mList.size();
	}

	@Override
	public Object getItem(int position) {
		return mList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewHolder;
		// 得到控件
		if (convertView == null) {
			viewHolder = new ViewHolder();
			convertView = mInflater.inflate(R.layout.item_collect, null);
			viewHolder.main_iv = (ImageView) convertView
					.findViewById(R.id.main_iv);
			viewHolder.head_iv = (ImageView) convertView
					.findViewById(R.id.head_iv);
			viewHolder.time_tv = (TextView) convertView
					.findViewById(R.id.time_tv);
			viewHolder.techerName_tv = (TextView) convertView
					.findViewById(R.id.teachername_tv);
			viewHolder.messageState_tv = (TextView) convertView
					.findViewById(R.id.messagestate_tv);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		// 显示
		viewHolder.time_tv.setText(mList.get(position).time);
		viewHolder.techerName_tv.setText(mList.get(position).techerName);
		viewHolder.messageState_tv.setText(mList.get(position).messageState);

		return convertView;
	}
	
	/**
	 * 内部类：文艺式
	 */
	class ViewHolder {
		public TextView time_tv ;
		public TextView techerName_tv ; 
		public TextView messageState_tv ;
		public ImageView main_iv, head_iv ;
	}

}
