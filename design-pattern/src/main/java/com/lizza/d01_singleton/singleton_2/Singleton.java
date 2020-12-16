package com.lizza.d01_singleton.singleton_2;

/**
 * 单例模式: 饿汉式(静态代码块进行实例化)
 * 1. 私有化构造器, 防止外部使用new关键字创建
 * 2. 创建实例对象
 * 3. 提供访问实例对象的静态方法
 */
public class Singleton {

    private static Singleton instance;

    static {
        instance  = new Singleton();
    }

    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }
}

class Test {

    public static void main(String[] args){
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1 hash code: " + instance1.hashCode());
        System.out.println("instance1 hash code: " + instance2.hashCode());
    }
}