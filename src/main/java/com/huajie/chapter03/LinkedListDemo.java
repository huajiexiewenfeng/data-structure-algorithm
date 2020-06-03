package com.huajie.chapter03;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 链表示例
 * @Author xwf
 * @Date 2020\5\31 0031 15:04
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(Arrays.toString(list.toArray()));
    }
}
