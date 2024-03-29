package com.example.dell.recipebywx.model;

import java.util.List;

/**
 * Created by dell on 2019/2/24.
 */

public class SearchResultModel {
    /**
     * errorCode : 0
     * message : 查询成功
     * success : true
     * data : [{"reid":1,"uid":1,"title":"柠檬可乐鸡翅","score":8,"ings":"鸡中翅 10个\n可乐 半瓶\n柠檬 1个\n葱 适量\n姜 适量\n酱油 适量\n料酒 适量\n盐 适量\n牙签 适量\n植物油 适量\n","image":"http://192.168.137.1:8080/image/1.jpg","visiteds":32,"collects":1,"likes":0,"tags":"热菜 \n鲁菜 \n老人 \n宵夜 \n朋友聚餐 \n冬季食谱 \n","intro":"","userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"stepsList":[{"stepId":1,"reid":1,"steps":"1鸡翅洗净，葱姜切大片，柠檬切两半。","stepImgs":"1-1.jpg"},{"stepId":2,"reid":1,"steps":"2先给洗净的鸡翅用牙签来做个针灸，孔越多越好，方便入味。","stepImgs":"1-2.jpg"},{"stepId":3,"reid":1,"steps":"3扎了孔的鸡翅用酱油，葱姜片，盐，料酒，和适量柠檬汁腌30分钟以上。","stepImgs":"1-3.jpg"},{"stepId":4,"reid":1,"steps":"4然后把腌过的鸡翅入5成油锅炸三四分钟，外皮金黄即可捞出。","stepImgs":"1-4.jpg"},{"stepId":5,"reid":1,"steps":"5炸好的鸡翅和之前腌鸡翅的料再加半瓶可乐一起放入炒锅中大火烧开。","stepImgs":"1-5.jpg"},{"stepId":6,"reid":1,"steps":"6转小火炖。","stepImgs":"1-6.jpg"},{"stepId":7,"reid":1,"steps":"7小火炖至汁快收干时改大火收汁，再挤几滴柠檬汁再鸡翅上即可食用。","stepImgs":"1-7.jpg"},{"stepId":8,"reid":1,"steps":"8出锅装盘。","stepImgs":"1-8.jpg"}],"viewLogs":[{"vid":1,"uid":1,"reid":1,"viewTime":1551687847000,"preferDegree":3,"visitTime":0.12,"visitedTimes":12,"comment":"哈哈，很棒"},{"vid":2,"uid":1,"reid":1,"viewTime":1550458220000,"preferDegree":2,"visitTime":0.12,"visitedTimes":1,"comment":null},{"vid":7,"uid":1,"reid":1,"viewTime":1553514185000,"preferDegree":1,"visitTime":0,"visitedTimes":50,"comment":null},{"vid":37,"uid":2,"reid":1,"viewTime":1553514038000,"preferDegree":1,"visitTime":0,"visitedTimes":20,"comment":null},{"vid":32,"uid":4,"reid":1,"viewTime":1553678276000,"preferDegree":1,"visitTime":0,"visitedTimes":34,"comment":null}],"recipeTypes":[{"typeId":1,"reid":1,"types":{"typeId":1,"typeName":"热菜"}},{"typeId":2,"reid":1,"types":{"typeId":2,"typeName":"家常菜"}},{"typeId":11,"reid":1,"types":{"typeId":11,"typeName":"甜品"}}],"recipeTags":[{"reid":1,"tagId":1,"tags":{"tagId":1,"tagName":"咸"}},{"reid":1,"tagId":2,"tags":{"tagId":2,"tagName":"甜"}},{"reid":1,"tagId":5,"tags":{"tagId":5,"tagName":"烘焙"}}],"userCollects":[{"reid":1,"uid":1,"type":false,"time":1551783266000},{"reid":1,"uid":2,"type":false,"time":1553048113000},{"reid":1,"uid":2,"type":true,"time":1553048114000},{"reid":1,"uid":4,"type":false,"time":1551764620000}],"comments":[{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"commentReplies":[{"mid":1,"mmid":1,"puid":2,"reid":1,"ruid":1,"context":"回复第一条评论，这是一条超长评论，啦啦啦啦啦啦啦啦","createTime":1551363434000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"delete":false},"delete":false,"show":false},{"mid":7,"mmid":1,"puid":2,"reid":1,"ruid":1,"context":"test","createTime":1551405225000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"delete":false},"delete":false,"show":false},{"mid":12,"mmid":1,"puid":4,"reid":1,"ruid":1,"context":"我是003","createTime":1551669384000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1Mzc1NTk4OCwiaWF0IjoxNTUzNjY5NTg4fQ.pLh_2XQ0ac_0_z0HrSDOJvgP7ZXcki8cr2Z-tgpkhdM","password":"003"},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":3,"reid":1,"puid":1,"createTime":1551418344000,"context":"第三条评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"commentReplies":[{"mid":13,"mmid":3,"puid":4,"reid":1,"ruid":1,"context":"看着很棒喔","createTime":1551676449000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1Mzc1NTk4OCwiaWF0IjoxNTUzNjY5NTg4fQ.pLh_2XQ0ac_0_z0HrSDOJvgP7ZXcki8cr2Z-tgpkhdM","password":"003"},"comment":{"mid":3,"reid":1,"puid":1,"createTime":1551418344000,"context":"第三条评论","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":4,"reid":1,"puid":1,"createTime":1551366961000,"context":"第三条评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"commentReplies":[{"mid":14,"mmid":4,"puid":4,"reid":1,"ruid":1,"context":"看着很棒","createTime":1551676486000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1Mzc1NTk4OCwiaWF0IjoxNTUzNjY5NTg4fQ.pLh_2XQ0ac_0_z0HrSDOJvgP7ZXcki8cr2Z-tgpkhdM","password":"003"},"comment":{"mid":4,"reid":1,"puid":1,"createTime":1551366961000,"context":"第三条评论","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":5,"reid":1,"puid":1,"createTime":1551403136000,"context":"No.4：今天是2019年3月1日","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"commentReplies":[],"delete":false},{"mid":6,"reid":1,"puid":1,"createTime":1551428819000,"context":"啦啦啦","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"commentReplies":[],"delete":false},{"mid":7,"reid":1,"puid":1,"createTime":1551429078000,"context":"哈哈","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"commentReplies":[],"delete":false},{"mid":8,"reid":1,"puid":1,"createTime":1551429079000,"context":"哈哈","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"commentReplies":[],"delete":false},{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"commentReplies":[{"mid":8,"mmid":9,"puid":2,"reid":1,"ruid":1,"context":"3.3 19:42","createTime":1551613446000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"comment":{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"delete":false},"delete":false,"show":true},{"mid":15,"mmid":9,"puid":4,"reid":1,"ruid":1,"context":"很棒棒哦","createTime":1551676543000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1Mzc1NTk4OCwiaWF0IjoxNTUzNjY5NTg4fQ.pLh_2XQ0ac_0_z0HrSDOJvgP7ZXcki8cr2Z-tgpkhdM","password":"003"},"comment":{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"delete":false},"delete":false,"show":false}],"delete":false},{"mid":10,"reid":1,"puid":1,"createTime":1551531101000,"context":"3.2日测试评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"commentReplies":[{"mid":9,"mmid":10,"puid":2,"reid":1,"ruid":1,"context":"哈哈","createTime":1551613534000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"comment":{"mid":10,"reid":1,"puid":1,"createTime":1551531101000,"context":"3.2日测试评论","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":11,"reid":1,"puid":1,"createTime":1551576718000,"context":"3.3","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"commentReplies":[{"mid":16,"mmid":11,"puid":1,"reid":1,"ruid":1,"context":"啦啦啦","createTime":1551778209000,"type":2,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"comment":{"mid":11,"reid":1,"puid":1,"createTime":1551576718000,"context":"3.3","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":2,"reid":1,"puid":2,"createTime":1551363363000,"context":"第二条评论","type":1,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"commentReplies":[{"mid":2,"mmid":2,"puid":1,"reid":1,"ruid":2,"context":"1号评论2号","createTime":1551403349000,"type":2,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"comment":{"mid":2,"reid":1,"puid":2,"createTime":1551363363000,"context":"第二条评论","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":12,"reid":1,"puid":4,"createTime":1551599094000,"context":"啦啦","type":1,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1Mzc1NTk4OCwiaWF0IjoxNTUzNjY5NTg4fQ.pLh_2XQ0ac_0_z0HrSDOJvgP7ZXcki8cr2Z-tgpkhdM","password":"003"},"commentReplies":[],"delete":false},{"mid":14,"reid":1,"puid":4,"createTime":1551676532000,"context":"很棒喔","type":1,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1Mzc1NTk4OCwiaWF0IjoxNTUzNjY5NTg4fQ.pLh_2XQ0ac_0_z0HrSDOJvgP7ZXcki8cr2Z-tgpkhdM","password":"003"},"commentReplies":[{"mid":18,"mmid":14,"puid":2,"reid":1,"ruid":4,"context":"哈哈","createTime":1553048124000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"comment":{"mid":14,"reid":1,"puid":4,"createTime":1551676532000,"context":"很棒喔","type":1,"delete":false},"delete":false,"show":true},{"mid":19,"mmid":14,"puid":2,"reid":1,"ruid":4,"context":"哈哈","createTime":1553048125000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"comment":{"mid":14,"reid":1,"puid":4,"createTime":1551676532000,"context":"很棒喔","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":16,"reid":1,"puid":4,"createTime":1551709996000,"context":"测试","type":1,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1Mzc1NTk4OCwiaWF0IjoxNTUzNjY5NTg4fQ.pLh_2XQ0ac_0_z0HrSDOJvgP7ZXcki8cr2Z-tgpkhdM","password":"003"},"commentReplies":[],"delete":false},{"mid":17,"reid":1,"puid":4,"createTime":1551711347000,"context":"测试","type":1,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1Mzc1NTk4OCwiaWF0IjoxNTUzNjY5NTg4fQ.pLh_2XQ0ac_0_z0HrSDOJvgP7ZXcki8cr2Z-tgpkhdM","password":"003"},"commentReplies":[],"delete":false}]},{"reid":14,"uid":4,"title":"【无油版】可乐鸡翅","score":0,"ings":"鸡中翅 适量\n姜 适量\n葱白 适量\n可乐 适量\n料酒 适量\n老抽 适量\n生抽 适量\n","image":"http://192.168.137.1:8080/image/14.jpg","visiteds":1,"collects":0,"likes":0,"tags":"热菜 \n粤菜 \n儿童 \n老人 \n宵夜 \n春季食谱 \n名菜 \n","intro":"","userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1Mzc1NTk4OCwiaWF0IjoxNTUzNjY5NTg4fQ.pLh_2XQ0ac_0_z0HrSDOJvgP7ZXcki8cr2Z-tgpkhdM","password":"003"},"stepsList":[{"stepId":1,"reid":14,"steps":"1准备好可乐，鸡翅解冻好洗净，切好葱白，姜片。","stepImgs":"14-1.jpg"},{"stepId":2,"reid":14,"steps":"2锅内倒凉水，把鸡翅放入，倒入1茶勺料酒，盖上锅盖煮。","stepImgs":"14-2.jpg"},{"stepId":3,"reid":14,"steps":"3煮至血沫烧出后，继续烧2分钟左右。","stepImgs":"14-3.jpg"},{"stepId":4,"reid":14,"steps":"4然后捞出用清水冲洗干净后，沥干水分备用。","stepImgs":"14-4.jpg"},{"stepId":5,"reid":14,"steps":"5锅烧热，把鸡皮那面朝下先煎黄再翻面。（煎出油份后吃着不会觉得腻）","stepImgs":"14-5.jpg"},{"stepId":6,"reid":14,"steps":"6倒入1厅的可乐没过鸡翅，加入姜片和葱白，倒入半小勺老抽，和半小勺生抽。","stepImgs":"14-6.jpg"},{"stepId":7,"reid":14,"steps":"7盖上锅盖大火烧开后转中火烧。","stepImgs":"14-7.jpg"},{"stepId":8,"reid":14,"steps":"8烧至汤汁浓稠后，把姜片和葱白捞出，继续烧2分钟左右即可。","stepImgs":"14-8.jpg"},{"stepId":9,"reid":14,"steps":"9很健康的做法，用百事可乐做的可乐鸡翅口感最甜；可口可乐做的可乐鸡翅甜味适中；健怡可乐做的可乐鸡翅甜味最淡。","stepImgs":"14-9.jpg"},{"stepId":10,"reid":14,"steps":"10很香的呦，怎么吃都不腻呢！","stepImgs":"14-10.jpg"},{"stepId":11,"reid":14,"steps":"11简单又实惠呢，赶紧试试吧！","stepImgs":"14-11.jpg"},{"stepId":12,"reid":14,"steps":"12可乐味道的呢！","stepImgs":"14-12.jpg"}],"viewLogs":[],"recipeTypes":[],"recipeTags":[],"userCollects":[],"comments":[]}]
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
         * visiteds : 32
         * collects : 1
         * likes : 0
         * tags : 热菜
         鲁菜
         老人
         宵夜
         朋友聚餐
         冬季食谱

         * intro :
         * userInfo : {"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"}
         * stepsList : [{"stepId":1,"reid":1,"steps":"1鸡翅洗净，葱姜切大片，柠檬切两半。","stepImgs":"1-1.jpg"},{"stepId":2,"reid":1,"steps":"2先给洗净的鸡翅用牙签来做个针灸，孔越多越好，方便入味。","stepImgs":"1-2.jpg"},{"stepId":3,"reid":1,"steps":"3扎了孔的鸡翅用酱油，葱姜片，盐，料酒，和适量柠檬汁腌30分钟以上。","stepImgs":"1-3.jpg"},{"stepId":4,"reid":1,"steps":"4然后把腌过的鸡翅入5成油锅炸三四分钟，外皮金黄即可捞出。","stepImgs":"1-4.jpg"},{"stepId":5,"reid":1,"steps":"5炸好的鸡翅和之前腌鸡翅的料再加半瓶可乐一起放入炒锅中大火烧开。","stepImgs":"1-5.jpg"},{"stepId":6,"reid":1,"steps":"6转小火炖。","stepImgs":"1-6.jpg"},{"stepId":7,"reid":1,"steps":"7小火炖至汁快收干时改大火收汁，再挤几滴柠檬汁再鸡翅上即可食用。","stepImgs":"1-7.jpg"},{"stepId":8,"reid":1,"steps":"8出锅装盘。","stepImgs":"1-8.jpg"}]
         * viewLogs : [{"vid":1,"uid":1,"reid":1,"viewTime":1551687847000,"preferDegree":3,"visitTime":0.12,"visitedTimes":12,"comment":"哈哈，很棒"},{"vid":2,"uid":1,"reid":1,"viewTime":1550458220000,"preferDegree":2,"visitTime":0.12,"visitedTimes":1,"comment":null},{"vid":7,"uid":1,"reid":1,"viewTime":1553514185000,"preferDegree":1,"visitTime":0,"visitedTimes":50,"comment":null},{"vid":37,"uid":2,"reid":1,"viewTime":1553514038000,"preferDegree":1,"visitTime":0,"visitedTimes":20,"comment":null},{"vid":32,"uid":4,"reid":1,"viewTime":1553678276000,"preferDegree":1,"visitTime":0,"visitedTimes":34,"comment":null}]
         * recipeTypes : [{"typeId":1,"reid":1,"types":{"typeId":1,"typeName":"热菜"}},{"typeId":2,"reid":1,"types":{"typeId":2,"typeName":"家常菜"}},{"typeId":11,"reid":1,"types":{"typeId":11,"typeName":"甜品"}}]
         * recipeTags : [{"reid":1,"tagId":1,"tags":{"tagId":1,"tagName":"咸"}},{"reid":1,"tagId":2,"tags":{"tagId":2,"tagName":"甜"}},{"reid":1,"tagId":5,"tags":{"tagId":5,"tagName":"烘焙"}}]
         * userCollects : [{"reid":1,"uid":1,"type":false,"time":1551783266000},{"reid":1,"uid":2,"type":false,"time":1553048113000},{"reid":1,"uid":2,"type":true,"time":1553048114000},{"reid":1,"uid":4,"type":false,"time":1551764620000}]
         * comments : [{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"commentReplies":[{"mid":1,"mmid":1,"puid":2,"reid":1,"ruid":1,"context":"回复第一条评论，这是一条超长评论，啦啦啦啦啦啦啦啦","createTime":1551363434000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"delete":false},"delete":false,"show":false},{"mid":7,"mmid":1,"puid":2,"reid":1,"ruid":1,"context":"test","createTime":1551405225000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"delete":false},"delete":false,"show":false},{"mid":12,"mmid":1,"puid":4,"reid":1,"ruid":1,"context":"我是003","createTime":1551669384000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1Mzc1NTk4OCwiaWF0IjoxNTUzNjY5NTg4fQ.pLh_2XQ0ac_0_z0HrSDOJvgP7ZXcki8cr2Z-tgpkhdM","password":"003"},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":3,"reid":1,"puid":1,"createTime":1551418344000,"context":"第三条评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"commentReplies":[{"mid":13,"mmid":3,"puid":4,"reid":1,"ruid":1,"context":"看着很棒喔","createTime":1551676449000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1Mzc1NTk4OCwiaWF0IjoxNTUzNjY5NTg4fQ.pLh_2XQ0ac_0_z0HrSDOJvgP7ZXcki8cr2Z-tgpkhdM","password":"003"},"comment":{"mid":3,"reid":1,"puid":1,"createTime":1551418344000,"context":"第三条评论","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":4,"reid":1,"puid":1,"createTime":1551366961000,"context":"第三条评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"commentReplies":[{"mid":14,"mmid":4,"puid":4,"reid":1,"ruid":1,"context":"看着很棒","createTime":1551676486000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1Mzc1NTk4OCwiaWF0IjoxNTUzNjY5NTg4fQ.pLh_2XQ0ac_0_z0HrSDOJvgP7ZXcki8cr2Z-tgpkhdM","password":"003"},"comment":{"mid":4,"reid":1,"puid":1,"createTime":1551366961000,"context":"第三条评论","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":5,"reid":1,"puid":1,"createTime":1551403136000,"context":"No.4：今天是2019年3月1日","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"commentReplies":[],"delete":false},{"mid":6,"reid":1,"puid":1,"createTime":1551428819000,"context":"啦啦啦","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"commentReplies":[],"delete":false},{"mid":7,"reid":1,"puid":1,"createTime":1551429078000,"context":"哈哈","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"commentReplies":[],"delete":false},{"mid":8,"reid":1,"puid":1,"createTime":1551429079000,"context":"哈哈","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"commentReplies":[],"delete":false},{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"commentReplies":[{"mid":8,"mmid":9,"puid":2,"reid":1,"ruid":1,"context":"3.3 19:42","createTime":1551613446000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"comment":{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"delete":false},"delete":false,"show":true},{"mid":15,"mmid":9,"puid":4,"reid":1,"ruid":1,"context":"很棒棒哦","createTime":1551676543000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1Mzc1NTk4OCwiaWF0IjoxNTUzNjY5NTg4fQ.pLh_2XQ0ac_0_z0HrSDOJvgP7ZXcki8cr2Z-tgpkhdM","password":"003"},"comment":{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"delete":false},"delete":false,"show":false}],"delete":false},{"mid":10,"reid":1,"puid":1,"createTime":1551531101000,"context":"3.2日测试评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"commentReplies":[{"mid":9,"mmid":10,"puid":2,"reid":1,"ruid":1,"context":"哈哈","createTime":1551613534000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"comment":{"mid":10,"reid":1,"puid":1,"createTime":1551531101000,"context":"3.2日测试评论","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":11,"reid":1,"puid":1,"createTime":1551576718000,"context":"3.3","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"commentReplies":[{"mid":16,"mmid":11,"puid":1,"reid":1,"ruid":1,"context":"啦啦啦","createTime":1551778209000,"type":2,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"comment":{"mid":11,"reid":1,"puid":1,"createTime":1551576718000,"context":"3.3","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":2,"reid":1,"puid":2,"createTime":1551363363000,"context":"第二条评论","type":1,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"commentReplies":[{"mid":2,"mmid":2,"puid":1,"reid":1,"ruid":2,"context":"1号评论2号","createTime":1551403349000,"type":2,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"},"comment":{"mid":2,"reid":1,"puid":2,"createTime":1551363363000,"context":"第二条评论","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":12,"reid":1,"puid":4,"createTime":1551599094000,"context":"啦啦","type":1,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1Mzc1NTk4OCwiaWF0IjoxNTUzNjY5NTg4fQ.pLh_2XQ0ac_0_z0HrSDOJvgP7ZXcki8cr2Z-tgpkhdM","password":"003"},"commentReplies":[],"delete":false},{"mid":14,"reid":1,"puid":4,"createTime":1551676532000,"context":"很棒喔","type":1,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1Mzc1NTk4OCwiaWF0IjoxNTUzNjY5NTg4fQ.pLh_2XQ0ac_0_z0HrSDOJvgP7ZXcki8cr2Z-tgpkhdM","password":"003"},"commentReplies":[{"mid":18,"mmid":14,"puid":2,"reid":1,"ruid":4,"context":"哈哈","createTime":1553048124000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"comment":{"mid":14,"reid":1,"puid":4,"createTime":1551676532000,"context":"很棒喔","type":1,"delete":false},"delete":false,"show":true},{"mid":19,"mmid":14,"puid":2,"reid":1,"ruid":4,"context":"哈哈","createTime":1553048125000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"comment":{"mid":14,"reid":1,"puid":4,"createTime":1551676532000,"context":"很棒喔","type":1,"delete":false},"delete":false,"show":true}],"delete":false},{"mid":16,"reid":1,"puid":4,"createTime":1551709996000,"context":"测试","type":1,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1Mzc1NTk4OCwiaWF0IjoxNTUzNjY5NTg4fQ.pLh_2XQ0ac_0_z0HrSDOJvgP7ZXcki8cr2Z-tgpkhdM","password":"003"},"commentReplies":[],"delete":false},{"mid":17,"reid":1,"puid":4,"createTime":1551711347000,"context":"测试","type":1,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1Mzc1NTk4OCwiaWF0IjoxNTUzNjY5NTg4fQ.pLh_2XQ0ac_0_z0HrSDOJvgP7ZXcki8cr2Z-tgpkhdM","password":"003"},"commentReplies":[],"delete":false}]
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
             * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4
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
             * userInfo : {"uid":1,"userName":"apple","age":"23","sex":2,"intro":"白天不懂夜的黑","location":"成都","image":"001.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4","password":"001"}
             * commentReplies : [{"mid":1,"mmid":1,"puid":2,"reid":1,"ruid":1,"context":"回复第一条评论，这是一条超长评论，啦啦啦啦啦啦啦啦","createTime":1551363434000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"delete":false},"delete":false,"show":false},{"mid":7,"mmid":1,"puid":2,"reid":1,"ruid":1,"context":"test","createTime":1551405225000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"delete":false},"delete":false,"show":false},{"mid":12,"mmid":1,"puid":4,"reid":1,"ruid":1,"context":"我是003","createTime":1551669384000,"type":2,"userInfo":{"uid":4,"userName":"3","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"上海","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjQsImV4cCI6MTU1Mzc1NTk4OCwiaWF0IjoxNTUzNjY5NTg4fQ.pLh_2XQ0ac_0_z0HrSDOJvgP7ZXcki8cr2Z-tgpkhdM","password":"003"},"comment":{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"delete":false},"delete":false,"show":true}]
             * delete : false
             */

