package com.huajie.chapter05;

import java.util.Arrays;

/**
 * 使用数组来实现队列
 */
public class ArrayQueue {

    private String[] items;// 队列存储的元素
    private int n;// 队列大小
    private int head;// 头节点下标
    private int tail;// 尾节点下标

    private static final String[] EMPTY_ELEMENTDATA = {};

    public ArrayQueue(int initialCapacity) {
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
        if (tail == n) {
            if (head == 0) {//没有出队操作
                throw new RuntimeException("队列已满");
            } else {//有出队操作，表示队列头部有空余空间，可以进行数据迁移
                System.err.println("触发数据迁移");
                for (int i = 0; i < n; i++) {
                    if (i <= head) {
                        items[i] = items[i + head];
                    } else {
                        items[i] = null;
                    }
                }
                tail = head + 1;
                head = 0;
            }
        }
        items[tail] = item;
        tail++;
        return true;
    }

    /**
     * 从头部出队
     *
     * @return
     */
    public String dequeue() {
        if (tail == head) {
            throw new RuntimeException("空队列");
        }
        String res = items[head];
        items[head] = null;
        head++;
        return res;
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "items=" + Arrays.toString(items) +
                ", n=" + n +
                ", head=" + head +
                ", tail=" + tail +
                '}';
    }
}
