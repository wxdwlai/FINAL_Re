package com.example.dell.recipebywx.service;

/**
 * Created by dell on 2019/1/5.
 */

public class ServiceAPI {
    public static String DOMAIN = "http://192.168.137.1:8080/";
    public static String LoginUrl = DOMAIN + "login";//用户登录接口

    public static String RegisterUrl = DOMAIN + "register";//用户注册接口

    public static String ListUrl = DOMAIN + "listRecipe";//展示菜谱接口
    public static String GetUser = DOMAIN + "getUserDetail";//获取用户信息
    public static String UpdateUserInfor = DOMAIN + "update/UserInfor";//修改用户资料
    public static String getSearchHistory = DOMAIN + "keywords";//返回搜索记录
//    public static String getSearchHistory1 = DOMAIN + "all";//返回用户搜索结果
    public static String getKeywords = DOMAIN + "keywords";//返回用户搜索关键词

    public static String searchUrl = DOMAIN + "searchRecipe";//搜索菜谱

    public static String RecipeDetail = DOMAIN + "getRecipe";//菜谱详情页

    public static String CollectRecipe = DOMAIN + "postCollect";//收藏菜谱

    public static String UserCollects = DOMAIN + "getCollects";//用户收藏页面显示

    public static String SearchUserCollects = DOMAIN + "searchCollect";//搜索用户收藏

    public static String RecommendRecipe = DOMAIN + "recommend";//首页菜谱推荐

    public static String addComment = DOMAIN + "addComment";//添加评论

    public static String getMessage = DOMAIN +"getMessage";//用户获取消息

    public static String getRecipeComment = DOMAIN + "getRecipeComment";//获取菜谱评论信息

    public static String getLikeMessage = DOMAIN + "getLikeMessage";//菜谱点在消息

    public static String getViews = DOMAIN + "getViews";//用户获取菜谱浏览记录

    public static String delMessage = DOMAIN + "deleteMessage";//用户删除消息

    public static String likeRecipe = DOMAIN + "likeRecipe";//点赞菜谱

    public static String getByType = DOMAIN + "getByType";//分类获取菜谱

    public static String getTaste = DOMAIN + "getTaste";//获取所有口味类型

    public static String getUserTaste = DOMAIN + "userTaste";//获取用户口味偏好

    public static String putTaste = DOMAIN + "updateTaste";//保存用户的口味标签

    public static String deleteTaste = DOMAIN + "deleteTaste";//删除口味标签

    public static String deleteSearch = DOMAIN + "deleteSearch";//删除用户搜索记录关键词

    public static String putRecipe = DOMAIN + "putRecipe";//保存菜谱基本信息

    public static String getAllType = DOMAIN + "recipeType";//查找所有菜谱类别

    public static String putSteps = DOMAIN + "putSteps";//保存菜谱步骤

    public static String recipeType = DOMAIN + "recipeType";//获取所有菜谱类型

    public static String putTypes = DOMAIN + "putTypes";//保存菜谱类别
}
