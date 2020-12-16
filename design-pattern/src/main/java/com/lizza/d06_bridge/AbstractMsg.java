package com.lizza.d06_bridge;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-17
 */
public abstract class AbstractMsg {

    private ISender sender;

    public AbstractMsg(ISender sender) {
        this.sender = sender;
    }

    public void send(String from, String to, String msg) {
        this.sender.send(from, to, msg);
    }
}
