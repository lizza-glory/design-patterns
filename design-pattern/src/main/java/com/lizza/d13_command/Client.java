package com.lizza.d13_command;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-09
 */
public class Client {

    public static void main(String[] args){
        // 创建命令接收者
        LightReceiver receiver = new LightReceiver();
        LightOnCommand onCommand = new LightOnCommand(receiver);
        LightOffCommand offCommand = new LightOffCommand(receiver);

        // 创建命令发布者
        RemoteController controller = new RemoteController();
        controller.setCommand(0, onCommand, offCommand);

        // 执行
        controller.on(0);
        controller.undo();
        controller.on(0);
        controller.off(0);
        controller.undo();
    }
}
