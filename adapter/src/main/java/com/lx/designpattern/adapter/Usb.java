package com.lx.designpattern.adapter;

/**
 * usb接口只能插入usb
 */
public interface Usb {
    public void insert(Usb usb);
}
