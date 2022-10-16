package com.xxt.registry;

import org.apache.commons.collections.CollectionUtils;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 心跳检测器
 */
public class HeartbeatChecker {

    private NodeTable nodeTable;

    private long timeout = 3000L;

    public void init(Registration registration) {
        nodeTable = registration.getNodeTable();
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            if (CollectionUtils.isEmpty(nodeTable.getNodeList())) {
                System.out.println("当前注册表没有节点");
            }
        }, 2, 3, TimeUnit.SECONDS);
    }

}
