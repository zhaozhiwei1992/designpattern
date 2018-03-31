package com.lx.designpattern.staticproxy;

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
        Server chinaServer = new ChinaClient();
        //访问不了google
        Assert.assertFalse(chinaServer.internetgoogle(null));
        //可以访问baidu
        Assert.assertTrue(chinaServer.internetbaidu(null));

        System.out.println("--------------------------------------------------通过代理访问--------------------------------------------------");
        Server proxyServer = new HKProxyServer(chinaServer);
        //可以访问google
        Assert.assertTrue(proxyServer.internetgoogle(null));
        //可以访问baidu
        Assert.assertTrue(proxyServer.internetbaidu(null));

    }
}
