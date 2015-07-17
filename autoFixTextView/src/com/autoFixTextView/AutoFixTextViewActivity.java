package com.autoFixTextView;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

public class AutoFixTextViewActivity extends Activity {
	private LinearLayout linearLayout1;
	private TextViewMultilineEllipse tvMultilineEllipse;
	private TextView tvNormal;
	
	//水调歌头，大家懂的
	private final String text="明月几时有？把酒问青天。不知天上宫阙，今夕是何年。\n"
			+"我欲乘风归去，又恐琼楼玉宇，高处不胜寒。\n"
			+"起舞弄清影，何似在人间。\n"
			+"转朱阁，低绮户，照无眠。不应有恨，何事长向别时圆？\n"
			+"人有悲欢离合，月有阴晴圆缺，此事古难全。\n"
			+"但愿人长久，千里共婵娟。";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        this.setTitle("适应多行文本的Android TextView---hellogv");
        
        //共同的宽高
        LayoutParams lp=new LayoutParams(LayoutParams.FILL_PARENT,300);
        //----用TextView来显示换行长文本----//
        tvNormal=(TextView)this.findViewById(R.id.tvNormal);
        tvNormal.setLayoutParams(lp); //限制TextView的宽高
        tvNormal.setEllipsize(TextUtils.TruncateAt.END);
        tvNormal.setSingleLine(false);
        tvNormal.setMaxLines(5);
        tvNormal.setText(text);
        
        
        //----用TextViewMultilineEllipse来显示换行长文本----//
        linearLayout1=(LinearLayout) this.findViewById(R.id.linearLayout1);
        
        tvMultilineEllipse = new TextViewMultilineEllipse(this);
		tvMultilineEllipse.setLayoutParams(lp);//限制TextView的宽高
		tvMultilineEllipse.setEllipsis("...");//...替换剩余字符串
		tvMultilineEllipse.setMaxLines(5);
		tvMultilineEllipse.setTextSize((int)tvNormal.getTextSize());//设置文字大小
		tvMultilineEllipse.setTextColor(Color.WHITE);
		tvMultilineEllipse.setText(text);//设置文本
		
		//在代码里添加tvMultilineEllipse,暂时不支持Layout里直接添加
		linearLayout1.addView(tvMultilineEllipse);
		
    }
 
    
}