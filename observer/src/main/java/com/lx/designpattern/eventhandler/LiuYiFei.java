package com.lx.designpattern.eventhandler;

import java.util.HashMap;
import java.util.Map;

/**
 * 屌丝朋友们都爱关注的刘亦菲仙女
 */
public class LiuYiFei implements Subject {

    @Override
    public void addFans(Observer fans) {
        fansWithEventListener.put(fans, null);
    }

    @Override
    public void deleteFans(Observer fans){
        fansWithEventListener.remove(fans);
    }

    /**
     * 记录每个对象的回调事件
     * 模拟了 c# eventhandler liuyifei.update += zhangsan.getinfobyemail //大话设计模式 14
     */
    private Map<Observer, String> fansWithEventListener =  new HashMap<>();

    /**
     * 通知所有的粉丝儿， 面条儿....
     */
    @Override
    public void notifyFans() {
        for (Observer fans : fansWithEventListener.keySet()) {
            if(fansWithEventListener.get(fans) == null){
                //默认采用qq通知
                fans.getInfoByQQ();
            }else{
                //如果有自己注册的事件， 就采用指定的通知方式通知
                try {
                    fans.getClass().getDeclaredMethod(fansWithEventListener.get(fans)).invoke(fans) ;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void addFansWithEventListener(Observer fans, String event) {
        fansWithEventListener.put(fans, event);
    }

    /**
     * 女神的状态改变， 所有订阅者第一时间收到消息
     */
    @Override
    public void statusChange() {
        this.notifyFans();
    }
}
