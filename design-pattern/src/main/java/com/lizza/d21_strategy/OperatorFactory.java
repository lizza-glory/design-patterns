package com.lizza.d21_strategy;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-12-18
 */
public class OperatorFactory {

    public static Operator getOperator(String symbol) {
        switch (symbol) {
            case "+":
                return new AddOperator();
            case "-":
                return new SubOperator();
            case "*":
                return new MultOperator();
            case "/":
                return new DivOperator();
            default:
                return null;
        }
    }
}
