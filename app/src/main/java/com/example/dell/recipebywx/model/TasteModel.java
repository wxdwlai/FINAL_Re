package com.example.dell.recipebywx.model;

import java.util.List;

/**
 * Created by dell on 2019/3/20.
 */

public class TasteModel {

    /**
     * errorCode : 0
     * message : 查找成功
     * success : true
     * data : [{"tagId":1,"tagName":"咸","recipeTags":[{"reid":1,"tagId":1}]},{"tagId":2,"tagName":"甜","recipeTags":[{"reid":1,"tagId":2}]},{"tagId":3,"tagName":"辣","recipeTags":[]},{"tagId":4,"tagName":"酸","recipeTags":[]},{"tagId":5,"tagName":"烘焙","recipeTags":[{"reid":1,"tagId":5}]},{"tagId":6,"tagName":"蒸","recipeTags":[]},{"tagId":7,"tagName":"炒","recipeTags":[]},{"tagId":8,"tagName":"油炸","recipeTags":[]},{"tagId":9,"tagName":"水煮","recipeTags":[]}]
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
         * tagId : 1
         * tagName : 咸
         * recipeTags : [{"reid":1,"tagId":1}]
         */

        private int tagId;
        private String tagName;
        private List<RecipeTagsBean> recipeTags;

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

        public List<RecipeTagsBean> getRecipeTags() {
            return recipeTags;
        }

        public void setRecipeTags(List<RecipeTagsBean> recipeTags) {
            this.recipeTags = recipeTags;
        }

        public static class RecipeTagsBean {
            /**
             * reid : 1
             * tagId : 1
             */

            private int reid;
            private int tagId;

            public int getReid() {
                return reid;
            }

            public void setReid(int reid) {
                this.reid = reid;
            }

            public int getTagId() {
                return tagId;
            }

            public void setTagId(int tagId) {
                this.tagId = tagId;
            }
        }
    }
}
