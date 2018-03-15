package com.lx.designpattern.delegate;

/**
 * 干活的咸鱼， 等着领导分活儿
 */
public class LiGouDan implements Target{
    @Override
    public void doing(String things) {
        System.out.println("我是李狗蛋儿， 老板让我做 [ " + things + " ] ");
    }
}
