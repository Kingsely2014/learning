package creational.factory.factory.abstractFactory;

import org.junit.Test;

/**
 * @author Kingsely
 * @create 2018-07-30
 **/
public class AbstactFactoryTest {

    @Test
    public void getMilk() {
        MilkFactory factory = new MilkFactory();
        System.out.println(factory.getYili());
    }
}