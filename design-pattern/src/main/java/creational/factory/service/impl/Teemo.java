package creational.factory.service.impl;

import creational.factory.service.Hero;

/**
 * @author Kingsely
 * @create 2018-07-30
 **/
public class Teemo implements Hero {
    /**
     * @param name
     * @return
     */
    @Override
    public String getName(String name) {
        return "提莫队长正在待命！";
    }
}
