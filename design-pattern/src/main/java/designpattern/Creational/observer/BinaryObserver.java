package designpattern.Creational.observer;

import java.util.Observable;

/**
 * 实体观察者类
 *
 * @author Kingsely
 * @create 2018-05-28
 **/
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
//        this.subject.attch(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}
