package com.lizza.d07_decoration;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-09
 */
public class Client {

    public static void main(String[] args){
        Drink drink = new LongBlack();
        System.out.println(drink.getDesc() + ", 价格: " + drink.cost());
        drink = new Milk(drink);
        System.out.println(drink.getDesc() + ", 价格: " + drink.cost());
        drink = new Soy(drink);
        System.out.println(drink.getDesc() + ", 价格: " + drink.cost());
    }
}
