package com.example.dell.recipebywx.model;

import android.widget.ImageView;

/**
 * Created by dell on 2018/12/30.
 */

public class CookingModel {
    private String cookingName;
    private String cookingMateria;
    private String userName;
    private String cookingScore;
    private String cookingNum;

    public String getCookingName() {
        return cookingName;
    }

    public void setCookingName(String cookingName) {
        this.cookingName = cookingName;
    }

    public String getCookingMateria() {
        return cookingMateria;
    }

    public void setCookingMateria(String cookingMateria) {
        this.cookingMateria = cookingMateria;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCookingScore() {
        return cookingScore;
    }

    public void setCookingScore(String cookingScore) {
        this.cookingScore = cookingScore;
    }

    public String getCookingNum() {
        return cookingNum;
    }

    public void setCookingNum(String cookingNum) {
        this.cookingNum = cookingNum;
    }
}
