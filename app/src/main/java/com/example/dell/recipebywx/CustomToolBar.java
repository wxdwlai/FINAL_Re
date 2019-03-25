package com.example.dell.recipebywx;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by dell on 2019/1/5.
 */

public class CustomToolBar extends LinearLayout {
    private Boolean isLefBtnVisible;
    private Boolean isLeftTvVisible;
    private Boolean isCenterTvVisible;
    private Boolean isRightBtnVisible;
    private int leftIvImg;
    private int rightIvImg;
    private String titleText = "";
    private String leftText = "";
    private int backgroundResId;


    public CustomToolBar(Context context) {
        this(context, null);
    }
    public CustomToolBar(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }
    public CustomToolBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(attrs);
    }

    private void initView(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.CustomToolBar);

        isLefBtnVisible = typedArray.getBoolean(R.styleable.CustomToolBar_left_btn_visible,false);
        isLeftTvVisible = typedArray.getBoolean(R.styleable.CustomToolBar_left_tv_visible,false);
        isCenterTvVisible = typedArray.getBoolean(R.styleable.CustomToolBar_center_tv_visible,false);
        isRightBtnVisible = typedArray.getBoolean(R.styleable.CustomToolBar_right_btn_visible,false);
        backgroundResId = typedArray.getResourceId(R.styleable.CustomToolBar_barBackground,-1);
        if (typedArray.hasValue(R.styleable.CustomToolBar_center_tv_text)) {
            titleText = typedArray.getString(R.styleable.CustomToolBar_center_tv_text);
        }
        if (typedArray.hasValue(R.styleable.CustomToolBar_left_tv_text)) {
            leftText = typedArray.getString(R.styleable.CustomToolBar_left_tv_text);
        }
        leftIvImg = typedArray.getResourceId(R.styleable.CustomToolBar_left_btn_src,-1);
        rightIvImg = typedArray.getResourceId(R.styleable.CustomToolBar_right_btn_src,-1);

//        if (typedArray.hasValue(R.styleable.CustomToolBar_left_btn_src)) {
//            leftIvImg = typedArray.getResourceId(R.styleable.CustomToolBar_left_btn_src,-1);
//        }
//        if (typedArray.hasValue(R.styleable.CustomToolBar_right_btn_src)) {
//            rightIvImg = typedArray.getResourceId(R.styleable.CustomToolBar_right_btn_src,-1);
//        }
        typedArray.recycle();
        View barLayoutView = View.inflate(getContext(), R.layout.layout_custom_toolbar_head, null);
        RelativeLayout actionBar = (RelativeLayout)barLayoutView.findViewById(R.id.action_bar_root);
        LinearLayout leftLl = (LinearLayout)barLayoutView.findViewById(R.id.toolbar_left_btn);
        TextView leftTv = (TextView)barLayoutView.findViewById(R.id.toolbar_left_tv);
        ImageView leftIv = (ImageView)barLayoutView.findViewById(R.id.toolbar_left_iv);
        TextView titleTv = (TextView)barLayoutView.findViewById(R.id.toolbar_center_tv);
        LinearLayout rightLl = (LinearLayout)barLayoutView.findViewById(R.id.toolbar_right_btn);
        ImageView rightIv = (ImageView)barLayoutView.findViewById(R.id.toolbar_right_image);
        if (isLefBtnVisible) {
            leftLl.setVisibility(VISIBLE);
        }
        if (leftIvImg != -1) {
            leftIv.setImageResource(leftIvImg);
        }
        if (isLeftTvVisible) {
            leftTv.setVisibility(VISIBLE);
        }
        if (leftText.length() != 0) {
            leftTv.setText(leftText);
        }
        if (isCenterTvVisible) {
            titleTv.setVisibility(VISIBLE);
        }
        if (titleText.length() != 0) {
            titleTv.setText(titleText);
        }
        if (isRightBtnVisible) {
            rightLl.setVisibility(VISIBLE);
        }
        if (rightIvImg != -1) {
            rightIv.setImageResource(rightIvImg);
        }
        if (backgroundResId != -1) {
            actionBar.setBackgroundColor(getResources().getColor(R.color.bg_toolbar));
        }
        //将设置完成之后的View添加到此LinearLayout中
        addView(barLayoutView, 0);
    }
}
