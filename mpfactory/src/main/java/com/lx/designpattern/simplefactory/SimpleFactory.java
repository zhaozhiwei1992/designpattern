package com.lx.designpattern.simplefactory;

import com.lx.designpattern.mobilephone.HuaWei;
import com.lx.designpattern.mobilephone.IPhoneX;
import com.lx.designpattern.mobilephone.Phone;
import com.lx.designpattern.mobilephone.XiaoMi;

/**
 * 小作坊: 简单工厂, 啥也能做， 要啥给啥
 *  缺点: 啥也能做，修改动静太大, 不符合开闭原则
 *  优点： 从此用户不用再去new对象,用户本身不再关心生产的过程，而只需要关心这个结果
 */
public class SimpleFactory{
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
