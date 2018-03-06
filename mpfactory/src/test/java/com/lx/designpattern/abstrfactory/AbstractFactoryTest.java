package com.lx.designpattern.abstrfactory;

import com.lx.designpattern.simplefactory.SimpleFactory;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 *
 */
public class AbstractFactoryTest {

    @Test
    public void testGetPhone() {

        PhoneFactory factory = new PhoneFactory();
        assertEquals("huawei",factory.getHuaWei().getName().toLowerCase());
    }
}
