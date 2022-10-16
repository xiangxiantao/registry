package com.xxt.registry;

/**
 * 没有网络通信的远程客户端，用于本地调试api
 */
public class LocallyRemoteClientImpl implements RemoteClient{

    @Override
    public Result heartbeat(Node node) {
        return null;
    }
}
