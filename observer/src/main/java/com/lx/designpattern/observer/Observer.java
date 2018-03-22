package com.lx.designpattern.observer;

/**
 * 主题的订阅者
 *
 * 关注大明星的一些粉丝儿， 粉条们, 爱好娱乐八卦
 *
 * 基础的观察者模式通知方式比较单一， 只能通过一条路径通知订阅者
 */
public interface Observer {

    //主题发生改变时使用qq通知
    void getInfoByQQ();

}
