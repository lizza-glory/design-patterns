package com.lizza.d11_proxy.static_proxy;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-05
 */
public class Client {

    public static void main(String[] args){
        TeacherProxy teacherProxy = new TeacherProxy(new Teacher());
        teacherProxy.teach();
    }
}
