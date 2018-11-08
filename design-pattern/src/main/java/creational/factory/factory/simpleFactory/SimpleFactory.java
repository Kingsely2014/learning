package creational.factory.factory.simpleFactory;

import creational.factory.service.impl.Mengniu;
import creational.factory.service.Milk;
import creational.factory.service.impl.Telunsu;
import creational.factory.service.impl.Yili;

/**
 * 简单工厂模型
 *
 * @author Kingsely
 * @create 2018-07-30
 **/
public class SimpleFactory {

    public Milk getMilk(String name) {
        if ("特仑苏1111".equals(name)) {
            return new Telunsu();
        } else if ("伊利".equals(name)) {
            return new Yili();
        } else if ("蒙牛".equals(name)) {
            return new Mengniu();
        } else {
            System.out.println("没有您需要的产品！");
            return null;
        }
    }
}
