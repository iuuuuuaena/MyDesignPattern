package pattern.builder;

import lombok.Data;
import lombok.ToString;

/**
 * @Author jxd
 * @Date 2020/11/13  8:46 上午
 * @Version 1.0
 * @Write For Computer
 * @Email waniiu@126.com
 */
/*
    产品类：Computer
 */
@Data
@ToString
public class Computer {
    private String displayScreen;
    private String CPU;
    private String GPU;
    private String RAM;
    private String HardDisk;
    private String IOEquip;
}
