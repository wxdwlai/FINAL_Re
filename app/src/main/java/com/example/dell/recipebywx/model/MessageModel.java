package com.example.dell.recipebywx.model;

import java.util.List;

/**
 * Created by dell on 2019/3/5.
 */

public class MessageModel {

    /**
     * errorCode : 0
     * message : 找到评论消息
     * success : true
     * data : [{"mid":8,"mmid":9,"puid":2,"reid":1,"ruid":1,"context":"3.3 19:42","createTime":1551613446000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"http://192.168.137.1:8080/image/002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"comment":{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":135,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"http://192.168.137.1:8080/image/001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDIwOTA1MiwiaWF0IjoxNTU0MTIyNjUyfQ.pcADmsjv7mq7Wt-PSqCKTuv7MT02-CA4PiJpbl2rt5w","password":"001"}},"delete":false},"show":true,"delete":false},{"mid":9,"mmid":10,"puid":2,"reid":1,"ruid":1,"context":"哈哈","createTime":1551613534000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"http://192.168.137.1:8080/image/002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"comment":{"mid":10,"reid":1,"puid":1,"createTime":1551531101000,"context":"3.2日测试评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":135,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"http://192.168.137.1:8080/image/001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDIwOTA1MiwiaWF0IjoxNTU0MTIyNjUyfQ.pcADmsjv7mq7Wt-PSqCKTuv7MT02-CA4PiJpbl2rt5w","password":"001"}},"delete":false},"show":true,"delete":false},{"mid":12,"mmid":1,"puid":4,"reid":1,"ruid":1,"context":"我是003","createTime":1551669384000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"http://192.168.137.1:8080/image/003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDA4NjM3MCwiaWF0IjoxNTUzOTk5OTcwfQ.g5H9-nN97dGPkUG2g4qsDEo45Eqql-kti9yzbgu7mN8","password":"003"},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":135,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"http://192.168.137.1:8080/image/001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDIwOTA1MiwiaWF0IjoxNTU0MTIyNjUyfQ.pcADmsjv7mq7Wt-PSqCKTuv7MT02-CA4PiJpbl2rt5w","password":"001"}},"delete":false},"show":true,"delete":false},{"mid":13,"mmid":3,"puid":4,"reid":1,"ruid":1,"context":"看着很棒喔","createTime":1551676449000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"http://192.168.137.1:8080/image/003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDA4NjM3MCwiaWF0IjoxNTUzOTk5OTcwfQ.g5H9-nN97dGPkUG2g4qsDEo45Eqql-kti9yzbgu7mN8","password":"003"},"comment":{"mid":3,"reid":1,"puid":1,"createTime":1551418344000,"context":"第三条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":135,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"http://192.168.137.1:8080/image/001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDIwOTA1MiwiaWF0IjoxNTU0MTIyNjUyfQ.pcADmsjv7mq7Wt-PSqCKTuv7MT02-CA4PiJpbl2rt5w","password":"001"}},"delete":false},"show":true,"delete":false},{"mid":14,"mmid":4,"puid":4,"reid":1,"ruid":1,"context":"看着很棒","createTime":1551676486000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"http://192.168.137.1:8080/image/003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDA4NjM3MCwiaWF0IjoxNTUzOTk5OTcwfQ.g5H9-nN97dGPkUG2g4qsDEo45Eqql-kti9yzbgu7mN8","password":"003"},"comment":{"mid":4,"reid":1,"puid":1,"createTime":1551366961000,"context":"第三条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":135,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"http://192.168.137.1:8080/image/001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDIwOTA1MiwiaWF0IjoxNTU0MTIyNjUyfQ.pcADmsjv7mq7Wt-PSqCKTuv7MT02-CA4PiJpbl2rt5w","password":"001"}},"delete":false},"show":true,"delete":false},{"mid":21,"mmid":3,"puid":4,"reid":1,"ruid":1,"context":"哈哈","createTime":1553853861000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"http://192.168.137.1:8080/image/003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDA4NjM3MCwiaWF0IjoxNTUzOTk5OTcwfQ.g5H9-nN97dGPkUG2g4qsDEo45Eqql-kti9yzbgu7mN8","password":"003"},"comment":{"mid":3,"reid":1,"puid":1,"createTime":1551418344000,"context":"第三条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":135,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"http://192.168.137.1:8080/image/001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDIwOTA1MiwiaWF0IjoxNTU0MTIyNjUyfQ.pcADmsjv7mq7Wt-PSqCKTuv7MT02-CA4PiJpbl2rt5w","password":"001"}},"delete":false},"show":true,"delete":false}]
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
         * mid : 8
         * mmid : 9
         * puid : 2
         * reid : 1
         * ruid : 1
         * context : 3.3 19:42
         * createTime : 1551613446000
         * type : 2
         * userInfo : {"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"http://192.168.137.1:8080/image/002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"}
         * comment : {"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":135,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"http://192.168.137.1:8080/image/001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDIwOTA1MiwiaWF0IjoxNTU0MTIyNjUyfQ.pcADmsjv7mq7Wt-PSqCKTuv7MT02-CA4PiJpbl2rt5w","password":"001"}},"delete":false}
         * show : true
         * delete : false
         */

