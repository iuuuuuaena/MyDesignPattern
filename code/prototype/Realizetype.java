package pattern.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author jxd
 * @Date 2020/11/12  9:49 上午
 * @Version 1.0
 * @Write For Realizetype
 * @Email waniiu@126.com
 */
@Slf4j
public class Realizetype implements Cloneable {

    Realizetype() {
        // do somethings
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        log.info("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}
