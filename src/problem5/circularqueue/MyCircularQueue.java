package problem5.circularqueue;

import problem5.node.Node;


public class MyCircularQueue {
    private Node front, tmp, end;

    public MyCircularQueue() {
        front = null;
        tmp = null;
        end = null;
    }
