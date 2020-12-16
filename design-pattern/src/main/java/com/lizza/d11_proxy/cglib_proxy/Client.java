package com.lizza.d11_proxy.cglib_proxy;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-09
 */
public class Client {

    public static void main(String[] args){
        Teacher proxyInstance = (Teacher) new ProxyFactory(new Teacher()).getProxyInstance();
        proxyInstance.teach();
    }
}
