package com.lx.designpattern.dynamicproxycglib;

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
        //不需要再new对象，传入chinaclient.class即可, 然后使用接口调用方法, 内部创建了个新的子类对象来调用指定方法
        Server proxyServer = (Server)new HKProxyServer().getInstence(ChinaClient.class);
        Assert.assertTrue(proxyServer.internetgoogle(true));
        Assert.assertTrue(proxyServer.internetbaidu(true));
    }
}
