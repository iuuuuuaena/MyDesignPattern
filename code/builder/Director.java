package pattern.builder;

/**
 * @Author jxd
 * @Date 2020/11/13  9:06 上午
 * @Version 1.0
 * @Write For Director
 * @Email waniiu@126.com
 */
/**
 * 指挥者
  */
public class Director {
    private AbstractBuilder builder;

    public Director(AbstractBuilder builder){
        this.builder = builder;
    }

    public Computer construct(){
        builder.buildDisplayScreen();
        builder.buildCPU();
        builder.buildGPU();
        builder.buildHardDisk();
        builder.buildIOEquip();
        builder.buildRAM();
        return builder.getResult();
    }
}
