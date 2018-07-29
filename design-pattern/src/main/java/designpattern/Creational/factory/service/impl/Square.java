package designpattern.Creational.factory.service.impl;

import designpattern.Creational.factory.service.Shape;

/**
 * @author Kingsely
 * @create 2018-05-22
 **/
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
