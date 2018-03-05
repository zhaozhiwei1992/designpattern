package com.lx.designpattern.factoryfunc;

import com.lx.designpattern.mobilephone.HuaWei;
import com.lx.designpattern.mobilephone.Phone;

public class HuaWeiFactory implements Factory{
    public Phone getPhone() {
        return new HuaWei();
    }
}
