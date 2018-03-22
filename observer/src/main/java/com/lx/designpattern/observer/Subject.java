package com.lx.designpattern.observer;

/**
 * 通知者， 也是主题发布者, 就是为了被观察或者订阅的,
 * 主题如果状态发生改变，就会通知所有的订阅者(观察者)
 */
public interface Subject {
    void addFans(Observer fans);
    void deleteFans(Observer fans);
    void notifyFans();

    void statusChange();
}
