package problem5.main;

import problem5.circularqueue.MyCircularQueue;

//executable class
public class MyMain {

    {
        public static void main (String[]args)
        {
            MyCircularQueue m = new MyCircularQueue();
            Node node;

            for (int i = 0; i < 5; i++) {
                node = new Node(new Student());
                m.enqueue(node);
            }
            m.printQueue();


        }