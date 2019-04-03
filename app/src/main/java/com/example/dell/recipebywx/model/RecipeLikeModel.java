package com.example.dell.recipebywx.model;

import java.util.List;

/**
 * Created by dell on 2019/3/31.
 */

public class RecipeLikeModel {


    /**
     * errorCode : 0
     * message : 查询成功
     * success : true
     * data : [{"reid":1,"uid":2,"type":true,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"http://192.168.137.1:8080/image/002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":110,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":""},"time":1553048114000},{"reid":1,"uid":4,"type":true,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"http://192.168.137.1:8080/image/003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDA4NjM3MCwiaWF0IjoxNTUzOTk5OTcwfQ.g5H9-nN97dGPkUG2g4qsDEo45Eqql-kti9yzbgu7mN8","password":"003"},"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":110,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":""},"time":1554010969000},{"reid":2,"uid":2,"type":true,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"http://192.168.137.1:8080/image/002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"recipe":{"reid":2,"uid":1,"title":"牛奶绣球面包","score":9,"ings":"金像高筋面粉 190克\n中筋面粉 30克\n牛奶 110克\n蛋清 1个\n白糖 30克\n黄油 25克\n鲜酵母 8克\n盐 1/4茶匙\n鲜蛋黄 1个\n熟植物油 适量\n","image":"http://192.168.137.1:8080/image/2.jpg","visiteds":79,"collects":0,"likes":0,"tags":"烘焙 \n儿童 \n面包 \n下午茶 \n快餐 \n","intro":""},"time":1552896312000},{"reid":2,"uid":4,"type":true,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"http://192.168.137.1:8080/image/003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDA4NjM3MCwiaWF0IjoxNTUzOTk5OTcwfQ.g5H9-nN97dGPkUG2g4qsDEo45Eqql-kti9yzbgu7mN8","password":"003"},"recipe":{"reid":2,"uid":1,"title":"牛奶绣球面包","score":9,"ings":"金像高筋面粉 190克\n中筋面粉 30克\n牛奶 110克\n蛋清 1个\n白糖 30克\n黄油 25克\n鲜酵母 8克\n盐 1/4茶匙\n鲜蛋黄 1个\n熟植物油 适量\n","image":"http://192.168.137.1:8080/image/2.jpg","visiteds":79,"collects":0,"likes":0,"tags":"烘焙 \n儿童 \n面包 \n下午茶 \n快餐 \n","intro":""},"time":1552890697000}]
     */

    private int errorCode;
    private String message;
    private boolean success;
    private List<DataBean> data;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * reid : 1
         * uid : 2
         * type : true
         * userInfo : {"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"http://192.168.137.1:8080/image/002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"}
         * recipe : {"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":110,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":""}
         * time : 1553048114000
         */

        private int reid;
        private int uid;
        private boolean type;
        private UserInfoBean userInfo;
        private RecipeBean recipe;
        private long time;

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

        public boolean isType() {
            return type;
        }

        public void setType(boolean type) {
            this.type = type;
        }

        public UserInfoBean getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(UserInfoBean userInfo) {
            this.userInfo = userInfo;
        }

        public RecipeBean getRecipe() {
            return recipe;
        }

        public void setRecipe(RecipeBean recipe) {
            this.recipe = recipe;
        }

        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
        }

        public static class UserInfoBean {
            /**
             * uid : 2
             * userName : wx
             * age : 21
             * sex : 1
             * intro : 白夜
             * location : 上海
             * image : http://192.168.137.1:8080/image/002.jpg
             * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM
             * password : 002
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

        public static class RecipeBean {
            /**
             * reid : 1
             * uid : 1
             * title : 柠檬可乐鸡翅
             * score : 8.0
             * ings : 鸡中翅 10个
             可乐 半瓶
             柠檬 1个
             葱 适量
             姜 适量
             酱油 适量
             料酒 适量
             盐 适量
             牙签 适量
             植物油 适量

             * image : http://192.168.137.1:8080/image/1.jpg
             * visiteds : 110
             * collects : 1
             * likes : 0
             * tags : 热菜
             鲁菜
             老人
             宵夜
             朋友聚餐
             冬季食谱

             * intro :
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
            private String tags;
            private String intro;

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

            public String getTags() {
                return tags;
            }

            public void setTags(String tags) {
                this.tags = tags;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }
        }
    }
}
