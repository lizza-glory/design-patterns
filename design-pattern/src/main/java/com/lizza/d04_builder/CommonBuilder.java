package com.lizza.d04_builder;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-07-14
 */
public class CommonBuilder extends Builder {

    @Override
    public void buildBase() {
        house.setBase("普通房子的地基");
    }

    @Override
    public void buildWall() {
        house.setWall("普通房子的墙");
    }

    @Override
    public void buildRoof() {
        house.setRoof("普通房子的屋顶");
    }
}
