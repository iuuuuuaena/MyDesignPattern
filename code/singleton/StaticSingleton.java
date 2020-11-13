package pattern.singleton;

/**
 * @Author jxd
 * @Date 2020/11/11  8:52 上午
 * @Version 1.0
 * @Write For StaticSingleton
 * @Email waniiu@126.com
 */
public class StaticSingleton {
    // 静态内部类单例

    // 私有化构造函数
    private StaticSingleton(){
        // 里面可能有很多操作
    }
    // 静态内部类，不依附于外部类的对象创建
    private static class StaticSingletonHolder{
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }
    public StaticSingleton getInstance(){
        return StaticSingletonHolder.INSTANCE;
    }
}