package creational.factory.factory.factory;

import creational.factory.service.Hero;

/**
 * 标准工厂模型
 *
 * @author Kingsely
 * @create 2018-07-30
 **/
public interface Factory {
    /**
     * @return
     */
    Hero getHero();
}
