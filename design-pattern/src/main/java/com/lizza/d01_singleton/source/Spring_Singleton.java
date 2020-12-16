package com.lizza.d01_singleton.source;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * spring中默认创建的都是单例
 */
@ComponentScan("com.lizza.d01_singleton.source")
public class Spring_Singleton {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Spring_Singleton.class);
        for (int i = 0; i < 10; i++) {
            BpmService bean = context.getBean(BpmService.class);
            System.out.println(bean.hashCode());
        }
    }
}
