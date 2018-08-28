package creational.factory.factory.abstractFactory;

import creational.factory.service.Milk;

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
     * 获得一个蒙牛品牌的牛奶
     *
     * @return
     */
    public abstract Milk getTelunsu();

    /**
     * 获得一个伊利品牌的牛奶
     *
     * @return
     */
    public abstract Milk getYili();

    /**
     * 获得一个特仑苏品牌的牛奶
     *
     * @return
     */
    public abstract Milk getMengniu();
}
