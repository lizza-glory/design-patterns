package com.lizza.d23_listener;

/**
 * @Desc: 打印服务, 成功/失败之后会发送消息通知
 * @author: lizza.liu
 * @date: 2021-08-01
 */
public class PrintService {

    private Listener listener;

    void registerListener(Listener listener) {
        this.listener = listener;
    }

    void print() {
        try {
            System.out.println("打印中...");
            listener.success();
        } catch (Exception e) {
            listener.fail();
        }
    }
}
