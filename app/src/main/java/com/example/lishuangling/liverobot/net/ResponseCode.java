package com.example.lishuangling.liverobot.net;

/**
 * *   .--,       .--,
 * *  ( (  \.---./  ) )
 * *   '.__/o   o\__.'
 * *      {=  ^  =}
 * *       >  -  <
 * *      /       \
 * *     //       \\
 * *    //|   .   |\\
 * *    "'\       /'"_.-~^`'-.
 * *       \  _  /--'         `
 * *     ___)( )(___
 * *    (((__) (__)))
 * *
 * Created by lishuangling on 2017/3/10.
 */


public class ResponseCode {
    //====================================内容只有text
    public final static int CHAT_CODE = 10004;//聊天码
    public final static int JOKE_CODE = 10006;//笑话码
    public final static int STORY_CODE = 10010;//故事码
    public final static int IDOM_CODE = 10011;//成语接龙码
    public final static int JI_XIONG_CODE = 10012;//吉凶码
    public final static int CONSTELLATION_CODE = 10002;//星座运势码
    public final static int LIVE_KNOWLEDGE_CODE = 10007;//生活百科码
    public final static int COMPUTER_CODE = 10009;//数字计算码
    public final static int CALENDAR_CODE = 10019;//日历查询
    public final static int QUESTION_CODE = 10007;//问答百科码
    public final static int COMPILE_CODE = 10013;//中英互译码
    public final static int MAIL_CODE = 10033;//邮编码
    //新闻类自己数据格式，对应NewsResponseBean
    public final static int NEWS_CODE = 10003;//新闻码
    //对应PictureResponseBean
    public final static int PICTURE_CODE = 10014;//图片搜索码
    //对应WeatherResponseBean
    public final static int WEATHER_CODE = 10008;//天气查询码
    //和新闻response一样，不过一般icon字段为空
    public final static int COOK_BOOK_CODE = 10015;//菜谱码
    public final static int FLIGHT_CODE = 10017;//航班查询码
    public final static int TRAIN_CODE = 10018;//火车路线查询
    public final static int MOVIE_CODE = 10025;//影视查询码

//    public final static int EXPRESS_CODE = 10015;//快递查询码
//    public final static int NEARBY_RESTUARANT_CODE = 10015;//附近餐厅码
//    public final static int NEARBY_HOTEL_CODE = 10015;//附近酒店码
//    public final static int BUS_CODE = 10015;//公交查询码



}
