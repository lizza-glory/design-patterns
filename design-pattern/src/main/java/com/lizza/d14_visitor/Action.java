package com.lizza.d14_visitor;

/**
 * Action类，评分类（抽象访问者）
 */
public abstract class Action {

    public abstract void getManResult(Man man);

    public abstract void getWomanResult(Woman woman);
}
