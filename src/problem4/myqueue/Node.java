package problem4.myqueue;
// to create queue to store pre - order successor

public class MyQueue {

    private Node front, end, tmp;
    private int size;

    public MyQueue() {
        front = null;
        end = null;
        tmp = null;
        size = 0;
    }
