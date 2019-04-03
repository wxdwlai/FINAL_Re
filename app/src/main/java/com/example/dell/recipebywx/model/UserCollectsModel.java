package com.example.dell.recipebywx.model;

import java.util.List;

/**
 * Created by dell on 2019/2/25.
 */

public class UserCollectsModel {

    /**
     * errorCode : 0
     * message : 查询成功
     * success : true
     * data : [{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"stepsList":[{"stepId":1,"reid":1,"steps":"1鸡翅洗净，葱姜切大片，柠檬切两半。","stepImgs":"1-1.jpg"},{"stepId":2,"reid":1,"steps":"2先给洗净的鸡翅用牙签来做个针灸，孔越多越好，方便入味。","stepImgs":"1-2.jpg"},{"stepId":3,"reid":1,"steps":"3扎了孔的鸡翅用酱油，葱姜片，盐，料酒，和适量柠檬汁腌30分钟以上。","stepImgs":"1-3.jpg"},{"stepId":4,"reid":1,"steps":"4然后把腌过的鸡翅入5成油锅炸三四分钟，外皮金黄即可捞出。","stepImgs":"1-4.jpg"},{"stepId":5,"reid":1,"steps":"5炸好的鸡翅和之前腌鸡翅的料再加半瓶可乐一起放入炒锅中大火烧开。","stepImgs":"1-5.jpg"},{"stepId":6,"reid":1,"steps":"6转小火炖。","stepImgs":"1-6.jpg"},{"stepId":7,"reid":1,"steps":"7小火炖至汁快收干时改大火收汁，再挤几滴柠檬汁再鸡翅上即可食用。","stepImgs":"1-7.jpg"},{"stepId":8,"reid":1,"steps":"8出锅装盘。","stepImgs":"1-8.jpg"}],"viewLogs":[{"vid":1,"uid":1,"reid":1,"viewTime":1551687847000,"preferDegree":3,"visitTime":0.12,"visitedTimes":12,"comment":"哈哈，很棒"},{"vid":2,"uid":1,"reid":1,"viewTime":1550458220000,"preferDegree":2,"visitTime":0.12,"visitedTimes":1,"comment":null},{"vid":7,"uid":1,"reid":1,"viewTime":1554271099000,"preferDegree":1,"visitTime":0,"visitedTimes":89,"comment":null},{"vid":37,"uid":2,"reid":1,"viewTime":1553514038000,"preferDegree":1,"visitTime":0,"visitedTimes":20,"comment":null},{"vid":32,"uid":4,"reid":1,"viewTime":1554271179000,"preferDegree":1,"visitTime":0,"visitedTimes":106,"comment":null}],"recipeTypes":[{"typeId":1,"reid":1,"types":{"typeId":1,"typeName":"热菜"}},{"typeId":2,"reid":1,"types":{"typeId":2,"typeName":"家常菜"}},{"typeId":11,"reid":1,"types":{"typeId":11,"typeName":"甜品"}}],"recipeTags":[{"reid":1,"tagId":1,"tags":{"tagId":1,"tagName":"咸"}},{"reid":1,"tagId":2,"tags":{"tagId":2,"tagName":"甜"}},{"reid":1,"tagId":5,"tags":{"tagId":5,"tagName":"烘焙"}}],"userCollects":[{"reid":1,"uid":1,"type":false,"time":1551783266000},{"reid":1,"uid":1,"type":true,"time":1554123056000},{"reid":1,"uid":2,"type":false,"time":1553048113000},{"reid":1,"uid":2,"type":true,"time":1553048114000},{"reid":1,"uid":4,"type":false,"time":1551764620000},{"reid":1,"uid":4,"type":true,"time":1554010969000}],"comments":[{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[{"mid":1,"mmid":1,"puid":2,"reid":1,"ruid":1,"context":"回复第一条评论，这是一条超长评论，啦啦啦啦啦啦啦啦","createTime":1551363434000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":false},{"mid":7,"mmid":1,"puid":2,"reid":1,"ruid":1,"context":"test","createTime":1551405225000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":false},{"mid":12,"mmid":1,"puid":4,"reid":1,"ruid":1,"context":"我是003","createTime":1551669384000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true}],"delete":false},{"mid":3,"reid":1,"puid":1,"createTime":1551418344000,"context":"第三条评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[{"mid":13,"mmid":3,"puid":4,"reid":1,"ruid":1,"context":"看着很棒喔","createTime":1551676449000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"comment":{"mid":3,"reid":1,"puid":1,"createTime":1551418344000,"context":"第三条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true},{"mid":21,"mmid":3,"puid":4,"reid":1,"ruid":1,"context":"哈哈","createTime":1553853861000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"comment":{"mid":3,"reid":1,"puid":1,"createTime":1551418344000,"context":"第三条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true}],"delete":false},{"mid":4,"reid":1,"puid":1,"createTime":1551366961000,"context":"第三条评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[{"mid":14,"mmid":4,"puid":4,"reid":1,"ruid":1,"context":"看着很棒","createTime":1551676486000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"comment":{"mid":4,"reid":1,"puid":1,"createTime":1551366961000,"context":"第三条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true}],"delete":false},{"mid":5,"reid":1,"puid":1,"createTime":1551403136000,"context":"No.4：今天是2019年3月1日","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[],"delete":false},{"mid":6,"reid":1,"puid":1,"createTime":1551428819000,"context":"啦啦啦","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[],"delete":false},{"mid":7,"reid":1,"puid":1,"createTime":1551429078000,"context":"哈哈","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[],"delete":false},{"mid":8,"reid":1,"puid":1,"createTime":1551429079000,"context":"哈哈","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[],"delete":false},{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[{"mid":8,"mmid":9,"puid":2,"reid":1,"ruid":1,"context":"3.3 19:42","createTime":1551613446000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"comment":{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true},{"mid":15,"mmid":9,"puid":4,"reid":1,"ruid":1,"context":"很棒棒哦","createTime":1551676543000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"comment":{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":false}],"delete":false},{"mid":10,"reid":1,"puid":1,"createTime":1551531101000,"context":"3.2日测试评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[{"mid":9,"mmid":10,"puid":2,"reid":1,"ruid":1,"context":"哈哈","createTime":1551613534000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"comment":{"mid":10,"reid":1,"puid":1,"createTime":1551531101000,"context":"3.2日测试评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true}],"delete":false},{"mid":11,"reid":1,"puid":1,"createTime":1551576718000,"context":"3.3","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[{"mid":16,"mmid":11,"puid":1,"reid":1,"ruid":1,"context":"啦啦啦","createTime":1551778209000,"type":2,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"comment":{"mid":11,"reid":1,"puid":1,"createTime":1551576718000,"context":"3.3","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true}],"delete":false},{"mid":2,"reid":1,"puid":2,"createTime":1551363363000,"context":"第二条评论","type":1,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"commentReplies":[{"mid":2,"mmid":2,"puid":1,"reid":1,"ruid":2,"context":"1号评论2号","createTime":1551403349000,"type":2,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"comment":{"mid":2,"reid":1,"puid":2,"createTime":1551363363000,"context":"第二条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true}],"delete":false},{"mid":12,"reid":1,"puid":4,"createTime":1551599094000,"context":"啦啦","type":1,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"commentReplies":[],"delete":false},{"mid":14,"reid":1,"puid":4,"createTime":1551676532000,"context":"很棒喔","type":1,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"commentReplies":[{"mid":18,"mmid":14,"puid":2,"reid":1,"ruid":4,"context":"哈哈","createTime":1553048124000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"comment":{"mid":14,"reid":1,"puid":4,"createTime":1551676532000,"context":"很棒喔","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true},{"mid":19,"mmid":14,"puid":2,"reid":1,"ruid":4,"context":"哈哈","createTime":1553048125000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"comment":{"mid":14,"reid":1,"puid":4,"createTime":1551676532000,"context":"很棒喔","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true}],"delete":false},{"mid":16,"reid":1,"puid":4,"createTime":1551709996000,"context":"测试","type":1,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"commentReplies":[],"delete":false},{"mid":17,"reid":1,"puid":4,"createTime":1551711347000,"context":"测试","type":1,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"commentReplies":[],"delete":false}]},{"reid":2,"uid":1,"title":"牛奶绣球面包","score":9,"ings":"金像高筋面粉 190克\n中筋面粉 30克\n牛奶 110克\n蛋清 1个\n白糖 30克\n黄油 25克\n鲜酵母 8克\n盐 1/4茶匙\n鲜蛋黄 1个\n熟植物油 适量\n","image":"http://192.168.137.1:8080/image/2.jpg","visiteds":83,"collects":0,"likes":0,"tags":"烘焙 \n儿童 \n面包 \n下午茶 \n快餐 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"stepsList":[{"stepId":1,"reid":2,"steps":"1主料中除黄油外全部放入盆中，揉搓至面团能拉出粗膜。","stepImgs":"2-1.jpg"},{"stepId":2,"reid":2,"steps":"2放入室温已经软化切成小块的黄油，继续揉搓至面团完全扩展阶段，可以拉出透明的薄膜。","stepImgs":"2-2.jpg"},{"stepId":3,"reid":2,"steps":"3面团加盖饧发至原体积2-3倍大。","stepImgs":"2-3.jpg"},{"stepId":4,"reid":2,"steps":"4把面团分割成18等份，每个重约23克。","stepImgs":"2-4.jpg"},{"stepId":5,"reid":2,"steps":"5分别滚圆，加盖饧10分钟。","stepImgs":"2-5.jpg"},{"stepId":6,"reid":2,"steps":"6取一个剂子，擀成长舌形。","stepImgs":"2-6.jpg"},{"stepId":7,"reid":2,"steps":"7翻面后从一端卷起，另一端压薄后卷成卷。","stepImgs":"2-7.jpg"},{"stepId":8,"reid":2,"steps":"8所有的剂子都卷好，加盖饧10分钟。","stepImgs":"2-8.jpg"},{"stepId":9,"reid":2,"steps":"9取2个面卷，搓成直径约7-8毫米的条。","stepImgs":"2-9.jpg"},{"stepId":10,"reid":2,"steps":"10两个条交叉勾起来。","stepImgs":"2-10.jpg"},{"stepId":11,"reid":2,"steps":"11中间2根先交叉。","stepImgs":"2-11.jpg"},{"stepId":12,"reid":2,"steps":"12左右2根再交叉。","stepImgs":"2-12.jpg"},{"stepId":13,"reid":2,"steps":"13重复步骤11、12，编成4股辫子。","stepImgs":"2-13.jpg"},{"stepId":14,"reid":2,"steps":"14把辫子翻过来，表面刷一层水。","stepImgs":"2-14.jpg"},{"stepId":15,"reid":2,"steps":"15由细的一端开始卷起来。","stepImgs":"2-15.jpg"},{"stepId":16,"reid":2,"steps":"16接口处捏紧，整形。","stepImgs":"2-16.jpg"},{"stepId":17,"reid":2,"steps":"17做好的绣球包生坯放到烤盘中。","stepImgs":"2-17.jpg"},{"stepId":18,"reid":2,"steps":"18加盖饧发到原体积1倍大。","stepImgs":"2-18.jpg"},{"stepId":19,"reid":2,"steps":"19表面刷薄薄一层蛋黄液。","stepImgs":"2-19.jpg"},{"stepId":20,"reid":2,"steps":"20放入已预热的烤箱，上下火165度烤大约10分钟。","stepImgs":"2-20.jpg"},{"stepId":21,"reid":2,"steps":"21表面上色后盖锡纸，再烤15分钟（如果烤箱有循环风功能可以这时开启）。","stepImgs":"2-21.jpg"},{"stepId":22,"reid":2,"steps":"22取出烤好的绣球包，表面刷一层熟植物油或融化的黄油即可。","stepImgs":"2-22.jpg"}],"viewLogs":[{"vid":8,"uid":1,"reid":2,"viewTime":1554272646000,"preferDegree":1,"visitTime":0,"visitedTimes":23,"comment":null},{"vid":36,"uid":2,"reid":2,"viewTime":1553514115000,"preferDegree":1,"visitTime":0,"visitedTimes":32,"comment":null},{"vid":33,"uid":4,"reid":2,"viewTime":1554003498000,"preferDegree":1,"visitTime":0,"visitedTimes":101,"comment":null}],"recipeTypes":[{"typeId":1,"reid":2,"types":{"typeId":1,"typeName":"热菜"}},{"typeId":2,"reid":2,"types":{"typeId":2,"typeName":"家常菜"}},{"typeId":6,"reid":2,"types":{"typeId":6,"typeName":"晚餐"}},{"typeId":7,"reid":2,"types":{"typeId":7,"typeName":"儿童"}}],"recipeTags":[{"reid":2,"tagId":1,"tags":{"tagId":1,"tagName":"咸"}},{"reid":2,"tagId":2,"tags":{"tagId":2,"tagName":"甜"}},{"reid":2,"tagId":7,"tags":{"tagId":7,"tagName":"炒"}}],"userCollects":[{"reid":2,"uid":1,"type":false,"time":1551747301000},{"reid":2,"uid":2,"type":false,"time":1552890770000},{"reid":2,"uid":2,"type":true,"time":1552896312000},{"reid":2,"uid":4,"type":false,"time":1553841812000},{"reid":2,"uid":4,"type":true,"time":1552890697000}],"comments":[{"mid":15,"reid":2,"puid":2,"createTime":1551683239000,"context":"首评","type":1,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"commentReplies":[{"mid":17,"mmid":15,"puid":4,"reid":2,"ruid":2,"context":"哈哈","createTime":1552881024000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"comment":{"mid":15,"reid":2,"puid":2,"createTime":1551683239000,"context":"首评","type":1,"recipe":{"reid":2,"uid":1,"title":"牛奶绣球面包","score":9,"ings":"金像高筋面粉 190克\n中筋面粉 30克\n牛奶 110克\n蛋清 1个\n白糖 30克\n黄油 25克\n鲜酵母 8克\n盐 1/4茶匙\n鲜蛋黄 1个\n熟植物油 适量\n","image":"http://192.168.137.1:8080/image/2.jpg","visiteds":83,"collects":0,"likes":0,"tags":"烘焙 \n儿童 \n面包 \n下午茶 \n快餐 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":false}],"delete":false},{"mid":18,"reid":2,"puid":4,"createTime":1553842203000,"context":"哈哈","type":1,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"commentReplies":[],"delete":false}]},{"reid":3,"uid":2,"title":"【蜜豆牛奶面包】------充满阳光的早晨","score":8,"ings":"高粉 200克\n发酵粉 3克\n牛奶 100克\n绵白糖 30克\n鸡蛋 30克\n盐 1克\n黄油 35克\n粗砂糖 1大勺\n","image":"http://192.168.137.1:8080/image/3.jpg","visiteds":33,"collects":0,"likes":0,"tags":"烘焙 \n儿童 \n老人 \n面包 \n早餐 \n","intro":"","userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"stepsList":[{"stepId":1,"reid":3,"steps":"1准备好上述所需食材；","stepImgs":"3-1.jpg"},{"stepId":2,"reid":3,"steps":"2除黄油以外的食材放入面包机，启动和面程序；第一个和面程序结束后，加入黄油，再次启动和面程序；","stepImgs":"3-2.jpg"},{"stepId":3,"reid":3,"steps":"3去掉面包机内的搅拌浆，面团收圆，发酵至两倍大；","stepImgs":"3-3.jpg"},{"stepId":4,"reid":3,"steps":"4取出排次，分成均匀的六个面团，松驰15分钟；","stepImgs":"3-4.jpg"},{"stepId":5,"reid":3,"steps":"5将面团擀成椭圆形；","stepImgs":"3-5.jpg"},{"stepId":6,"reid":3,"steps":"6在椭圆形面片的上端加入蜜红豆；","stepImgs":"3-6.jpg"},{"stepId":7,"reid":3,"steps":"7由上至下双手卷起；","stepImgs":"3-7.jpg"},{"stepId":8,"reid":3,"steps":"8卷好后，反面捏紧收口；","stepImgs":"3-8.jpg"},{"stepId":9,"reid":3,"steps":"9发酵至两倍大后，刷上全蛋液，用剪刀剪出口子；","stepImgs":"3-9.jpg"},{"stepId":10,"reid":3,"steps":"10撒上粗砂糖，烤箱预热200度，烤至18-20分钟即可；","stepImgs":"3-10.jpg"}],"viewLogs":[{"vid":9,"uid":1,"reid":3,"viewTime":1554272650000,"preferDegree":1,"visitTime":0,"visitedTimes":22,"comment":null},{"vid":53,"uid":2,"reid":3,"viewTime":1553513371000,"preferDegree":1,"visitTime":0,"visitedTimes":13,"comment":null},{"vid":38,"uid":4,"reid":3,"viewTime":1554011312000,"preferDegree":1,"visitTime":0,"visitedTimes":44,"comment":null}],"recipeTypes":[{"typeId":3,"reid":3,"types":{"typeId":3,"typeName":"早餐"}},{"typeId":11,"reid":3,"types":{"typeId":11,"typeName":"甜品"}}],"recipeTags":[{"reid":3,"tagId":2,"tags":{"tagId":2,"tagName":"甜"}},{"reid":3,"tagId":5,"tags":{"tagId":5,"tagName":"烘焙"}}],"userCollects":[{"reid":3,"uid":1,"type":false,"time":1551783268000},{"reid":3,"uid":2,"type":false,"time":1552890784000},{"reid":3,"uid":4,"type":true,"time":1553515131000}],"comments":[{"mid":13,"reid":3,"puid":4,"createTime":1551613601000,"context":"沙发","type":1,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"commentReplies":[{"mid":10,"mmid":13,"puid":2,"reid":3,"ruid":4,"context":"up","createTime":1551613613000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"comment":{"mid":13,"reid":3,"puid":4,"createTime":1551613601000,"context":"沙发","type":1,"recipe":{"reid":3,"uid":2,"title":"【蜜豆牛奶面包】------充满阳光的早晨","score":8,"ings":"高粉 200克\n发酵粉 3克\n牛奶 100克\n绵白糖 30克\n鸡蛋 30克\n盐 1克\n黄油 35克\n粗砂糖 1大勺\n","image":"http://192.168.137.1:8080/image/3.jpg","visiteds":33,"collects":0,"likes":0,"tags":"烘焙 \n儿童 \n老人 \n面包 \n早餐 \n","intro":"","userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"}},"delete":false},"delete":false,"show":false},{"mid":20,"mmid":13,"puid":4,"reid":3,"ruid":4,"context":"喜欢这个哦","createTime":1553084529000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"comment":{"mid":13,"reid":3,"puid":4,"createTime":1551613601000,"context":"沙发","type":1,"recipe":{"reid":3,"uid":2,"title":"【蜜豆牛奶面包】------充满阳光的早晨","score":8,"ings":"高粉 200克\n发酵粉 3克\n牛奶 100克\n绵白糖 30克\n鸡蛋 30克\n盐 1克\n黄油 35克\n粗砂糖 1大勺\n","image":"http://192.168.137.1:8080/image/3.jpg","visiteds":33,"collects":0,"likes":0,"tags":"烘焙 \n儿童 \n老人 \n面包 \n早餐 \n","intro":"","userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"}},"delete":false},"delete":false,"show":true}],"delete":false}]},{"reid":19,"uid":1,"title":"章鱼烧【可乐饼版】","score":0,"ings":"马铃薯 300克\n小章鱼 100克\n鸡蛋 1个\n底筋没粉 适量\n面包糠 适量\n幼盐 少许\n黑胡椒粉 少许\n青海苔 适量\n柴鱼片 适量\n照烧酱 适量\n","image":"http://192.168.137.1:8080/image/19.jpg","visiteds":1,"collects":0,"likes":0,"tags":"小吃 \n日本料理 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"stepsList":[{"stepId":1,"reid":19,"steps":"1章鱼烧的简单材料。","stepImgs":"19-1.jpg"},{"stepId":2,"reid":19,"steps":"2马铃薯捎皮，切薄片放蒸锅里蒸熟。","stepImgs":"19-2.jpg"},{"stepId":3,"reid":19,"steps":"3鸡蛋打散，面粉和面包糠各自放较大的盘备用。","stepImgs":"19-3.jpg"},{"stepId":4,"reid":19,"steps":"4小章鱼洗净，放进滚开的热水中川烫片刻捞起。","stepImgs":"19-4.jpg"},{"stepId":5,"reid":19,"steps":"5把小章鱼切成幼小粒状。","stepImgs":"19-5.jpg"},{"stepId":6,"reid":19,"steps":"6把蒸熟的马铃薯用叉子压成泥。","stepImgs":"19-6.jpg"},{"stepId":7,"reid":19,"steps":"7放进章鱼粒，幼盐和黑胡椒粉。","stepImgs":"19-7.jpg"},{"stepId":8,"reid":19,"steps":"8把它们拌匀好成薯泥备用。","stepImgs":"19-8.jpg"},{"stepId":9,"reid":19,"steps":"9戴一次性手套抹一点油，用小汤匙拿一汤匙薯泥放掌心搓圆。","stepImgs":"19-9.jpg"},{"stepId":10,"reid":19,"steps":"10把薯泥先裹上一层底筋面粉。","stepImgs":"19-10.jpg"},{"stepId":11,"reid":19,"steps":"11再沾上一层鸡蛋液。","stepImgs":"19-11.jpg"},{"stepId":12,"reid":19,"steps":"12放进面包糠中裹满面包糠。","stepImgs":"19-12.jpg"},{"stepId":13,"reid":19,"steps":"136,7成热的油，炸至金黄色即可。","stepImgs":"19-13.jpg"},{"stepId":14,"reid":19,"steps":"14美味的【可乐版章鱼烧】","stepImgs":"19-14.jpg"},{"stepId":15,"reid":19,"steps":"15装饰下，先挤上少许沙拉酱。","stepImgs":"19-15.jpg"},{"stepId":16,"reid":19,"steps":"16再倒少许照烧酱，柴鱼片，青海苔。","stepImgs":"19-16.jpg"},{"stepId":17,"reid":19,"steps":"17我来咯，山寨版章鱼烧！","stepImgs":"19-17.jpg"},{"stepId":18,"reid":19,"steps":"18照烧酱的做法请看小贴士。","stepImgs":"19-18.jpg"}],"viewLogs":[{"vid":92,"uid":1,"reid":19,"viewTime":1554123107000,"preferDegree":1,"visitTime":0,"visitedTimes":1,"comment":null}],"recipeTypes":[],"recipeTags":[],"userCollects":[{"reid":19,"uid":1,"type":false,"time":1553049254000}],"comments":[]},{"reid":20,"uid":1,"title":"年年有余：水煮鱼","score":0,"ings":"草鱼 适量\n黄豆芽 适量\n鸡蛋清 适量\n姜 适量\n蒜 适量\n郫县豆瓣酱 适量\n辣椒若干 适量\n花椒适量 适量\n盐 适量\n淀粉 适量\n料酒 适量\n","image":"http://192.168.137.1:8080/image/20.jpg","visiteds":13,"collects":0,"likes":0,"tags":"热菜 \n老人 \n川菜 \n冬季食谱 \n午餐 \n名菜 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"stepsList":[{"stepId":1,"reid":20,"steps":"1材料：草鱼、黄豆芽调味：鸡蛋清、姜、蒜、郫县豆瓣酱、辣椒若干、花椒适量、盐、淀粉、料酒。","stepImgs":"20-1.jpg"},{"stepId":2,"reid":20,"steps":"2将草鱼去腮、内脏处理干净。","stepImgs":"20-2.jpg"},{"stepId":3,"reid":20,"steps":"3切下头、尾留用，沿中间鱼骨将鱼肉片成两片。","stepImgs":"20-3.jpg"},{"stepId":4,"reid":20,"steps":"4鱼皮朝下，斜刀切除鱼身的大刺片，再切成薄厚适中的鱼片。","stepImgs":"20-4.jpg"},{"stepId":5,"reid":20,"steps":"5鱼皮朝下，斜刀切除鱼身的大刺片，再切成薄厚适中的鱼片。","stepImgs":"20-5.jpg"},{"stepId":6,"reid":20,"steps":"6姜、蒜切片，干辣椒掰成小段。","stepImgs":"20-6.jpg"},{"stepId":7,"reid":20,"steps":"7鱼片中倒入一个蛋清，加盐、料酒、淀粉抓匀后腌制20分钟。","stepImgs":"20-7.jpg"},{"stepId":8,"reid":20,"steps":"8黄豆芽掐根部，洗净备用。","stepImgs":"20-8.jpg"},{"stepId":9,"reid":20,"steps":"9黄豆芽入加入少许盐的清水中煮至软、至熟捞出。","stepImgs":"20-9.jpg"},{"stepId":10,"reid":20,"steps":"10铺在装水煮鱼的容器底部。","stepImgs":"20-10.jpg"},{"stepId":11,"reid":20,"steps":"11锅置火上倒入油，下花椒慢炸约2分钟。","stepImgs":"20-11.jpg"},{"stepId":12,"reid":20,"steps":"12倒入干辣椒和豆瓣酱，炒出香味和红油。","stepImgs":"20-12.jpg"},{"stepId":13,"reid":20,"steps":"13待辣椒变色，捞出一半的花椒、辣椒待用；将蒜片和姜倒入锅中，炒出香味。","stepImgs":"20-13.jpg"},{"stepId":14,"reid":20,"steps":"14倒入鱼头、尾、鱼骨炒匀。","stepImgs":"20-14.jpg"},{"stepId":15,"reid":20,"steps":"15加入适量热水，没过鱼即可。","stepImgs":"20-15.jpg"},{"stepId":16,"reid":20,"steps":"16水沸后，将鱼片一片片放入锅中，并用筷子轻轻搅散。","stepImgs":"20-16.jpg"},{"stepId":17,"reid":20,"steps":"17煮到鱼片变色至熟，约1~2分钟，即可。","stepImgs":"20-17.jpg"},{"stepId":18,"reid":20,"steps":"18将锅中的鱼片、鱼汤倒入铺好豆芽的碗中。","stepImgs":"20-18.jpg"},{"stepId":19,"reid":20,"steps":"19将事先盛出的花椒、辣椒铺于碗中，淋入热油即可。","stepImgs":"20-19.jpg"}],"viewLogs":[{"vid":65,"uid":4,"reid":20,"viewTime":1553855148000,"preferDegree":1,"visitTime":0,"visitedTimes":10,"comment":null},{"vid":97,"uid":1,"reid":20,"viewTime":1554271120000,"preferDegree":1,"visitTime":0,"visitedTimes":2,"comment":null}],"recipeTypes":[],"recipeTags":[],"userCollects":[{"reid":20,"uid":1,"type":false,"time":1553049256000},{"reid":20,"uid":4,"type":false,"time":1553086145000}],"comments":[]},{"reid":28,"uid":2,"title":"榴莲千层蛋糕","score":0,"ings":"低筋面粉 120克\n榴莲肉 3块\n鸡蛋 2个\n牛奶 380克\n淡奶油 200克\n糖粉 45克\n黄油 20克\n","image":"http://192.168.137.1:8080/image/28.jpg","visiteds":12,"collects":0,"likes":0,"tags":"烘焙 \n蛋糕 \n","intro":"","userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"stepsList":[{"stepId":1,"reid":28,"steps":"1所有材料准备好","stepImgs":"28-1.jpg"},{"stepId":2,"reid":28,"steps":"2鸡蛋打散","stepImgs":"28-2.jpg"},{"stepId":3,"reid":28,"steps":"3加入牛奶","stepImgs":"28-3.jpg"},{"stepId":4,"reid":28,"steps":"4糖粉、融化的黄油","stepImgs":"28-4.jpg"},{"stepId":5,"reid":28,"steps":"5搅拌均匀","stepImgs":"28-5.jpg"},{"stepId":6,"reid":28,"steps":"6筛入低筋面粉","stepImgs":"28-6.jpg"},{"stepId":7,"reid":28,"steps":"7用手动打蛋器搅匀看到没有没有干粉颗粒就可以了，放冰箱冷藏30分钟。","stepImgs":"28-7.jpg"},{"stepId":8,"reid":28,"steps":"8榴莲去掉里面的核","stepImgs":"28-8.jpg"},{"stepId":9,"reid":28,"steps":"9用勺子碾碎成酱状，越细发越好，免得后来抹不平整。","stepImgs":"28-9.jpg"},{"stepId":10,"reid":28,"steps":"10冰箱取出冷藏好的面糊看状态比之前要细腻浓稠了许多","stepImgs":"28-10.jpg"},{"stepId":11,"reid":28,"steps":"11不粘锅用小火加热，舀一勺面糊放在锅里端起锅顺势转一圈，摊成一个蛋饼。","stepImgs":"28-11.jpg"},{"stepId":12,"reid":28,"steps":"12鼓泡就可以起锅取出了，放在干净的盘子里。全部烙好的饼皮放在冰箱或者其他凉爽的地方降温待用。","stepImgs":"28-12.jpg"},{"stepId":13,"reid":28,"steps":"13淡奶油打发，我打的稍硬些","stepImgs":"28-13.jpg"},{"stepId":14,"reid":28,"steps":"14将榴莲放入","stepImgs":"28-14.jpg"},{"stepId":15,"reid":28,"steps":"15搅拌均匀淡奶油打的干一点，与淡奶油拌合后稠度刚好，榴莲奶油夹馅就做好了。","stepImgs":"28-15.jpg"},{"stepId":16,"reid":28,"steps":"16取一个大些的平盘，最底层放上两张饼皮，抹上一层榴莲奶油馅","stepImgs":"28-16.jpg"},{"stepId":17,"reid":28,"steps":"17再放上一张饼皮，以此法操作一直到完成所有的材料，蛋糕就做好了。","stepImgs":"28-17.jpg"},{"stepId":18,"reid":28,"steps":"18做好的千层榴莲蛋糕盖保鲜膜放冰箱冷藏2个小时后再切块食用味道更好。","stepImgs":"28-18.jpg"},{"stepId":19,"reid":28,"steps":"19成品切块即可食用","stepImgs":"28-19.jpg"}],"viewLogs":[{"vid":93,"uid":1,"reid":28,"viewTime":1554271365000,"preferDegree":1,"visitTime":0,"visitedTimes":8,"comment":null},{"vid":98,"uid":2,"reid":28,"viewTime":1554271248000,"preferDegree":1,"visitTime":0,"visitedTimes":2,"comment":null},{"vid":74,"uid":4,"reid":28,"viewTime":1553823455000,"preferDegree":1,"visitTime":0,"visitedTimes":2,"comment":null}],"recipeTypes":[],"recipeTags":[],"userCollects":[{"reid":28,"uid":1,"type":false,"time":1553059041000},{"reid":28,"uid":1,"type":true,"time":1554124364000}],"comments":[{"mid":20,"reid":28,"puid":1,"createTime":1554271143000,"context":"看着很不错哟","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[{"mid":22,"mmid":20,"puid":2,"reid":28,"ruid":1,"context":"谢谢","createTime":1554271246000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"comment":{"mid":20,"reid":28,"puid":1,"createTime":1554271143000,"context":"看着很不错哟","type":1,"recipe":{"reid":28,"uid":2,"title":"榴莲千层蛋糕","score":0,"ings":"低筋面粉 120克\n榴莲肉 3块\n鸡蛋 2个\n牛奶 380克\n淡奶油 200克\n糖粉 45克\n黄油 20克\n","image":"http://192.168.137.1:8080/image/28.jpg","visiteds":12,"collects":0,"likes":0,"tags":"烘焙 \n蛋糕 \n","intro":"","userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"}},"delete":false},"delete":false,"show":true}],"delete":false}]},{"reid":29,"uid":4,"title":"巧克力慕斯蛋糕","score":0,"ings":"蛋黄 60克\n蛋白 150克\n全蛋 一个\n植物油 60毫升\n柠檬汁 40毫升\n盐 少许\n细砂糖 20克+90克\n低筋面粉 65克\n可可粉 30克\n玉米淀粉 8克\n白醋 5毫升\n淡奶油 250毫升\n纯牛奶 100毫升\n黑巧克力 90克\n可可粉 20克\n糖 80克\n柠檬汁 少许\n鱼胶粉 10克\n","image":"http://192.168.137.1:8080/image/29.jpg","visiteds":7,"collects":0,"likes":0,"tags":"烘焙 \n儿童 \n蛋糕 \n下午茶 \n","intro":"","userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"stepsList":[{"stepId":1,"reid":29,"steps":"1先来做一个可可戚风蛋糕底：将蛋黄打匀。","stepImgs":"29-1.jpg"},{"stepId":2,"reid":29,"steps":"2加入柠檬汁、色拉油、少许盐，加入过筛两次的可可粉，拌匀。","stepImgs":"29-2.jpg"},{"stepId":3,"reid":29,"steps":"33、再筛入低粉。","stepImgs":"29-3.jpg"},{"stepId":4,"reid":29,"steps":"4以不规则的方式搅拌均匀（注意不要划圈哦），可可蛋黄糊就做好了。","stepImgs":"29-4.jpg"},{"stepId":5,"reid":29,"steps":"5蛋白分三次加入90克糖，打至硬性发泡；此时烤箱150度预热。","stepImgs":"29-5.jpg"},{"stepId":6,"reid":29,"steps":"61/3 蛋白糊倒入可可蛋黄糊中，像炒菜那样上下翻拌匀。","stepImgs":"29-6.jpg"},{"stepId":7,"reid":29,"steps":"7将拌好的面糊倒入剩余的蛋白中，拌匀后倒入模具中，烤箱中层，150度30分钟，170度烤30分钟，烤好后立即出炉倒扣冷却30分钟即可脱模。","stepImgs":"29-7.jpg"},{"stepId":8,"reid":29,"steps":"8烤好的可可戚风依据慕斯模的大小裁剪好，横切成两片，先铺一片到底层。","stepImgs":"29-8.jpg"},{"stepId":9,"reid":29,"steps":"9淡奶油打至六分发，放冰箱冷藏备用。","stepImgs":"29-9.jpg"},{"stepId":10,"reid":29,"steps":"10牛奶、柠檬汁、鱼胶粉和过筛两次的可可粉混合均匀，用小火加热至80度，冷却备用。","stepImgs":"29-10.jpg"},{"stepId":11,"reid":29,"steps":"11隔水溶解黑巧克力，用叉子压成巧克力浆。","stepImgs":"29-11.jpg"},{"stepId":12,"reid":29,"steps":"12将牛奶鱼胶粉溶液与巧克力溶液混合搅拌均匀，冷却至不烫手即可。","stepImgs":"29-12.jpg"},{"stepId":13,"reid":29,"steps":"13与打发的淡奶油混合。","stepImgs":"29-13.jpg"},{"stepId":14,"reid":29,"steps":"14搅拌均匀，巧克力慕斯馅就做好了。","stepImgs":"29-14.jpg"},{"stepId":15,"reid":29,"steps":"15倒一半慕斯入慕斯模，再铺一层蛋糕，再将剩余的慕斯馅全部倒入，放入冰箱冷藏6个小时即可。","stepImgs":"29-15.jpg"}],"viewLogs":[{"vid":72,"uid":1,"reid":29,"viewTime":1554271122000,"preferDegree":1,"visitTime":0,"visitedTimes":4,"comment":null},{"vid":63,"uid":2,"reid":29,"viewTime":1553001275000,"preferDegree":1,"visitTime":0,"visitedTimes":1,"comment":null},{"vid":76,"uid":4,"reid":29,"viewTime":1554271194000,"preferDegree":1,"visitTime":0,"visitedTimes":3,"comment":null}],"recipeTypes":[],"recipeTags":[],"userCollects":[{"reid":29,"uid":1,"type":false,"time":1553059044000},{"reid":29,"uid":1,"type":true,"time":1554021851000},{"reid":29,"uid":4,"type":false,"time":1553087017000}],"comments":[]}]
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
         * title : 柠檬可乐鸡翅
         * score : 8.0
         * ings : 鸡中翅 10个
         可乐 半瓶
         柠檬 1个
         葱 适量
         姜 适量
         酱油 适量
         料酒 适量
         盐 适量
         牙签 适量
         植物油 适量

         * image : http://192.168.137.1:8080/image/1.jpg
         * visiteds : 141
         * collects : 1
         * likes : 0
         * tags : 热菜
         鲁菜
         老人
         宵夜
         朋友聚餐
         冬季食谱

         * intro :
         * userInfo : {"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}
         * stepsList : [{"stepId":1,"reid":1,"steps":"1鸡翅洗净，葱姜切大片，柠檬切两半。","stepImgs":"1-1.jpg"},{"stepId":2,"reid":1,"steps":"2先给洗净的鸡翅用牙签来做个针灸，孔越多越好，方便入味。","stepImgs":"1-2.jpg"},{"stepId":3,"reid":1,"steps":"3扎了孔的鸡翅用酱油，葱姜片，盐，料酒，和适量柠檬汁腌30分钟以上。","stepImgs":"1-3.jpg"},{"stepId":4,"reid":1,"steps":"4然后把腌过的鸡翅入5成油锅炸三四分钟，外皮金黄即可捞出。","stepImgs":"1-4.jpg"},{"stepId":5,"reid":1,"steps":"5炸好的鸡翅和之前腌鸡翅的料再加半瓶可乐一起放入炒锅中大火烧开。","stepImgs":"1-5.jpg"},{"stepId":6,"reid":1,"steps":"6转小火炖。","stepImgs":"1-6.jpg"},{"stepId":7,"reid":1,"steps":"7小火炖至汁快收干时改大火收汁，再挤几滴柠檬汁再鸡翅上即可食用。","stepImgs":"1-7.jpg"},{"stepId":8,"reid":1,"steps":"8出锅装盘。","stepImgs":"1-8.jpg"}]
         * viewLogs : [{"vid":1,"uid":1,"reid":1,"viewTime":1551687847000,"preferDegree":3,"visitTime":0.12,"visitedTimes":12,"comment":"哈哈，很棒"},{"vid":2,"uid":1,"reid":1,"viewTime":1550458220000,"preferDegree":2,"visitTime":0.12,"visitedTimes":1,"comment":null},{"vid":7,"uid":1,"reid":1,"viewTime":1554271099000,"preferDegree":1,"visitTime":0,"visitedTimes":89,"comment":null},{"vid":37,"uid":2,"reid":1,"viewTime":1553514038000,"preferDegree":1,"visitTime":0,"visitedTimes":20,"comment":null},{"vid":32,"uid":4,"reid":1,"viewTime":1554271179000,"preferDegree":1,"visitTime":0,"visitedTimes":106,"comment":null}]
         * recipeTypes : [{"typeId":1,"reid":1,"types":{"typeId":1,"typeName":"热菜"}},{"typeId":2,"reid":1,"types":{"typeId":2,"typeName":"家常菜"}},{"typeId":11,"reid":1,"types":{"typeId":11,"typeName":"甜品"}}]
         * recipeTags : [{"reid":1,"tagId":1,"tags":{"tagId":1,"tagName":"咸"}},{"reid":1,"tagId":2,"tags":{"tagId":2,"tagName":"甜"}},{"reid":1,"tagId":5,"tags":{"tagId":5,"tagName":"烘焙"}}]
         * userCollects : [{"reid":1,"uid":1,"type":false,"time":1551783266000},{"reid":1,"uid":1,"type":true,"time":1554123056000},{"reid":1,"uid":2,"type":false,"time":1553048113000},{"reid":1,"uid":2,"type":true,"time":1553048114000},{"reid":1,"uid":4,"type":false,"time":1551764620000},{"reid":1,"uid":4,"type":true,"time":1554010969000}]
         * comments : [{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[{"mid":1,"mmid":1,"puid":2,"reid":1,"ruid":1,"context":"回复第一条评论，这是一条超长评论，啦啦啦啦啦啦啦啦","createTime":1551363434000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":false},{"mid":7,"mmid":1,"puid":2,"reid":1,"ruid":1,"context":"test","createTime":1551405225000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":false},{"mid":12,"mmid":1,"puid":4,"reid":1,"ruid":1,"context":"我是003","createTime":1551669384000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true}],"delete":false},{"mid":3,"reid":1,"puid":1,"createTime":1551418344000,"context":"第三条评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[{"mid":13,"mmid":3,"puid":4,"reid":1,"ruid":1,"context":"看着很棒喔","createTime":1551676449000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"comment":{"mid":3,"reid":1,"puid":1,"createTime":1551418344000,"context":"第三条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true},{"mid":21,"mmid":3,"puid":4,"reid":1,"ruid":1,"context":"哈哈","createTime":1553853861000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"comment":{"mid":3,"reid":1,"puid":1,"createTime":1551418344000,"context":"第三条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true}],"delete":false},{"mid":4,"reid":1,"puid":1,"createTime":1551366961000,"context":"第三条评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[{"mid":14,"mmid":4,"puid":4,"reid":1,"ruid":1,"context":"看着很棒","createTime":1551676486000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"comment":{"mid":4,"reid":1,"puid":1,"createTime":1551366961000,"context":"第三条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true}],"delete":false},{"mid":5,"reid":1,"puid":1,"createTime":1551403136000,"context":"No.4：今天是2019年3月1日","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[],"delete":false},{"mid":6,"reid":1,"puid":1,"createTime":1551428819000,"context":"啦啦啦","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[],"delete":false},{"mid":7,"reid":1,"puid":1,"createTime":1551429078000,"context":"哈哈","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[],"delete":false},{"mid":8,"reid":1,"puid":1,"createTime":1551429079000,"context":"哈哈","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[],"delete":false},{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[{"mid":8,"mmid":9,"puid":2,"reid":1,"ruid":1,"context":"3.3 19:42","createTime":1551613446000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"comment":{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true},{"mid":15,"mmid":9,"puid":4,"reid":1,"ruid":1,"context":"很棒棒哦","createTime":1551676543000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"comment":{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":false}],"delete":false},{"mid":10,"reid":1,"puid":1,"createTime":1551531101000,"context":"3.2日测试评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[{"mid":9,"mmid":10,"puid":2,"reid":1,"ruid":1,"context":"哈哈","createTime":1551613534000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"comment":{"mid":10,"reid":1,"puid":1,"createTime":1551531101000,"context":"3.2日测试评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true}],"delete":false},{"mid":11,"reid":1,"puid":1,"createTime":1551576718000,"context":"3.3","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"commentReplies":[{"mid":16,"mmid":11,"puid":1,"reid":1,"ruid":1,"context":"啦啦啦","createTime":1551778209000,"type":2,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"comment":{"mid":11,"reid":1,"puid":1,"createTime":1551576718000,"context":"3.3","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true}],"delete":false},{"mid":2,"reid":1,"puid":2,"createTime":1551363363000,"context":"第二条评论","type":1,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"commentReplies":[{"mid":2,"mmid":2,"puid":1,"reid":1,"ruid":2,"context":"1号评论2号","createTime":1551403349000,"type":2,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"},"comment":{"mid":2,"reid":1,"puid":2,"createTime":1551363363000,"context":"第二条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true}],"delete":false},{"mid":12,"reid":1,"puid":4,"createTime":1551599094000,"context":"啦啦","type":1,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"commentReplies":[],"delete":false},{"mid":14,"reid":1,"puid":4,"createTime":1551676532000,"context":"很棒喔","type":1,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"commentReplies":[{"mid":18,"mmid":14,"puid":2,"reid":1,"ruid":4,"context":"哈哈","createTime":1553048124000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"comment":{"mid":14,"reid":1,"puid":4,"createTime":1551676532000,"context":"很棒喔","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true},{"mid":19,"mmid":14,"puid":2,"reid":1,"ruid":4,"context":"哈哈","createTime":1553048125000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"comment":{"mid":14,"reid":1,"puid":4,"createTime":1551676532000,"context":"很棒喔","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true}],"delete":false},{"mid":16,"reid":1,"puid":4,"createTime":1551709996000,"context":"测试","type":1,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"commentReplies":[],"delete":false},{"mid":17,"reid":1,"puid":4,"createTime":1551711347000,"context":"测试","type":1,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"commentReplies":[],"delete":false}]
         */

