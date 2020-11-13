package pattern.singleton;

/**
 * @Author jxd
 * @Date 2020/11/11  8:47 上午
 * @Version 1.0
 * @Write For Singleton1
 * @Email waniiu@126.com
 */
public class Singleton1 {

    // 饿汉式
    private static Singleton1 instance = new Singleton1();

    // 私有化构造函数
    private Singleton1(){
        // 里面可能有很多操作
    }
    // 外部访问点
    public static Singleton1 getInstance(){
        return instance;
    }
}
