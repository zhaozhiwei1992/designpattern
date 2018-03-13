package com.lx.designpattern.templatemethod;

import org.junit.Test;

public class TestPutElephantInTheFridge {

    /**
     * [张三] 用手打开冰箱门
     * [张三] 用手把大象踢进冰箱
     * [张三] 用手关上冰箱门
     * [李四] 用脚打开冰箱门
     * [李四] 用脚把大象踢进冰箱
     * [李四] 用脚关上冰箱门
     */
    @Test
    public void putElephantInTheFridgeTest(){
        Person zhangsan = new ZhangSan();
        zhangsan.putElephantInTheFridge();

        Person liSi = new LiSi();
        liSi.putElephantInTheFridge();
    }
}
