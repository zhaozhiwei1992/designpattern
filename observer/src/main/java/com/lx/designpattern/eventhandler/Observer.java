package com.lx.designpattern.eventhandler;

/**
 * 事件委托模型： 订阅的时候顺便制定通知的方式
 * 基础的观察者模式通知方式比较单一， 只能通过一条路径通知订阅者
 * 现在我们有微信， 有扣扣， 有邮箱， 我们需要自己指定通过什么渠道来订阅通知
 */
public interface Observer {

    //主题发生改变时的通知渠道
    void getInfoByQQ();

    //主题发生改变时使用微信通知
    void getInfoByWeiXin();

    //主题发生改变时使用邮件通知
    void getInfoByEMail();
}
