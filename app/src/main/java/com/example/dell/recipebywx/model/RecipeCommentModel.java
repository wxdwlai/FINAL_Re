package com.example.dell.recipebywx.model;

import java.util.List;

/**
 * Created by dell on 2019/3/31.
 */

public class RecipeCommentModel {


    /**
     * errorCode : 0
     * message : 找到菜谱评论信息
     * success : true
     * data : [{"mid":2,"reid":1,"puid":2,"createTime":1551363363000,"context":"第二条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"1.jpg","visiteds":110,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":""},"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"http://192.168.137.1:8080/image/002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"commentReplies":[{"mid":2,"mmid":2,"puid":1,"reid":1,"ruid":2,"context":"1号评论2号","createTime":1551403349000,"type":2,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDIwNjIzMywiaWF0IjoxNTU0MTE5ODMzfQ.kfc_7YymdOwPzuPJkt7xdtyzLwQ5T4J6lH4CIKTdSk8","password":"001"},"comment":{"mid":2,"reid":1,"puid":2,"createTime":1551363363000,"context":"第二条评论","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":12,"reid":1,"puid":4,"createTime":1551599094000,"context":"啦啦","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"1.jpg","visiteds":110,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":""},"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"http://192.168.137.1:8080/image/003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDA4NjM3MCwiaWF0IjoxNTUzOTk5OTcwfQ.g5H9-nN97dGPkUG2g4qsDEo45Eqql-kti9yzbgu7mN8","password":"003"},"commentReplies":[],"delete":false},{"mid":14,"reid":1,"puid":4,"createTime":1551676532000,"context":"很棒喔","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"1.jpg","visiteds":110,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":""},"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"http://192.168.137.1:8080/image/003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDA4NjM3MCwiaWF0IjoxNTUzOTk5OTcwfQ.g5H9-nN97dGPkUG2g4qsDEo45Eqql-kti9yzbgu7mN8","password":"003"},"commentReplies":[{"mid":18,"mmid":14,"puid":2,"reid":1,"ruid":4,"context":"哈哈","createTime":1553048124000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"http://192.168.137.1:8080/image/002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"comment":{"mid":14,"reid":1,"puid":4,"createTime":1551676532000,"context":"很棒喔","type":1,"delete":false},"delete":false,"show":true},{"mid":19,"mmid":14,"puid":2,"reid":1,"ruid":4,"context":"哈哈","createTime":1553048125000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"http://192.168.137.1:8080/image/002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"comment":{"mid":14,"reid":1,"puid":4,"createTime":1551676532000,"context":"很棒喔","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":16,"reid":1,"puid":4,"createTime":1551709996000,"context":"测试","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"1.jpg","visiteds":110,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":""},"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"http://192.168.137.1:8080/image/003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDA4NjM3MCwiaWF0IjoxNTUzOTk5OTcwfQ.g5H9-nN97dGPkUG2g4qsDEo45Eqql-kti9yzbgu7mN8","password":"003"},"commentReplies":[],"delete":false},{"mid":17,"reid":1,"puid":4,"createTime":1551711347000,"context":"测试","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"1.jpg","visiteds":110,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":""},"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"http://192.168.137.1:8080/image/003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDA4NjM3MCwiaWF0IjoxNTUzOTk5OTcwfQ.g5H9-nN97dGPkUG2g4qsDEo45Eqql-kti9yzbgu7mN8","password":"003"},"commentReplies":[],"delete":false},{"mid":15,"reid":2,"puid":2,"createTime":1551683239000,"context":"首评","type":1,"recipe":{"reid":2,"uid":1,"title":"牛奶绣球面包","score":9,"ings":"金像高筋面粉 190克\n中筋面粉 30克\n牛奶 110克\n蛋清 1个\n白糖 30克\n黄油 25克\n鲜酵母 8克\n盐 1/4茶匙\n鲜蛋黄 1个\n熟植物油 适量\n","image":"2.jpg","visiteds":79,"collects":0,"likes":0,"tags":"烘焙 \n儿童 \n面包 \n下午茶 \n快餐 \n","intro":""},"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"http://192.168.137.1:8080/image/002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"commentReplies":[{"mid":17,"mmid":15,"puid":4,"reid":2,"ruid":2,"context":"哈哈","createTime":1552881024000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"http://192.168.137.1:8080/image/003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDA4NjM3MCwiaWF0IjoxNTUzOTk5OTcwfQ.g5H9-nN97dGPkUG2g4qsDEo45Eqql-kti9yzbgu7mN8","password":"003"},"comment":{"mid":15,"reid":2,"puid":2,"createTime":1551683239000,"context":"首评","type":1,"delete":false},"delete":false,"show":false}],"delete":false},{"mid":18,"reid":2,"puid":4,"createTime":1553842203000,"context":"哈哈","type":1,"recipe":{"reid":2,"uid":1,"title":"牛奶绣球面包","score":9,"ings":"金像高筋面粉 190克\n中筋面粉 30克\n牛奶 110克\n蛋清 1个\n白糖 30克\n黄油 25克\n鲜酵母 8克\n盐 1/4茶匙\n鲜蛋黄 1个\n熟植物油 适量\n","image":"2.jpg","visiteds":79,"collects":0,"likes":0,"tags":"烘焙 \n儿童 \n面包 \n下午茶 \n快餐 \n","intro":""},"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"http://192.168.137.1:8080/image/003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDA4NjM3MCwiaWF0IjoxNTUzOTk5OTcwfQ.g5H9-nN97dGPkUG2g4qsDEo45Eqql-kti9yzbgu7mN8","password":"003"},"commentReplies":[],"delete":false}]
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
         * mid : 2
         * reid : 1
         * puid : 2
         * createTime : 1551363363000
         * context : 第二条评论
         * type : 1
         * recipe : {"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"1.jpg","visiteds":110,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":""}
         * userInfo : {"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"http://192.168.137.1:8080/image/002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"}
         * commentReplies : [{"mid":2,"mmid":2,"puid":1,"reid":1,"ruid":2,"context":"1号评论2号","createTime":1551403349000,"type":2,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDIwNjIzMywiaWF0IjoxNTU0MTE5ODMzfQ.kfc_7YymdOwPzuPJkt7xdtyzLwQ5T4J6lH4CIKTdSk8","password":"001"},"comment":{"mid":2,"reid":1,"puid":2,"createTime":1551363363000,"context":"第二条评论","type":1,"delete":false},"delete":false,"show":true}]
         * delete : false
         */

