package com.lx.designpattern.factoryfunc;

import com.lx.designpattern.mobilephone.Phone;
import com.lx.designpattern.mobilephone.XiaoMi;

public class XiaoMiFactory implements Factory{
    public Phone getPhone() {
        return new XiaoMi();
    }
}