        private int reid;
        private int uid;
        private String title;
        private double score;
        private String ings;
        private String image;
        private int visiteds;
        private int collects;
        private int likes;
        private String tags;
        private String intro;
        private UserInfoBean userInfo;
        private List<StepsListBean> stepsList;
        private List<ViewLogsBean> viewLogs;
        private List<RecipeTypesBean> recipeTypes;
        private List<RecipeTagsBean> recipeTags;
        private List<UserCollectsBean> userCollects;
        private List<CommentsBean> comments;

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

        public UserInfoBean getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(UserInfoBean userInfo) {
            this.userInfo = userInfo;
        }

        public List<StepsListBean> getStepsList() {
            return stepsList;
        }

        public void setStepsList(List<StepsListBean> stepsList) {
            this.stepsList = stepsList;
        }

        public List<ViewLogsBean> getViewLogs() {
            return viewLogs;
        }

        public void setViewLogs(List<ViewLogsBean> viewLogs) {
            this.viewLogs = viewLogs;
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

        public static class UserInfoBean {
            /**
             * uid : 1
             * userName : apple
             * age : 23
             * sex : 2
             * intro : 白天不懂夜的黑
             * location : 成都
             * image : 001.jpg
             * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s
             * password : 001
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
        }

        public static class StepsListBean {
            /**
             * stepId : 1
             * reid : 1
             * steps : 1鸡翅洗净，葱姜切大片，柠檬切两半。
             * stepImgs : 1-1.jpg
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

        public static class RecipeTypesBean {
            /**
             * typeId : 1
             * reid : 1
             * types : {"typeId":1,"typeName":"热菜"}
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
                 * typeName : 热菜
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
             * tags : {"tagId":1,"tagName":"咸"}
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
             * userInfo : {"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}
             * commentReplies : [{"mid":1,"mmid":1,"puid":2,"reid":1,"ruid":1,"context":"回复第一条评论，这是一条超长评论，啦啦啦啦啦啦啦啦","createTime":1551363434000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":false},{"mid":7,"mmid":1,"puid":2,"reid":1,"ruid":1,"context":"test","createTime":1551405225000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":false},{"mid":12,"mmid":1,"puid":4,"reid":1,"ruid":1,"context":"我是003","createTime":1551669384000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1NDM1NzU2MCwiaWF0IjoxNTU0MjcxMTYwfQ.QbrnmWsQ3oye3RR2tbZQvPCoLtMC_ZI9I-Xieq3rn0k","password":"003"},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false},"delete":false,"show":true}]
             * delete : false
             */

            private int mid;
            private int reid;
            private int puid;
            private long createTime;
            private String context;
            private int type;
            private UserInfoBeanX userInfo;
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

            public UserInfoBeanX getUserInfo() {
                return userInfo;
            }

            public void setUserInfo(UserInfoBeanX userInfo) {
                this.userInfo = userInfo;
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

            public static class UserInfoBeanX {
                /**
                 * uid : 1
                 * userName : apple
                 * age : 23
                 * sex : 2
                 * intro : 白天不懂夜的黑
                 * location : 成都
                 * image : 001.jpg
                 * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s
                 * password : 001
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
                 * userInfo : {"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs","password":"002"}
                 * comment : {"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"recipe":{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}},"delete":false}
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
                private UserInfoBeanXX userInfo;
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

                public UserInfoBeanXX getUserInfo() {
                    return userInfo;
                }

                public void setUserInfo(UserInfoBeanXX userInfo) {
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

                public static class UserInfoBeanXX {
                    /**
                     * uid : 2
                     * userName : wx
                     * age : 21
                     * sex : 1
                     * intro : 白夜
                     * location : 上海
                     * image : 002.jpg
                     * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1NDM1NzYxNCwiaWF0IjoxNTU0MjcxMjE0fQ.jK9L3c1dVwaUi0qiRt0kKtk-qVmvuMFJZ_0r4ySIdZs
                     * password : 002
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
                }

                public static class CommentBean {
                    /**
                     * mid : 1
                     * reid : 1
                     * puid : 1
                     * createTime : 1551363328000
                     * context : 来自小仙女的第一条评论
                     * type : 1
                     * recipe : {"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":141,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}}
                     * delete : false
                     */

                    private int mid;
                    private int reid;
                    private int puid;
                    private long createTime;
                    private String context;
                    private int type;
                    private RecipeBean recipe;
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

                    public RecipeBean getRecipe() {
                        return recipe;
                    }

                    public void setRecipe(RecipeBean recipe) {
                        this.recipe = recipe;
                    }

                    public boolean isDelete() {
                        return delete;
                    }

                    public void setDelete(boolean delete) {
                        this.delete = delete;
                    }

                    public static class RecipeBean {
                        /**
                         * reid : 1
                         * uid : 1
                         * title : 柠檬可乐鸡翅
                         * score : 8.0
                         * ings : 鸡中翅 10个
                         可乐 半瓶
                         柠檬 1个
                         葱 适量
                         姜 适量
                         酱油 适量
                         料酒 适量
                         盐 适量
                         牙签 适量
                         植物油 适量

                         * image : http://192.168.137.1:8080/image/1.jpg
                         * visiteds : 141
                         * collects : 1
                         * likes : 0
                         * tags : 热菜
                         鲁菜
                         老人
                         宵夜
                         朋友聚餐
                         冬季食谱

                         * intro :
                         * userInfo : {"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s","password":"001"}
                         */

                        private int reid;
                        private int uid;
                        private String title;
                        private double score;
                        private String ings;
                        private String image;
                        private int visiteds;
                        private int collects;
                        private int likes;
                        private String tags;
                        private String intro;
                        private UserInfoBeanXXX userInfo;

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

                        public UserInfoBeanXXX getUserInfo() {
                            return userInfo;
                        }

                        public void setUserInfo(UserInfoBeanXXX userInfo) {
                            this.userInfo = userInfo;
                        }

                        public static class UserInfoBeanXXX {
                            /**
                             * uid : 1
                             * userName : apple
                             * age : 23
                             * sex : 2
                             * intro : 白天不懂夜的黑
                             * location : 成都
                             * image : 001.jpg
                             * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1NDM1NzY2OSwiaWF0IjoxNTU0MjcxMjY5fQ.z8QaLt6_4296AD_8h1nNQoiNQ_feGZOj8TM3vkXOd2s
                             * password : 001
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
                        }
                    }
                }
            }
        }
    }
}
