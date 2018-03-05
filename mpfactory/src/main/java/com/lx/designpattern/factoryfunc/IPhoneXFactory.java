package com.lx.designpattern.factoryfunc;

import com.lx.designpattern.mobilephone.IPhoneX;
import com.lx.designpattern.mobilephone.Phone;

public class IPhoneXFactory implements Factory{
    public Phone getPhone() {
        return new IPhoneX();
    }
}
