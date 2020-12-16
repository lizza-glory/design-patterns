package com.lizza.d01_singleton.destroy_singleton;

import com.lizza.d01_singleton.singleton_1.Singleton;
import java.lang.reflect.Constructor;

/**
 * 反射破坏单例
 */
public class Reflect {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.lizza.d01_singleton.singleton_1.Singleton");
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton instance_1 = (Singleton) constructor.newInstance();
        Singleton instance_2 = (Singleton) constructor.newInstance();
        System.out.println(instance_1.hashCode());
        System.out.println(instance_2.hashCode());
    }
}
