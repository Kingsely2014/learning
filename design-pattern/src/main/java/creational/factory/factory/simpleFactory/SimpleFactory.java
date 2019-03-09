package creational.factory.factory.simpleFactory;

import creational.factory.service.impl.Morgana;
import creational.factory.service.Hero;
import creational.factory.service.impl.Teemo;
import creational.factory.service.impl.Garen;

/**
 * 简单工厂模型
 *
 * @author Kingsely
 * @create 2018-07-30
 **/
public class SimpleFactory {

    public Hero getHero(String name) {
        if ("提莫".equals(name)) {
            return new Teemo();
        } else if ("盖伦".equals(name)) {
            return new Garen();
        } else if ("莫甘娜".equals(name)) {
            return new Morgana();
        } else {
            System.out.println("英雄优惠季，现在充值点卷购买英雄买一送一哦！");
            return null;
        }
    }
}
