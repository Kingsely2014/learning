package designpattern.Creational.proxypattern.service.impl;

import designpattern.Creational.proxypattern.service.Image;

/**
 * @author Kingsely
 * @create 2018-05-28
 **/
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fildName;

    public ProxyImage(String fildName) {
        this.fildName = fildName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fildName);
        }
        realImage.display();
    }

}
