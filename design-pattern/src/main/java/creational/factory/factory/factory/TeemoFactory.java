package creational.factory.factory.factory;

import creational.factory.service.Hero;
import creational.factory.service.impl.Teemo;

/**
 * @author Kingsely
 * @create 2018-07-30
 **/
public class TeemoFactory implements Factory {
    @Override
    public Hero getHero() {
        return new Teemo();
    }
}
