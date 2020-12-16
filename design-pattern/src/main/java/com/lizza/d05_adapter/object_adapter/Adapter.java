package com.lizza.d05_adapter.object_adapter;

/**
 * 适配器: 适配目标
 */
public class Adapter implements IVoltage5 {

    private Voltage220 voltage220 = new Voltage220();

    public int charge5() {
        int v_220 = voltage220.charge220();
        int result = v_220/44;
        return result;
    }
}
