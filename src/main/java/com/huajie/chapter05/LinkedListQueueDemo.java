package com.huajie.chapter05;


/**
 * {@link LinkedListQueue}
 */
public class LinkedListQueueDemo {
    public static void main(String[] args) {
        LinkedListQueue linkedListQueue = new LinkedListQueue();
        for (int i = 0; i < 5; i++) {
            linkedListQueue.enqueue("元素" + i);
            System.out.println(linkedListQueue.toString());
        }
        System.out.println("====出队两个元素====");
        for (int i = 0; i < 2; i++) {
            linkedListQueue.dequeue();
            System.out.println(linkedListQueue.toString());
        }
        System.out.println("====再次入队三个元素====");
        for (int i = 0; i < 3; i++) {
            linkedListQueue.enqueue("再出入队元素" + i);
            System.out.println(linkedListQueue.toString());
        }
    }
}
