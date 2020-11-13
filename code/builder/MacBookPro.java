package pattern.builder;

/**
 * @Author jxd
 * @Date 2020/11/13  8:47 上午
 * @Version 1.0
 * @Write For MacBookPro
 * @Email waniiu@126.com
 */

/**
 * 具体构建者
 */
public class MacBookPro extends AbstractBuilder {


    @Override
    void buildDisplayScreen() {
        computer.setDisplayScreen("LG 2560x1440 HDR SGRB 120% 650nt");
    }

    @Override
    void buildCPU() {
        computer.setCPU("RAM m1 cpu 8 core");
    }

    @Override
    void buildGPU() {
        computer.setGPU("RAM m1 gpu 8 core");
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
        computer.setIOEquip("4 Thunderbolt 3 & " +
                "Scissor keyboard");
    }

    @Override
    Computer getResult() {
        return computer;
    }
}