        private int mid;
        private int mmid;
        private int puid;
        private int reid;
        private int ruid;
        private String context;
        private long createTime;
        private int type;
        private UserInfoBean userInfo;
        private CommentBean comment;
        private boolean show;
        private boolean delete;

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

        public UserInfoBean getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(UserInfoBean userInfo) {
            this.userInfo = userInfo;
        }

        public CommentBean getComment() {
            return comment;
        }

        public void setComment(CommentBean comment) {
            this.comment = comment;
        }

        public boolean isShow() {
            return show;
        }

        public void setShow(boolean show) {
            this.show = show;
        }

        public boolean isDelete() {
            return delete;
        }

        public void setDelete(boolean delete) {
            this.delete = delete;
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

        public static class CommentBean {
            /**
             * mid : 9
             * reid : 1
             * puid : 1
             * createTime : 1551429209000
             * context : 123
             * type : 1
             * recipe : {"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":135,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"http://192.168.137.1:8080/image/001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDIwOTA1MiwiaWF0IjoxNTU0MTIyNjUyfQ.pcADmsjv7mq7Wt-PSqCKTuv7MT02-CA4PiJpbl2rt5w","password":"001"}}
             * delete : false
             */

            private int mid;
            private int reid;
            private int puid;
            private long createTime;
            private String context;
            private int type;
            private RecipeBean recipe;
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

            public RecipeBean getRecipe() {
                return recipe;
            }

            public void setRecipe(RecipeBean recipe) {
                this.recipe = recipe;
            }

            public boolean isDelete() {
                return delete;
            }

            public void setDelete(boolean delete) {
                this.delete = delete;
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
                 * visiteds : 135
                 * collects : 1
                 * likes : 0
                 * tags : 热菜
                 鲁菜
                 老人
                 宵夜
                 朋友聚餐
                 冬季食谱

                 * intro :
                 * userInfo : {"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"http://192.168.137.1:8080/image/001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDIwOTA1MiwiaWF0IjoxNTU0MTIyNjUyfQ.pcADmsjv7mq7Wt-PSqCKTuv7MT02-CA4PiJpbl2rt5w","password":"001"}
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
                private UserInfoBeanX userInfo;

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

                public UserInfoBeanX getUserInfo() {
                    return userInfo;
                }

                public void setUserInfo(UserInfoBeanX userInfo) {
                    this.userInfo = userInfo;
                }

                public static class UserInfoBeanX {
                    /**
                     * uid : 1
                     * userName : apple
                     * age : 23
                     * sex : 2
                     * intro : 白天不懂夜的黑
                     * location : 成都
                     * image : http://192.168.137.1:8080/image/001.jpg
                     * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDIwOTA1MiwiaWF0IjoxNTU0MTIyNjUyfQ.pcADmsjv7mq7Wt-PSqCKTuv7MT02-CA4PiJpbl2rt5w
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
            }
        }
    }
}
