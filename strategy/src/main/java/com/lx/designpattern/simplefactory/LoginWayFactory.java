package com.lx.designpattern.simplefactory;

import com.lx.designpattern.loginway.*;

/**
 * 采用简单工厂实现 登录方式选择
 *
 *  可以约定好传入参数的格式， 这样就可以去掉if switch的判断逻辑, 采用反射的方式具体实现
 */
public class LoginWayFactory {
    public LoginWay createLoginWay(String loginWay) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if(loginWay.equalsIgnoreCase("wechat")){
            return new WeChat();
        }else if(loginWay.equalsIgnoreCase("qq")){
            return new QQ();
        }else if(loginWay.equalsIgnoreCase("github")){
            return new GitHub();
        }else {
            return new Normal();
        }

//        loginWay = "Normal";
//        Class<?> clazz = Class.forName("com.lx.designpattern.loginway." + loginWay);
//        return (LoginWay) clazz.newInstance();

    }
}
