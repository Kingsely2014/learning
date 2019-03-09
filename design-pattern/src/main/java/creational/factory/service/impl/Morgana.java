package creational.factory.service.impl;

import creational.factory.service.Hero;

/**
 * @author Kingsely
 * @create 2018-07-30
 **/
public class Morgana implements Hero {
    /**
     * @param name
     * @return
     */
    @Override
    public String getName(String name) {
        return "有人说他们上辈子都是折翼的天使……但我上辈子是什么呢？";
    }
}
