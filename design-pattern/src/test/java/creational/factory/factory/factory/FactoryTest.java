package creational.factory.factory.factory;

import org.junit.Test;

/**
 * @author Kingsely
 * @create 2018-07-30
 **/
public class FactoryTest {

    @Test
    public void getMilk() {
        Factory factory = new YiliFactory();
        System.out.println(factory.getMilk());
    }
}