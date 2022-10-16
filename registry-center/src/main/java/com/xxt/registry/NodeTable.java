package com.xxt.registry;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 节点维护表
 */
@Data
public class NodeTable {

    private List<Node> nodeList = new CopyOnWriteArrayList<>();

    private Map<String, Node> nodeMap = new ConcurrentHashMap<>();

    public synchronized void addNode(Node node) {
        if (exist(node)) {
            return;
        }
        nodeList.add(node);
        nodeMap.put(node.getIp() + ":" + node.getPort(), node);
    }

    public boolean exist(Node node) {
        return nodeMap.containsKey(node.getIp() + ":" + node.getPort());
    }

}
