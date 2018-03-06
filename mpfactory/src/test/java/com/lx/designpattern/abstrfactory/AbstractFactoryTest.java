package com.lx.designpattern.abstrfactory;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * 抽象工厂产生俩个实际工厂分别产生自己的产品
 */
public class AbstractFactoryTest {

    @Test
    public void testGetPhone() {

        AbstractFactory dlPhoneFactory = new DLPhoneFactory();
        assertEquals("huawei",dlPhoneFactory.getHuaWei().getName().toLowerCase());
        assertEquals("xiaomi",dlPhoneFactory.getXiaoMi().getName().toLowerCase());
        assertEquals("iphonex",dlPhoneFactory.getIPhoneX().getName().toLowerCase());

        assertEquals("dalu",dlPhoneFactory.getHuaWei().getOrigin().toLowerCase());
        assertEquals("dalu",dlPhoneFactory.getXiaoMi().getOrigin().toLowerCase());
        assertEquals("dalu",dlPhoneFactory.getIPhoneX().getOrigin().toLowerCase());

        AbstractFactory hkfactory = new HKPhoneFactory();
        assertEquals("huawei",hkfactory.getHuaWei().getName().toLowerCase());
        assertEquals("xiaomi",hkfactory.getXiaoMi().getName().toLowerCase());
        assertEquals("iphonex",hkfactory.getIPhoneX().getName().toLowerCase());

        assertEquals("hk",hkfactory.getHuaWei().getOrigin().toLowerCase());
        assertEquals("hk",hkfactory.getXiaoMi().getOrigin().toLowerCase());
        assertEquals("hk",hkfactory.getIPhoneX().getOrigin().toLowerCase());


        //新加一个手机品牌 , 增加对应品牌的实体， 抽象工厂中增加一个接口, 各个实体工厂实现接口, 原逻辑没做修改， 满足开闭原则
        assertEquals("nokia",dlPhoneFactory.getNokia().getName().toLowerCase());
        assertEquals("dalu",dlPhoneFactory.getNokia().getOrigin().toLowerCase());

        assertEquals("nokia",hkfactory.getNokia().getName().toLowerCase());
        assertEquals("hk",hkfactory.getNokia().getOrigin().toLowerCase());
    }
}
