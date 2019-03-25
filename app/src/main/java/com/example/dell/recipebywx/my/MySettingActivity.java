package com.example.dell.recipebywx.my;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.utils.Helper;
import com.example.dell.recipebywx.utils.LocalUserInfo;

public class MySettingActivity extends AppCompatActivity {

    private LinearLayout back;
    private LocalUserInfo localUserInfo;
    private LinearLayout checkLl;
    private LinearLayout clearLl;
    private LinearLayout helpLl;
    private LinearLayout logoutLl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_setting);
        localUserInfo = new LocalUserInfo(getApplicationContext());
        this.changeStatusBarTextColor(true);
        initView();
    }

    void initView() {
        back = (LinearLayout)findViewById(R.id.toolbar_left_btn);
        checkLl = (LinearLayout)findViewById(R.id.check_ll);
        clearLl = (LinearLayout)findViewById(R.id.clear_cash_ll);
        helpLl = (LinearLayout)findViewById(R.id.help_ll);
        logoutLl = (LinearLayout)findViewById(R.id.logout_ll);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        if (!"0".equals(localUserInfo.getUserInfo().getToken())) {
            logoutLl.setVisibility(View.VISIBLE);
            logoutLl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //退出登录
                    postLogout();
                }
            });
        }
        else {
            logoutLl.setVisibility(View.GONE);
        }
    }

    void postLogout() {
        localUserInfo.clear();
        logoutLl.setVisibility(View.GONE);
    }

    private void changeStatusBarTextColor(boolean isBlack) {
        int type = Helper.statusBarLightMode(this);
        Helper.statusBarLightMode(this,type);
    }
}
