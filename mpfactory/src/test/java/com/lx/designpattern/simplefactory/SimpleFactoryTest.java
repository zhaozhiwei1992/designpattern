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

        //新加一个手机品牌 , 增加对应品牌的实体， 需要修改simplefactory中if else的逻辑, 需要测试其整个方法的准确性
        assertEquals("nokia",factory.getPhone("nokia").getName().toLowerCase());
        assertEquals("xiaomi",factory.getPhone("xiaomi").getName().toLowerCase());
        assertEquals("iphonex",factory.getPhone("iphonex").getName().toLowerCase());
        assertEquals("huawei",factory.getPhone("huawei").getName().toLowerCase());
    }
}
