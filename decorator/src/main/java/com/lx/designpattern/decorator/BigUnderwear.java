package com.lx.designpattern.decorator;

/**
 * 大裤衩
 */
public class BigUnderwear extends Decorator{
    @Override
    public void show() {
        System.out.print("大裤衩，");
        super.show();
    }
}
