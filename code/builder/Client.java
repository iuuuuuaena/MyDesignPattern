package pattern.builder;

/**
 * @Author jxd
 * @Date 2020/11/13  9:05 上午
 * @Version 1.0
 * @Write For Client
 * @Email waniiu@126.com
 */

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        // 1. 找指挥部 表明 购买的意向
        Director director = new Director(new MacBookPro());
        // 2. 指挥部 制作 电脑，内部细节隐藏
        Computer myComputer = director.construct();
        // 3. 展示电脑 各部件配置
        System.out.println(myComputer.toString());
        // Computer{displayScreen='LG 2560x1440 HDR SGRB 120% 650nt',
        //          CPU='RAM m1 cpu 8 core',
        //          GPU='RAM m1 gpu 8 core',
        //          RAM='32GB DDR5',
        //          HardDisk='1T SSD',
        //          IOEquip='4 Thunderbolt 3 & Scissor keyboard'}
    }
}
