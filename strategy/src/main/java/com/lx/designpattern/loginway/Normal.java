package com.lx.designpattern.loginway;

/**
 * 华为手机
 */
public class Normal implements LoginWay {

    @Override
    public Boolean login() {
        System.out.println("欢迎登录， 登录成功");
        return true;
    }
}
