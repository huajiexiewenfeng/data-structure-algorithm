package com.huajie.chapter05;

/**
 * {@link CycleArrayQueue} 示例
 */
public class CycleArrayQueueDemo {
    public static void main(String[] args) {
        alternatedenqueueAndDequeue();
    }

    private static void alternatedenqueueAndDequeue() {
        CycleArrayQueue arrayQueue = new CycleArrayQueue(5);
        for (int i = 0; i < 5; i++) {
            arrayQueue.enqueue("元素" + i);
            System.err.println(arrayQueue.toString());
        }
        for (int i = 0; i < 3; i++) {
            String item = arrayQueue.dequeue();
            System.err.println("出队元素："+item);
            System.err.println(arrayQueue.toString());
        }
        for (int i = 0; i < 3; i++) {
            arrayQueue.enqueue("第二次入队元素" + i);
            System.err.println(arrayQueue.toString());
        }
        System.err.println("===================");
        for (int i = 0; i < 5; i++) {
            String item = arrayQueue.dequeue();
            System.err.println("第二次出队元素："+item);
            System.err.println(arrayQueue.toString());
        }
        for (int i = 0; i < 6; i++) {
            arrayQueue.enqueue("第三次入队元素" + i);
            System.err.println(arrayQueue.toString());
        }
    }

}
