package com.lizza.d21_strategy;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-12-18
 */
public class Client {

    public static void main(String[] args){
        Operator operator = OperatorFactory.getOperator("+");
        int result = operator.operate(16, 4);
        System.out.println(result);
    }
}