            private int mid;
            private int reid;
            private int puid;
            private long createTime;
            private String context;
            private int type;
            private UserInfoBean userInfo;
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

            public UserInfoBean getUserInfo() {
                return userInfo;
            }

            public void setUserInfo(UserInfoBean userInfo) {
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
                 * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEsImV4cCI6MTU1MzYwMDU3OCwiaWF0IjoxNTUzNTE0MTc4fQ.USy5l3Hal3rJ9sUdDrknkkxeCOorDVAJ6PHm-wuFyU4
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
                 * userInfo : {"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM","password":"002"}
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

                public static class UserInfoBeanXX {
                    /**
                     * uid : 2
                     * userName : wx
                     * age : 21
                     * sex : 1
                     * intro : 白夜
                     * location : 上海
                     * image : 002.jpg
                     * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjIsImV4cCI6MTU1MzU5OTIxMSwiaWF0IjoxNTUzNTEyODExfQ.7lhf08pdNMn7CeKcpfn7VDLkorj7LuhPnJmJ0LWUUbM
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
    }


    /**
     * errorCode : 0
     * message : 查询成功
     * success : true
     * data : [{"reid":1,"title":"牛奶面包","score":8,"ings":"高筋面粉\t250克\r\n奶粉\t8克\r\n酵母\t2.5克\r\n盐\t3克\r\n糖\t30克\r\n牛奶\t165克\r\n全蛋液\t30克\r\n黄油\t25克","image":"http://192.168.137.1:8080/image/006.jpg","visiteds":5769,"collects":1,"likes":0,"tags":"甜；糕点；蒸","intro":"之前在浮小笙主页上看见这样一款包包\r\n瞬间被造型萌到了，一直保存着图片\r\n很多小伙伴嫌弃做面包时间长啊神马的，\r\n除了中种法可以前一天做好分开来调整时间之外，\r\n其实直接法也可以，这个面团用的5°冷藏初发酵，面团手感很好\r\n整形过程完全是脑洞来的，最终的造型还算OK，所以就酱紫吧~~","stepsList":[{"stepId":1,"reid":1,"steps":"面团材料中盐和黄油以外的所有食材混合，揉成面团。面团揉至粗膜状态加入黄油和盐继续揉至扩展阶段，可以扯出较为结实的半透明薄膜","stepImgs":"001.jpg"},{"stepId":2,"reid":1,"steps":"将面团装入厚实一些的保鲜袋","stepImgs":"002.jpg"},{"stepId":3,"reid":1,"steps":"放入冰箱5°冷藏发酵10-12小时后取出","stepImgs":"003.jpg"},{"stepId":4,"reid":1,"steps":"室温下放置40-60分钟回温后将面团取出\r\n按压排气","stepImgs":"004.jpg"},{"stepId":5,"reid":1,"steps":"将面团称重","stepImgs":"005.jpg"},{"stepId":6,"reid":1,"steps":"等分为九个小面团","stepImgs":null},{"stepId":7,"reid":1,"steps":"滚圆后盖保鲜膜松弛15分钟","stepImgs":null},{"stepId":8,"reid":1,"steps":"取一个松弛好的面团擀面杖自中间分别向上向下擀开","stepImgs":null},{"stepId":9,"reid":1,"steps":"翻面后横放身前，上下各自向1/3处折叠压紧","stepImgs":null},{"stepId":10,"reid":1,"steps":"将其擀长","stepImgs":null},{"stepId":11,"reid":1,"steps":"上下各自向1/2处卷起，卷到中间压紧","stepImgs":null},{"stepId":12,"reid":1,"steps":"翻过来，造型完成","stepImgs":null},{"stepId":13,"reid":1,"steps":"等距摆上烤盘","stepImgs":null},{"stepId":14,"reid":1,"steps":"放在温度36相对湿度75%的环境中发酵至两倍大","stepImgs":null},{"stepId":15,"reid":1,"steps":"烤箱上下管180度充分预热\r\n顶部用锋利的刀片划十字割口\r\n撒高粉","stepImgs":null},{"stepId":16,"reid":1,"steps":"放入预热好的烤箱中层\r\n上下管180度烘烤15-20分钟出炉","stepImgs":null},{"stepId":17,"reid":1,"steps":"冷却后装袋即可","stepImgs":null}],"viewLogs":[{"vid":1,"uid":1,"reid":1,"viewTime":1550544540000,"preferDegree":1,"visitTime":0.12,"visitedTimes":12,"comment":"哈哈，很棒"},{"vid":2,"uid":1,"reid":1,"viewTime":1550458220000,"preferDegree":2,"visitTime":0.12,"visitedTimes":1,"comment":null}],"recipeTypes":[{"typeId":1,"reid":1,"types":{"typeId":1,"typeName":"酸"}},{"typeId":2,"reid":1,"types":{"typeId":2,"typeName":"甜"}}],"recipeTags":[{"reid":1,"tagId":1,"tags":{"tagId":1,"tagName":"酸"}},{"reid":1,"tagId":2,"tags":{"tagId":2,"tagName":"甜"}},{"reid":1,"tagId":5,"tags":{"tagId":5,"tagName":"咸"}}],"userCollects":[{"reid":1,"uid":1,"time":1551533218000},{"reid":1,"uid":4,"time":1551598507000}],"comments":[{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"commentReplies":[{"mid":1,"mmid":1,"puid":2,"reid":null,"ruid":1,"context":"回复第一条评论","createTime":1551363434000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":null,"password":"002"},"delete":false},{"mid":7,"mmid":1,"puid":2,"reid":null,"ruid":1,"context":"test","createTime":1551405225000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":null,"password":"002"},"delete":false}],"delete":false},{"mid":2,"reid":1,"puid":2,"createTime":1551363363000,"context":"第二条评论","type":1,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":null,"password":"002"},"commentReplies":[{"mid":2,"mmid":2,"puid":1,"reid":null,"ruid":2,"context":"1号评论2号","createTime":1551403349000,"type":2,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"delete":false}],"delete":false},{"mid":3,"reid":1,"puid":1,"createTime":1551418344000,"context":"第三条评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"commentReplies":[],"delete":false},{"mid":4,"reid":1,"puid":1,"createTime":1551366961000,"context":"第三条评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"commentReplies":[],"delete":false},{"mid":5,"reid":1,"puid":1,"createTime":1551403136000,"context":"No.4：今天是2019年3月1日","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"commentReplies":[],"delete":false},{"mid":6,"reid":1,"puid":1,"createTime":1551428819000,"context":"啦啦啦","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"commentReplies":[],"delete":false},{"mid":7,"reid":1,"puid":1,"createTime":1551429078000,"context":"哈哈","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"commentReplies":[],"delete":false},{"mid":8,"reid":1,"puid":1,"createTime":1551429079000,"context":"哈哈","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"commentReplies":[],"delete":false},{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"commentReplies":[{"mid":8,"mmid":9,"puid":2,"reid":1,"ruid":1,"context":"3.3 19:42","createTime":1551613446000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":null,"password":"002"},"delete":false}],"delete":false},{"mid":10,"reid":1,"puid":1,"createTime":1551531101000,"context":"3.2日测试评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"commentReplies":[{"mid":9,"mmid":10,"puid":2,"reid":1,"ruid":1,"context":"哈哈","createTime":1551613534000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":null,"password":"002"},"delete":false}],"delete":false},{"mid":11,"reid":1,"puid":1,"createTime":1551576718000,"context":"3.3","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"commentReplies":[],"delete":false},{"mid":12,"reid":1,"puid":4,"createTime":1551599094000,"context":"啦啦","type":1,"userInfo":{"uid":4,"userName":"003","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"北京","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiMDAzIiwiZXhwIjoxNTUxNjEyNjcyLCJpYXQiOjE1NTE2MTE3NzJ9.FGB4Iyo_fqQYkg2RNivbHvW18j5dyuxkAGNgj3kPsjM","password":"003"},"commentReplies":[],"delete":false}]},{"reid":2,"title":"可乐鸡翅","score":9,"ings":"鸡翅、牛奶","image":"http://192.168.137.1:8080/image/002.jpg","visiteds":1234,"collects":0,"likes":0,"tags":null,"intro":null,"stepsList":[],"viewLogs":[],"recipeTypes":[{"typeId":1,"reid":2,"types":{"typeId":1,"typeName":"酸"}},{"typeId":3,"reid":2,"types":{"typeId":3,"typeName":"苦"}}],"recipeTags":[],"userCollects":[{"reid":2,"uid":1,"time":1551262827000}],"comments":[]},{"reid":3,"title":"牛奶蛋糕","score":8,"ings":"黄油、牛奶","image":"http://192.168.137.1:8080/image/003.jpg","visiteds":0,"collects":0,"likes":0,"tags":null,"intro":null,"stepsList":[],"viewLogs":[],"recipeTypes":[],"recipeTags":[],"userCollects":[{"reid":3,"uid":4,"time":1551599044000}],"comments":[{"mid":13,"reid":3,"puid":4,"createTime":1551613601000,"context":"沙发","type":1,"userInfo":{"uid":4,"userName":"003","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"北京","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiMDAzIiwiZXhwIjoxNTUxNjEyNjcyLCJpYXQiOjE1NTE2MTE3NzJ9.FGB4Iyo_fqQYkg2RNivbHvW18j5dyuxkAGNgj3kPsjM","password":"003"},"commentReplies":[{"mid":10,"mmid":13,"puid":2,"reid":3,"ruid":4,"context":"up","createTime":1551613613000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":null,"password":"002"},"delete":false}],"delete":false}]}]
     */

//    private int errorCode;
//    private String message;
//    private boolean success;
//    private List<DataBean> data;
//
//    public int getErrorCode() {
//        return errorCode;
//    }
//
//    public void setErrorCode(int errorCode) {
//        this.errorCode = errorCode;
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
//         * reid : 1
//         * title : 牛奶面包
//         * score : 8.0
//         * ings : 高筋面粉	250克
//         奶粉	8克
//         酵母	2.5克
//         盐	3克
//         糖	30克
//         牛奶	165克
//         全蛋液	30克
//         黄油	25克
//         * image : http://192.168.137.1:8080/image/006.jpg
//         * visiteds : 5769
//         * collects : 1
//         * likes : 0
//         * tags : 甜；糕点；蒸
//         * intro : 之前在浮小笙主页上看见这样一款包包
//         瞬间被造型萌到了，一直保存着图片
//         很多小伙伴嫌弃做面包时间长啊神马的，
//         除了中种法可以前一天做好分开来调整时间之外，
//         其实直接法也可以，这个面团用的5°冷藏初发酵，面团手感很好
//         整形过程完全是脑洞来的，最终的造型还算OK，所以就酱紫吧~~
//         * stepsList : [{"stepId":1,"reid":1,"steps":"面团材料中盐和黄油以外的所有食材混合，揉成面团。面团揉至粗膜状态加入黄油和盐继续揉至扩展阶段，可以扯出较为结实的半透明薄膜","stepImgs":"001.jpg"},{"stepId":2,"reid":1,"steps":"将面团装入厚实一些的保鲜袋","stepImgs":"002.jpg"},{"stepId":3,"reid":1,"steps":"放入冰箱5°冷藏发酵10-12小时后取出","stepImgs":"003.jpg"},{"stepId":4,"reid":1,"steps":"室温下放置40-60分钟回温后将面团取出\r\n按压排气","stepImgs":"004.jpg"},{"stepId":5,"reid":1,"steps":"将面团称重","stepImgs":"005.jpg"},{"stepId":6,"reid":1,"steps":"等分为九个小面团","stepImgs":null},{"stepId":7,"reid":1,"steps":"滚圆后盖保鲜膜松弛15分钟","stepImgs":null},{"stepId":8,"reid":1,"steps":"取一个松弛好的面团擀面杖自中间分别向上向下擀开","stepImgs":null},{"stepId":9,"reid":1,"steps":"翻面后横放身前，上下各自向1/3处折叠压紧","stepImgs":null},{"stepId":10,"reid":1,"steps":"将其擀长","stepImgs":null},{"stepId":11,"reid":1,"steps":"上下各自向1/2处卷起，卷到中间压紧","stepImgs":null},{"stepId":12,"reid":1,"steps":"翻过来，造型完成","stepImgs":null},{"stepId":13,"reid":1,"steps":"等距摆上烤盘","stepImgs":null},{"stepId":14,"reid":1,"steps":"放在温度36相对湿度75%的环境中发酵至两倍大","stepImgs":null},{"stepId":15,"reid":1,"steps":"烤箱上下管180度充分预热\r\n顶部用锋利的刀片划十字割口\r\n撒高粉","stepImgs":null},{"stepId":16,"reid":1,"steps":"放入预热好的烤箱中层\r\n上下管180度烘烤15-20分钟出炉","stepImgs":null},{"stepId":17,"reid":1,"steps":"冷却后装袋即可","stepImgs":null}]
//         * viewLogs : [{"vid":1,"uid":1,"reid":1,"viewTime":1550544540000,"preferDegree":1,"visitTime":0.12,"visitedTimes":12,"comment":"哈哈，很棒"},{"vid":2,"uid":1,"reid":1,"viewTime":1550458220000,"preferDegree":2,"visitTime":0.12,"visitedTimes":1,"comment":null}]
//         * recipeTypes : [{"typeId":1,"reid":1,"types":{"typeId":1,"typeName":"酸"}},{"typeId":2,"reid":1,"types":{"typeId":2,"typeName":"甜"}}]
//         * recipeTags : [{"reid":1,"tagId":1,"tags":{"tagId":1,"tagName":"酸"}},{"reid":1,"tagId":2,"tags":{"tagId":2,"tagName":"甜"}},{"reid":1,"tagId":5,"tags":{"tagId":5,"tagName":"咸"}}]
//         * userCollects : [{"reid":1,"uid":1,"time":1551533218000},{"reid":1,"uid":4,"time":1551598507000}]
//         * comments : [{"mid":1,"reid":1,"puid":1,"createTime":1551363328000,"context":"来自小仙女的第一条评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"commentReplies":[{"mid":1,"mmid":1,"puid":2,"reid":null,"ruid":1,"context":"回复第一条评论","createTime":1551363434000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":null,"password":"002"},"delete":false},{"mid":7,"mmid":1,"puid":2,"reid":null,"ruid":1,"context":"test","createTime":1551405225000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":null,"password":"002"},"delete":false}],"delete":false},{"mid":2,"reid":1,"puid":2,"createTime":1551363363000,"context":"第二条评论","type":1,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":null,"password":"002"},"commentReplies":[{"mid":2,"mmid":2,"puid":1,"reid":null,"ruid":2,"context":"1号评论2号","createTime":1551403349000,"type":2,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"delete":false}],"delete":false},{"mid":3,"reid":1,"puid":1,"createTime":1551418344000,"context":"第三条评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"commentReplies":[],"delete":false},{"mid":4,"reid":1,"puid":1,"createTime":1551366961000,"context":"第三条评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"commentReplies":[],"delete":false},{"mid":5,"reid":1,"puid":1,"createTime":1551403136000,"context":"No.4：今天是2019年3月1日","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"commentReplies":[],"delete":false},{"mid":6,"reid":1,"puid":1,"createTime":1551428819000,"context":"啦啦啦","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"commentReplies":[],"delete":false},{"mid":7,"reid":1,"puid":1,"createTime":1551429078000,"context":"哈哈","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"commentReplies":[],"delete":false},{"mid":8,"reid":1,"puid":1,"createTime":1551429079000,"context":"哈哈","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"commentReplies":[],"delete":false},{"mid":9,"reid":1,"puid":1,"createTime":1551429209000,"context":"123","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"commentReplies":[{"mid":8,"mmid":9,"puid":2,"reid":1,"ruid":1,"context":"3.3 19:42","createTime":1551613446000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":null,"password":"002"},"delete":false}],"delete":false},{"mid":10,"reid":1,"puid":1,"createTime":1551531101000,"context":"3.2日测试评论","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"commentReplies":[{"mid":9,"mmid":10,"puid":2,"reid":1,"ruid":1,"context":"哈哈","createTime":1551613534000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":null,"password":"002"},"delete":false}],"delete":false},{"mid":11,"reid":1,"puid":1,"createTime":1551576718000,"context":"3.3","type":1,"userInfo":{"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"},"commentReplies":[],"delete":false},{"mid":12,"reid":1,"puid":4,"createTime":1551599094000,"context":"啦啦","type":1,"userInfo":{"uid":4,"userName":"003","age":"35","sex":2,"intro":"我就是我，颜色不一样的烟火","location":"北京","image":"003.jpg","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiMDAzIiwiZXhwIjoxNTUxNjEyNjcyLCJpYXQiOjE1NTE2MTE3NzJ9.FGB4Iyo_fqQYkg2RNivbHvW18j5dyuxkAGNgj3kPsjM","password":"003"},"commentReplies":[],"delete":false}]
//         */
//
//        private int reid;
//        private String title;
//        private double score;
//        private String ings;
//        private String image;
//        private int visiteds;
//        private int collects;
//        private int likes;
//        private String tags;
//        private String intro;
//        private List<StepsListBean> stepsList;
//        private List<ViewLogsBean> viewLogs;
//        private List<RecipeTypesBean> recipeTypes;
//        private List<RecipeTagsBean> recipeTags;
//        private List<UserCollectsBean> userCollects;
//        private List<CommentsBean> comments;
//
//        public int getReid() {
//            return reid;
//        }
//
//        public void setReid(int reid) {
//            this.reid = reid;
//        }
//
//        public String getTitle() {
//            return title;
//        }
//
//        public void setTitle(String title) {
//            this.title = title;
//        }
//
//        public double getScore() {
//            return score;
//        }
//
//        public void setScore(double score) {
//            this.score = score;
//        }
//
//        public String getIngs() {
//            return ings;
//        }
//
//        public void setIngs(String ings) {
//            this.ings = ings;
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
//        public int getVisiteds() {
//            return visiteds;
//        }
//
//        public void setVisiteds(int visiteds) {
//            this.visiteds = visiteds;
//        }
//
//        public int getCollects() {
//            return collects;
//        }
//
//        public void setCollects(int collects) {
//            this.collects = collects;
//        }
//
//        public int getLikes() {
//            return likes;
//        }
//
//        public void setLikes(int likes) {
//            this.likes = likes;
//        }
//
//        public String getTags() {
//            return tags;
//        }
//
//        public void setTags(String tags) {
//            this.tags = tags;
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
//        public List<StepsListBean> getStepsList() {
//            return stepsList;
//        }
//
//        public void setStepsList(List<StepsListBean> stepsList) {
//            this.stepsList = stepsList;
//        }
//
//        public List<ViewLogsBean> getViewLogs() {
//            return viewLogs;
//        }
//
//        public void setViewLogs(List<ViewLogsBean> viewLogs) {
//            this.viewLogs = viewLogs;
//        }
//
//        public List<RecipeTypesBean> getRecipeTypes() {
//            return recipeTypes;
//        }
//
//        public void setRecipeTypes(List<RecipeTypesBean> recipeTypes) {
//            this.recipeTypes = recipeTypes;
//        }
//
//        public List<RecipeTagsBean> getRecipeTags() {
//            return recipeTags;
//        }
//
//        public void setRecipeTags(List<RecipeTagsBean> recipeTags) {
//            this.recipeTags = recipeTags;
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
//        public static class StepsListBean {
//            /**
//             * stepId : 1
//             * reid : 1
//             * steps : 面团材料中盐和黄油以外的所有食材混合，揉成面团。面团揉至粗膜状态加入黄油和盐继续揉至扩展阶段，可以扯出较为结实的半透明薄膜
//             * stepImgs : 001.jpg
//             */
//
//            private int stepId;
//            private int reid;
//            private String steps;
//            private String stepImgs;
//
//            public int getStepId() {
//                return stepId;
//            }
//
//            public void setStepId(int stepId) {
//                this.stepId = stepId;
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
//            public String getSteps() {
//                return steps;
//            }
//
//            public void setSteps(String steps) {
//                this.steps = steps;
//            }
//
//            public String getStepImgs() {
//                return stepImgs;
//            }
//
//            public void setStepImgs(String stepImgs) {
//                this.stepImgs = stepImgs;
//            }
//        }
//
//        public static class ViewLogsBean {
//            /**
//             * vid : 1
//             * uid : 1
//             * reid : 1
//             * viewTime : 1550544540000
//             * preferDegree : 1
//             * visitTime : 0.12
//             * visitedTimes : 12
//             * comment : 哈哈，很棒
//             */
//
//            private int vid;
//            private int uid;
//            private int reid;
//            private long viewTime;
//            private int preferDegree;
//            private double visitTime;
//            private int visitedTimes;
//            private String comment;
//
//            public int getVid() {
//                return vid;
//            }
//
//            public void setVid(int vid) {
//                this.vid = vid;
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
//            public int getReid() {
//                return reid;
//            }
//
//            public void setReid(int reid) {
//                this.reid = reid;
//            }
//
//            public long getViewTime() {
//                return viewTime;
//            }
//
//            public void setViewTime(long viewTime) {
//                this.viewTime = viewTime;
//            }
//
//            public int getPreferDegree() {
//                return preferDegree;
//            }
//
//            public void setPreferDegree(int preferDegree) {
//                this.preferDegree = preferDegree;
//            }
//
//            public double getVisitTime() {
//                return visitTime;
//            }
//
//            public void setVisitTime(double visitTime) {
//                this.visitTime = visitTime;
//            }
//
//            public int getVisitedTimes() {
//                return visitedTimes;
//            }
//
//            public void setVisitedTimes(int visitedTimes) {
//                this.visitedTimes = visitedTimes;
//            }
//
//            public String getComment() {
//                return comment;
//            }
//
//            public void setComment(String comment) {
//                this.comment = comment;
//            }
//        }
//
//        public static class RecipeTypesBean {
//            /**
//             * typeId : 1
//             * reid : 1
//             * types : {"typeId":1,"typeName":"酸"}
//             */
//
//            private int typeId;
//            private int reid;
//            private TypesBean types;
//
//            public int getTypeId() {
//                return typeId;
//            }
//
//            public void setTypeId(int typeId) {
//                this.typeId = typeId;
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
//            public TypesBean getTypes() {
//                return types;
//            }
//
//            public void setTypes(TypesBean types) {
//                this.types = types;
//            }
//
//            public static class TypesBean {
//                /**
//                 * typeId : 1
//                 * typeName : 酸
//                 */
//
//                private int typeId;
//                private String typeName;
//
//                public int getTypeId() {
//                    return typeId;
//                }
//
//                public void setTypeId(int typeId) {
//                    this.typeId = typeId;
//                }
//
//                public String getTypeName() {
//                    return typeName;
//                }
//
//                public void setTypeName(String typeName) {
//                    this.typeName = typeName;
//                }
//            }
//        }
//
//        public static class RecipeTagsBean {
//            /**
//             * reid : 1
//             * tagId : 1
//             * tags : {"tagId":1,"tagName":"酸"}
//             */
//
//            private int reid;
//            private int tagId;
//            private TagsBean tags;
//
//            public int getReid() {
//                return reid;
//            }
//
//            public void setReid(int reid) {
//                this.reid = reid;
//            }
//
//            public int getTagId() {
//                return tagId;
//            }
//
//            public void setTagId(int tagId) {
//                this.tagId = tagId;
//            }
//
//            public TagsBean getTags() {
//                return tags;
//            }
//
//            public void setTags(TagsBean tags) {
//                this.tags = tags;
//            }
//
//            public static class TagsBean {
//                /**
//                 * tagId : 1
//                 * tagName : 酸
//                 */
//
//                private int tagId;
//                private String tagName;
//
//                public int getTagId() {
//                    return tagId;
//                }
//
//                public void setTagId(int tagId) {
//                    this.tagId = tagId;
//                }
//
//                public String getTagName() {
//                    return tagName;
//                }
//
//                public void setTagName(String tagName) {
//                    this.tagName = tagName;
//                }
//            }
//        }
//
//        public static class UserCollectsBean {
//            /**
//             * reid : 1
//             * uid : 1
//             * time : 1551533218000
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
//             * mid : 1
//             * reid : 1
//             * puid : 1
//             * createTime : 1551363328000
//             * context : 来自小仙女的第一条评论
//             * type : 1
//             * userInfo : {"uid":1,"userName":"apple","age":"23","sex":1,"intro":"白天不懂夜的黑","location":"成都","image":"005.jpg","token":null,"password":"001"}
//             * commentReplies : [{"mid":1,"mmid":1,"puid":2,"reid":null,"ruid":1,"context":"回复第一条评论","createTime":1551363434000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":null,"password":"002"},"delete":false},{"mid":7,"mmid":1,"puid":2,"reid":null,"ruid":1,"context":"test","createTime":1551405225000,"type":2,"userInfo":{"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":null,"password":"002"},"delete":false}]
//             * delete : false
//             */
//
//            private int mid;
//            private int reid;
//            private int puid;
//            private long createTime;
//            private String context;
//            private int type;
//            private UserInfoBean userInfo;
//            private boolean delete;
//            private List<CommentRepliesBean> commentReplies;
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
//            public UserInfoBean getUserInfo() {
//                return userInfo;
//            }
//
//            public void setUserInfo(UserInfoBean userInfo) {
//                this.userInfo = userInfo;
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
//            public List<CommentRepliesBean> getCommentReplies() {
//                return commentReplies;
//            }
//
//            public void setCommentReplies(List<CommentRepliesBean> commentReplies) {
//                this.commentReplies = commentReplies;
//            }
//
//            public static class UserInfoBean {
//                /**
//                 * uid : 1
//                 * userName : apple
//                 * age : 23
//                 * sex : 1
//                 * intro : 白天不懂夜的黑
//                 * location : 成都
//                 * image : 005.jpg
//                 * token : null
//                 * password : 001
//                 */
//
//                private int uid;
//                private String userName;
//                private String age;
//                private int sex;
//                private String intro;
//                private String location;
//                private String image;
//                private Object token;
//                private String password;
//
//                public int getUid() {
//                    return uid;
//                }
//
//                public void setUid(int uid) {
//                    this.uid = uid;
//                }
//
//                public String getUserName() {
//                    return userName;
//                }
//
//                public void setUserName(String userName) {
//                    this.userName = userName;
//                }
//
//                public String getAge() {
//                    return age;
//                }
//
//                public void setAge(String age) {
//                    this.age = age;
//                }
//
//                public int getSex() {
//                    return sex;
//                }
//
//                public void setSex(int sex) {
//                    this.sex = sex;
//                }
//
//                public String getIntro() {
//                    return intro;
//                }
//
//                public void setIntro(String intro) {
//                    this.intro = intro;
//                }
//
//                public String getLocation() {
//                    return location;
//                }
//
//                public void setLocation(String location) {
//                    this.location = location;
//                }
//
//                public String getImage() {
//                    return image;
//                }
//
//                public void setImage(String image) {
//                    this.image = image;
//                }
//
//                public Object getToken() {
//                    return token;
//                }
//
//                public void setToken(Object token) {
//                    this.token = token;
//                }
//
//                public String getPassword() {
//                    return password;
//                }
//
//                public void setPassword(String password) {
//                    this.password = password;
//                }
//            }
//
//            public static class CommentRepliesBean {
//                /**
//                 * mid : 1
//                 * mmid : 1
//                 * puid : 2
//                 * reid : null
//                 * ruid : 1
//                 * context : 回复第一条评论
//                 * createTime : 1551363434000
//                 * type : 2
//                 * userInfo : {"uid":2,"userName":"wx","age":"21","sex":1,"intro":"白夜","location":"上海","image":"002.jpg","token":null,"password":"002"}
//                 * delete : false
//                 */
//
//                private int mid;
//                private int mmid;
//                private int puid;
//                private Object reid;
//                private int ruid;
//                private String context;
//                private long createTime;
//                private int type;
//                private UserInfoBeanX userInfo;
//                private boolean delete;
//
//                public int getMid() {
//                    return mid;
//                }
//
//                public void setMid(int mid) {
//                    this.mid = mid;
//                }
//
//                public int getMmid() {
//                    return mmid;
//                }
//
//                public void setMmid(int mmid) {
//                    this.mmid = mmid;
//                }
//
//                public int getPuid() {
//                    return puid;
//                }
//
//                public void setPuid(int puid) {
//                    this.puid = puid;
//                }
//
//                public Object getReid() {
//                    return reid;
//                }
//
//                public void setReid(Object reid) {
//                    this.reid = reid;
//                }
//
//                public int getRuid() {
//                    return ruid;
//                }
//
//                public void setRuid(int ruid) {
//                    this.ruid = ruid;
//                }
//
//                public String getContext() {
//                    return context;
//                }
//
//                public void setContext(String context) {
//                    this.context = context;
//                }
//
//                public long getCreateTime() {
//                    return createTime;
//                }
//
//                public void setCreateTime(long createTime) {
//                    this.createTime = createTime;
//                }
//
//                public int getType() {
//                    return type;
//                }
//
//                public void setType(int type) {
//                    this.type = type;
//                }
//
//                public UserInfoBeanX getUserInfo() {
//                    return userInfo;
//                }
//
//                public void setUserInfo(UserInfoBeanX userInfo) {
//                    this.userInfo = userInfo;
//                }
//
//                public boolean isDelete() {
//                    return delete;
//                }
//
//                public void setDelete(boolean delete) {
//                    this.delete = delete;
//                }
//
//                public static class UserInfoBeanX {
//                    /**
//                     * uid : 2
//                     * userName : wx
//                     * age : 21
//                     * sex : 1
//                     * intro : 白夜
//                     * location : 上海
//                     * image : 002.jpg
//                     * token : null
//                     * password : 002
//                     */
//
//                    private int uid;
//                    private String userName;
//                    private String age;
//                    private int sex;
//                    private String intro;
//                    private String location;
//                    private String image;
//                    private Object token;
//                    private String password;
//
//                    public int getUid() {
//                        return uid;
//                    }
//
//                    public void setUid(int uid) {
//                        this.uid = uid;
//                    }
//
//                    public String getUserName() {
//                        return userName;
//                    }
//
//                    public void setUserName(String userName) {
//                        this.userName = userName;
//                    }
//
//                    public String getAge() {
//                        return age;
//                    }
//
//                    public void setAge(String age) {
//                        this.age = age;
//                    }
//
//                    public int getSex() {
//                        return sex;
//                    }
//
//                    public void setSex(int sex) {
//                        this.sex = sex;
//                    }
//
//                    public String getIntro() {
//                        return intro;
//                    }
//
//                    public void setIntro(String intro) {
//                        this.intro = intro;
//                    }
//
//                    public String getLocation() {
//                        return location;
//                    }
//
//                    public void setLocation(String location) {
//                        this.location = location;
//                    }
//
//                    public String getImage() {
//                        return image;
//                    }
//
//                    public void setImage(String image) {
//                        this.image = image;
//                    }
//
//                    public Object getToken() {
//                        return token;
//                    }
//
//                    public void setToken(Object token) {
//                        this.token = token;
//                    }
//
//                    public String getPassword() {
//                        return password;
//                    }
//
//                    public void setPassword(String password) {
//                        this.password = password;
//                    }
//                }
//            }
//        }
//    }
}
