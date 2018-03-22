package com.lx.designpattern.eventhandler;

public class ZhangSan implements Observer {
    @Override
    public void getInfoByQQ() {
        System.out.println("我是张三, QQ通知: 女神更新状态了!!");
    }

    @Override
    public void getInfoByWeiXin() {
        System.out.println("我是张三, 微信通知: 女神更新状态了!!");
    }

    @Override
    public void getInfoByEMail() {
        System.out.println("我是张三, 邮箱通知: 女神更新状态了!!");
    }
}
