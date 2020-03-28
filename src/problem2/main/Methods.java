package problem2.main;

import problem1.mybst.MyBinarySearchTree;


public class Methods {
    private MyBinarySearchTree m;
    private MyQueue pre, post;

    //constructor
    public Methods() {
        m = new MyBinarySearchTree();
        pre = new MyQueue();
        post = new MyQueue();
    }

    public MyQueue getPre() {
        return pre;
    }

    public void setPre(MyQueue pre) {
        this.pre = pre;
    }
















