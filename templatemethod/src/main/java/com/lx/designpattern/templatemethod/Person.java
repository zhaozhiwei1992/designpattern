package com.lx.designpattern.templatemethod;

/**
 * 模板方法创建的初衷就是为了被继承和提取一些公共逻辑
 */
public abstract class Person {
    public void putElephantInTheFridge(){
        openTheFridgeDoor();
        pubElephantIn();
        closeTheFridgeDoor();
    }

    protected abstract void closeTheFridgeDoor();

    protected abstract void pubElephantIn();

    protected abstract void openTheFridgeDoor();
}
