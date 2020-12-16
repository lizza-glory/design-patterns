package com.lizza.d11_proxy.dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-05
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (object, method, args) -> {
                    System.out.println("开始代理(动态代理)...");
                    Object result = method.invoke(target, args);
                    System.out.println("代理结束(动态代理)...");
                    return result;
                });
    }
}
