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
     * data : [{"mid":10,"mmid":13,"puid":2,"reid":3,"ruid":4,"context":"up","createTime":1551613613000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"http://192.168.137.1:8080/image/002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MTkyNzcxMCwiaWF0IjoxNTUxODQxMzEwfQ.F2Ts2rhKq5AMgVYxFhqStRBrXwMlwg0kHg5wr_LAro0","password":"002"},"comment":{"mid":13,"reid":3,"puid":4,"createTime":1551613601000,"context":"沙发","type":1,"delete":false},"delete":false}]
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
         * mid : 10
         * mmid : 13
         * puid : 2
         * reid : 3
         * ruid : 4
         * context : up
         * createTime : 1551613613000
         * type : 2
         * userInfo : {"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"http://192.168.137.1:8080/image/002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MTkyNzcxMCwiaWF0IjoxNTUxODQxMzEwfQ.F2Ts2rhKq5AMgVYxFhqStRBrXwMlwg0kHg5wr_LAro0","password":"002"}
         * comment : {"mid":13,"reid":3,"puid":4,"createTime":1551613601000,"context":"沙发","type":1,"delete":false}
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
             * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MTkyNzcxMCwiaWF0IjoxNTUxODQxMzEwfQ.F2Ts2rhKq5AMgVYxFhqStRBrXwMlwg0kHg5wr_LAro0
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
             * mid : 13
             * reid : 3
             * puid : 4
             * createTime : 1551613601000
             * context : 沙发
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


//    /**
//     * errorCode : 0
//     * message : 找到评论消息
//     * success : true
//     * data : [{"mid":10,"mmid":13,"puid":2,"reid":3,"ruid":4,"context":"up","createTime":1551613613000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MTcwNDc2OSwiaWF0IjoxNTUxNzAzODY5fQ.IQZU9zSaxQlmh2JGe1VR6QB1EpLosqboK2gsfwY51Lc","password":"002"},"delete":false}]
//     */
//
//    private int errorCode;
//    private String message;
//    private boolean success;
//    private List<DataBean> data;
//
//    public int getErrorCode() {
//        return errorCode;
//    }
//
//    public void setErrorCode(int errorCode) {
//        this.errorCode = errorCode;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public boolean isSuccess() {
//        return success;
//    }
//
//    public void setSuccess(boolean success) {
//        this.success = success;
//    }
//
//    public List<DataBean> getData() {
//        return data;
//    }
//
//    public void setData(List<DataBean> data) {
//        this.data = data;
//    }
//
//    public static class DataBean {
//        /**
//         * mid : 10
//         * mmid : 13
//         * puid : 2
//         * reid : 3
//         * ruid : 4
//         * context : up
//         * createTime : 1551613613000
//         * type : 2
//         * userInfo : {"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MTcwNDc2OSwiaWF0IjoxNTUxNzAzODY5fQ.IQZU9zSaxQlmh2JGe1VR6QB1EpLosqboK2gsfwY51Lc","password":"002"}
//         * delete : false
//         */
//
//        private int mid;
//        private int mmid;
//        private int puid;
//        private int reid;
//        private int ruid;
//        private String context;
//        private long createTime;
//        private int type;
//        private UserInfoBean userInfo;
//        private boolean delete;
//
//        public int getMid() {
//            return mid;
//        }
//
//        public void setMid(int mid) {
//            this.mid = mid;
//        }
//
//        public int getMmid() {
//            return mmid;
//        }
//
//        public void setMmid(int mmid) {
//            this.mmid = mmid;
//        }
//
//        public int getPuid() {
//            return puid;
//        }
//
//        public void setPuid(int puid) {
//            this.puid = puid;
//        }
//
//        public int getReid() {
//            return reid;
//        }
//
//        public void setReid(int reid) {
//            this.reid = reid;
//        }
//
//        public int getRuid() {
//            return ruid;
//        }
//
//        public void setRuid(int ruid) {
//            this.ruid = ruid;
//        }
//
//        public String getContext() {
//            return context;
//        }
//
//        public void setContext(String context) {
//            this.context = context;
//        }
//
//        public long getCreateTime() {
//            return createTime;
//        }
//
//        public void setCreateTime(long createTime) {
//            this.createTime = createTime;
//        }
//
//        public int getType() {
//            return type;
//        }
//
//        public void setType(int type) {
//            this.type = type;
//        }
//
//        public UserInfoBean getUserInfo() {
//            return userInfo;
//        }
//
//        public void setUserInfo(UserInfoBean userInfo) {
//            this.userInfo = userInfo;
//        }
//
//        public boolean isDelete() {
//            return delete;
//        }
//
//        public void setDelete(boolean delete) {
//            this.delete = delete;
//        }
//
//        public static class UserInfoBean {
//            /**
//             * uid : 2
//             * userName : wx
//             * age : 21
//             * sex : 1
//             * intro : 白夜
//             * location : 上海
//             * image : 002.jpg
//             * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MTcwNDc2OSwiaWF0IjoxNTUxNzAzODY5fQ.IQZU9zSaxQlmh2JGe1VR6QB1EpLosqboK2gsfwY51Lc
//             * password : 002
//             */
//
//            private int uid;
//            private String userName;
//            private String age;
//            private int sex;
//            private String intro;
//            private String location;
//            private String image;
//            private String token;
//            private String password;
//
//            public int getUid() {
//                return uid;
//            }
//
//            public void setUid(int uid) {
//                this.uid = uid;
//            }
//
//            public String getUserName() {
//                return userName;
//            }
//
//            public void setUserName(String userName) {
//                this.userName = userName;
//            }
//
//            public String getAge() {
//                return age;
//            }
//
//            public void setAge(String age) {
//                this.age = age;
//            }
//
//            public int getSex() {
//                return sex;
//            }
//
//            public void setSex(int sex) {
//                this.sex = sex;
//            }
//
//            public String getIntro() {
//                return intro;
//            }
//
//            public void setIntro(String intro) {
//                this.intro = intro;
//            }
//
//            public String getLocation() {
//                return location;
//            }
//
//            public void setLocation(String location) {
//                this.location = location;
//            }
//
//            public String getImage() {
//                return image;
//            }
//
//            public void setImage(String image) {
//                this.image = image;
//            }
//
//            public String getToken() {
//                return token;
//            }
//
//            public void setToken(String token) {
//                this.token = token;
//            }
//
//            public String getPassword() {
//                return password;
//            }
//
//            public void setPassword(String password) {
//                this.password = password;
//            }
//        }
//    }
}
