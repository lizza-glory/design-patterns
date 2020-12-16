package com.lizza.d14_visitor;

/**
 * 被访问者
 */
public abstract class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract Person accept(Action action);
}
