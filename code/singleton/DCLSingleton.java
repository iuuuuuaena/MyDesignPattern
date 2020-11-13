package pattern.singleton;

/**
 * @Author jxd
 * @Date 2020/11/11  8:48 上午
 * @Version 1.0
 * @Write For DCLSingleton
 * @Email waniiu@126.com
 */
public class DCLSingleton {
    // DCL单例
    private static volatile DCLSingleton instance = null;

    // 私有构造
    private DCLSingleton() {
        // do somethings
    }

    public DCLSingleton getinstance() {
        if (instance == null) {
            synchronized (DCLSingleton.class) {
                if (instance == null) {
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}
