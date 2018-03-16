package com.lx.designpattern.adapter;

/**
 * 插座上只有普通插口
 */
public class SocketIml implements Socket{

    @Override
    public void insert(Socket socket) {
        System.out.println("插到插座里++++++++");
    }
}
