package com.example.dell.recipebywx;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.Image;
import android.util.AttributeSet;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by dell on 2018/12/27.
 */

public class HomeToolbar extends LinearLayout {

    /**
     * made by wx : wxdwlai@sina.com
     * @param context
     */
    private int leftLlSrc;
    private int rightLlSrc;
    private Boolean isAddLlVisible;
    private Boolean isSearchLlVisble;
    private Boolean isRightButton1Visible;
    private Boolean isRightButton2Visible;
    private Boolean isRightEtvVisible;
    private Boolean isClearIvVisible;
    private String rightTvText;
    private String centerTvText;

    private int backgroundResId;

    public HomeToolbar(Context context) {
        this(context, null);
    }
    public HomeToolbar(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HomeToolbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(attrs);
    }
    /**
     * 初始化属性
     *
     * @param attrs
     */
    public void initView(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.HomeToolBar);

        isAddLlVisible = typedArray.getBoolean(R.styleable.HomeToolBar_left_ll_visible,false);
        leftLlSrc = typedArray.getResourceId(R.styleable.HomeToolBar_left_ll_src,-1);
        rightLlSrc = typedArray.getResourceId(R.styleable.HomeToolBar_right_ll_src,-1);
        isSearchLlVisble = typedArray.getBoolean(R.styleable.HomeToolBar_center_search_ll_visible,false);
        isRightButton1Visible = typedArray.getBoolean(R.styleable.HomeToolBar_right_button_ll_visible,false);
        isRightButton2Visible = typedArray.getBoolean(R.styleable.HomeToolBar_right_button2_ll_visible,false);
        isRightEtvVisible = typedArray.getBoolean(R.styleable.HomeToolBar_home_right_tv_visible,false);
        isClearIvVisible = typedArray.getBoolean(R.styleable.HomeToolBar_home_clear_iv_visible,false);
        if (typedArray.hasValue(R.styleable.HomeToolBar_home_right_tv_text)) {
            rightTvText = typedArray.getString(R.styleable.HomeToolBar_home_right_tv_text);
        }
        if (typedArray.hasValue(R.styleable.HomeToolBar_center_search_text)) {
            centerTvText = typedArray.getString(R.styleable.HomeToolBar_center_search_text);
        }
        backgroundResId = typedArray.getResourceId(R.styleable.HomeToolBar_homeBarBackground, -1);
        typedArray.recycle();
        View barLayoutView = View.inflate(getContext(), R.layout.layout_home_toolbar, null);
        LinearLayout barRlyt = (LinearLayout) barLayoutView.findViewById(R.id.toolbar_home_rlyt);

        LinearLayout addLl = (LinearLayout)barLayoutView.findViewById(R.id.toolbar_left_button);
        ImageView leftIv = (ImageView)barLayoutView.findViewById(R.id.toolbar_left_image);
        LinearLayout searchLl = (LinearLayout)barLayoutView.findViewById(R.id.toolbar_center_serch);
        EditText searchEtv = (EditText)barLayoutView.findViewById(R.id.toolbar_search_etv);
        LinearLayout rightButtonLl = (LinearLayout)barLayoutView.findViewById(R.id.toolbar_right_btn);
        LinearLayout rightButton2Ll = (LinearLayout)barLayoutView.findViewById(R.id.toolbar_right_btn2);
        LinearLayout clearIv = (LinearLayout) barLayoutView.findViewById(R.id.clear_iv);
        TextView rightTv = (TextView) barLayoutView.findViewById(R.id.toolbar_right_tv);

        ImageView rightIv = (ImageView)barLayoutView.findViewById(R.id.toolbar_right_iv);

        if (leftLlSrc != -1) {
            leftIv.setImageResource(leftLlSrc);
        }
        if (rightLlSrc != -1) {
            rightIv.setImageResource(rightLlSrc);
        }
        if (isAddLlVisible) {
            addLl.setVisibility(VISIBLE);
        }
        if (isSearchLlVisble) {
            searchLl.setVisibility(VISIBLE);
        }
        searchEtv.setHint(centerTvText);
//        searchEtv.setText(centerTvText);
        if (isRightButton1Visible) {
            rightButtonLl.setVisibility(VISIBLE);
        }
        if (isRightButton2Visible) {
            rightButton2Ll.setVisibility(VISIBLE);
        }
        if (isRightEtvVisible) {
            rightTv.setVisibility(VISIBLE);
        }
        rightTv.setText(rightTvText);

        if (backgroundResId != -1) {
            barRlyt.setBackgroundColor(getResources().getColor(R.color.bg_toolbar));
        }

        if (isClearIvVisible) {
            clearIv.setVisibility(VISIBLE);
        }
        //将设置完成之后的View添加到此LinearLayout中
        addView(barLayoutView, 0);
    }
}
