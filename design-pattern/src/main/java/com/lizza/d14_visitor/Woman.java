package com.lizza.d14_visitor;

/**
 * 女生观众（具体被访问者）
 */
public class Woman extends Person {

    public Woman(String name) {
        super(name);
    }

    @Override
    public Woman accept(Action action) {
        action.getWomanResult(this);
        return this;
    }
}
