package com.lx.designpattern.loginway;

/**
 * 华为手机
 */
public class WeChat implements LoginWay {

    @Override
    public Boolean login() {
        System.out.println("欢迎使用微信登录， 登录成功");
        return true;
    }
}
