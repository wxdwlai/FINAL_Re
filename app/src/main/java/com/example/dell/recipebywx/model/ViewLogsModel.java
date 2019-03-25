package com.example.dell.recipebywx.model;

import java.util.List;

/**
 * Created by dell on 2019/3/6.
 */

public class ViewLogsModel {

    /**
     * errorCode : 0
     * message : 找到用户浏览记录
     * success : true
     * data : [{"vid":7,"uid":1,"reid":1,"viewTime":1551833026000,"preferDegree":1,"visitTime":0,"visitedTimes":18,"comment":null,"recipe":{"reid":1,"title":"牛奶面包","score":8,"ings":"高筋面粉\t250克\r\n奶粉\t8克\r\n酵母\t2.5克\r\n盐\t3克\r\n糖\t30克\r\n牛奶\t165克\r\n全蛋液\t30克\r\n黄油\t25克","image":"006.jpg","visiteds":5769,"collects":1,"likes":0,"tags":"甜；糕点；蒸","intro":"之前在浮小笙主页上看见这样一款包包\r\n瞬间被造型萌到了，一直保存着图片\r\n很多小伙伴嫌弃做面包时间长啊神马的，\r\n除了中种法可以前一天做好分开来调整时间之外，\r\n其实直接法也可以，这个面团用的5°冷藏初发酵，面团手感很好\r\n整形过程完全是脑洞来的，最终的造型还算OK，所以就酱紫吧~~","stepsList":[{"stepId":1,"reid":1,"steps":"面团材料中盐和黄油以外的所有食材混合，揉成面团。面团揉至粗膜状态加入黄油和盐继续揉至扩展阶段，可以扯出较为结实的半透明薄膜","stepImgs":"001.jpg"},{"stepId":2,"reid":1,"steps":"将面团装入厚实一些的保鲜袋","stepImgs":"002.jpg"},{"stepId":3,"reid":1,"steps":"放入冰箱5°冷藏发酵10-12小时后取出","stepImgs":"003.jpg"},{"stepId":4,"reid":1,"steps":"室温下放置40-60分钟回温后将面团取出\r\n按压排气","stepImgs":"004.jpg"},{"stepId":5,"reid":1,"steps":"将面团称重","stepImgs":"005.jpg"},{"stepId":6,"reid":1,"steps":"等分为九个小面团","stepImgs":null},{"stepId":7,"reid":1,"steps":"滚圆后盖保鲜膜松弛15分钟","stepImgs":null},{"stepId":8,"reid":1,"steps":"取一个松弛好的面团擀面杖自中间分别向上向下擀开","stepImgs":null},{"stepId":9,"reid":1,"steps":"翻面后横放身前，上下各自向1/3处折叠压紧","stepImgs":null},{"stepId":10,"reid":1,"steps":"将其擀长","stepImgs":null},{"stepId":11,"reid":1,"steps":"上下各自向1/2处卷起，卷到中间压紧","stepImgs":null},{"stepId":12,"reid":1,"steps":"翻过来，造型完成","stepImgs":null},{"stepId":13,"reid":1,"steps":"等距摆上烤盘","stepImgs":null},{"stepId":14,"reid":1,"steps":"放在温度36相对湿度75%的环境中发酵至两倍大","stepImgs":null},{"stepId":15,"reid":1,"steps":"烤箱上下管180度充分预热\r\n顶部用锋利的刀片划十字割口\r\n撒高粉","stepImgs":null},{"stepId":16,"reid":1,"steps":"放入预热好的烤箱中层\r\n上下管180度烘烤15-20分钟出炉","stepImgs":null},{"stepId":17,"reid":1,"steps":"冷却后装袋即可","stepImgs":null}],"recipeTypes":[{"typeId":1,"reid":1,"types":{"typeId":1,"typeName":"酸"}},{"typeId":2,"reid":1,"types":{"typeId":2,"typeName":"甜"}}],"recipeTags":[{"reid":1,"tagId":1,"tags":{"tagId":1,"tagName":"酸"}},{"reid":1,"tagId":2,"tags":{"tagId":2,"tagName":"甜"}},{"reid":1,"tagId":5,"tags":{"tagId":5,"tagName":"咸"}}]}},{"vid":8,"uid":1,"reid":2,"viewTime":1551832903000,"preferDegree":1,"visitTime":0,"visitedTimes":13,"comment":null,"recipe":{"reid":2,"title":"可乐鸡翅","score":9,"ings":"鸡翅、牛奶","image":"002.jpg","visiteds":1234,"collects":0,"likes":0,"tags":null,"intro":null,"stepsList":[],"recipeTypes":[{"typeId":1,"reid":2,"types":{"typeId":1,"typeName":"酸"}},{"typeId":3,"reid":2,"types":{"typeId":3,"typeName":"苦"}}],"recipeTags":[]}},{"vid":9,"uid":1,"reid":3,"viewTime":1551833028000,"preferDegree":1,"visitTime":0,"visitedTimes":14,"comment":null,"recipe":{"reid":3,"title":"牛奶蛋糕","score":8,"ings":"黄油、牛奶","image":"003.jpg","visiteds":0,"collects":0,"likes":0,"tags":null,"intro":null,"stepsList":[],"recipeTypes":[],"recipeTags":[]}}]
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
         * vid : 7
         * uid : 1
         * reid : 1
         * viewTime : 1551833026000
         * preferDegree : 1
         * visitTime : 0.0
         * visitedTimes : 18
         * comment : null
         * recipe : {"reid":1,"title":"牛奶面包","score":8,"ings":"高筋面粉\t250克\r\n奶粉\t8克\r\n酵母\t2.5克\r\n盐\t3克\r\n糖\t30克\r\n牛奶\t165克\r\n全蛋液\t30克\r\n黄油\t25克","image":"006.jpg","visiteds":5769,"collects":1,"likes":0,"tags":"甜；糕点；蒸","intro":"之前在浮小笙主页上看见这样一款包包\r\n瞬间被造型萌到了，一直保存着图片\r\n很多小伙伴嫌弃做面包时间长啊神马的，\r\n除了中种法可以前一天做好分开来调整时间之外，\r\n其实直接法也可以，这个面团用的5°冷藏初发酵，面团手感很好\r\n整形过程完全是脑洞来的，最终的造型还算OK，所以就酱紫吧~~","stepsList":[{"stepId":1,"reid":1,"steps":"面团材料中盐和黄油以外的所有食材混合，揉成面团。面团揉至粗膜状态加入黄油和盐继续揉至扩展阶段，可以扯出较为结实的半透明薄膜","stepImgs":"001.jpg"},{"stepId":2,"reid":1,"steps":"将面团装入厚实一些的保鲜袋","stepImgs":"002.jpg"},{"stepId":3,"reid":1,"steps":"放入冰箱5°冷藏发酵10-12小时后取出","stepImgs":"003.jpg"},{"stepId":4,"reid":1,"steps":"室温下放置40-60分钟回温后将面团取出\r\n按压排气","stepImgs":"004.jpg"},{"stepId":5,"reid":1,"steps":"将面团称重","stepImgs":"005.jpg"},{"stepId":6,"reid":1,"steps":"等分为九个小面团","stepImgs":null},{"stepId":7,"reid":1,"steps":"滚圆后盖保鲜膜松弛15分钟","stepImgs":null},{"stepId":8,"reid":1,"steps":"取一个松弛好的面团擀面杖自中间分别向上向下擀开","stepImgs":null},{"stepId":9,"reid":1,"steps":"翻面后横放身前，上下各自向1/3处折叠压紧","stepImgs":null},{"stepId":10,"reid":1,"steps":"将其擀长","stepImgs":null},{"stepId":11,"reid":1,"steps":"上下各自向1/2处卷起，卷到中间压紧","stepImgs":null},{"stepId":12,"reid":1,"steps":"翻过来，造型完成","stepImgs":null},{"stepId":13,"reid":1,"steps":"等距摆上烤盘","stepImgs":null},{"stepId":14,"reid":1,"steps":"放在温度36相对湿度75%的环境中发酵至两倍大","stepImgs":null},{"stepId":15,"reid":1,"steps":"烤箱上下管180度充分预热\r\n顶部用锋利的刀片划十字割口\r\n撒高粉","stepImgs":null},{"stepId":16,"reid":1,"steps":"放入预热好的烤箱中层\r\n上下管180度烘烤15-20分钟出炉","stepImgs":null},{"stepId":17,"reid":1,"steps":"冷却后装袋即可","stepImgs":null}],"recipeTypes":[{"typeId":1,"reid":1,"types":{"typeId":1,"typeName":"酸"}},{"typeId":2,"reid":1,"types":{"typeId":2,"typeName":"甜"}}],"recipeTags":[{"reid":1,"tagId":1,"tags":{"tagId":1,"tagName":"酸"}},{"reid":1,"tagId":2,"tags":{"tagId":2,"tagName":"甜"}},{"reid":1,"tagId":5,"tags":{"tagId":5,"tagName":"咸"}}]}
         */

