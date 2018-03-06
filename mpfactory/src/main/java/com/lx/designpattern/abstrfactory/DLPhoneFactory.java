package com.lx.designpattern.abstrfactory;

import com.lx.designpattern.mobilephone.*;

/**
 * 大陆某具体工厂
 */
public class DLPhoneFactory extends AbstractFactory{

    private final String ORIGIN = "dalu";
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
