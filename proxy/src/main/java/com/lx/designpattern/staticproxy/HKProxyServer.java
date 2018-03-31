package com.lx.designpattern.staticproxy;

import com.lx.designpattern.Server;

/**
 * @author 赵志伟
 * @ClassName: HKProxyServer
 * @description [静态代理类, 帮助被代理对象访问url, 静态代理类和被代理对象实现同一接口, 唯一的区别就是代理类持有被代理对象引用, ]
 *  每次修改接口， 代理类和被代理类都要实现相同的方法, 静态代理, 要做的事情已经是确定的, 只是表面上换了个人去做
 * @create 2018-03-31 上午7:56
 **/
public class HKProxyServer implements Server{

    //传入客户端信息
    private Server client;

    public HKProxyServer(Server client) {
        this.client = client;
    }

    @Override
    public boolean internetgoogle(Boolean ispass) {
        System.out.println("香港代理: ");
        return client.internetgoogle(true);
    }

    @Override
    public boolean internetbaidu(Boolean ispass) {
        System.out.println("香港代理: ");
        return client.internetbaidu(true);
    }
}
