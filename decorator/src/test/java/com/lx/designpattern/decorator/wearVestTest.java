package com.lx.designpattern.decorator;

import org.junit.Test;

/**
 * 别以为穿马甲我就不认识你
 */
public class wearVestTest {

    /**
     * 穿着大裤衩， 马甲的蛇
     */
    @Test
    public void wearVestTest(){
        Animal snake = new Snake();
        System.out.print("穿着 ");

        Decorator vest = new Vest();
        vest.setAnimal(snake);
        Decorator bigUnderwear = new BigUnderwear();
        //这里如果decorator不继承animal就不能使用setAnamal方法包装
        bigUnderwear.setAnimal(vest);
        bigUnderwear.show();
    }
}
