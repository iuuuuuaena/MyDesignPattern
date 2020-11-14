package pattern.proxy.dynamic;

import lombok.extern.slf4j.Slf4j;
import pattern.proxy.ShoppingProxy;
import sun.security.provider.SHA;

import java.lang.reflect.Proxy;

/**
 * @Author jxd
 * @Date 2020/11/14  10:38 上午
 * @Version 1.0
 * @Write For Main
 * @Email waniiu@126.com
 */
@Slf4j
public class ABuyer {

    /**
     * 一个购买者想要买东西：
     *
     * @param args
     */
    public static void main(String[] args) {
        // 但是直接买亚马逊上的，买不了,没法访问
        /** Shopping shop = new Shopping();
         *  shop.buy();
         */
        // 所以只能找人出国代买，这个人就是代理

        // 1. 类加载器
        ClassLoader classLoader = Shopping.class.getClassLoader();
        // 2. 所有接口
        Class<?>[] classes = Shopping.class.getInterfaces();
        // 3. 调用处理类
        DynamicShoppingProxy dynamicProxy = new DynamicShoppingProxy(new Shopping());
        // 生成并返回的 代理对象
        Buy buy = (Buy) Proxy.newProxyInstance(classLoader, classes, dynamicProxy);
        // 让代理对象执行buy方法
        buy.buy("milk");


        // lambda表达式的方式
        Buy buy2 = (Buy)Proxy.newProxyInstance(Shopping.class.getClassLoader(),
                Shopping.class.getInterfaces(),
                (a, b, c) -> b.invoke(new Shopping(), c)
        );
        buy2.buy("iPhone12 Pro Max");
        /**
         * 出国
         * 选购
         * 加入购物车
         * 付款
         * 购买了:milk
         * 取快递
         */
    }
}
