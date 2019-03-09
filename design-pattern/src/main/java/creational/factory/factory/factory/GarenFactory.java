package creational.factory.factory.factory;

import creational.factory.service.Hero;
import creational.factory.service.impl.Garen;

/**
 * @author Kingsely
 * @create 2018-07-30
 **/
public class GarenFactory implements Factory {
    @Override
    public Hero getHero() {
        return new Garen();
    }
}
