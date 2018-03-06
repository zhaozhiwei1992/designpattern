package com.lx.designpattern.factoryfunc;

import com.lx.designpattern.mobilephone.Phone;

/**
 * 工厂:
 * 工厂方法模式: 有了一定的规范， 各个产品都有对应的工厂
 *
 * 工厂必然具有生产产品技能，统一的产品出口
 */
public interface Factory {
    Phone getPhone();
}
