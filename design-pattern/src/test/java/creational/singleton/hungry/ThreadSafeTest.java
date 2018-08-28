package creational.singleton.hungry;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;

/**
 * @author Kingsely
 * @create 2018-08-01
 **/
public class ThreadSafeTest {

    @Test
    public void getHungry() {
        int count = 1000;
        CountDownLatch latch = new CountDownLatch(count);

    }
}