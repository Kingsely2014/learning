package creational.factory.factory.abstractFactory;

import creational.factory.service.Hero;

/**
 * 抽象工厂模式
 *
 * @author Kingsely
 * @create 2018-07-30
 **/
public abstract class AbstractFactroy {

    // 公共的逻辑
    // 方便统一的管理

    /**
     * 召唤英雄提莫
     *
     * @return
     */
    public abstract Hero getTeemo();

    /**
     * 召唤英雄盖伦
     *
     * @return
     */
    public abstract Hero getGaren();

    /**
     * 召唤英雄莫甘娜
     *
     * @return
     */
    public abstract Hero getMorgana();
}
