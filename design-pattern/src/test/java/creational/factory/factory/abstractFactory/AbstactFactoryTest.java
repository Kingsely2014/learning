package creational.factory.factory.abstractFactory;

import org.junit.Test;

/**
 * @author Kingsely
 * @create 2018-07-30
 **/
public class AbstactFactoryTest {

    @Test
    public void getMilk() {
        HeroFactory factory = new HeroFactory();
        System.out.println(factory.getTeemo());
    }
}