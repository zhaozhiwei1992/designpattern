package com.lx.designpattern.simplefactory;

import com.lx.designpattern.mobilephone.HuaWei;
import com.lx.designpattern.mobilephone.IPhoneX;
import com.lx.designpattern.mobilephone.Phone;
import com.lx.designpattern.mobilephone.XiaoMi;

/**
 * 小作坊: 简单工厂, 啥也能做， 要啥给啥
 *  缺点: 啥也能做，修改动静太大, 不符合开闭原则
 */
public class SimpleFactory implements Factory{
    public Phone getPhone(String name) {
        if(name.equalsIgnoreCase("iphonex")){
            return new IPhoneX();
        }else if(name.equalsIgnoreCase("xiaomi")){
            return new XiaoMi();
        }else if(name.equalsIgnoreCase("huawei")){
            return new HuaWei();
        }else{
            return null;
        }
    }
}
