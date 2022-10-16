package com.xxt.registry;

public class StartUp {

    public static void main(String[] args) {
        Registration registration = new Registration();
        RemoteController remoteController = new RemoteController();
        remoteController.init(registration);
        HeartbeatChecker heartbeatChecker = new HeartbeatChecker();
        heartbeatChecker.init(registration);
    }

}
