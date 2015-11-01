package org.yanzi.ui;

import org.yanzi.constant.Constant;

import com.example.fragmentproject.R;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class HeadControlPanel extends RelativeLayout {

	private Context mContext;
	private TextView mMidleTitle;
	private TextView mRightTitle;
	private static final float middle_title_size = 20f; 
	private static final float right_title_size = 17f; 
	private static final int default_background_color = Color.rgb(21, 126, 203);
	
	public HeadControlPanel(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onFinishInflate() {
		// TODO Auto-generated method stub
		mMidleTitle = (TextView)findViewById(R.id.midle_title);
		mRightTitle = (TextView)findViewById(R.id.right_title);
		setBackgroundColor(default_background_color);
	}
	public void initHeadPanel(){
		
		if(mMidleTitle != null){
			setMiddleTitle(Constant.FRAGMENT_FLAG_MESSAGE);
		}
	}
	public void setMiddleTitle(String s){
		mMidleTitle.setText(s);
		mMidleTitle.setTextSize(middle_title_size);
	}
	

}
