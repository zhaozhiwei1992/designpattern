package com.lx.designpattern.dynamicproxyjdk;

import com.lx.designpattern.Server;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author 赵志伟
 * @ClassName: AccessGoogle
 * @description [描述该类的功能]
 * @create 2018-03-31 上午7:44
 **/
public class AccessGoogle {

    @Test
    public void tryToAccessGoogle(){
        //代理对象内部使用传入de被代理对象调用方法(等价 new Object().methodxx())
        Server chinaClient = new ChinaClient();
        Server proxyServer = (Server)new HKProxyServer(chinaClient).getInstence();
        Assert.assertTrue(proxyServer.internetgoogle(false));
        Assert.assertTrue(proxyServer.internetbaidu(true));

        Assert.assertFalse(chinaClient.equals(proxyServer));
    }
}
