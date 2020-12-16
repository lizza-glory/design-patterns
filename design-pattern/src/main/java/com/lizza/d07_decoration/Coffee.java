package com.lizza.d07_decoration;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-09
 */
public class Coffee extends Drink {

    @Override
    Float cost() {
        return this.getPrice();
    }
}
