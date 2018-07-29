package designpattern;

import designpattern.Creational.proxypattern.service.Image;
import designpattern.Creational.proxypattern.service.impl.ProxyImage;
import designpattern.Creational.singleton.SingleObject;
import org.junit.Test;

/**
 * @author Kingsely
 * @create 2018-05-28
 **/
public class testDome {
    /**
     * 代理模式测试
     */
    @Test
    public void proxyPattenTest() {
        Image image = new ProxyImage("test_10mb.jpg");

        //图像将从磁盘加载
        image.display();
        System.out.println("");
        //图像将无法从磁盘加载
        image.display();
    }

    /**
     * 单例模式测试
     */
    @Test
    public void singletonPatternTest() {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();

        //显示消息
        object.showMessage();
    }

}
