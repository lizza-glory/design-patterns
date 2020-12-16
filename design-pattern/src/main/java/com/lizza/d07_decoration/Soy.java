package com.lizza.d07_decoration;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-09
 */
public class Soy extends Decorator {

    public Soy(Drink drink) {
        super(drink);
        setPrice(1.0f);
        setDesc("豆浆");
    }
}