        private int vid;
        private int uid;
        private int reid;
        private long viewTime;
        private int preferDegree;
        private double visitTime;
        private int visitedTimes;
        private Object comment;
        private RecipeBean recipe;

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

        public Object getComment() {
            return comment;
        }

        public void setComment(Object comment) {
            this.comment = comment;
        }

        public RecipeBean getRecipe() {
            return recipe;
        }

        public void setRecipe(RecipeBean recipe) {
            this.recipe = recipe;
        }

        public static class RecipeBean {
            /**
             * reid : 1
             * title : 牛奶面包
             * score : 8.0
             * ings : 高筋面粉	250克
             奶粉	8克
             酵母	2.5克
             盐	3克
             糖	30克
             牛奶	165克
             全蛋液	30克
             黄油	25克
             * image : 006.jpg
             * visiteds : 5769
             * collects : 1
             * likes : 0
             * tags : 甜；糕点；蒸
             * intro : 之前在浮小笙主页上看见这样一款包包
             瞬间被造型萌到了，一直保存着图片
             很多小伙伴嫌弃做面包时间长啊神马的，
             除了中种法可以前一天做好分开来调整时间之外，
             其实直接法也可以，这个面团用的5°冷藏初发酵，面团手感很好
             整形过程完全是脑洞来的，最终的造型还算OK，所以就酱紫吧~~
             * stepsList : [{"stepId":1,"reid":1,"steps":"面团材料中盐和黄油以外的所有食材混合，揉成面团。面团揉至粗膜状态加入黄油和盐继续揉至扩展阶段，可以扯出较为结实的半透明薄膜","stepImgs":"001.jpg"},{"stepId":2,"reid":1,"steps":"将面团装入厚实一些的保鲜袋","stepImgs":"002.jpg"},{"stepId":3,"reid":1,"steps":"放入冰箱5°冷藏发酵10-12小时后取出","stepImgs":"003.jpg"},{"stepId":4,"reid":1,"steps":"室温下放置40-60分钟回温后将面团取出\r\n按压排气","stepImgs":"004.jpg"},{"stepId":5,"reid":1,"steps":"将面团称重","stepImgs":"005.jpg"},{"stepId":6,"reid":1,"steps":"等分为九个小面团","stepImgs":null},{"stepId":7,"reid":1,"steps":"滚圆后盖保鲜膜松弛15分钟","stepImgs":null},{"stepId":8,"reid":1,"steps":"取一个松弛好的面团擀面杖自中间分别向上向下擀开","stepImgs":null},{"stepId":9,"reid":1,"steps":"翻面后横放身前，上下各自向1/3处折叠压紧","stepImgs":null},{"stepId":10,"reid":1,"steps":"将其擀长","stepImgs":null},{"stepId":11,"reid":1,"steps":"上下各自向1/2处卷起，卷到中间压紧","stepImgs":null},{"stepId":12,"reid":1,"steps":"翻过来，造型完成","stepImgs":null},{"stepId":13,"reid":1,"steps":"等距摆上烤盘","stepImgs":null},{"stepId":14,"reid":1,"steps":"放在温度36相对湿度75%的环境中发酵至两倍大","stepImgs":null},{"stepId":15,"reid":1,"steps":"烤箱上下管180度充分预热\r\n顶部用锋利的刀片划十字割口\r\n撒高粉","stepImgs":null},{"stepId":16,"reid":1,"steps":"放入预热好的烤箱中层\r\n上下管180度烘烤15-20分钟出炉","stepImgs":null},{"stepId":17,"reid":1,"steps":"冷却后装袋即可","stepImgs":null}]
             * recipeTypes : [{"typeId":1,"reid":1,"types":{"typeId":1,"typeName":"酸"}},{"typeId":2,"reid":1,"types":{"typeId":2,"typeName":"甜"}}]
             * recipeTags : [{"reid":1,"tagId":1,"tags":{"tagId":1,"tagName":"酸"}},{"reid":1,"tagId":2,"tags":{"tagId":2,"tagName":"甜"}},{"reid":1,"tagId":5,"tags":{"tagId":5,"tagName":"咸"}}]
             */

