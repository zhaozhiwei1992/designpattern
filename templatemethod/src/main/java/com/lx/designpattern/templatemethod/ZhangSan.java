package com.lx.designpattern.templatemethod;

public class ZhangSan extends Person{

    protected void closeTheFridgeDoor() {
        System.out.println("[张三] 用脚关上冰箱门");
    }

    protected void pubElephantIn() {
        System.out.println("[张三] 用脚把大象踢进冰箱");
    }

    protected void openTheFridgeDoor() {
        System.out.println("[张三] 用脚打开冰箱门");
    }
}
