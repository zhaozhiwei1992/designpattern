package com.lx.designpattern.personalproxy;

import com.lx.designpattern.ChinaClient;
import com.lx.designpattern.Server;
import com.lx.designpattern.dynamicproxyjdk.HKProxyServer;
import org.junit.Assert;
import org.junit.Test;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PersonalProxyTest {

    @Test
    public void tryToAccessGoogle(){
        //代理对象内部使用传入de被代理对象调用方法(等价 new Object().methodxx())
        Server chinaClient = new ChinaClient();
        Server proxyServer = (Server)new PersonalHKProxyServer(chinaClient).getInstence();
        Assert.assertTrue(proxyServer.internetgoogle(false));
        Assert.assertTrue(proxyServer.internetbaidu(true));

        Assert.assertFalse(chinaClient.equals(proxyServer));
    }

    @Test
    public void getProxyClass(){
        //获取字节码文件
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Server.class});
        FileOutputStream outputStream = null;
//        String path = Thread.currentThread().getContextClassLoader().getResource("\\").getPath();
        //D:\workspace\designpattern\proxy\com.lx.designpattern.personalproxy.PersonalProxyTest
        String path = System.getProperty("user.dir");
        System.out.println(path);
        try {
            outputStream = new FileOutputStream(path + "\\src\\main\\java\\com\\lx\\designpattern\\personalproxy\\$Proxy0.class");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            outputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
