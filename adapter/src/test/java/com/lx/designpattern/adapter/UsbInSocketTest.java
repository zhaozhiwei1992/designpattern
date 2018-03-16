package com.lx.designpattern.adapter;

import org.junit.Test;

/**
 * 客户要求 我只传usb， 最终你还得让我插到插座里
 */
public class UsbInSocketTest {
    @Test
    public void usbInsertSocketTest(){
        Usb usb = new UsbImp(); //usb实体对象
        Usb adapter = new TransferImp();//转接器
        //usb插到转接器上最终插到插座里
        adapter.insert(usb);//插到插座里++++++++
    }
}
