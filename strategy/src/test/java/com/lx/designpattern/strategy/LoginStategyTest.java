package com.lx.designpattern.strategy;

import com.lx.designpattern.loginway.GitHub;
import com.lx.designpattern.loginway.Normal;
import com.lx.designpattern.loginway.QQ;
import com.lx.designpattern.loginway.WeChat;
import com.lx.designpattern.simplefactory.LoginWayFactory;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 *
 */
public class LoginStategyTest {

    /**
     * 基础的策略模式需要在客户端中选择策略, 可以结合简单工厂模式将策略封装在策略类中
     * 如果将具体类创建过程封装到LoginStategy， 实际上在客户端只会了解LoginStategy， 相对于单独的简单工厂方法降低了耦合度
     *
     * 扩展一种新的方式:
     *  1. 扩展一个新的登录方式(loginway)
     *  2. UI端增加一个选项
     *  3. 客户端增加一个分支（如果采用简单工厂也只是把客户端的逻辑封装在了工厂中, 一样需要增加分支(如果再结合反射， 完美)）
     */
    @Test
    public void testLogin() {

        //界面选择登录方式
        String loginWay = "wechat";
        LoginStategy loginStategy ;
        if(loginWay.equalsIgnoreCase("wechat")){
            loginStategy = new LoginStategy(new WeChat());
        }else if(loginWay.equalsIgnoreCase("qq")){
            loginStategy = new LoginStategy(new QQ());
        }else if(loginWay.equalsIgnoreCase("github")){
            loginStategy = new LoginStategy(new GitHub());
        }else {
            loginStategy = new LoginStategy(new Normal());
        }
        assertTrue(loginStategy.login());
        //新加一个登录方式, 需要修改客户端的分支条件

    }
}
