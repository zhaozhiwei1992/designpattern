package com.lx.designpattern.observer;

import org.junit.Test;

public class TestObserver {

    /**
     * 女神刘亦菲更新微博状态后发生什么
     */
    @Test
    public void afterLiuyifeiUpdateWeibo(){
        Subject liuyifei = new LiuYiFei();

        Observer zhangSan = new ZhangSan();
        Observer liSi = new LiSi();
        Observer wangerMaZi = new WangerMaZi();

        liuyifei.addFans(zhangSan);
        liuyifei.addFans(liSi);
        liuyifei.addFans(wangerMaZi);
        liuyifei.deleteFans(liSi);

        /**
         我是张三, QQ通知: 女神更新状态了!!
         我是王二麻子, QQ通知: 女神更新状态了!!
         */
        liuyifei.statusChange();
    }
}
