package com.lizza.d11_proxy.static_proxy;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-05
 */
public class Teacher implements ITeacher {

    @Override
    public void teach() {
        System.out.println("正在授课...");
    }
}
