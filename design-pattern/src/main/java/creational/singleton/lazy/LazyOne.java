package creational.singleton.lazy;

/**
 * 懒汉式单例
 * --在外部需要使用的时候才进行实例化
 *
 * @author Kingsely
 * @create 2018-08-01
 **/
public class LazyOne {
    private LazyOne() {
    }

    //静态块，公共内存区域
    private static LazyOne lazy = null;

    public static LazyOne getInstance() {
        //调用方法之前，先判断。
        //如果没有初始化，将其进行初始化，并且赋值，将该实例缓存好。
        if (lazy == null) {
            lazy = new LazyOne();
        }
        //如果已经初始化，直接返回之前已经保存好的结果
        return lazy;
    }
}
