package com.lx.designpattern.simplefactory;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 *
 */
public class SimpleFactoryTest {

    @Test
    public void testGetPhone() {

        SimpleFactory factory = new SimpleFactory();
        assertEquals("xiaomi",factory.getPhone("xiaomi").getName().toLowerCase());
        assertEquals("iphonex",factory.getPhone("iphonex").getName().toLowerCase());
        assertEquals("huawei",factory.getPhone("huawei").getName().toLowerCase());

    }
}
