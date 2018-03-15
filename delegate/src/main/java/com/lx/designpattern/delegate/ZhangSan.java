package com.lx.designpattern.delegate;

public class ZhangSan implements Target{
    @Override
    public void doing(String things) {
        System.out.println("我是张三, 老板让我做 [ " + things + " ] ");
    }
}
