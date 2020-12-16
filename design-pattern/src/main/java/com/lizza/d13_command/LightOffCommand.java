package com.lizza.d13_command;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-09
 */
public class LightOffCommand implements Command {

    private LightReceiver receiver;

    public LightOffCommand(LightReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void undo() {
        receiver.on();
    }
}
