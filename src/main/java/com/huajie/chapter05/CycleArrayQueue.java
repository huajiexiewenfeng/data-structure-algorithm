package com.huajie.chapter05;

import java.util.Arrays;

/**
 * 使用数组来实现循环队列
 */
public class CycleArrayQueue {

    private String[] items;// 队列存储的元素
    private int n;// 队列大小
    private int count;// 实际元素个数
    private int head;// 头节点下标
    private int tail;// 尾节点下标

    private static final String[] EMPTY_ELEMENTDATA = {};

    public CycleArrayQueue(int initialCapacity) {
        if (initialCapacity > 0) {
            this.items = new String[initialCapacity];
            n = initialCapacity;
        } else if (initialCapacity == 0) {
            this.items = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialCapacity);
        }
    }

    /**
     * 从尾部入队
     *
     * @param item
     * @return
     */
    public boolean enqueue(String item) {
        if (count == n) {
            throw new RuntimeException("队列已满");
        }
        if (tail == n) {// 需要将新加入的元素添加到前面空闲节点
            tail = 1;
            items[0] = item;
        } else {
            items[tail] = item;
            tail++;
        }
        count++;
        return true;
    }

    /**
     * 从头部出队
     *
     * @return
     */
    public String dequeue() {
        if (count == 0) {
            throw new RuntimeException("空队列");
        }
        String res = items[head];
        items[head] =null;
        head = (head + 1) % n;
        count--;
        return res;
    }

    @Override
    public String toString() {
        return "CycleArrayQueue{" +
                "items=" + Arrays.toString(items) +
                ", n=" + n +
                ", count=" + count +
                ", head=" + head +
                ", tail=" + tail +
                '}';
    }
}
