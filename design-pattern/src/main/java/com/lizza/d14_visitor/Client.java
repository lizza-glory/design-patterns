package com.lizza.d14_visitor;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-10
 */
public class Client {

    public static void main(String[] args){
        // 创建数据结构
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man("张三").accept(new Success()));
        objectStructure.attach(new Man("李四").accept(new Fail()));
        objectStructure.attach(new Man("王五").accept(new Fail()));
        objectStructure.attach(new Woman("花花").accept(new Success()));
    }
}
