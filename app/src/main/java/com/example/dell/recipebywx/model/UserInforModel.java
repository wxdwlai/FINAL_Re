package com.example.dell.recipebywx.model;

import java.util.List;

/**
 * Created by dell on 2019/2/16.
 */

public class UserInforModel {
    /**
     * errorCode : 0
     * success : true
     * message : 查询成功
     * data : {"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"http://192.168.137.1:8080/image/001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzEzNTYwNywiaWF0IjoxNTUzMDQ5MjA3fQ.iZr2UdJ8CTxVJknaMsfJ0PxbnrLmr3hYsHCi5z_VsSE","password":"001","viewLogs":[{"vid":1,"uid":1,"reid":1,"viewTime":1551687847000,"preferDegree":3,"visitTime":0.12,"visitedTimes":12,"comment":"哈哈，很棒"},{"vid":2,"uid":1,"reid":1,"viewTime":1550458220000,"preferDegree":2,"visitTime":0.12,"visitedTimes":1,"comment":null},{"vid":7,"uid":1,"reid":1,"viewTime":1552263253000,"preferDegree":1,"visitTime":0,"visitedTimes":49,"comment":null},{"vid":8,"uid":1,"reid":2,"viewTime":1551838849000,"preferDegree":1,"visitTime":0,"visitedTimes":19,"comment":null},{"vid":9,"uid":1,"reid":3,"viewTime":1551857411000,"preferDegree":1,"visitTime":0,"visitedTimes":21,"comment":null}],"userCollects":[{"reid":1,"uid":1,"type":false,"time":1551783266000},{"reid":2,"uid":1,"type":false,"time":1551747301000},{"reid":3,"uid":1,"type":false,"time":1551783268000},{"reid":19,"uid":1,"type":false,"time":1553049254000},{"reid":20,"uid":1,"type":false,"time":1553049256000}],"comments":[{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"commentReplies":[{"mid":1,"mmid":1,"puid":2,"reid":1,"ruid":1,"context":"回复第一条评论，这是一条超长评论，啦啦啦啦啦啦啦啦","createTime":1551363434000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzEzNTQ0NSwiaWF0IjoxNTUzMDQ5MDQ1fQ.TCFCEmxl974ZSHJFCOjs3K9x9VYxM4U1U8bAcR0OJfY","password":"002","userTastes":[]},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"delete":false},"delete":false,"show":false},{"mid":7,"mmid":1,"puid":2,"reid":1,"ruid":1,"context":"test","createTime":1551405225000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzEzNTQ0NSwiaWF0IjoxNTUzMDQ5MDQ1fQ.TCFCEmxl974ZSHJFCOjs3K9x9VYxM4U1U8bAcR0OJfY","password":"002","userTastes":[]},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"delete":false},"delete":false,"show":true},{"mid":12,"mmid":1,"puid":4,"reid":1,"ruid":1,"context":"我是003","createTime":1551669384000,"type":2,"userInfo":{"uid":4,"userName":"003","age":"35","sex":2,"intro":"我就是我，","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1MzEzMzgyMCwiaWF0IjoxNTUzMDQ3NDIwfQ.xPA3Z-fzr0Msg2C5job-SIS5suRHRMAHxGe6TERSwMw","password":"003","userTastes":[]},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":3,"reid":1,"puid":1,"createTime":1551418344000,"context":"第三条评论","type":1,"commentReplies":[{"mid":13,"mmid":3,"puid":4,"reid":1,"ruid":1,"context":"看着很棒喔","createTime":1551676449000,"type":2,"userInfo":{"uid":4,"userName":"003","age":"35","sex":2,"intro":"我就是我，","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1MzEzMzgyMCwiaWF0IjoxNTUzMDQ3NDIwfQ.xPA3Z-fzr0Msg2C5job-SIS5suRHRMAHxGe6TERSwMw","password":"003","userTastes":[]},"comment":{"mid":3,"reid":1,"puid":1,"createTime":1551418344000,"context":"第三条评论","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":4,"reid":1,"puid":1,"createTime":1551366961000,"context":"第三条评论","type":1,"commentReplies":[{"mid":14,"mmid":4,"puid":4,"reid":1,"ruid":1,"context":"看着很棒","createTime":1551676486000,"type":2,"userInfo":{"uid":4,"userName":"003","age":"35","sex":2,"intro":"我就是我，","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1MzEzMzgyMCwiaWF0IjoxNTUzMDQ3NDIwfQ.xPA3Z-fzr0Msg2C5job-SIS5suRHRMAHxGe6TERSwMw","password":"003","userTastes":[]},"comment":{"mid":4,"reid":1,"puid":1,"createTime":1551366961000,"context":"第三条评论","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":5,"reid":1,"puid":1,"createTime":1551403136000,"context":"No.4：今天是2019年3月1日","type":1,"commentReplies":[],"delete":false},{"mid":6,"reid":1,"puid":1,"createTime":1551428819000,"context":"啦啦啦","type":1,"commentReplies":[],"delete":false},{"mid":7,"reid":1,"puid":1,"createTime":1551429078000,"context":"哈哈","type":1,"commentReplies":[],"delete":false},{"mid":8,"reid":1,"puid":1,"createTime":1551429079000,"context":"哈哈","type":1,"commentReplies":[],"delete":false},{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"commentReplies":[{"mid":8,"mmid":9,"puid":2,"reid":1,"ruid":1,"context":"3.3 19:42","createTime":1551613446000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzEzNTQ0NSwiaWF0IjoxNTUzMDQ5MDQ1fQ.TCFCEmxl974ZSHJFCOjs3K9x9VYxM4U1U8bAcR0OJfY","password":"002","userTastes":[]},"comment":{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"delete":false},"delete":false,"show":true},{"mid":15,"mmid":9,"puid":4,"reid":1,"ruid":1,"context":"很棒棒哦","createTime":1551676543000,"type":2,"userInfo":{"uid":4,"userName":"003","age":"35","sex":2,"intro":"我就是我，","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1MzEzMzgyMCwiaWF0IjoxNTUzMDQ3NDIwfQ.xPA3Z-fzr0Msg2C5job-SIS5suRHRMAHxGe6TERSwMw","password":"003","userTastes":[]},"comment":{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"delete":false},"delete":false,"show":false}],"delete":false},{"mid":10,"reid":1,"puid":1,"createTime":1551531101000,"context":"3.2日测试评论","type":1,"commentReplies":[{"mid":9,"mmid":10,"puid":2,"reid":1,"ruid":1,"context":"哈哈","createTime":1551613534000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzEzNTQ0NSwiaWF0IjoxNTUzMDQ5MDQ1fQ.TCFCEmxl974ZSHJFCOjs3K9x9VYxM4U1U8bAcR0OJfY","password":"002","userTastes":[]},"comment":{"mid":10,"reid":1,"puid":1,"createTime":1551531101000,"context":"3.2日测试评论","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":11,"reid":1,"puid":1,"createTime":1551576718000,"context":"3.3","type":1,"commentReplies":[{"mid":16,"mmid":11,"puid":1,"reid":1,"ruid":1,"context":"啦啦啦","createTime":1551778209000,"type":2,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"http://192.168.137.1:8080/image/001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzEzNTYwNywiaWF0IjoxNTUzMDQ5MjA3fQ.iZr2UdJ8CTxVJknaMsfJ0PxbnrLmr3hYsHCi5z_VsSE","password":"001","userTastes":[{"uid":1,"tagId":1,"tags":{"tagId":1,"tagName":"咸"}}]},"comment":{"mid":11,"reid":1,"puid":1,"createTime":1551576718000,"context":"3.3","type":1,"delete":false},"delete":false,"show":true}],"delete":false}],"commentReplies":[{"mid":2,"mmid":2,"puid":1,"reid":1,"ruid":2,"context":"1号评论2号","createTime":1551403349000,"type":2,"comment":{"mid":2,"reid":1,"puid":2,"createTime":1551363363000,"context":"第二条评论","type":1,"delete":false},"delete":false,"show":true},{"mid":16,"mmid":11,"puid":1,"reid":1,"ruid":1,"context":"啦啦啦","createTime":1551778209000,"type":2,"comment":{"mid":11,"reid":1,"puid":1,"createTime":1551576718000,"context":"3.3","type":1,"delete":false},"delete":false,"show":true}],"userTastes":[{"uid":1,"tagId":1,"tags":{"tagId":1,"tagName":"咸"}}]}
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
         * uid : 1
         * userName : apple
         * age : 23
         * sex : 2
         * intro : 白天不懂夜的黑
         * location : 成都
         * image : http://192.168.137.1:8080/image/001.jpg
         * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzEzNTYwNywiaWF0IjoxNTUzMDQ5MjA3fQ.iZr2UdJ8CTxVJknaMsfJ0PxbnrLmr3hYsHCi5z_VsSE
         * password : 001
         * viewLogs : [{"vid":1,"uid":1,"reid":1,"viewTime":1551687847000,"preferDegree":3,"visitTime":0.12,"visitedTimes":12,"comment":"哈哈，很棒"},{"vid":2,"uid":1,"reid":1,"viewTime":1550458220000,"preferDegree":2,"visitTime":0.12,"visitedTimes":1,"comment":null},{"vid":7,"uid":1,"reid":1,"viewTime":1552263253000,"preferDegree":1,"visitTime":0,"visitedTimes":49,"comment":null},{"vid":8,"uid":1,"reid":2,"viewTime":1551838849000,"preferDegree":1,"visitTime":0,"visitedTimes":19,"comment":null},{"vid":9,"uid":1,"reid":3,"viewTime":1551857411000,"preferDegree":1,"visitTime":0,"visitedTimes":21,"comment":null}]
         * userCollects : [{"reid":1,"uid":1,"type":false,"time":1551783266000},{"reid":2,"uid":1,"type":false,"time":1551747301000},{"reid":3,"uid":1,"type":false,"time":1551783268000},{"reid":19,"uid":1,"type":false,"time":1553049254000},{"reid":20,"uid":1,"type":false,"time":1553049256000}]
         * comments : [{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"commentReplies":[{"mid":1,"mmid":1,"puid":2,"reid":1,"ruid":1,"context":"回复第一条评论，这是一条超长评论，啦啦啦啦啦啦啦啦","createTime":1551363434000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzEzNTQ0NSwiaWF0IjoxNTUzMDQ5MDQ1fQ.TCFCEmxl974ZSHJFCOjs3K9x9VYxM4U1U8bAcR0OJfY","password":"002","userTastes":[]},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"delete":false},"delete":false,"show":false},{"mid":7,"mmid":1,"puid":2,"reid":1,"ruid":1,"context":"test","createTime":1551405225000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzEzNTQ0NSwiaWF0IjoxNTUzMDQ5MDQ1fQ.TCFCEmxl974ZSHJFCOjs3K9x9VYxM4U1U8bAcR0OJfY","password":"002","userTastes":[]},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"delete":false},"delete":false,"show":true},{"mid":12,"mmid":1,"puid":4,"reid":1,"ruid":1,"context":"我是003","createTime":1551669384000,"type":2,"userInfo":{"uid":4,"userName":"003","age":"35","sex":2,"intro":"我就是我，","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1MzEzMzgyMCwiaWF0IjoxNTUzMDQ3NDIwfQ.xPA3Z-fzr0Msg2C5job-SIS5suRHRMAHxGe6TERSwMw","password":"003","userTastes":[]},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":3,"reid":1,"puid":1,"createTime":1551418344000,"context":"第三条评论","type":1,"commentReplies":[{"mid":13,"mmid":3,"puid":4,"reid":1,"ruid":1,"context":"看着很棒喔","createTime":1551676449000,"type":2,"userInfo":{"uid":4,"userName":"003","age":"35","sex":2,"intro":"我就是我，","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1MzEzMzgyMCwiaWF0IjoxNTUzMDQ3NDIwfQ.xPA3Z-fzr0Msg2C5job-SIS5suRHRMAHxGe6TERSwMw","password":"003","userTastes":[]},"comment":{"mid":3,"reid":1,"puid":1,"createTime":1551418344000,"context":"第三条评论","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":4,"reid":1,"puid":1,"createTime":1551366961000,"context":"第三条评论","type":1,"commentReplies":[{"mid":14,"mmid":4,"puid":4,"reid":1,"ruid":1,"context":"看着很棒","createTime":1551676486000,"type":2,"userInfo":{"uid":4,"userName":"003","age":"35","sex":2,"intro":"我就是我，","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1MzEzMzgyMCwiaWF0IjoxNTUzMDQ3NDIwfQ.xPA3Z-fzr0Msg2C5job-SIS5suRHRMAHxGe6TERSwMw","password":"003","userTastes":[]},"comment":{"mid":4,"reid":1,"puid":1,"createTime":1551366961000,"context":"第三条评论","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":5,"reid":1,"puid":1,"createTime":1551403136000,"context":"No.4：今天是2019年3月1日","type":1,"commentReplies":[],"delete":false},{"mid":6,"reid":1,"puid":1,"createTime":1551428819000,"context":"啦啦啦","type":1,"commentReplies":[],"delete":false},{"mid":7,"reid":1,"puid":1,"createTime":1551429078000,"context":"哈哈","type":1,"commentReplies":[],"delete":false},{"mid":8,"reid":1,"puid":1,"createTime":1551429079000,"context":"哈哈","type":1,"commentReplies":[],"delete":false},{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"commentReplies":[{"mid":8,"mmid":9,"puid":2,"reid":1,"ruid":1,"context":"3.3 19:42","createTime":1551613446000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzEzNTQ0NSwiaWF0IjoxNTUzMDQ5MDQ1fQ.TCFCEmxl974ZSHJFCOjs3K9x9VYxM4U1U8bAcR0OJfY","password":"002","userTastes":[]},"comment":{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"delete":false},"delete":false,"show":true},{"mid":15,"mmid":9,"puid":4,"reid":1,"ruid":1,"context":"很棒棒哦","createTime":1551676543000,"type":2,"userInfo":{"uid":4,"userName":"003","age":"35","sex":2,"intro":"我就是我，","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1MzEzMzgyMCwiaWF0IjoxNTUzMDQ3NDIwfQ.xPA3Z-fzr0Msg2C5job-SIS5suRHRMAHxGe6TERSwMw","password":"003","userTastes":[]},"comment":{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"delete":false},"delete":false,"show":false}],"delete":false},{"mid":10,"reid":1,"puid":1,"createTime":1551531101000,"context":"3.2日测试评论","type":1,"commentReplies":[{"mid":9,"mmid":10,"puid":2,"reid":1,"ruid":1,"context":"哈哈","createTime":1551613534000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzEzNTQ0NSwiaWF0IjoxNTUzMDQ5MDQ1fQ.TCFCEmxl974ZSHJFCOjs3K9x9VYxM4U1U8bAcR0OJfY","password":"002","userTastes":[]},"comment":{"mid":10,"reid":1,"puid":1,"createTime":1551531101000,"context":"3.2日测试评论","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":11,"reid":1,"puid":1,"createTime":1551576718000,"context":"3.3","type":1,"commentReplies":[{"mid":16,"mmid":11,"puid":1,"reid":1,"ruid":1,"context":"啦啦啦","createTime":1551778209000,"type":2,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"http://192.168.137.1:8080/image/001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzEzNTYwNywiaWF0IjoxNTUzMDQ5MjA3fQ.iZr2UdJ8CTxVJknaMsfJ0PxbnrLmr3hYsHCi5z_VsSE","password":"001","userTastes":[{"uid":1,"tagId":1,"tags":{"tagId":1,"tagName":"咸"}}]},"comment":{"mid":11,"reid":1,"puid":1,"createTime":1551576718000,"context":"3.3","type":1,"delete":false},"delete":false,"show":true}],"delete":false}]
         * commentReplies : [{"mid":2,"mmid":2,"puid":1,"reid":1,"ruid":2,"context":"1号评论2号","createTime":1551403349000,"type":2,"comment":{"mid":2,"reid":1,"puid":2,"createTime":1551363363000,"context":"第二条评论","type":1,"delete":false},"delete":false,"show":true},{"mid":16,"mmid":11,"puid":1,"reid":1,"ruid":1,"context":"啦啦啦","createTime":1551778209000,"type":2,"comment":{"mid":11,"reid":1,"puid":1,"createTime":1551576718000,"context":"3.3","type":1,"delete":false},"delete":false,"show":true}]
         * userTastes : [{"uid":1,"tagId":1,"tags":{"tagId":1,"tagName":"咸"}}]
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
        private List<ViewLogsBean> viewLogs;
        private List<UserCollectsBean> userCollects;
        private List<CommentsBean> comments;
        private List<CommentRepliesBeanX> commentReplies;
        private List<UserTastesBean> userTastes;

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

        public List<ViewLogsBean> getViewLogs() {
            return viewLogs;
        }

        public void setViewLogs(List<ViewLogsBean> viewLogs) {
            this.viewLogs = viewLogs;
        }

        public List<UserCollectsBean> getUserCollects() {
            return userCollects;
        }

        public void setUserCollects(List<UserCollectsBean> userCollects) {
            this.userCollects = userCollects;
        }

        public List<CommentsBean> getComments() {
            return comments;
        }

        public void setComments(List<CommentsBean> comments) {
            this.comments = comments;
        }

        public List<CommentRepliesBeanX> getCommentReplies() {
            return commentReplies;
        }

        public void setCommentReplies(List<CommentRepliesBeanX> commentReplies) {
            this.commentReplies = commentReplies;
        }

        public List<UserTastesBean> getUserTastes() {
            return userTastes;
        }

        public void setUserTastes(List<UserTastesBean> userTastes) {
            this.userTastes = userTastes;
        }

        public static class ViewLogsBean {
            /**
             * vid : 1
             * uid : 1
             * reid : 1
             * viewTime : 1551687847000
             * preferDegree : 3
             * visitTime : 0.12
             * visitedTimes : 12
             * comment : 哈哈，很棒
             */

