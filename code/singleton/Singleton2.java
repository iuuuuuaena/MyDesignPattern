package pattern.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author jxd
 * @Date 2020/11/11  8:48 上午
 * @Version 1.0
 * @Write For Singleton2
 * @Email waniiu@126.com
 */
@Slf4j
public class Singleton2 {
    // 懒汉式
    private static Singleton2 instance = null;

    // 私有化构造函数
    private Singleton2(){
        // 里面可能有很多操作
    }
    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
            return instance;
        } else {
            log.error("单例已经创建");
        }
        return null;
    }
}
