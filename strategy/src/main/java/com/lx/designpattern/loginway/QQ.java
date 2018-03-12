package com.lx.designpattern.loginway;


public class QQ implements LoginWay {

    @Override
    public Boolean login() {
        System.out.println("欢迎使用qq登录, 登录成功");
        return true;
    }
}
