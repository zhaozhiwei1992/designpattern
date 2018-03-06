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
    }
}
