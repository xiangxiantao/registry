package com.xxt.registry;

/**
 * 用于接收远端请求
 */
public class RemoteController {

    public Registration registration;

    public void init(Registration registration) {
        registration.init();
    }

    public void heartbeat(Node node) {
        registration.regist(node);
    }

}
