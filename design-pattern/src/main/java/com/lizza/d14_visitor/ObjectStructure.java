package com.lizza.d14_visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-10
 */
public class ObjectStructure {

    List<Person> list = new LinkedList<>();

    public void attach(Person person) {
        list.add(person);
    }

    public void detach(Person person) {
        list.remove(person);
    }

    public void display(Action action) {
        list.forEach(e -> {
            e.accept(action);
        });
    }
}
