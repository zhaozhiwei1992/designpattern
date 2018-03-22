package com.lx.designpattern.observer;

/**
 * 王二麻子实现订阅接口就可以有获取新动态的能力
 */
public class WangerMaZi implements Observer{

    /**
     * 订阅了菲菲女神微博后， 女神发新状态通知王二麻子的渠道
     */
    @Override
    public void getInfoByQQ() {
        System.out.println("我是王二麻子, QQ通知: 女神更新状态了!!");
    }
}
