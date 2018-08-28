package creational.singleton.hungry;

/**
 * 饿汉式单例
 * 它是在类加载的时候就立即初始化，并且创建单例对象
 * 优点:
 * 没有加任何的锁、执行效率比较高
 * 对线程安全，在线程还没出现以前就是实例化了，不可能存在访问安全问题
 * <p>
 * 缺点:
 * 类加载的时候就初始化，不管是否使用，都占着空间
 *
 * @author Kingsely
 * @create 2018-07-31
 **/
public class Hungry {
    private Hungry() {
    }

    //先静态、后动态
    //先属性、后方法
    //先上后下
    private static final Hungry HUNGRY = new Hungry();

    public static Hungry getHungry() {
        return HUNGRY;
    }
}
