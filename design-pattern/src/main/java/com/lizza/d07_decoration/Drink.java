package com.lizza.d07_decoration;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-09
 */
public abstract class Drink {

    private String desc;
    private Float price;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    abstract Float cost();
}