            private int reid;
            private String title;
            private double score;
            private String ings;
            private String image;
            private int visiteds;
            private int collects;
            private int likes;
            private String tags;
            private String intro;
            private List<StepsListBean> stepsList;
            private List<RecipeTypesBean> recipeTypes;
            private List<RecipeTagsBean> recipeTags;

            public int getReid() {
                return reid;
            }

            public void setReid(int reid) {
                this.reid = reid;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public double getScore() {
                return score;
            }

            public void setScore(double score) {
                this.score = score;
            }

            public String getIngs() {
                return ings;
            }

            public void setIngs(String ings) {
                this.ings = ings;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getVisiteds() {
                return visiteds;
            }

            public void setVisiteds(int visiteds) {
                this.visiteds = visiteds;
            }

            public int getCollects() {
                return collects;
            }

            public void setCollects(int collects) {
                this.collects = collects;
            }

            public int getLikes() {
                return likes;
            }

            public void setLikes(int likes) {
                this.likes = likes;
            }

            public String getTags() {
                return tags;
            }

            public void setTags(String tags) {
                this.tags = tags;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public List<StepsListBean> getStepsList() {
                return stepsList;
            }

            public void setStepsList(List<StepsListBean> stepsList) {
                this.stepsList = stepsList;
            }

            public List<RecipeTypesBean> getRecipeTypes() {
                return recipeTypes;
            }

            public void setRecipeTypes(List<RecipeTypesBean> recipeTypes) {
                this.recipeTypes = recipeTypes;
            }

            public List<RecipeTagsBean> getRecipeTags() {
                return recipeTags;
            }

            public void setRecipeTags(List<RecipeTagsBean> recipeTags) {
                this.recipeTags = recipeTags;
            }

            public static class StepsListBean {
                /**
                 * stepId : 1
                 * reid : 1
                 * steps : 面团材料中盐和黄油以外的所有食材混合，揉成面团。面团揉至粗膜状态加入黄油和盐继续揉至扩展阶段，可以扯出较为结实的半透明薄膜
                 * stepImgs : 001.jpg
                 */

                private int stepId;
                private int reid;
                private String steps;
                private String stepImgs;

                public int getStepId() {
                    return stepId;
                }

                public void setStepId(int stepId) {
                    this.stepId = stepId;
                }

                public int getReid() {
                    return reid;
                }

                public void setReid(int reid) {
                    this.reid = reid;
                }

                public String getSteps() {
                    return steps;
                }

                public void setSteps(String steps) {
                    this.steps = steps;
                }

                public String getStepImgs() {
                    return stepImgs;
                }

                public void setStepImgs(String stepImgs) {
                    this.stepImgs = stepImgs;
                }
            }

            public static class RecipeTypesBean {
                /**
                 * typeId : 1
                 * reid : 1
                 * types : {"typeId":1,"typeName":"酸"}
                 */

                private int typeId;
                private int reid;
                private TypesBean types;

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

                public TypesBean getTypes() {
                    return types;
                }

                public void setTypes(TypesBean types) {
                    this.types = types;
                }

                public static class TypesBean {
                    /**
                     * typeId : 1
                     * typeName : 酸
                     */

                    private int typeId;
                    private String typeName;

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
                }
            }

            public static class RecipeTagsBean {
                /**
                 * reid : 1
                 * tagId : 1
                 * tags : {"tagId":1,"tagName":"酸"}
                 */

                private int reid;
                private int tagId;
                private TagsBean tags;

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

                public TagsBean getTags() {
                    return tags;
                }

                public void setTags(TagsBean tags) {
                    this.tags = tags;
                }

                public static class TagsBean {
                    /**
                     * tagId : 1
                     * tagName : 酸
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
    }
}
