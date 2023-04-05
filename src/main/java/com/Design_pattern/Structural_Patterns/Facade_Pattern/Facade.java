package com.Design_pattern.Structural_Patterns.Facade_Pattern;

import com.Design_pattern.Structural_Patterns.Facade_Pattern.impl.Cpu;
import com.Design_pattern.Structural_Patterns.Facade_Pattern.impl.Ddr;
import com.Design_pattern.Structural_Patterns.Facade_Pattern.impl.Ssd;

/** * 外观类 */
public class Facade {
    private Computer cpu;
    private Computer ddr;
    private Computer ssd;

    /** * 启动cpu */
    public void onCPU() {
        cpu = new Cpu();
        cpu.open();
    }

    /** * 启动内存 */
    public void onDDR() {
        ddr = new Ddr();
        ddr.open();
    }

    /** * 启动硬盘 */
    public void onSSD() {
        ssd = new Ssd();
        ssd.open();
    }



    public void open() {
        this.onCPU();
        this.onSSD();
        this.onDDR();
    }

    public void close() {

    }

}