            private int vid;
            private int uid;
            private int reid;
            private long viewTime;
            private int preferDegree;
            private double visitTime;
            private int visitedTimes;
            private String comment;

            public int getVid() {
                return vid;
            }

            public void setVid(int vid) {
                this.vid = vid;
            }

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public int getReid() {
                return reid;
            }

            public void setReid(int reid) {
                this.reid = reid;
            }

            public long getViewTime() {
                return viewTime;
            }

            public void setViewTime(long viewTime) {
                this.viewTime = viewTime;
            }

            public int getPreferDegree() {
                return preferDegree;
            }

            public void setPreferDegree(int preferDegree) {
                this.preferDegree = preferDegree;
            }

            public double getVisitTime() {
                return visitTime;
            }

            public void setVisitTime(double visitTime) {
                this.visitTime = visitTime;
            }

            public int getVisitedTimes() {
                return visitedTimes;
            }

            public void setVisitedTimes(int visitedTimes) {
                this.visitedTimes = visitedTimes;
            }

            public String getComment() {
                return comment;
            }

            public void setComment(String comment) {
                this.comment = comment;
            }
        }

        public static class UserCollectsBean {
            /**
             * reid : 1
             * uid : 1
             * type : false
             * time : 1551783266000
             */

            private int reid;
            private int uid;
            private boolean type;
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

            public long getTime() {
                return time;
            }

            public void setTime(long time) {
                this.time = time;
            }
        }

        public static class CommentsBean {
            /**
             * mid : 1
             * reid : 1
             * puid : 1
             * createTime : 1551363328000
             * context : 来自小仙女的第一条评论
             * type : 1
             * commentReplies : [{"mid":1,"mmid":1,"puid":2,"reid":1,"ruid":1,"context":"回复第一条评论，这是一条超长评论，啦啦啦啦啦啦啦啦","createTime":1551363434000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzEzNTQ0NSwiaWF0IjoxNTUzMDQ5MDQ1fQ.TCFCEmxl974ZSHJFCOjs3K9x9VYxM4U1U8bAcR0OJfY","password":"002","userTastes":[]},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"delete":false},"delete":false,"show":false},{"mid":7,"mmid":1,"puid":2,"reid":1,"ruid":1,"context":"test","createTime":1551405225000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzEzNTQ0NSwiaWF0IjoxNTUzMDQ5MDQ1fQ.TCFCEmxl974ZSHJFCOjs3K9x9VYxM4U1U8bAcR0OJfY","password":"002","userTastes":[]},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"delete":false},"delete":false,"show":true},{"mid":12,"mmid":1,"puid":4,"reid":1,"ruid":1,"context":"我是003","createTime":1551669384000,"type":2,"userInfo":{"uid":4,"userName":"003","age":"35","sex":2,"intro":"我就是我，","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1MzEzMzgyMCwiaWF0IjoxNTUzMDQ3NDIwfQ.xPA3Z-fzr0Msg2C5job-SIS5suRHRMAHxGe6TERSwMw","password":"003","userTastes":[]},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"delete":false},"delete":false,"show":true}]
             * delete : false
             */

            private int mid;
            private int reid;
            private int puid;
            private long createTime;
            private String context;
            private int type;
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

            public static class CommentRepliesBean {
                /**
                 * mid : 1
                 * mmid : 1
                 * puid : 2
                 * reid : 1
                 * ruid : 1
                 * context : 回复第一条评论，这是一条超长评论，啦啦啦啦啦啦啦啦
                 * createTime : 1551363434000
                 * type : 2
                 * userInfo : {"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzEzNTQ0NSwiaWF0IjoxNTUzMDQ5MDQ1fQ.TCFCEmxl974ZSHJFCOjs3K9x9VYxM4U1U8bAcR0OJfY","password":"002","userTastes":[]}
                 * comment : {"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"delete":false}
                 * delete : false
                 * show : false
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

                public boolean isShow() {
                    return show;
                }

                public void setShow(boolean show) {
                    this.show = show;
                }

                public static class UserInfoBean {
                    /**
                     * uid : 2
                     * userName : wx
                     * age : 21
                     * sex : 1
                     * intro : 白夜
                     * location : 上海
                     * image : 002.jpg
                     * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzEzNTQ0NSwiaWF0IjoxNTUzMDQ5MDQ1fQ.TCFCEmxl974ZSHJFCOjs3K9x9VYxM4U1U8bAcR0OJfY
                     * password : 002
                     * userTastes : []
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
                    private List<?> userTastes;

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

                    public List<?> getUserTastes() {
                        return userTastes;
                    }

                    public void setUserTastes(List<?> userTastes) {
                        this.userTastes = userTastes;
                    }
                }

                public static class CommentBean {
                    /**
                     * mid : 1
                     * reid : 1
                     * puid : 1
                     * createTime : 1551363328000
                     * context : 来自小仙女的第一条评论
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

        public static class CommentRepliesBeanX {
            /**
             * mid : 2
             * mmid : 2
             * puid : 1
             * reid : 1
             * ruid : 2
             * context : 1号评论2号
             * createTime : 1551403349000
             * type : 2
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
            private CommentBeanX comment;
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

            public CommentBeanX getComment() {
                return comment;
            }

            public void setComment(CommentBeanX comment) {
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

            public static class CommentBeanX {
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

        public static class UserTastesBean {
            /**
             * uid : 1
             * tagId : 1
             * tags : {"tagId":1,"tagName":"咸"}
             */

            private int uid;
            private int tagId;
            private TagsBean tags;

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public int getTagId() {
                return tagId;
            }

            public void setTagId(int tagId) {
                this.tagId = tagId;
            }

            public TagsBean getTags() {
                return tags;
            }

            public void setTags(TagsBean tags) {
                this.tags = tags;
            }

            public static class TagsBean {
                /**
                 * tagId : 1
                 * tagName : 咸
                 */

                private int tagId;
                private String tagName;

                public int getTagId() {
                    return tagId;
                }

                public void setTagId(int tagId) {
                    this.tagId = tagId;
                }

                public String getTagName() {
                    return tagName;
                }

                public void setTagName(String tagName) {
                    this.tagName = tagName;
                }
            }
        }
    }


