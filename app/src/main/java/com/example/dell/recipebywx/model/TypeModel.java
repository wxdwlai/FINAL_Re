package com.example.dell.recipebywx.model;

import java.util.List;

/**
 * Created by dell on 2019/3/27.
 */

public class TypeModel {


    /**
     * errorCode : 0
     * message : 查找成功
     * success : true
     * data : [{"typeId":1,"typeName":"热菜","recipeTypes":[{"typeId":1,"reid":2},{"typeId":1,"reid":1},{"typeId":1,"reid":7},{"typeId":1,"reid":15}]},{"typeId":2,"typeName":"家常菜","recipeTypes":[{"typeId":2,"reid":15},{"typeId":2,"reid":1},{"typeId":2,"reid":2}]},{"typeId":3,"typeName":"早餐","recipeTypes":[{"typeId":3,"reid":3}]},{"typeId":4,"typeName":"午餐","recipeTypes":[{"typeId":4,"reid":7},{"typeId":4,"reid":15}]},{"typeId":5,"typeName":"下午茶","recipeTypes":[]},{"typeId":6,"typeName":"晚餐","recipeTypes":[{"typeId":6,"reid":2},{"typeId":6,"reid":15},{"typeId":6,"reid":7}]},{"typeId":7,"typeName":"儿童","recipeTypes":[{"typeId":7,"reid":2},{"typeId":7,"reid":15}]},{"typeId":8,"typeName":"老人","recipeTypes":[{"typeId":8,"reid":15}]},{"typeId":9,"typeName":"烘焙","recipeTypes":[{"typeId":9,"reid":22}]},{"typeId":10,"typeName":"川菜","recipeTypes":[]},{"typeId":11,"typeName":"甜品","recipeTypes":[{"typeId":11,"reid":3},{"typeId":11,"reid":22},{"typeId":11,"reid":1}]}]
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
         * typeId : 1
         * typeName : 热菜
         * recipeTypes : [{"typeId":1,"reid":2},{"typeId":1,"reid":1},{"typeId":1,"reid":7},{"typeId":1,"reid":15}]
         */

        private int typeId;
        private String typeName;
        private List<RecipeTypesBean> recipeTypes;

        public int getTypeId() {
            return typeId;
        }

        public void setTypeId(int typeId) {
            this.typeId = typeId;
        }

        public String getTypeName() {
            return typeName;
        }

        public void setTypeName(String typeName) {
            this.typeName = typeName;
        }

        public List<RecipeTypesBean> getRecipeTypes() {
            return recipeTypes;
        }

        public void setRecipeTypes(List<RecipeTypesBean> recipeTypes) {
            this.recipeTypes = recipeTypes;
        }

        public static class RecipeTypesBean {
            /**
             * typeId : 1
             * reid : 2
             */

            private int typeId;
            private int reid;

            public int getTypeId() {
                return typeId;
            }

            public void setTypeId(int typeId) {
                this.typeId = typeId;
            }

            public int getReid() {
                return reid;
            }

            public void setReid(int reid) {
                this.reid = reid;
            }
        }
    }
}
