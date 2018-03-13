package com.lx.designpattern.loginway;

/**
 * 微信登录
 */
public class WeChat implements LoginWay {

    @Override
    public Boolean login() {
        System.out.println("欢迎使用微信登录， 登录成功");
        return true;
    }
}
