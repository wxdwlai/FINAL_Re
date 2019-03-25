package com.example.dell.recipebywx.model;

import java.util.List;

/**
 * Created by dell on 2019/2/25.
 */

public class CollectResponseModel {

    /**
     * errorCode : 0
     * message : 取消收藏
     * success : true
     * data : [{"reid":1,"uid":1,"time":"2019-02-25T04:46:12.000+0000"},{"reid":1,"uid":2,"time":"2019-02-25T04:46:46.000+0000"}]
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
         * uid : 1
         * time : 2019-02-25T04:46:12.000+0000
         */

        private int reid;
        private int uid;
        private String time;
        private boolean type;

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

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public boolean isType() {
            return type;
        }

        public void setType(boolean type) {
            this.type = type;
        }
    }
}
