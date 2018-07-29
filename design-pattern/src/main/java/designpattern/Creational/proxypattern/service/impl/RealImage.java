package designpattern.Creational.proxypattern.service.impl;

import designpattern.Creational.proxypattern.service.Image;

/**
 * @author Kingsely
 * @create 2018-05-28
 **/
public class RealImage implements Image {
    private String fildName;

    public RealImage(String fildName) {
        this.fildName = fildName;
        loadFromDisk(fildName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fildName);
    }

    private void loadFromDisk(String fildName) {
        System.out.println("Loding " + fildName);
    }
}
