package creational.factory.factory.abstractFactory;

import creational.factory.service.Milk;
import creational.factory.service.impl.Mengniu;
import creational.factory.service.impl.Telunsu;
import creational.factory.service.impl.Yili;

/**
 * @author Kingsely
 * @create 2018-07-30
 **/
public class MilkFactory extends AbstractFactroy {
    /**
     * 获得一个蒙牛品牌的牛奶
     *  sdfas
     * @return
     */
    @Override
    public Milk getTelunsu() {
        return new Telunsu();
    }

    /**
     * 获得一个伊利品牌的牛奶
     *
     * @return
     */
    @Override
    public Milk getYili() {
        return new Yili();
    }

    /**
     * 获得一个特仑苏品牌的牛奶
     *
     * @return
     */
    @Override
    public Milk getMengniu() {
        return new Mengniu();
    }
}
