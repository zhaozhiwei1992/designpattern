package com.lx.designpattern.decorator;

public class Vest extends Decorator{
    @Override
    public void show() {
        System.out.print(" 马甲, ");
        super.show();
    }
}
