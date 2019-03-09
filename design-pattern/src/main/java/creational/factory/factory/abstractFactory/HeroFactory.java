package creational.factory.factory.abstractFactory;

import creational.factory.service.Hero;
import creational.factory.service.impl.Morgana;
import creational.factory.service.impl.Teemo;
import creational.factory.service.impl.Garen;

/**
 * @author Kingsely
 * @create 2018-07-30
 **/
public class HeroFactory extends AbstractFactroy {
    /**
     * 召唤英雄提莫
     *
     * @return
     */
    @Override
    public Hero getTeemo() {
        return new Teemo();
    }

    /**
     * 召唤英雄盖伦
     *
     * @return
     */
    @Override
    public Hero getGaren() {
        return new Garen();
    }

    /**
     * 召唤英雄莫甘娜
     *
     * @return
     */
    @Override
    public Hero getMorgana() {
        return new Morgana();
    }
}
