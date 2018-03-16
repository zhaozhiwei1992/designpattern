package com.lx.designpattern.adapter;

/**
 * 转接头上既有usb接口 又有socket接口
 *
 * 适配器模式主要是为了处理遗留项目， 不能改变原来接口， 又想传入自己新的参数，只能在中间包装一层，兼容俩边的需求
 */
public class TransferImp implements Usb, Socket{

    @Override
    public void insert(Socket socket) {

    }

    /**
     * usb插到接口上， 我再转接插到插座上
     * @param usb
     */
    @Override
    public void insert(Usb usb) {
        Socket socketIml = new SocketIml();
        socketIml.insert(socketIml);
    }
}
