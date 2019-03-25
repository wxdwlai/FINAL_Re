package com.example.dell.recipebywx;

import android.Manifest;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.dell.recipebywx.collect.CollectFragment;
import com.example.dell.recipebywx.home.HomeFragment;
import com.example.dell.recipebywx.message.MessageFragment;
import com.example.dell.recipebywx.my.MyFragment;
import com.example.dell.recipebywx.utils.Helper;

import butterknife.BindFont;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends FragmentActivity {

    @BindFont(R.id.fl_main)
    FrameLayout frameLayout;

    @BindView(R.id.ll_main_home)
    LinearLayout homeLl;

    @BindView(R.id.ll_main_collect)
    LinearLayout collectLl;

    @BindView(R.id.ll_main_message)
    LinearLayout messageLl;

    @BindView(R.id.ll_main_my)
    LinearLayout userHomeLl;

    @BindView(R.id.iv_main_button_home)
    ImageView homeIv;

    @BindView(R.id.iv_main_button_collect)
    ImageView collectIv;

    @BindView(R.id.iv_main_button_message)
    ImageView messageIv;

    @BindView(R.id.iv_main_button_my)
    ImageView userHomeIv;

    private String userId;//本地用户id
    private int fragmentId = -1;//当前显示界面

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
//        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
        ButterKnife.bind(this);
//        userId = getIntent().getStringExtra("userId");
//        fragmentId = getIntent().getIntExtra("fragmentId", -1);
        initView();
        if (fragmentId == -1) {
            setSelect(1);
        } else {
            setSelect(fragmentId);
        }
        if(Build.VERSION.SDK_INT>=23){
            String[] mPermissionList = new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.CALL_PHONE,Manifest.permission.READ_LOGS,Manifest.permission.READ_PHONE_STATE, Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.SET_DEBUG_APP,Manifest.permission.SYSTEM_ALERT_WINDOW,Manifest.permission.GET_ACCOUNTS,Manifest.permission.WRITE_APN_SETTINGS};
            ActivityCompat.requestPermissions(this,mPermissionList,123);
        }
        this.changeStatusBarTextColor(true);
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }
    private void initView() {
        frameLayout = (FrameLayout)findViewById(R.id.fl_main);
        homeLl = (LinearLayout)findViewById(R.id.ll_main_home);
        collectLl = (LinearLayout)findViewById(R.id.ll_main_collect);
        messageLl = (LinearLayout)findViewById(R.id.ll_main_message);
        userHomeLl = (LinearLayout)findViewById(R.id.ll_main_my);

        homeIv = (ImageView)findViewById(R.id.iv_main_button_home);
        collectIv = (ImageView)findViewById(R.id.iv_main_button_collect);
        messageIv = (ImageView)findViewById(R.id.iv_main_button_message);
        userHomeIv = (ImageView)findViewById(R.id.iv_main_button_my);

        homeLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelect(1);
            }
        });

        collectLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelect(2);
            }
        });

        messageLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelect(3);
            }
        });

        userHomeLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelect(4);
            }
        });
    }

    /**
     * 设置底部button的点击事件,tab添加点击事件
     */
    @OnClick({R.id.ll_main_home,R.id.ll_main_collect,R.id.ll_main_message,R.id.ll_main_my})
    private void switchFragment(View view) {
        switch (view.getId()) {
            case R.id.ll_main_home:
                setSelect(1);
                break;
            case R.id.ll_main_collect:
                setSelect(2);
                break;
            case R.id.ll_main_message:
                setSelect(3);
                break;
            case R.id.ll_main_my:
                setSelect(4);
                break;
        }
    }

    /**
     * 设置选中的状态
     */
    private HomeFragment homeFragment;
    private CollectFragment collectFragment;
    private MessageFragment messageFragment;
    private MyFragment myFragment;
    private int currentPosition = 1;
    private int oldPosition = 1;
    private void setSelect(int position) {
        //通过事务生成并调用fragment
        FragmentManager manager = this.getSupportFragmentManager();
        FragmentTransaction transation = manager.beginTransaction();
        switch (position) {
            case 1://显示主页
                if (homeFragment == null) {
                    homeFragment = new HomeFragment();
//                    if (userId.length() != 0) {
//                        Bundle bundle = new Bundle();
//                        bundle.putString("userId",userId);
//                        homeFragment.setArguments(bundle);
//                    }
                    transation.add(R.id.fl_main,homeFragment);
                }
                checkFragment(position,transation);
                transation.show(homeFragment);
                currentPosition = position;
                break;
            case 2://显示收藏页面
                if (collectFragment == null) {
                    collectFragment = new CollectFragment();
//                    if (userId.isEmpty()) {
//                        Bundle bundle = new Bundle();
//                        bundle.putString("userId",userId);
//                        collectFragment.setArguments(bundle);
//                    }
                    transation.add(R.id.fl_main,collectFragment);
                }
                checkFragment(position,transation);
                transation.show(collectFragment);
                currentPosition = position;
                break;
            case 3://显示消息界面
                if (messageFragment == null) {
                    messageFragment = new MessageFragment();
//                    if (userId.length() != 0) {
//                        Bundle bundle = new Bundle();
//                        bundle.putString("userId",userId);
//                        messageFragment.setArguments(bundle);
//                    }
                    transation.add(R.id.fl_main,messageFragment);
                }
                checkFragment(position,transation);
                transation.show(messageFragment);
                currentPosition = position;
                break;
            case 4:
                if (myFragment == null) {
                    myFragment = new MyFragment();
//                    if (userId != null&&userId.length() != 0) {
//                        Bundle bundle = new Bundle();
//                        bundle.putString("userId",userId);
//                        myFragment.setArguments(bundle);
//                    }
                    if (userId != "" && userId != null) {
                        myFragment.setUserId(userId);
                    }
                    transation.add(R.id.fl_main,myFragment);
                }
                checkFragment(position,transation);
                transation.show(myFragment);
                currentPosition = position;
                break;
        }
        transation.commit();
        updateButton(position,oldPosition);
        currentPosition = position;
        oldPosition = position;
    }

    /**
     * 检查当前的fragment
     * @param i
     * @param transation
     */
    private void checkFragment(int i, FragmentTransaction transation) {
        if (i != currentPosition) {
            switch (currentPosition) {
                case 1: //隐藏home
                    transation.hide(homeFragment);
                    break;
                case 2: //隐藏collect
                    transation.hide(collectFragment);
                    break;
                case 3: //隐藏message
                    transation.hide(messageFragment);
                    break;
                case 4: //隐藏my
                    transation.hide(myFragment);
                    break;

            }
        }

    }
    /**
     * 更新按钮状态
     */
    private void updateButton(int position, int oldPosition) {
        //还原button图标
        switch (oldPosition) {
            case 1:
                homeIv.setImageResource(R.drawable.home);
                break;
            case 2:
                collectIv.setImageResource(R.drawable.collect);
                break;
            case 3:
                messageIv.setImageResource(R.drawable.message);
                break;
            case 4:
                userHomeIv.setImageResource(R.drawable.user_home);
        }
        //设置新的button图标
        switch (position) {
            case 1:
                homeIv.setImageResource(R.drawable.home_selected);
                break;
            case 2:
                collectIv.setImageResource(R.drawable.collected);
                break;
            case 3:
                messageIv.setImageResource(R.drawable.message_selected);
                break;
            case 4:
                userHomeIv.setImageResource(R.drawable.user_home_selected);
                break;
        }
    }
    private void changeStatusBarTextColor(boolean isBlack) {
        int type = Helper.statusBarLightMode(this);
        Helper.statusBarLightMode(this,type);
    }
}
