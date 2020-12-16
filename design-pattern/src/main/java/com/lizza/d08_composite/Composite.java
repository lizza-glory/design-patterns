package com.lizza.d08_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-17
 */
public class Composite extends Component {

    private String name;

    private List<Component> list = new ArrayList<>();

    public Composite (String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public Component get(int index) {
        return list.get(index);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    public void print() {
        for (Component component : list) {

        }
    }
}
