package pattern.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author jxd
 * @Date 2020/11/14  10:35 上午
 * @Version 1.0
 * @Write For Shopping
 * @Email waniiu@126.com
 */

/**
 * 直接购物
 */
@Slf4j
public class Shopping implements Buy {
    /**
     * 购物：先付款，再购买
     * @param goodName
     */
    @Override
    public void buy(String goodName) {
        System.out.println("付款" );
        log.info("付款");
        System.out.println("购买了:" + goodName);
        log.info("购买了:" + goodName);
    }
}
