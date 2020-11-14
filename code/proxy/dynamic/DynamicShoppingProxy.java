package pattern.proxy.dynamic;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author jxd
 * @Date 2020/11/14  12:07 下午
 * @Version 1.0
 * @Write For DynamicShoppingProxy
 * @Email waniiu@126.com
 */
@Slf4j
public class DynamicShoppingProxy  implements InvocationHandler {

    private Buy buy;

    public DynamicShoppingProxy(Buy buy) {
        this.buy = buy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("出国");
        log.info("选购");
        log.info("加入购物车");
        Object invoke = method.invoke(buy,args);
        log.info("取快递");
        return invoke;
    }
}
