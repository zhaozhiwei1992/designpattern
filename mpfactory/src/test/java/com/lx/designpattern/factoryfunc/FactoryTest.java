package com.lx.designpattern.factoryfunc;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class FactoryTest {

    @Test
    public void testGetPhone() {

        Factory factory = new IPhoneXFactory();

        assertEquals("iphonex",factory.getPhone().getName().toLowerCase());

        factory = new XiaoMiFactory();
        assertEquals("xiaomi",factory.getPhone().getName().toLowerCase());

        factory = new HuaWeiFactory();
        assertEquals("huawei",factory.getPhone().getName().toLowerCase());

        //新加一个手机品牌 , 增加对应品牌的实体， 增加一个实体工厂, 除客户端外没有对原有逻辑修改
        factory = new NokiaFactory();
        assertEquals("nokia",factory.getPhone().getName().toLowerCase());
    }
}
