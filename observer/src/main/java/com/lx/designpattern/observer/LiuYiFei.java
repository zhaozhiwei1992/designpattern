package com.lx.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 屌丝朋友们都爱关注的刘亦菲仙女
 */
public class LiuYiFei implements Subject{

    /**
     * 菲菲女神的粉丝
     */
    private List<Observer> fansList = new ArrayList<Observer>();

    @Override
    public void addFans(Observer fans) {
        fansList.add(fans);
    }

    @Override
    public void deleteFans(Observer fans){
        fansList.remove(fans);
    }

    /**
     * 通知所有的粉丝儿， 面条儿....
     */
    @Override
    public void notifyFans() {
        for (Observer fans : fansList) {
            //粉丝通知方式比较苦逼， 都是通过qq
            fans.getInfoByQQ();
        }
    }

    /**
     * 女神的状态改变， 所有订阅者第一时间收到消息
     */
    @Override
    public void statusChange() {
        this.notifyFans();
    }
}
