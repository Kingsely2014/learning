package creational.factory.factory.factory;

import creational.factory.service.Milk;
import creational.factory.service.impl.Yili;

/**
 * @author Kingsely
 * @create 2018-07-30
 **/
public class YiliFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
