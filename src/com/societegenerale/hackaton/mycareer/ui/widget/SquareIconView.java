package com.societegenerale.hackaton.mycareer.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class SquareIconView extends ImageView {
	public SquareIconView(Context context) {
		super(context);
	}

	public SquareIconView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public SquareIconView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth()); //Snap to width
	}
}