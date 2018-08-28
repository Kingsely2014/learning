package creational.factory.factory.factory;

import creational.factory.service.Milk;
import creational.factory.service.impl.Mengniu;

/**
 * @author Kingsely
 * @create 2018-07-30
 **/
public class MengniuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
