package pattern.builder;

/**
 * @Author jxd
 * @Date 2020/11/13  8:47 上午
 * @Version 1.0
 * @Write For AbstractBuilder
 * @Email waniiu@126.com
 */

/**
 * 抽象构造者
 */
abstract class AbstractBuilder {
    Computer computer = new Computer();

    abstract void buildDisplayScreen();
    abstract void buildCPU();
    abstract void buildGPU();
    abstract void buildHardDisk();
    abstract void buildRAM();
    abstract void buildIOEquip();

    abstract Computer getResult();
}
