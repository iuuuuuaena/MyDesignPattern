package pattern.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author jxd
 * @Date 2020/11/12  9:49 上午
 * @Version 1.0
 * @Write For PrototypeTest
 * @Email waniiu@126.com
 */
@Slf4j
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype();
        Realizetype obj2 = (Realizetype)obj1.clone();
        log.info("obj1==obj2? " + (obj1 == obj2));
    }
}