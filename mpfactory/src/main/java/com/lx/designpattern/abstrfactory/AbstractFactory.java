package com.lx.designpattern.abstrfactory;

import com.lx.designpattern.mobilephone.Phone;

public abstract class AbstractFactory {

    abstract Phone getXiaoMi();
    abstract Phone getIPhoneX();
    abstract Phone getHuaWei();

}
