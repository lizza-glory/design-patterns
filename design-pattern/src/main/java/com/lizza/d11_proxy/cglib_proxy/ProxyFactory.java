package com.lizza.d11_proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.springframework.util.ObjectUtils;

import java.lang.reflect.Method;

/**
 * cglib动态代理的使用
 * 1. 实现接口
 * 2. 重写intercept方法
 */
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        // 1. 创建增强器对象
        Enhancer enhancer = new Enhancer();
        // 2. 设置父类
        enhancer.setSuperclass(target.getClass());
        // 3. 设置回调对象
        enhancer.setCallback(this);
        // 4. 创建代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理开始~");
        Object result = method.invoke(target, args);
        System.out.println("cglib代理结束~");
        return result;
    }
}
