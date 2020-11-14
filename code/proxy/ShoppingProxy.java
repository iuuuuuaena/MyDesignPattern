package pattern.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author jxd
 * @Date 2020/11/14  10:34 上午
 * @Version 1.0
 * @Write For ShoppingProxy
 * @Email waniiu@126.com
 */

/**
 * 代理购物
 */
@Slf4j
public class ShoppingProxy implements Buy {

    // 内置了  购物
    private Shopping buyer;

    /**
     * 代理购物 方法
     * @param goodName
     */
    @Override
    public void buy(String goodName) {
        if (buyer == null){
            buyer = new Shopping();
        }
        preBuyer();  // 做一些前置工作，比如出国
        /**
         *   代理执行
          */
        buyer.buy(goodName);
        postBuyer(); // 做一些后置工作，带回国
    }

    /**
     * 做一些预处理，加入购物车等等
     */
    private void preBuyer() {
        System.out.println("出国");
        System.out.println("选购");
        System.out.println("加入购物车");
        log.info("出国");
        log.info("选购");
        log.info("加入购物车");
    }

    /**
     * 做一些后置处理
     */
    private void postBuyer() {
        System.out.println("取快递");
        log.info("取快递");
    }
}