        private int mid;
        private int reid;
        private int puid;
        private long createTime;
        private String context;
        private int type;
        private RecipeBean recipe;
        private UserInfoBean userInfo;
        private boolean delete;
        private List<CommentRepliesBean> commentReplies;

        public int getMid() {
            return mid;
        }

        public void setMid(int mid) {
            this.mid = mid;
        }

        public int getReid() {
            return reid;
        }

        public void setReid(int reid) {
            this.reid = reid;
        }

        public int getPuid() {
            return puid;
        }

        public void setPuid(int puid) {
            this.puid = puid;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public String getContext() {
            return context;
        }

        public void setContext(String context) {
            this.context = context;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public RecipeBean getRecipe() {
            return recipe;
        }

        public void setRecipe(RecipeBean recipe) {
            this.recipe = recipe;
        }

        public UserInfoBean getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(UserInfoBean userInfo) {
            this.userInfo = userInfo;
        }

        public boolean isDelete() {
            return delete;
        }

        public void setDelete(boolean delete) {
            this.delete = delete;
        }

        public List<CommentRepliesBean> getCommentReplies() {
            return commentReplies;
        }

        public void setCommentReplies(List<CommentRepliesBean> commentReplies) {
            this.commentReplies = commentReplies;
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

             * image : 1.jpg
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

        public static class CommentRepliesBean {
            /**
             * mid : 2
             * mmid : 2
             * puid : 1
             * reid : 1
             * ruid : 2
             * context : 1号评论2号
             * createTime : 1551403349000
             * type : 2
             * userInfo : {"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDIwNjIzMywiaWF0IjoxNTU0MTE5ODMzfQ.kfc_7YymdOwPzuPJkt7xdtyzLwQ5T4J6lH4CIKTdSk8","password":"001"}
             * comment : {"mid":2,"reid":1,"puid":2,"createTime":1551363363000,"context":"第二条评论","type":1,"delete":false}
             * delete : false
             * show : true
             */

            private int mid;
            private int mmid;
            private int puid;
            private int reid;
            private int ruid;
            private String context;
            private long createTime;
            private int type;
            private UserInfoBeanX userInfo;
            private CommentBean comment;
            private boolean delete;
            private boolean show;

            public int getMid() {
                return mid;
            }

            public void setMid(int mid) {
                this.mid = mid;
            }

            public int getMmid() {
                return mmid;
            }

            public void setMmid(int mmid) {
                this.mmid = mmid;
            }

            public int getPuid() {
                return puid;
            }

            public void setPuid(int puid) {
                this.puid = puid;
            }

            public int getReid() {
                return reid;
            }

            public void setReid(int reid) {
                this.reid = reid;
            }

            public int getRuid() {
                return ruid;
            }

            public void setRuid(int ruid) {
                this.ruid = ruid;
            }

            public String getContext() {
                return context;
            }

            public void setContext(String context) {
                this.context = context;
            }

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public UserInfoBeanX getUserInfo() {
                return userInfo;
            }

            public void setUserInfo(UserInfoBeanX userInfo) {
                this.userInfo = userInfo;
            }

            public CommentBean getComment() {
                return comment;
            }

            public void setComment(CommentBean comment) {
                this.comment = comment;
            }

            public boolean isDelete() {
                return delete;
            }

            public void setDelete(boolean delete) {
                this.delete = delete;
            }

            public boolean isShow() {
                return show;
            }

            public void setShow(boolean show) {
                this.show = show;
            }

            public static class UserInfoBeanX {
                /**
                 * uid : 1
                 * userName : apple
                 * age : 23
                 * sex : 2
                 * intro : 白天不懂夜的黑
                 * location : 成都
                 * image : 001.jpg
                 * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDIwNjIzMywiaWF0IjoxNTU0MTE5ODMzfQ.kfc_7YymdOwPzuPJkt7xdtyzLwQ5T4J6lH4CIKTdSk8
                 * password : 001
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

            public static class CommentBean {
                /**
                 * mid : 2
                 * reid : 1
                 * puid : 2
                 * createTime : 1551363363000
                 * context : 第二条评论
                 * type : 1
                 * delete : false
                 */

                private int mid;
                private int reid;
                private int puid;
                private long createTime;
                private String context;
                private int type;
                private boolean delete;

                public int getMid() {
                    return mid;
                }

                public void setMid(int mid) {
                    this.mid = mid;
                }

                public int getReid() {
                    return reid;
                }

                public void setReid(int reid) {
                    this.reid = reid;
                }

                public int getPuid() {
                    return puid;
                }

                public void setPuid(int puid) {
                    this.puid = puid;
                }

                public long getCreateTime() {
                    return createTime;
                }

                public void setCreateTime(long createTime) {
                    this.createTime = createTime;
                }

                public String getContext() {
                    return context;
                }

                public void setContext(String context) {
                    this.context = context;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public boolean isDelete() {
                    return delete;
                }

                public void setDelete(boolean delete) {
                    this.delete = delete;
                }
            }
        }
    }
}
