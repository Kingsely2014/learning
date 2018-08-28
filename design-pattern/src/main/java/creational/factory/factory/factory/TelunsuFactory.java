package creational.factory.factory.factory;

import creational.factory.service.Milk;
import creational.factory.service.impl.Telunsu;

/**
 * @author Kingsely
 * @create 2018-07-30
 **/
public class TelunsuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
