package com.lizza.d04_builder;

/**
 * 高楼
 */
public class HighBuilder extends Builder {

    @Override
    public void buildBase() {
        house.setBase("高楼的地基");
    }

    @Override
    public void buildWall() {
        house.setWall("高楼的墙");
    }

    @Override
    public void buildRoof() {
        house.setRoof("高楼的屋顶");
    }
}
