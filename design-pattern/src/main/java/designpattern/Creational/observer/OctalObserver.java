package designpattern.Creational.observer;

/**
 * @author Kingsely
 * @create 2018-05-28
 **/
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
//        this.subject.attach();
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}
