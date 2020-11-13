package pattern.builder;

/**
 * @Author jxd
 * @Date 2020/11/13  8:48 上午
 * @Version 1.0
 * @Write For LenovoY9000X
 * @Email waniiu@126.com
 */

/**
 * 具体构建者
 */
public class LenovoY9000X extends AbstractBuilder {

    @Override
    void buildDisplayScreen() {
        computer.setIOEquip("2K IPS SRGB 100%");
    }

    @Override
    void buildCPU() {
        computer.setCPU("i7 10875H");
    }

    @Override
    void buildGPU() {
        computer.setGPU("xxx");
    }

    @Override
    void buildHardDisk() {
        computer.setHardDisk("1T SSD");

    }

    @Override
    void buildRAM() {
        computer.setRAM("32GB DDR5");
    }

    @Override
    void buildIOEquip() {
        computer.setIOEquip("lenovo keyboard 2 Thunderbolt");

    }

    @Override
    Computer getResult() {
        return computer;
    }
}
