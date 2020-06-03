package com.huajie.chapter05;

/**
 * {@link ArrayQueue} 示例
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {
        // 入队异常
//        enqueueException();
        // 入队和出队
//        enqueueAndDequeue();
        // 交替进行
        alternatedenqueueAndDequeue();
    }

    private static void enqueueException() {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        for (int i = 0; i < 6; i++) {
            arrayQueue.enqueue("元素" + i);
            System.err.println(arrayQueue.toString());
        }
    }

    private static void enqueueAndDequeue() {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        for (int i = 0; i < 5; i++) {
            arrayQueue.enqueue("元素" + i);
            System.err.println(arrayQueue.toString());
        }
        for (int i = 0; i < 5; i++) {
            String item = arrayQueue.dequeue();
            System.err.println("出队元素："+item);
            System.err.println(arrayQueue.toString());
        }
    }

    private static void alternatedenqueueAndDequeue() {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        for (int i = 0; i < 5; i++) {
            arrayQueue.enqueue("元素" + i);
            System.err.println(arrayQueue.toString());
        }
        for (int i = 0; i < 2; i++) {
            String item = arrayQueue.dequeue();
            System.err.println("出队元素："+item);
            System.err.println(arrayQueue.toString());
        }
        for (int i = 0; i < 2; i++) {
            arrayQueue.enqueue("再次入队元素" + i);
            System.err.println(arrayQueue.toString());
        }
    }
}
