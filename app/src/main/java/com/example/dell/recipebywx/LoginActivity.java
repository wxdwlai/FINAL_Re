package com.example.dell.recipebywx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell.recipebywx.model.UserInforModel;
import com.example.dell.recipebywx.my.UserWeixinInforModel;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.Helper;
import com.example.dell.recipebywx.utils.Local;
import com.example.dell.recipebywx.utils.LocalUserInfo;
import com.google.gson.Gson;
//import com.mob.MobSDK;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {

    private LinearLayout back;
    private EditText userIdEtv;
    private EditText userPasswordEtv;
    private TextView loginTv;
    private TextView registerTv;
    private int currentFragmentId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.changeStatusBarTextColor(true);
        initView();
        currentFragmentId = getIntent().getIntExtra("fragmentId",4);

    }

    private void initView() {
        back = (LinearLayout)findViewById(R.id.toolbar_left_btn);
        userIdEtv = (EditText)findViewById(R.id.user_id_etv);
        userPasswordEtv = (EditText)findViewById(R.id.user_password_etv);
        loginTv = (TextView)findViewById(R.id.login_tv);
        registerTv = (TextView)findViewById(R.id.register_tv);
        loginTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getLogin();
//                Toast.makeText(LoginActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
            }
        });

        registerTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });

        //客户端对用户的用户名和密码输入进行判空处理，当用户名和密码都不为空的时候才能请求服务器的登录接口
        if (userIdEtv.getText().length() == 0) {
            Toast.makeText(LoginActivity.this,"用户名不能为空",Toast.LENGTH_SHORT);
        }
        else if (userPasswordEtv.getText().length() == 0) {
            Toast.makeText(LoginActivity.this,"密码不能为空",Toast.LENGTH_SHORT);
        }
        else {
            loginTv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    getLogin();
                    Toast.makeText(LoginActivity.this,"点击了登录",Toast.LENGTH_SHORT).show();
                }
            });
        }
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
//        loginTv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getLogin();
//            }
//        });
    }

    /**
     * function:用户登录
     */
    private void getLogin() {
        Map<String, String> map = new HashMap<>();
        final String id = userIdEtv.getText().toString();
        String password = userPasswordEtv.getText().toString();
        map.put("name",id);
        map.put("password",password);
//        map.put("x-auth-token","0");
        XutilsHttp.getInstance().get(ServiceAPI.LoginUrl, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                Gson gson = new Gson();
                UserWeixinInforModel userInforModel = gson.fromJson(result,UserWeixinInforModel.class);
                if (userInforModel.isSuccess()) {
                    LocalUserInfo localUserInfo = new LocalUserInfo(getApplicationContext());
                    localUserInfo.setUserInfo(userInforModel);
//                    MobSDK.setUser(localUserInfo.getUserInfo().getUid(), localUserInfo.getUserInfo().getName(),localUserInfo.getUserInfo().getIconurl(), null);
                    Toast.makeText(LoginActivity.this,userInforModel.getMessage(),Toast.LENGTH_SHORT).show();
                    finish();
                }
                else {
                    Toast.makeText(LoginActivity.this,"登录失败",Toast.LENGTH_SHORT).show();
                }
//                if (result.equals("200")) {
////                    MyFragment myFragment = new MyFragment();
////                    Bundle bundle = new Bundle();
////                    bundle.putString("userId",id);
////                    myFragment.setArguments(bundle);
//                    Local.userId = id;
//                    finish();
////                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
////                    intent.putExtra("userId",id);
////                    intent.putExtra("fragmentId",currentFragmentId);
////                    startActivity(intent);
//                } else {
//                    Toast.makeText(getApplicationContext(),"账号或密码错误", Toast.LENGTH_LONG).show();
//                }
            }

            @Override
            public void onError(String result) {
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
            }
        });
    }
    private void changeStatusBarTextColor(boolean isBlack) {
        int type = Helper.statusBarLightMode(this);
        Helper.statusBarLightMode(this,type);
    }
}
