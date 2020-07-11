package com.huajie.lru;

import java.util.Random;

/**
 * 使用单链表实现 LRU 算法
 *
 * @author ：xwf
 * @date ：Created in 2020\7\11 0011 19:19
 */
public class LinkedListLRU {

    public static void main(String[] args) {
        LinkedList list = new LinkedList(5);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int key = random.nextInt(10);
            Integer value = random.nextInt(10);
            System.out.println("插入值：" + value);
            list.put(key, value);
            System.out.println("链表：" + list.toString());
        }
        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(10);
            System.out.println("获取值>" + value + ":" + list.get(value));
            System.out.println("链表：" + list.toString());
        }
    }

    static class LinkedList {
        int maxSize;
        int size;
        Node first;

        public LinkedList(int maxSize) {
            this.maxSize = maxSize;
        }

        Integer get(int key) {
            Node node = contains(key);
            if (node != null) {
                Integer index = contains(node);
                Integer value = node.getVal();
                if (index == 1) {// 表示和头结点相等
                    return value;
                }
                del(index);
                addFirst(node);
                return value;
            } else {
                return -1;
            }
        }

        void put(Integer key, Integer value) {
            Node node = new Node(key, value);
            if (first == null) {// 初始化头结点
                first = node;
                size++;
                return;
            }
            int index = contains(node);// 查找是否存在该节点
            if (index < 0) {// 链表不存在该节点
                if (size >= maxSize) {// 如果队列已满
                    delLast();// 删除最后一个节点
                }
            } else if (index == 1) {// 表示和头结点相等
                return;
            } else {// 存在这个节点
                del(index);
            }
            addFirst(node);
        }

        void addFirst(Node node) {
            node.next = first;
            first = node;
            size++;
        }

        void delLast() {
            del(size);
        }

        void del(int index) {
            Node tmp = first;
            for (int i = 0; i < index - 2; i++) {// 找到当前需要删除节点的上一个节点
                tmp = tmp.next;
            }
            if (tmp.next != null) {
                tmp.next = tmp.next.next;// 删除当前节点
            }
            size--;
        }

        int contains(Node node) {
            int index = 1;
            Node tmp = first;
            while (tmp != null) {// 遍历循环查找当前节点的位置
                if (tmp.getKey() == node.getKey()) {
                    return index;
                }
                tmp = tmp.next;
                index++;
            }
            return -1;
        }

        Node contains(int key) {
            Node tmp = first;
            while (tmp != null) {// 遍历循环查找当前节点的位置
                if (tmp.getKey() == key) {
                    return tmp;
                }
                tmp = tmp.next;
            }
            return null;
        }

        @Override
        public String toString() {
            String res = "";
            for (Node x = first; x != null; x = x.next) {
                res += "[" + x.getKey() + ":" + x.getVal() + "],";
            }
            return res.equals("") ? res : res.substring(0, res.length() - 1);
        }
    }

    static class Node {
        Integer key;
        Integer val;
        Node next;

        public Integer getVal() {
            return val;
        }

        public Integer getKey() {
            return key;
        }

        Node(Integer key, Integer value) {
            this.key = key;
            this.val = value;
        }
    }

}
