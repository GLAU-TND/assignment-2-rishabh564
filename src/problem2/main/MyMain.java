package problem2.main;

import problem1.mybst.MyBinarySearchTree;


public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree m = new MyBinarySearchTree();
        Methods mthds = new Methods();

        //setting up the root
        m.setRoot();
        System.out.println("Root set Successfully value :" + m.getRoot().getData());

