package pattern.proxy;

import lombok.extern.slf4j.Slf4j;

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
     * @param args
     */
    public static void main(String[] args) {
        // 但是直接买亚马逊上的，买不了,没法访问
            /** Shopping shop = new Shopping();
             *  shop.buy();
             */
        // 所以只能找人出国代买，这个人就是代理
        ShoppingProxy shoppingProxy = new ShoppingProxy();
        shoppingProxy.buy("milk");
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
