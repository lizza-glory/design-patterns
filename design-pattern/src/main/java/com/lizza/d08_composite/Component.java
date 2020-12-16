package com.lizza.d08_composite;

import com.lizza.d13_command.Command;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-17
 */
public abstract class Component {

    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    public Component get(int index) {
        throw new UnsupportedOperationException();
    }
}
