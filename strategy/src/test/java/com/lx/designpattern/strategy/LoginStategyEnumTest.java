package com.lx.designpattern.strategy;

import com.lx.designpattern.loginway.*;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 *
 */
public class LoginStategyEnumTest {

    /**
     * 结合反射及枚举类型使用策略模式
     * 这种方式下， 登录方式就是一个字符串， 通过反射生成实际对象客户端逻辑不用修改
     * 如果要支持一种新的方式：
     *  1. 在界面增加一个可选的类型字符串
     *  2. 扩展一个新的枚举类型(loginwayenum)
     *  3. 扩展一个新的登录方式(loginway)
     *
     */
    @Test
    public void testLogin() throws ClassNotFoundException {

        //界面选择登录方式
        String loginWay = "GitHub";

        Class clazz = Class.forName("com.lx.designpattern.loginway.LoginWayEnum");
        Object weChat = Enum.valueOf(clazz, loginWay);
        LoginStategyEnum loginStategyEnum = new LoginStategyEnum((LoginWayEnum) weChat);

        assertTrue(loginStategyEnum.login());

    }
}
