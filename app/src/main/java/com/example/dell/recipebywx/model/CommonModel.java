package com.example.dell.recipebywx.model;

/**
 * Created by dell on 2019/3/1.
 */

public class CommonModel {

    /**
     * errorCode : 0
     * success : true
     * message : 添加一级评论成功
     * data : null
     */

    private int errorCode;
    private boolean success;
    private String message;
    private Object data;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
