package com.example.dell.recipebywx.my;

import java.util.List;

public class UserWeixinInforModel {
    /**
     * uid : 4
     * name : 003
     * gender : null
     * iconurl : 003.jpg
     * data : {"uid":4,"userName":"003","age":"35","sex":0,"intro":null,"location":"北京","image":"003.jpg","password":"003","userCollects":[]}
     * elapsedMilliseconds : 0
     * errorCode : 0
     * errorDesc : null
     * success : true
     * message : 登录成功
     */

    private String uid;
    private String name;
    private Object gender;
    private String iconurl;
    private String intro;
    private String token;
    private DataBean data;
    private int elapsedMilliseconds;
    private int errorCode;
    private Object errorDesc;
    private boolean success;
    private String message;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public String getIconurl() {
        return iconurl;
    }

    public void setIconurl(String iconurl) {
        this.iconurl = iconurl;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getElapsedMilliseconds() {
        return elapsedMilliseconds;
    }

    public void setElapsedMilliseconds(int elapsedMilliseconds) {
        this.elapsedMilliseconds = elapsedMilliseconds;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public Object getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(Object errorDesc) {
        this.errorDesc = errorDesc;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static class DataBean {
        /**
         * uid : 4
         * userName : 003
         * age : 35
         * sex : 0
         * intro : null
         * location : 北京
         * image : 003.jpg
         * password : 003
         * userCollects : []
         */

        private int uid;
        private String userName;
        private String age;
        private int sex;
        private Object intro;
        private String location;
        private String image;
        private String password;
        private List<?> userCollects;

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

        public Object getIntro() {
            return intro;
        }

        public void setIntro(Object intro) {
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

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public List<?> getUserCollects() {
            return userCollects;
        }

        public void setUserCollects(List<?> userCollects) {
            this.userCollects = userCollects;
        }
    }


//    private String uid;
//    private String name;
//    private String gender;
//    private String iconurl;
//    @SerializedName("@jsonId")
//    private int _$JsonId255; // FIXME check this code
//    private DataBean data;
//    private int elapsedMilliseconds;
//    private String errorCode;
//    private String errorDesc;
//    private boolean success;
//    /**
//     * token : 111
//     */
//
//    private String token;
//    /**
//     * userId : 11
//     */
//
//    private String userId;
//    /**
//     * userIntro : 2232
//     */
//
//    private String userIntro;
//
//    public String getUid() {
//        return uid;
//    }
//
//    public void setUid(String uid) {
//        this.uid = uid;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public String getIconurl() {
//        return iconurl;
//    }
//
//    public void setIconurl(String iconurl) {
//        this.iconurl = iconurl;
//    }
//
//    public int get_$JsonId255() {
//        return _$JsonId255;
//    }
//
//    public void set_$JsonId255(int _$JsonId255) {
//        this._$JsonId255 = _$JsonId255;
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
//    public int getElapsedMilliseconds() {
//        return elapsedMilliseconds;
//    }
//
//    public void setElapsedMilliseconds(int elapsedMilliseconds) {
//        this.elapsedMilliseconds = elapsedMilliseconds;
//    }
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
//    public String getToken() {
//        return token;
//    }
//
//    public void setToken(String token) {
//        this.token = token;
//    }
//
//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }
//
//    public String getUserIntro() {
//        return userIntro;
//    }
//
//    public void setUserIntro(String userIntro) {
//        this.userIntro = userIntro;
//    }
//
//    public static class DataBean {
//        /**
//         * firstLogonOfDay : false
//         * headImgUrl : http://img.zcool.cn/community/01d6c4553a0a810000002561413a6a.jpg
//         * loginTime : 1544525970054
//         * passwordValid : false
//         * token : b8250dde065e4a91a01bf8f716f5a363
//         * unionId : kdjfalsdfmcvkljsf
//         * userName : 赵姐
//         * weixinBindPhoneStatus : 0
//         */
//
//        private String id;
//        private boolean firstLogonOfDay;
//        private String headImgUrl;
//        private long loginTime;
//        private boolean passwordValid;
//        private String token;
//        private String unionId;
//        private String userName;
//        private int weixinBindPhoneStatus;
//        private String sex;
//        private String intro;
//
//
//        public String getId() {
//            return id;
//        }
//
//        public void setId(String token) {
//            this.id = id;
//        }
//
//        public boolean isFirstLogonOfDay() {
//            return firstLogonOfDay;
//        }
//
//        public void setFirstLogonOfDay(boolean firstLogonOfDay) {
//            this.firstLogonOfDay = firstLogonOfDay;
//        }
//
//        public String getHeadImgUrl() {
//            return headImgUrl;
//        }
//
//        public void setHeadImgUrl(String headImgUrl) {
//            this.headImgUrl = headImgUrl;
//        }
//
//        public long getLoginTime() {
//            return loginTime;
//        }
//
//        public void setLoginTime(long loginTime) {
//            this.loginTime = loginTime;
//        }
//
//        public boolean isPasswordValid() {
//            return passwordValid;
//        }
//
//        public void setPasswordValid(boolean passwordValid) {
//            this.passwordValid = passwordValid;
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
//        public String getUnionId() {
//            return unionId;
//        }
//
//        public void setUnionId(String unionId) {
//            this.unionId = unionId;
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
//        public int getWeixinBindPhoneStatus() {
//            return weixinBindPhoneStatus;
//        }
//
//        public void setWeixinBindPhoneStatus(int weixinBindPhoneStatus) {
//            this.weixinBindPhoneStatus = weixinBindPhoneStatus;
//        }
//
//        public String getSex() {
//            return sex;
//        }
//
//        public void setSex(String sex) {
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
//    }
}
