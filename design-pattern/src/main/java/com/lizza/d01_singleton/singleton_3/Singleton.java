package com.lizza.d01_singleton.singleton_3;

/**
 * 单例模式: 懒汉式(线程不安全)
 * 1. 私有化构造器, 防止外部使用new关键字创建
 * 2. 创建实例对象, 但不初始化
 * 3. 提供访问实例对象的静态方法, 并对示例对象进行判断, 若为空, 则进行初始化
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}

class Test {

    public static void main(String[] args){
//        Singleton instance1 = Singleton.getInstance();
//        Singleton instance2 = Singleton.getInstance();
//        System.out.println(instance1 == instance2);
//        System.out.println("instance1 hash code: " + instance1.hashCode());
//        System.out.println("instance1 hash code: " + instance2.hashCode());

        // 多线程下测试线程不安全问题(执行多次, 会发现输出的hashCode不同)
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                Singleton instance = Singleton.getInstance();
                System.out.println(instance.hashCode());
            }, "T-" + i).start();
        }
    }
}