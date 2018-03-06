package com.lx.designpattern.abstrfactory;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 *
 */
public class AbstractFactoryTest {

    @Test
    public void testGetPhone() {

//        AbstractFactory factory = new PhoneFactory();
        PhoneFactory factory = new PhoneFactory();
        assertEquals("huawei",factory.getHuaWei().getName().toLowerCase());
        assertEquals("xiaomi",factory.getXiaoMi().getName().toLowerCase());
        assertEquals("iphonex",factory.getIPhoneX().getName().toLowerCase());
    }
}
