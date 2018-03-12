package com.lx.designpattern.loginway;

/**
 * 华为手机
 */
public class GitHub implements LoginWay {

    @Override
    public Boolean login() {
        System.out.println("欢迎使用github账号登录， 登录成功");
        return true;
    }
}
