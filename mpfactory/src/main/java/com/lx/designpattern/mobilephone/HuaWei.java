package com.lx.designpattern.mobilephone;

/**
 * 华为手机
 */
public class HuaWei implements Phone{

    public HuaWei() {

    }
    /**
     * 产地
     */
    private String origin;

    public HuaWei(String origin) {
        this.origin = origin;
    }

    public String getName() {
        return "HUAWEI";
    }

    public String getOrigin() {
        return origin;
    }
}
