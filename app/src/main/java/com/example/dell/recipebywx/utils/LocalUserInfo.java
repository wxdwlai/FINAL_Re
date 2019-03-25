package com.example.dell.recipebywx.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.dell.recipebywx.model.UserInforModel;
import com.example.dell.recipebywx.my.UserWeixinInforModel;

/**
 * Created by dell on 2019/1/22.
 * function：本地用户信息存储工具类
 *      （可作为用户登录状态的判定）
 */

public class LocalUserInfo {

    private UserWeixinInforModel UserInfo = new UserWeixinInforModel();
    SharedPreferences share = null;	//本地存储类
    public LocalUserInfo(Context context) {

        share = context.getSharedPreferences("UserWeixinInforModel", Context.MODE_PRIVATE);

    }
    public void clear() {
        SharedPreferences.Editor editor = share.edit();
        editor.clear();
        editor.commit();
    }
    //读取本地数据
    public UserWeixinInforModel getUserInfo(){
        UserWeixinInforModel userInfo = new UserWeixinInforModel();
        userInfo.setUid(share.getString("uid", "0"));
        userInfo.setName(share.getString("name", "0"));
        userInfo.setIconurl(share.getString("iconurl", ""));
        userInfo.setToken(share.getString("token","0"));
//        userInfo.setUserId(share.getString("userid",""));
        userInfo.setIntro(share.getString("intro",""));
        return userInfo;
    }
    //存储本地数据
    public void setUserInfo(UserWeixinInforModel UserInfo){
        SharedPreferences.Editor editor = share.edit();
        editor.putString("uid", String.valueOf(UserInfo.getData().getUid()));
        editor.putString("name", UserInfo.getData().getUserName());
        editor.putString("iconurl", UserInfo.getData().getImage());
        editor.putString("token",UserInfo.getToken());
//        editor.putString("userid",UserInfo.getData().getId());
        editor.putString("intro", (String) UserInfo.getData().getIntro());
        //commit是立即提交保存数据到本地
        editor.commit();
        //apply后台存储
//        editor.apply();
    }
}
