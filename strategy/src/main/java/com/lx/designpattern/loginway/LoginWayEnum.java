package com.lx.designpattern.loginway;

public enum LoginWayEnum {
    GitHub(new GitHub()),
    Normal(new Normal()),
    QQ(new QQ()),
    WeChat(new WeChat());

    private LoginWay loginWay;
    LoginWayEnum(LoginWay loginWay){
        this.loginWay = loginWay;
    }

    public LoginWay get(){ return  this.loginWay;}

}
