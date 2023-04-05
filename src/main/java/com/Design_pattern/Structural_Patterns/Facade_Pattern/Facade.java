package com.Design_pattern.Structural_Patterns.Facade_Pattern;

import com.Design_pattern.Structural_Patterns.Facade_Pattern.impl.Cpu;
import com.Design_pattern.Structural_Patterns.Facade_Pattern.impl.Ddr;
import com.Design_pattern.Structural_Patterns.Facade_Pattern.impl.Ssd;

/** * ����� */
public class Facade {
    private Computer cpu;
    private Computer ddr;
    private Computer ssd;

    /** * ����cpu */
    public void onCPU() {
        cpu = new Cpu();
        cpu.open();
    }

    /** * �����ڴ� */
    public void onDDR() {
        ddr = new Ddr();
        ddr.open();
    }

    /** * ����Ӳ�� */
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