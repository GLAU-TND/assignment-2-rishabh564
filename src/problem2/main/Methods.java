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

    public MyQueue getPost() {
        return post;
    }

    public void setPost(MyQueue post) {
        this.post = post;
    }

    public MyBinarySearchTree getM() {
        return m;
    }

    public void setM(MyBinarySearchTree m) {
        this.m = m;
    }

    public void verify_A(TreeNode root) {

        preOrder(root);
        System.out.println("First element of pre Order traversal : " + pre.getFront().getNode().getData());
        postOrder(root);
        System.out.println("Last Element of post order traversal : " + post.getEnd().getNode().getData());

    }

    //verification of statement "Both the traversal will give same element at the mid position for odd number of nodes."
    public boolean verify_B(TreeNode root) {

        pre.queuePrint(pre);
        post.queuePrint(post);
        int size = pre.getSize(pre);

        int ctr = 0;
        int predata = 0;
        int postdata = 0;













