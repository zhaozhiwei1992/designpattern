package com.lx.designpattern.strategy;

import com.lx.designpattern.loginway.*;

public class LoginStategy {
    LoginWay loginWay;

    public LoginStategy(LoginWay loginWay) {
        this.loginWay = loginWay;
    }

    /**
     * 结合简单工厂以及反射的策略方法
     * @param loginWay
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public LoginStategy(String loginWay) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        if(loginWay.equalsIgnoreCase("wechat")){
//            this.loginWay = new WeChat();
//        }else if(loginWay.equalsIgnoreCase("qq")){
//            this.loginWay = new QQ();
//        }else if(loginWay.equalsIgnoreCase("github")){
//            this.loginWay = new GitHub();
//        }else {
//            this.loginWay = new Normal();
//        }
        Class<?> clazz = Class.forName("com.lx.designpattern.loginway." + loginWay);
        this.loginWay = (LoginWay) clazz.newInstance();
    }

    public Boolean login(){
        return loginWay.login();
    }
}
