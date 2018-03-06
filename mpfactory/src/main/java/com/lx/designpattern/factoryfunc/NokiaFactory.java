package com.lx.designpattern.factoryfunc;

import com.lx.designpattern.mobilephone.Nokia;
import com.lx.designpattern.mobilephone.Phone;

public class NokiaFactory implements Factory {
    @Override
    public Phone getPhone() {
        return new Nokia();
    }
}
