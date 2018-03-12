package com.lx.designpattern.simplefactory;

import com.lx.designpattern.loginway.LoginWay;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * 使用简单工厂方式 我们在客户端我们需要了解到俩个类 LoginWayFactory LoginWay 参与到编译中
 *
 */
public class LoginWayFactoryTest {

    @Test
    public void testLogin() throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        LoginWayFactory factory = new LoginWayFactory();
        //界面选择不同的登录方式
        LoginWay loginWay = factory.createLoginWay("wechat");
        assertTrue(loginWay.login());
        loginWay = factory.createLoginWay("qq");
        assertTrue(loginWay.login());

        //新加一个登录方式, 需要修改factory总的分支条件, 需要loginwayfactory参与编译
        loginWay = factory.createLoginWay("githubxx");
        assertTrue(loginWay.login());
    }
}
