package creational.factory.service.impl;

import creational.factory.service.Milk;

/**
 * @author Kingsely
 * @create 2018-07-30
 **/
public class Mengniu implements Milk {
    /**
     * @param name
     * @return
     */
    @Override
    public String getName(String name) {
        return "蒙牛";
    }
}