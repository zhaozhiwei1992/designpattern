package com.lx.designpattern.factoryfunc;

import com.lx.designpattern.simplefactory.SimpleFactory;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class FactoryTest {

    @Test
    public void testGetPhone() {

        Factory factory = new IPhoneXFactory();

        assertEquals("iphonex",factory.getPhone().getName().toLowerCase());
    }
}
