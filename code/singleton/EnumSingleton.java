package pattern.singleton;

/**
 * @Author jxd
 * @Date 2020/11/11  8:53 上午
 * @Version 1.0
 * @Write For EnumSingleton
 * @Email waniiu@126.com
 */
public class EnumSingleton {

    private EnumSingleton() {
        // do somethings
    }

    /**
     * 枚举类型是线程安全的，并且只会装载一次
     */
    private enum SingletonEnum {
        // 实例
        INSTANCE;

        private final EnumSingleton instance;

        // 枚举的构造初始化
        SingletonEnum() {
            instance = new EnumSingleton();
        }

        private EnumSingleton getInstance() {
            return instance;
        }
    }

    public static EnumSingleton getInstance() {
        return SingletonEnum.INSTANCE.getInstance();
    }
}
