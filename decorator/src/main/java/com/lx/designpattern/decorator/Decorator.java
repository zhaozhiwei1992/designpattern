package com.lx.designpattern.decorator;

/**
 * 这里采用继承确实有点怪, 但是这个例子只是为了更好的理解记住装饰者模式
 * 实际采用 io流， 水管套水管更适合， 再粗的水管也是水管
 */
public class Decorator extends Animal{
    private Animal animal;

    public void show() {
        animal.show();
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
