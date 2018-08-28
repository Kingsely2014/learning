package creational.factory.factory.simpleFactory;

import org.junit.Test;

/**
 * @author Kingsely
 * @create 2018-07-30
 **/
public class SimpleFactoryTest {

    @Test
    public void getMilk() {
        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.getMilk("特仑苏"));
    }
}