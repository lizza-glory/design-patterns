package com.lizza.d07_decoration;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-09
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    Float cost() {
        return drink.cost() + this.getPrice();
    }

    @Override
    public String getDesc() {
        return drink.getDesc() + " && " + super.getDesc();
    }
}
