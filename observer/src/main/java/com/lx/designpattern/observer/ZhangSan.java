package com.lx.designpattern.observer;

public class ZhangSan implements Observer{
    @Override
    public void getInfoByQQ() {
        System.out.println("我是张三, QQ通知: 女神更新状态了!!");
    }
}
