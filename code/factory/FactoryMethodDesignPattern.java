package pattern.factory;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author jxd
 * @Date 2020/11/10  8:27 上午
 * @Version 1.0
 * @Write For FactoryMethodDesignPattern 工厂方法模式
 * @Email waniiu@126.com
 */
@Slf4j
public class FactoryMethodDesignPattern {
    /**
     * 使用 Tee做例子
     *
     * @param args
     */
    public static void main(String[] args) {
        GreenTeeFactory greenTeeFactory = new GreenTeeFactory();
        Tee tee = greenTeeFactory.createTee();
        log.info("this is my " + tee);
        // 我们会发现，这样做了以后，比如我们要新加入茶的一个品类，比如 普洱茶
        // 我们只需要写一个Tee的实现类，然后 写一个 TeeFactory的实现类，PuErTeeFactory去生产普洱茶就行了
        // 代码比较容易拓展
    }
}

/**
 * 产品接口类：茶
 */
abstract class Tee {
    String NAME;
    int PRICE;
}

/**
 * 产品实现类：红茶
 */
@Data
class RedTee extends Tee {
    public RedTee(String n, int p) {
        NAME = n;
        PRICE = p;
    }
}

/**
 * 产品实现类：绿茶
 */
@Data
class GreenTee extends Tee {
    public GreenTee(String n, int p) {
        NAME = n;
        PRICE = p;
    }
}

/**
 * 工厂类
 */
interface TeeFactory {
    /**
     * 生产Tee
     *
     * @return 返回Tee
     */
    Tee createTee();
}

/**
 * 工厂具体实现类：绿茶工厂
 */
class GreenTeeFactory implements TeeFactory {

    @Override
    public Tee createTee() {
        return new GreenTee("GreenTee", 8);
    }
}

/**
 * 工厂具体实现类：红茶工厂
 */
class RedTeeFactory implements TeeFactory {

    @Override
    public Tee createTee() {
        return new RedTee("RedTee", 9);
    }
}