package com.lx.designpattern.simplefactory;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 *
 */
public class SimpleFactoryTest {

    @Test
    public void testGetPhone() {

        // System.out.println(new Telunsu().getName());
        SimpleFactory factory = new SimpleFactory();
        assertEquals("xiaomi",factory.getPhone("xiaomi").getName().toLowerCase());
    }
}
