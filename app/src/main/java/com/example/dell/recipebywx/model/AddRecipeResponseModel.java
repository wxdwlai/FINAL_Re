package com.example.dell.recipebywx.model;

import java.util.List;

/**
 * Created by dell on 2019/3/27.
 */

public class AddRecipeResponseModel {

    /**
     * errorCode : 0
     * success : true
     * message : 上传成功
     * data : {"reid":4103836,"uid":4,"title":"啦啦","score":0,"ings":"","image":"420190327113056.jpg","visiteds":0,"collects":0,"likes":0,"tags":null,"intro":"","userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1MzY0NzM5OCwiaWF0IjoxNTUzNTYwOTk4fQ.F7Zy7jxFqJjGTlCHNqGY9F1MdOFfkXiJ7mTKxQljKjs","password":"003"},"stepsList":[],"viewLogs":[],"recipeTypes":[],"recipeTags":[],"userCollects":[],"comments":[]}
     */

    private int errorCode;
    private boolean success;
    private String message;
    private DataBean data;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * reid : 4103836
         * uid : 4
         * title : 啦啦
         * score : 0.0
         * ings :
         * image : 420190327113056.jpg
         * visiteds : 0
         * collects : 0
         * likes : 0
         * tags : null
         * intro :
         * userInfo : {"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1MzY0NzM5OCwiaWF0IjoxNTUzNTYwOTk4fQ.F7Zy7jxFqJjGTlCHNqGY9F1MdOFfkXiJ7mTKxQljKjs","password":"003"}
         * stepsList : []
         * viewLogs : []
         * recipeTypes : []
         * recipeTags : []
         * userCollects : []
         * comments : []
         */

        private int reid;
        private int uid;
        private String title;
        private double score;
        private String ings;
        private String image;
        private int visiteds;
        private int collects;
        private int likes;
        private Object tags;
        private String intro;
        private UserInfoBean userInfo;
        private List<?> stepsList;
        private List<?> viewLogs;
        private List<?> recipeTypes;
        private List<?> recipeTags;
        private List<?> userCollects;
        private List<?> comments;

        public int getReid() {
            return reid;
        }

        public void setReid(int reid) {
            this.reid = reid;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
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

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
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

        public Object getTags() {
            return tags;
        }

        public void setTags(Object tags) {
            this.tags = tags;
        }

        public String getIntro() {
            return intro;
        }

        public void setIntro(String intro) {
            this.intro = intro;
        }

        public UserInfoBean getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(UserInfoBean userInfo) {
            this.userInfo = userInfo;
        }

        public List<?> getStepsList() {
            return stepsList;
        }

        public void setStepsList(List<?> stepsList) {
            this.stepsList = stepsList;
        }

        public List<?> getViewLogs() {
            return viewLogs;
        }

        public void setViewLogs(List<?> viewLogs) {
            this.viewLogs = viewLogs;
        }

        public List<?> getRecipeTypes() {
            return recipeTypes;
        }

        public void setRecipeTypes(List<?> recipeTypes) {
            this.recipeTypes = recipeTypes;
        }

        public List<?> getRecipeTags() {
            return recipeTags;
        }

        public void setRecipeTags(List<?> recipeTags) {
            this.recipeTags = recipeTags;
        }

        public List<?> getUserCollects() {
            return userCollects;
        }

        public void setUserCollects(List<?> userCollects) {
            this.userCollects = userCollects;
        }

        public List<?> getComments() {
            return comments;
        }

        public void setComments(List<?> comments) {
            this.comments = comments;
        }

        public static class UserInfoBean {
            /**
             * uid : 4
             * userName : 3
             * age : 35
             * sex : 2
             * intro : 我就是我，颜色不一样的烟火
             * location : 上海
             * image : 003.jpg
             * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1MzY0NzM5OCwiaWF0IjoxNTUzNTYwOTk4fQ.F7Zy7jxFqJjGTlCHNqGY9F1MdOFfkXiJ7mTKxQljKjs
             * password : 003
             */

            private int uid;
            private String userName;
            private String age;
            private int sex;
            private String intro;
            private String location;
            private String image;
            private String token;
            private String password;

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public String getAge() {
                return age;
            }

            public void setAge(String age) {
                this.age = age;
            }

            public int getSex() {
                return sex;
            }

            public void setSex(int sex) {
                this.sex = sex;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getToken() {
                return token;
            }

            public void setToken(String token) {
                this.token = token;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }
        }
    }
}
