package com.huajie.chapter05;


import java.util.Arrays;

/**
 * 使用链表来实现队列
 */
public class LinkedListQueue {

    private Node head;// 头节点
    private Node tail;// 尾节点
    private int size;

    public LinkedListQueue() {
    }

    /**
     * 从尾部入队
     *
     * @param element
     * @return
     */
    public boolean enqueue(String element) {
        if (head == null) {
            head = tail = new Node(element, null);
        } else {
            Node node = new Node(element, null);
            tail.next = node;
            tail = tail.next;
        }
        size++;
        return true;
    }

    /**
     * 从头部出队
     *
     * @return
     */
    public String dequeue() {
        String res = head.item;
        head = head.next;
        size--;
        return res;
    }

    private static class Node {
        String item;
        Node next;

        Node(String element, Node next) {
            this.item = element;
            this.next = next;
        }
    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node x = head; x != null; x = x.next)
            result[i++] = x.item;
        return result;
    }

    @Override
    public String toString() {
        return "LinkedListQueue{" +
                "元素集合=" + Arrays.toString(toArray()) +
                '}';
    }
}
