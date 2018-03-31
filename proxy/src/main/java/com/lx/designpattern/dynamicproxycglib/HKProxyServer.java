package com.lx.designpattern.dynamicproxycglib;

import com.lx.designpattern.Server;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 赵志伟
 * @ClassName: HKProxyServer
 * @description [使用cglib实现动态代理, 客户端都不用创建对象, 对象由框架创建载入, 体现在客户端像是用接口调用方法]
 * @create 2018-03-31 上午7:56
 **/
public class HKProxyServer implements MethodInterceptor {

    public Object getInstence(Class<?> clazz){

        Enhancer enhancer = new Enhancer();
        //要把哪个设置为即将生成的新类父类
        enhancer.setSuperclass(clazz);

        enhancer.setCallback(this);

        return  enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("mylog +++++++++++++++ cglib代理实现: 调用方法" + method.getName());
        return methodProxy.invokeSuper(o,objects);
    }
}
