package com.lizza.d14_visitor;

/**
 * Man类，男生观众（具体被访问者）
 */
public class Man extends Person {

    public Man(String name) {
        super(name);
    }

    @Override
    public Man accept(Action action) {
        action.getManResult(this);
        return this;
    }
}
