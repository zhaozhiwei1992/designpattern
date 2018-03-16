package com.lx.designpattern.adapter;

/**
 * usb上只有usb的接口
 */
public class UsbImp implements Usb{
    @Override
    public void insert(Usb usb) {
        System.out.println("插到usb里+++++++++");
    }
}