//    /**
//     * errorCode : 0
//     * success : true
//     * message : 查询成功
//     * data : {"uid":4,"userName":"003","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"北京","image":"http://192.168.137.1:8080/image/003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiMDAzIiwiZXhwIjoxNTUxNjEyNjcyLCJpYXQiOjE1NTE2MTE3NzJ9.FGB4Iyo_fqQYkg2RNivbHvW18j5dyuxkAGNgj3kPsjM","password":"003","viewLogs":[],"userCollects":[{"reid":1,"uid":4,"time":1551598507000},{"reid":3,"uid":4,"time":1551599044000}],"comments":[{"mid":12,"reid":1,"puid":4,"createTime":1551599094000,"context":"啦啦","type":1,"commentReplies":[],"delete":false},{"mid":13,"reid":3,"puid":4,"createTime":1551613601000,"context":"沙发","type":1,"commentReplies":[{"mid":10,"mmid":13,"puid":2,"reid":3,"ruid":4,"context":"up","createTime":1551613613000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":null,"password":"002"},"delete":false}],"delete":false}],"commentReplies":[]}
//     */
//
//    private int errorCode;
//    private boolean success;
//    private String message;
//    private DataBean data;
//
//    public int getErrorCode() {
//        return errorCode;
//    }
//
//    public void setErrorCode(int errorCode) {
//        this.errorCode = errorCode;
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
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public DataBean getData() {
//        return data;
//    }
//
//    public void setData(DataBean data) {
//        this.data = data;
//    }
//
//    public static class DataBean {
//        /**
//         * uid : 4
//         * userName : 003
//         * age : 35
//         * sex : 2
//         * intro : 我就是我，颜色不一样的烟火
//         * location : 北京
//         * image : http://192.168.137.1:8080/image/003.jpg
//         * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiMDAzIiwiZXhwIjoxNTUxNjEyNjcyLCJpYXQiOjE1NTE2MTE3NzJ9.FGB4Iyo_fqQYkg2RNivbHvW18j5dyuxkAGNgj3kPsjM
//         * password : 003
//         * viewLogs : []
//         * userCollects : [{"reid":1,"uid":4,"time":1551598507000},{"reid":3,"uid":4,"time":1551599044000}]
//         * comments : [{"mid":12,"reid":1,"puid":4,"createTime":1551599094000,"context":"啦啦","type":1,"commentReplies":[],"delete":false},{"mid":13,"reid":3,"puid":4,"createTime":1551613601000,"context":"沙发","type":1,"commentReplies":[{"mid":10,"mmid":13,"puid":2,"reid":3,"ruid":4,"context":"up","createTime":1551613613000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":null,"password":"002"},"delete":false}],"delete":false}]
//         * commentReplies : []
//         */
//
//        private int uid;
//        private String userName;
//        private String age;
//        private int sex;
//        private String intro;
//        private String location;
//        private String image;
//        private String token;
//        private String password;
//        private List<?> viewLogs;
//        private List<UserCollectsBean> userCollects;
//        private List<CommentsBean> comments;
//        private List<?> commentReplies;
//
//        public int getUid() {
//            return uid;
//        }
//
//        public void setUid(int uid) {
//            this.uid = uid;
//        }
//
//        public String getUserName() {
//            return userName;
//        }
//
//        public void setUserName(String userName) {
//            this.userName = userName;
//        }
//
//        public String getAge() {
//            return age;
//        }
//
//        public void setAge(String age) {
//            this.age = age;
//        }
//
//        public int getSex() {
//            return sex;
//        }
//
//        public void setSex(int sex) {
//            this.sex = sex;
//        }
//
//        public String getIntro() {
//            return intro;
//        }
//
//        public void setIntro(String intro) {
//            this.intro = intro;
//        }
//
//        public String getLocation() {
//            return location;
//        }
//
//        public void setLocation(String location) {
//            this.location = location;
//        }
//
//        public String getImage() {
//            return image;
//        }
//
//        public void setImage(String image) {
//            this.image = image;
//        }
//
//        public String getToken() {
//            return token;
//        }
//
//        public void setToken(String token) {
//            this.token = token;
//        }
//
//        public String getPassword() {
//            return password;
//        }
//
//        public void setPassword(String password) {
//            this.password = password;
//        }
//
//        public List<?> getViewLogs() {
//            return viewLogs;
//        }
//
//        public void setViewLogs(List<?> viewLogs) {
//            this.viewLogs = viewLogs;
//        }
//
//        public List<UserCollectsBean> getUserCollects() {
//            return userCollects;
//        }
//
//        public void setUserCollects(List<UserCollectsBean> userCollects) {
//            this.userCollects = userCollects;
//        }
//
//        public List<CommentsBean> getComments() {
//            return comments;
//        }
//
//        public void setComments(List<CommentsBean> comments) {
//            this.comments = comments;
//        }
//
//        public List<?> getCommentReplies() {
//            return commentReplies;
//        }
//
//        public void setCommentReplies(List<?> commentReplies) {
//            this.commentReplies = commentReplies;
//        }
//
//        public static class UserCollectsBean {
//            /**
//             * reid : 1
//             * uid : 4
//             * time : 1551598507000
//             */
//
//            private int reid;
//            private int uid;
//            private long time;
//
//            public int getReid() {
//                return reid;
//            }
//
//            public void setReid(int reid) {
//                this.reid = reid;
//            }
//
//            public int getUid() {
//                return uid;
//            }
//
//            public void setUid(int uid) {
//                this.uid = uid;
//            }
//
//            public long getTime() {
//                return time;
//            }
//
//            public void setTime(long time) {
//                this.time = time;
//            }
//        }
//
//        public static class CommentsBean {
//            /**
//             * mid : 12
//             * reid : 1
//             * puid : 4
//             * createTime : 1551599094000
//             * context : 啦啦
//             * type : 1
//             * commentReplies : []
//             * delete : false
//             */
//
//            private int mid;
//            private int reid;
//            private int puid;
//            private long createTime;
//            private String context;
//            private int type;
//            private boolean delete;
//            private List<?> commentReplies;
//
//            public int getMid() {
//                return mid;
//            }
//
//            public void setMid(int mid) {
//                this.mid = mid;
//            }
//
//            public int getReid() {
//                return reid;
//            }
//
//            public void setReid(int reid) {
//                this.reid = reid;
//            }
//
//            public int getPuid() {
//                return puid;
//            }
//
//            public void setPuid(int puid) {
//                this.puid = puid;
//            }
//
//            public long getCreateTime() {
//                return createTime;
//            }
//
//            public void setCreateTime(long createTime) {
//                this.createTime = createTime;
//            }
//
//            public String getContext() {
//                return context;
//            }
//
//            public void setContext(String context) {
//                this.context = context;
//            }
//
//            public int getType() {
//                return type;
//            }
//
//            public void setType(int type) {
//                this.type = type;
//            }
//
//            public boolean isDelete() {
//                return delete;
//            }
//
//            public void setDelete(boolean delete) {
//                this.delete = delete;
//            }
//
//            public List<?> getCommentReplies() {
//                return commentReplies;
//            }
//
//            public void setCommentReplies(List<?> commentReplies) {
//                this.commentReplies = commentReplies;
//            }
//        }
//    }
}
