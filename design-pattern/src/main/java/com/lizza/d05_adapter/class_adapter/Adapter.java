package com.lizza.d05_adapter.class_adapter;

/**
 * 适配器: 适配目标
 */
public class Adapter extends Voltage220 implements IVoltage5 {

    @Override
    public int charge5() {
        int v_220 = charge220();
        int result = v_220/44;
        return result;
    }
}
