package com.lx.designpattern.simplefactory;

import com.lx.designpattern.mobilephone.Phone;

public interface Factory {
    Phone getPhone(String name);
}
