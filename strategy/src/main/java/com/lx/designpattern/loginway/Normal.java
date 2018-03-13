package com.lx.designpattern.loginway;

/**
 * 普通登录
 */
public class Normal implements LoginWay {

    @Override
    public Boolean login() {
        System.out.println("欢迎登录， 登录成功");
        return true;
    }
}
