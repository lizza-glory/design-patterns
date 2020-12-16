package com.lizza.d01_singleton.singleton_5;

/**
 * 单例模式: 双重检查(线程安全)
 * 1. 私有化构造器, 防止外部使用new关键字创建
 * 2. 创建实例对象, 但不初始化
 * 3. 提供访问实例对象的静态方法, 并对示例对象进行判断, 若为空, 在同步代码块里对示例对象进行初始化
 *
 * 优缺点说明
 * 1. 使用双重检查解决了线程安全问题, 同时解决了懒加载问题, 同时提高了效率, 一箭三雕
 */
public class Singleton {

    private volatile static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

class Test {

    public static void main(String[] args){

        // 多线程下测试线程不安全问题(执行多次, 线程安全)
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                Singleton instance = Singleton.getInstance();
                System.out.println(instance.hashCode());
            }, "T-" + i).start();
        }
    }
}