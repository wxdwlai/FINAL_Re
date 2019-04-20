package com.example.dell.recipebywx.model;

/**
 * Created by dell on 2019/4/20.
 */

public class RegisterModel {

    /**
     * errorCode : 0
     * message : 注册成功
     * success : true
     * data : null
     */

    private int errorCode;
    private String message;
    private boolean success;
    private Object data;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
