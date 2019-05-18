package com.example.dell.recipebywx.model;

import java.util.List;

/**
 * Created by dell on 2019/5/17.
 */

public class PrivateMessageModel {

    /**
     * errorCode : 0
     * message : c查找成功
     * success : true
     * data : [{"uid":1,"uuid":2,"count":1,"flag":2,"message":"第一条消息","date":1558058342000,"receiverInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"http://192.168.137.1:8080/image/002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1Nzk3MjQ0NiwiaWF0IjoxNTU3ODg2MDQ2fQ.O0e9AkbCvoDoGQsBU6ydRbA_YqDlNb8CUuSPGOHWXuY","password":"002","sendMessages":[]},"senderInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"http://192.168.137.1:8080/image/001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NTIyNDEyNSwiaWF0IjoxNTU1MTM3NzI1fQ.9eDu5Pl9Hn4bAL6kZ23pHv_0UmFhvGiGv92aEK2ZoS0","password":"001","receiveMessages":[]},"delete":false}]
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
         * uid : 1
         * uuid : 2
         * count : 1
         * flag : 2
         * message : 第一条消息
         * date : 1558058342000
         * receiverInfo : {"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"http://192.168.137.1:8080/image/002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1Nzk3MjQ0NiwiaWF0IjoxNTU3ODg2MDQ2fQ.O0e9AkbCvoDoGQsBU6ydRbA_YqDlNb8CUuSPGOHWXuY","password":"002","sendMessages":[]}
         * senderInfo : {"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"http://192.168.137.1:8080/image/001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NTIyNDEyNSwiaWF0IjoxNTU1MTM3NzI1fQ.9eDu5Pl9Hn4bAL6kZ23pHv_0UmFhvGiGv92aEK2ZoS0","password":"001","receiveMessages":[]}
         * delete : false
         */

        private int uid;
        private int uuid;
        private int count;
        private int flag;
        private String message;
        private long date;
        private ReceiverInfoBean receiverInfo;
        private SenderInfoBean senderInfo;
        private boolean delete;

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public int getUuid() {
            return uuid;
        }

        public void setUuid(int uuid) {
            this.uuid = uuid;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getFlag() {
            return flag;
        }

        public void setFlag(int flag) {
            this.flag = flag;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public long getDate() {
            return date;
        }

        public void setDate(long date) {
            this.date = date;
        }

        public ReceiverInfoBean getReceiverInfo() {
            return receiverInfo;
        }

        public void setReceiverInfo(ReceiverInfoBean receiverInfo) {
            this.receiverInfo = receiverInfo;
        }

        public SenderInfoBean getSenderInfo() {
            return senderInfo;
        }

        public void setSenderInfo(SenderInfoBean senderInfo) {
            this.senderInfo = senderInfo;
        }

        public boolean isDelete() {
            return delete;
        }

        public void setDelete(boolean delete) {
            this.delete = delete;
        }

        public static class ReceiverInfoBean {
            /**
             * uid : 2
             * userName : wx
             * age : 21
             * sex : 1
             * intro : 白夜
             * location : 上海
             * image : http://192.168.137.1:8080/image/002.jpg
             * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1Nzk3MjQ0NiwiaWF0IjoxNTU3ODg2MDQ2fQ.O0e9AkbCvoDoGQsBU6ydRbA_YqDlNb8CUuSPGOHWXuY
             * password : 002
             * sendMessages : []
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
            private List<?> sendMessages;

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

            public List<?> getSendMessages() {
                return sendMessages;
            }

            public void setSendMessages(List<?> sendMessages) {
                this.sendMessages = sendMessages;
            }
        }

        public static class SenderInfoBean {
            /**
             * uid : 1
             * userName : apple
             * age : 23
             * sex : 2
             * intro : 白天不懂夜的黑
             * location : 成都
             * image : http://192.168.137.1:8080/image/001.jpg
             * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NTIyNDEyNSwiaWF0IjoxNTU1MTM3NzI1fQ.9eDu5Pl9Hn4bAL6kZ23pHv_0UmFhvGiGv92aEK2ZoS0
             * password : 001
             * receiveMessages : []
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
            private List<?> receiveMessages;

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

            public List<?> getReceiveMessages() {
                return receiveMessages;
            }

            public void setReceiveMessages(List<?> receiveMessages) {
                this.receiveMessages = receiveMessages;
            }
        }
    }
}
