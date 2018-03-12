package com.lx.designpattern.strategy;

import com.lx.designpattern.loginway.LoginWayEnum;

public class LoginStategyEnum {
    LoginWayEnum loginWayEnum;

    public LoginStategyEnum(LoginWayEnum loginWayEnum) {
        this.loginWayEnum = loginWayEnum;
    }

    public Boolean login(){
        return loginWayEnum.get().login();
    }

}
