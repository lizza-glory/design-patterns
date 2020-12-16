package com.lizza.d12_template;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-09
 */
public abstract class AbstractSoyMilk {

    public final void make() {
        select();
        add();
        soak();
        grind();
    }

    public void select() {
        System.out.println("第一步: 精选上好黄豆");
    }

    // 钩子方法, 让子类实现
    public void add(){

    }

    public void soak() {
        System.out.println("第三步: 将原料浸泡3小时");
    }

    public void grind() {
        System.out.println("第四步: 将原料打磨成豆浆");
    }
}
