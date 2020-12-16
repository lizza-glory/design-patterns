package com.lizza.d05_adapter.interface_adapter;

/**
 * 客户端创建抽象适配器实例并实现自己所需要的方法
 */
public class Client {

    public static void main(String[] args){
        AbsAdapter adapter = new AbsAdapter(){
            @Override
            public void m1() {
                System.out.println("m1 方法");
            }
        };

        adapter.m1();
        adapter.m2();
    }

}
