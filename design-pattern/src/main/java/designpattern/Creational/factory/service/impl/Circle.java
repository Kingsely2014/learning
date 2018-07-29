package designpattern.Creational.factory.service.impl;

import designpattern.Creational.factory.service.Shape;

/**
 * @author Kingsely
 * @create 2018-05-22
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Corcle::draw() method.");

    }
}
