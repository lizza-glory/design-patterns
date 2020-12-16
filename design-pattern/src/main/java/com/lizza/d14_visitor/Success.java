package com.lizza.d14_visitor;

/**
 * Success类，评价成功类（具体访问者）
 */
public class Success extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("男人" + man.getName() + "的评价 -> 成功");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人" + woman.getName() + "的评价 -> 成功");
    }
}
