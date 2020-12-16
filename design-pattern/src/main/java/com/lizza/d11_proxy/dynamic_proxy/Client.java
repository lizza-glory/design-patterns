package com.lizza.d11_proxy.dynamic_proxy;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-05
 */
public class Client {

    public static void main(String[] args){
        ITeacher teacher = (ITeacher) new ProxyFactory(
                new Teacher()).getProxyInstance();
        teacher.teach();
    }
}
