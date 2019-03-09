package creational.factory.factory.simpleFactory;

import org.junit.Test;

/**
 * @author Kingsely
 * @create 2018-07-30
 **/
public class SimpleFactoryTest {

    @Test
    public void getHero() {
        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.getHero("提莫"));
    }
}