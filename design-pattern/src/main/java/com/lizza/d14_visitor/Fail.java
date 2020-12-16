package com.lizza.d14_visitor;

/**
 * Fail类，评价失败类（具体访问者）
 */
public class Fail extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("男人" + man.getName() + "的评价 -> 失败");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人" + woman.getName() + "的评价 -> 失败");
    }
}
