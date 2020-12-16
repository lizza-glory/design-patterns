package com.lizza.d07_decoration;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-09
 */
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        this.setPrice(2.0f);
        this.setDesc("牛奶");
    }
}
