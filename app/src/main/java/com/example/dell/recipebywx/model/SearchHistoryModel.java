package com.example.dell.recipebywx.model;

import java.util.List;

/**
 * Created by dell on 2019/2/16.
 */

public class SearchHistoryModel {
    /**
     * errorCode : 0
     * errorDesc :
     * success : true
     * data : ["虾仁","鱼","鱼肉","柚子","蜂蜜","芝士","西兰","五仁","可乐","绿茶"]
     */

    private String errorCode;
    private String errorDesc;
    private boolean success;
    private List<String> data;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

//    /**
//     * errorCode : 0
//     * errorDesc :
//     * success : true
//     * data : [{"uid":1,"keyword":"五仁","time":"2019-02-06T16:00:00.000+0000"},{"uid":1,"keyword":"五仁","time":"2019-02-06T16:00:00.000+0000"},{"uid":1,"keyword":"五仁","time":"2019-02-06T16:00:00.000+0000"},{"uid":1,"keyword":"五仁","time":"2019-02-06T16:00:00.000+0000"},{"uid":1,"keyword":"五仁","time":"2019-02-06T16:00:00.000+0000"},{"uid":1,"keyword":"五仁","time":"2019-02-06T16:00:00.000+0000"},{"uid":1,"keyword":"五仁","time":"2019-02-06T16:00:00.000+0000"},{"uid":1,"keyword":"五仁","time":"2019-02-06T16:00:00.000+0000"},{"uid":1,"keyword":"五仁","time":"2019-02-06T16:00:00.000+0000"},{"uid":1,"keyword":"五仁","time":"2019-02-06T16:00:00.000+0000"},{"uid":1,"keyword":"五仁","time":"2019-02-06T16:00:00.000+0000"}]
//     */
//
//    private String errorCode;
//    private String errorDesc;
//    private boolean success;
//    private List<DataBean> data;
//
//    public String getErrorCode() {
//        return errorCode;
//    }
//
//    public void setErrorCode(String errorCode) {
//        this.errorCode = errorCode;
//    }
//
//    public String getErrorDesc() {
//        return errorDesc;
//    }
//
//    public void setErrorDesc(String errorDesc) {
//        this.errorDesc = errorDesc;
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
//         * uid : 1
//         * keyword : 五仁
//         * time : 2019-02-06T16:00:00.000+0000
//         */
//
//        private int uid;
//        private String keyword;
//        private String time;
//
//        public int getUid() {
//            return uid;
//        }
//
//        public void setUid(int uid) {
//            this.uid = uid;
//        }
//
//        public String getKeyword() {
//            return keyword;
//        }
//
//        public void setKeyword(String keyword) {
//            this.keyword = keyword;
//        }
//
//        public String getTime() {
//            return time;
//        }
//
//        public void setTime(String time) {
//            this.time = time;
//        }
//    }
}
