package com.lizza.d01_singleton.singleton_1;

import java.io.Serializable;

/**
 * 单例模式: 饿汉式
 * 1. 私有化构造器, 防止外部使用new关键字创建
 * 2. 创建实例对象
 * 3. 提供访问实例对象的静态方法
 */
public class Singleton implements Serializable {

    private static Singleton instance = new Singleton();

    private Singleton(){
        if (instance != null) {
            throw new RuntimeException("instance is must be null!");
        }
    }

    /** 反序列化时会判断是否有readResolve方法, 若有则通过该方法创建对象 **/
    private Object readResolve() {
        System.out.println(">>> readResolve is run!");
        return getInstance();
    }

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