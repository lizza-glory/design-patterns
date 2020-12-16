package com.lizza.d01_singleton.singleton_7;

/**
 * 枚举实现单例模式
 * 1. 枚举保证了线程安全
 * 2. 枚举可以避免反序列化时重复创建对象
 */
public class Test {

    public static void main(String[] args){
        Singleton instance = Singleton.INSTANCE;
        instance.method();
    }
}