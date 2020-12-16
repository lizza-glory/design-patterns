package com.lizza.d06_bridge;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-17
 */
public class Client {

    public static void main(String[] args){
        ISender sender = new Phone();
        UrgencyMsg msg = new UrgencyMsg(sender);
        msg.send("Lizza", "Robert", "Today Is Nice Day!");
    }
}
