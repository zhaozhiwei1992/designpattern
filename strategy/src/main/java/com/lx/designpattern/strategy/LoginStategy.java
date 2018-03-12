package com.lx.designpattern.strategy;

import com.lx.designpattern.loginway.LoginWay;

public class LoginStategy {
    LoginWay loginWay;

    public LoginStategy(LoginWay loginWay) {
        this.loginWay = loginWay;
    }

    public Boolean login(){
        return loginWay.login();
    }
}
