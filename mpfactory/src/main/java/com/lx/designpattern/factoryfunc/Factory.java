package com.lx.designpattern.factoryfunc;

import com.lx.designpattern.mobilephone.Phone;

/**
 * 工厂:
 * 工厂方法模式: 有了一定的规范， 各个产品都有对应的工厂
 */
public interface Factory {
    Phone getPhone();
}
