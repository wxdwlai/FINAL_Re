package com.example.dell.recipebywx.model;

/**
 * Created by dell on 2019/1/28.
 */

public class RecipeModel {


    /**
     * reid : 1
     * title : 牛奶面包
     * score : 8.0
     * ings : 高筋面粉	250克
     奶粉	8克
     酵母	2.5克
     盐	3克
     糖	30克
     牛奶	165克
     全蛋液	30克
     黄油	25克
     * image : null
     * visiteds : 5769
     * collects : 2398
     * likes : 4980
     * tags : 甜；糕点；蒸
     * types : 1
     * intro : 之前在浮小笙主页上看见这样一款包包
     瞬间被造型萌到了，一直保存着图片
     很多小伙伴嫌弃做面包时间长啊神马的，
     除了中种法可以前一天做好分开来调整时间之外，
     其实直接法也可以，这个面团用的5°冷藏初发酵，面团手感很好
     整形过程完全是脑洞来的，最终的造型还算OK，所以就酱紫吧~~
     */

    private int reid;
    private String title;
    private double score;
    private String ings;
    private Object image;
    private int visiteds;
    private int collects;
    private int likes;
    private String tags;
    private int types;
    private String intro;

    public int getReid() {
        return reid;
    }

    public void setReid(int reid) {
        this.reid = reid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getIngs() {
        return ings;
    }

    public void setIngs(String ings) {
        this.ings = ings;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public int getVisiteds() {
        return visiteds;
    }

    public void setVisiteds(int visiteds) {
        this.visiteds = visiteds;
    }

    public int getCollects() {
        return collects;
    }

    public void setCollects(int collects) {
        this.collects = collects;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getTypes() {
        return types;
    }

    public void setTypes(int types) {
        this.types = types;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
