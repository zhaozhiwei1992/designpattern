package com.lx.designpattern.dynamicproxyjdk;

import com.lx.designpattern.Server;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 赵志伟
 * @ClassName: HKProxyServer
 * @description [使用jdk动态代理实现, 不用实现与被代理类相同的接口, 接口增加方法也与我无关, 动态调用被代理类方法,
 *                  在调用方法前我可以输出日志, aop, 但是调用的方法的对象是传入的client对象]
 * @create 2018-03-31 上午7:56
 **/
public class HKProxyServer implements InvocationHandler {

    //传入客户端信息
    private Server client;

    public HKProxyServer(Server client) {
        this.client = client;
    }

    public Object getInstence(){
        Class<?> clazz = client.getClass();
        //用来生成一个新的对象（字节码重组来实现）
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);

        //如果直接返回传入对象就不会调用下面的invoke方法
//        return client;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        args = new Object[]{true};//代理执行方法前可以搞事情
        System.out.println("mylog +++++++++ 动态代理调用方法 " + method.getName());
        return method.invoke(this.client, args);
    }
}
