package com.lizza.d06_bridge;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-17
 */
public class UrgencyMsg extends AbstractMsg {

    public UrgencyMsg(ISender sender) {
        super(sender);
    }

    @Override
    public void send(String from, String to, String msg) {
        msg = "[Urgency] " + msg;
        super.send(from, to, msg);
    }
}
