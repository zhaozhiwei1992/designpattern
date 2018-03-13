package com.lx.designpattern.loginway;

/**
 * github 登录
 */
public class GitHub implements LoginWay {

    @Override
    public Boolean login() {
        System.out.println("欢迎使用github账号登录， 登录成功");
        return true;
    }
}
