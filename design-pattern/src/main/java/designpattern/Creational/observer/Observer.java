package designpattern.Creational.observer;

/**
 * @author Kingsely
 * @create 2018-05-28
 **/
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
