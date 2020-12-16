package com.lizza.d08_composite;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-17
 */
public class Leaf extends Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Leaf: " + name);
    }
}
