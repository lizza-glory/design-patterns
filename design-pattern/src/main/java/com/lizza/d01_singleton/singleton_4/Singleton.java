package com.lizza.d01_singleton.singleton_4;

/**
 * 单例模式: 懒汉式(线程安全)
 * 1. 私有化构造器, 防止外部使用new关键字创建
 * 2. 创建实例对象, 但不初始化
 * 3. 提供访问实例对象的静态方法, 并对示例对象进行判断, 若为空, 则进行初始化
 * 4. 使用synchronized修饰静态方法, 表示对类加锁, 保证了线程安全
 *
 * 优缺点说明
 * 1. 使用synchronized修饰静态方法, 保证了线程安全
 * 2. 但是每次调用getInstance方法时, 都需要获取锁, 增加等待时间, 效率较低
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public synchronized static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
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