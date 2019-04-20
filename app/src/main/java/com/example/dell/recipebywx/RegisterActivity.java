package com.example.dell.recipebywx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell.recipebywx.model.RegisterModel;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.Helper;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {

    private LinearLayout back;
    private EditText userNameEtv;
    private EditText passwordEdv;
    private EditText passwordTEtv;
    private TextView registerTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        this.changeStatusBarTextColor(true);
        initView();
    }

    private void initView() {
        back = (LinearLayout)findViewById(R.id.toolbar_left_btn);
        userNameEtv = (EditText)findViewById(R.id.user_id_etv);
        passwordEdv = (EditText)findViewById(R.id.user_password_etv);
        passwordTEtv = (EditText)findViewById(R.id.user_password_twice_etv);
        registerTv = (TextView)findViewById(R.id.register_tv);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        registerTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userNameEtv.getText().toString().length()==0) {
                    Toast.makeText(RegisterActivity.this,"用户名不能为空",Toast.LENGTH_SHORT).show();
                }
                else if (passwordEdv.getText().toString().length()==0||passwordTEtv.getText().toString().length()==0) {
                    Toast.makeText(RegisterActivity.this,"密码不能为空",Toast.LENGTH_SHORT).show();
                }
                else if (!passwordEdv.getText().toString().equals(passwordTEtv.getText().toString())) {
                    Toast.makeText(RegisterActivity.this,"两次密码不一致",Toast.LENGTH_SHORT).show();
                }
                else {
                    postRegister();
                }
            }
        });
    }

    private void postRegister() {
        Map<String,String> map = new HashMap<>();
        String name = userNameEtv.getText().toString();
        String password = passwordEdv.getText().toString();
        map.put("userName",name);
        map.put("password",password);
        XutilsHttp.getInstance().post(ServiceAPI.RegisterUrl, map, null, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    RegisterModel model = new Gson().fromJson(result,RegisterModel.class);
                    Toast.makeText(RegisterActivity.this,model.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }
    private void changeStatusBarTextColor(boolean isBlack) {
        int type = Helper.statusBarLightMode(this);
        Helper.statusBarLightMode(this,type);
    }
}
