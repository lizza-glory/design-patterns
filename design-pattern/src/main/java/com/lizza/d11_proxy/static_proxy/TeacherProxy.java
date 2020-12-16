package com.lizza.d11_proxy.static_proxy;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-05
 */
public class TeacherProxy implements ITeacher {

    private Teacher teacher;

    public TeacherProxy(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void teach() {
        System.out.println("开始代理...");
        teacher.teach();
        System.out.println("代理结束...");
    }
}
