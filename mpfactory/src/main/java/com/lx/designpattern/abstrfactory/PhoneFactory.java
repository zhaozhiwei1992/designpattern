package com.lx.designpattern.abstrfactory;

import com.lx.designpattern.mobilephone.HuaWei;
import com.lx.designpattern.mobilephone.IPhoneX;
import com.lx.designpattern.mobilephone.Phone;
import com.lx.designpattern.mobilephone.XiaoMi;

public class PhoneFactory extends AbstractFactory{
    Phone getXiaoMi() {
        return new XiaoMi();
    }

    Phone getIPhoneX() {
        return new IPhoneX();
    }

    Phone getHuaWei() {
        return new HuaWei();
    }
}
