package com.lizza.d13_command;

/**
 * 空执行, 什么都不做; 初始化时使用, 省去了调用命令时的判空操作
 */
public class NoCommand implements Command {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
