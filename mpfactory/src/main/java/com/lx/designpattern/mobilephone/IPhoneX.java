package com.lx.designpattern.mobilephone;

/**
 * 水果X
 */
public class IPhoneX implements Phone{

    public IPhoneX(){

    }
    /**
     * 产地
     */
    private String origin;

    public IPhoneX(String origin) {
        this.origin = origin;
    }

    public String getName() {
        return "IPHONEX";
    }

    @Override
    public String getOrigin() {
        return this.origin;
    }

}
