package com.xxt.registry;

import lombok.Data;

/**
 * 注册器
 */
@Data
public class Registration {

    private NodeTable nodeTable;

    public void init() {
        nodeTable = new NodeTable();
    }

    public void regist(Node node) {
        nodeTable.addNode(node);
    }

}
