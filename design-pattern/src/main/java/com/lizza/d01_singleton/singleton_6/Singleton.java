package com.lizza.d01_singleton.singleton_6;

/**
 * 懒加载的单例模式(静态内部类实现)
 */
public class Singleton {

    private Singleton(){}

    public static Singleton getInstance() {
        return InnerSingleton.INSTANCE;
    }

    private static class InnerSingleton {
        static {
            System.out.println("InnerSingleton Init!");
        }
        private static final Singleton INSTANCE = new Singleton();
    }
}

class Test {

    public static void main(String[] args){
        // 静态内部类在外部类初始化时, 不会进行加载, 更不会进行初始化操作
//        new Singleton();

        // 多线程下测试线程不安全问题(执行多次, 线程安全)
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                Singleton instance = Singleton.getInstance();
                System.out.println(instance.hashCode());
            }, "T-" + i).start();
        }
    }
}