package com.lx.designpattern.abstrfactory;

import com.lx.designpattern.mobilephone.*;

/**
 * 香港某具体工厂
 */
public class HKPhoneFactory extends AbstractFactory{

    private final String ORIGIN = "hk";

    Phone getXiaoMi() {
        return new XiaoMi(ORIGIN);
    }

    Phone getIPhoneX() {
        return new IPhoneX(ORIGIN);
    }

    Phone getHuaWei() {
        return new HuaWei(ORIGIN);
    }

    @Override
    Phone getNokia() {
        return new Nokia(ORIGIN);
    }
}
