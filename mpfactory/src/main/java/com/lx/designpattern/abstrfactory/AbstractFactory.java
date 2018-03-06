package com.lx.designpattern.abstrfactory;

import com.lx.designpattern.mobilephone.Phone;

/**
 * 流水线：
 * 抽象工厂是用户的主入口, 定义了所有实现工厂能做的产品
 * 在Spring中应用得最为广泛的一种设计模式
 * 易于扩展
 * 基本的逻辑都抽象出来， 而且可以进行随意组合, 用户只能用现有的功能，提高健壮性
 *
 * 适合既做产品， 并且产品分流水线, 分为 大陆\ 港版
 *
 */
public abstract class AbstractFactory {

    abstract Phone getXiaoMi();
    abstract Phone getIPhoneX();
    abstract Phone getHuaWei();
    abstract Phone getNokia();

}
