package com.lx.designpattern.dynamicproxycglib;

import com.lx.designpattern.Server;

/**
 * @author 赵志伟
 * @ClassName: ChinaServer
 * @description [描述该类的功能]
 * @create 2018-03-31 上午7:45
 **/
public class ChinaClient implements Server {

    @Override
    public boolean internetgoogle(Boolean ispass) {
        System.out.println(this);
        if(ispass){
            System.out.println("请求地址: www.google.com 通过");
            return true ;
        }else{
            System.out.println("请求地址: www.google.com 拒绝");
            return false;
        }
    }

    @Override
    public boolean internetbaidu(Boolean ispass) {
        System.out.println(this);
        System.out.println("请求地址: www.baidu.com 通过");
        return true;
    }
}
