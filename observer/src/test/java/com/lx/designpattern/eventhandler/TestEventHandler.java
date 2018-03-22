package com.lx.designpattern.eventhandler;

import org.junit.Test;

public class TestEventHandler {
    /**
     * 女神刘亦菲更新微博状态后发生什么
     */
    @Test
    public void afterLiuyifeiUpdateWeibo(){
        Subject liuyifei = new LiuYiFei();

        Observer zhangSan = new ZhangSan();
        Observer liSi = new LiSi();
        Observer wangerMaZi = new WangerMaZi();

//        liuyifei.addListener(zhangSan, "微信通知");
//      liuyifei.addListener(lisiSan, "邮箱通知");
        //指定通知以后的回调方法
        liuyifei.addFansWithEventListener(zhangSan, "getInfoByWeiXin");
        liuyifei.addFansWithEventListener(wangerMaZi, "getInfoByEMail");
        liuyifei.addFans(liSi);

        liuyifei.statusChange();
    }
}
