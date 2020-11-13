package pattern.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author jxd
 * @Date 2020/11/10  8:27 上午
 * @Version 1.0
 * @Write For AbstractFactoryDesignPattern  抽象工厂模式
 * @Email waniiu@126.com
 */
@Slf4j
public class AbstractFactoryDesignPattern {
    // 用酒做例子
    public static void main(String[] args) {
        /**
         * 相比于工厂方法模式，抽象工厂模式是让一个工厂具有生产多个产品的能力
         * 更具拓展性
         */
        BeijingFactory beijingFactory = new BeijingFactory();
        Liqueur liqueur = beijingFactory.createLiqueur();
        SodaWater sodaWater = beijingFactory.createSodaWater();
        log.info("i get "+liqueur+",and "+sodaWater);
    }
}

/**
 * 产品类：酒精
 */
abstract class Liqueur{
    String NAME = "";
    int PRICE = 0;
}

/**
 * 产品实现类：二锅头酒
 */
class Erguotou extends  Liqueur{
    public Erguotou(String n, int p) {
        NAME = n;
        PRICE = p;
    }
}
/**
 * 产品实现类：威士忌
 */
class Whisky extends  Liqueur{
    public Whisky(String n, int p) {
        NAME = n;
        PRICE = p;
    }
}

/**
 * 产品2：苏打水
 */
abstract class SodaWater{
    String NAME = "";
    int PRICE = 0;
}
/**
 * 波多 Badoit 苏打水
 */
class Badoit extends SodaWater{
    public Badoit(String name, int price){
        NAME = name;
        PRICE = price;
    }
}
/**
 * .哈罗盖特 Harrogate 苏打水
 */
class Harrogate extends SodaWater{
    public Harrogate(String name, int price){
        NAME = name;
        PRICE = price;
    }
}

/**
 * 工厂接口：规定了多个产品的制作
 */
interface Factory{
    /**
     * 生产酒精类制品
     * @return
     */
    public abstract Liqueur createLiqueur();

    /**
     * 生产苏打水类制品
     * @return
     */
    public abstract SodaWater createSodaWater();
}

/**
 * 北京的具体工厂：实现了多个产品的制作
 */
class BeijingFactory implements Factory{

    /**
     * 北京工厂生产，二锅头
     * @return
     */
    @Override
    public Liqueur createLiqueur() {
        return new Erguotou("二锅头",5);
    }

    /**
     * 北京工厂生产，波多苏打水
     * @return
     */
    @Override
    public SodaWater createSodaWater() {
        return new Badoit("波多苏打水",5);
    }
}
/**
 * 苏格兰的具体工厂：实现了多个产品的制作
 */
class ScotlandFactory implements Factory{

    /**
     * 苏格兰工厂生产，威士忌
     * @return
     */
    @Override
    public Liqueur createLiqueur() {
        return new Whisky("威士忌",100);
    }

    /**
     * 苏格兰工厂生产，哈罗盖特苏打水
     * @return
     */
    @Override
    public SodaWater createSodaWater() {
        return new Harrogate("哈罗盖特",7);
    }
}