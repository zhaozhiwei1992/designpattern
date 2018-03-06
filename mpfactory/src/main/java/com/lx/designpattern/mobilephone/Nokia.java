package com.lx.designpattern.mobilephone;


public class Nokia implements Phone {

    public Nokia() {
    }

    private String origin;

    public Nokia(String origin) {
        this.origin = origin;
    }

    @Override
    public String getName() {
        return "NOKIA";
    }

    @Override
    public String getOrigin() {
        return this.origin;
    }
}
