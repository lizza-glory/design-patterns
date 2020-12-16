package com.lizza.d01_singleton.destroy_singleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化破坏单例
 */
public class Serialize {

    public static void main(String[] args){
        // 传统单例
        com.lizza.d01_singleton.singleton_1.Singleton instance = com.lizza.d01_singleton.singleton_1.Singleton.getInstance();
        // 枚举: 可以避免序列化破坏单例的情况
//        com.lizza.d1_singleton.singleton_7.Singleton instance = com.lizza.d1_singleton.singleton_7.Singleton.INSTANCE;
        Object object = clone(instance);
        System.out.println(instance.getClass() + ", " + instance.hashCode());
        System.out.println(instance.getClass() + ", " + object.hashCode());
    }

    public static Object clone(Object object) {
        ObjectInputStream is = null;
        ObjectOutputStream os = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            os = new ObjectOutputStream(bos);
            os.writeObject(object);
            is = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));

            return is.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
                if (is != null) {
                    is.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
