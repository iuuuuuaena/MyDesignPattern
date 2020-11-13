package pattern.factory;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author jxd
 * @Date 2020/11/10  8:26 上午
 * @Version 1.0
 * @Write For SimpleFactoryDesignPattern
 * @Email waniiu@126.com
 */
@Slf4j
public class SimpleFactoryDesignPattern {
    /**
     * 用咖啡来举例子
     *
     * @param args
     */
    public static void main(String[] args) {
        // 创建工厂
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        // 创建 Coffee
        Coffee myCoffee = (Coffee)coffeeFactory.createCoffee("AmericanoCoffee");
        log.info("this is my "+myCoffee);
        // 但是我们会发现，如果我要拓展品类，我想要引入新的咖啡种类，或者添加新的产品线，比如红茶等，
        // 都需要对工厂类进行修改，不利于代码的可重用性、拓展性和易修改性，所以我们引入了工厂方法
    }
}


/**
 * 产品类:咖啡
 */
abstract class Coffee {
    String NAME ;
    int PRICE;
}

/**
 * 产品实现类：猫屎咖啡
 */
class CatFecesCoffee extends Coffee {
    CatFecesCoffee(String n, int p) {
        NAME = n;
        PRICE = p;
    }
}

/**
 * 产品实现类，美式咖啡
 */
@Data
class AmericanoCoffee extends Coffee {
    AmericanoCoffee(String n, int p) {
        NAME = n;
        PRICE = p;
    }
}
/**
 * 产品，豆奶
 */
@Data
class SoyMilk{
    public String NAME;
    public int PRICE;
    SoyMilk(String n, int p){
        this.NAME = n;
        this.PRICE = p;
    }
}

/**
 * 工厂类
 */
@Slf4j
class CoffeeFactory {
    /**
     * 一个工厂可以生成多个产品
     * @param name 产品名称
     * @return 做好的产品
     */
    public Object createCoffee(String name) {
        switch (name) {
            case "CatFecesCoffee":
                log.info("ye,this is your CatFecesCoffee!");
                return new CatFecesCoffee("CatFecesCoffee", 15);
            case "AmericanoCoffee":
                log.info("ye,this is your AmericanoCoffee!");
                return new AmericanoCoffee("AmericanoCoffee", 17);
            case "SoyMilk":
                log.info("ye,this is your SoyMilk!");
                return new SoyMilk("SoyMilk", 10);
            default:
                log.error("sorry, we just have this two coffee!");
                break;
        }
        return null;
    }
}
