package com.huajie.chapter04;

import java.util.Arrays;

/**
 * 使用数组来实现一个栈
 */
public class ArrayStack {
    private String[] items;// 存储栈的元素数组
    private Integer length;// 栈的深度
    private Integer count;// 栈目前的元素个数

    public ArrayStack(Integer length) {
        this.items = new String[length];
        this.length = length;
        this.count = 0;
    }

    /**
     * 入栈
     */
    public void push(String item) {
        if (count >= length) {
            throw new RuntimeException("超过栈的最大深度：" + length);
        }
        items[count] = item;
        count++;

    }

    /**
     * 出栈
     */
    public String pop() {
        if (count == 0) {
            throw new RuntimeException("空栈");
        }
        String item = items[count - 1];
        items[count - 1] = null;
        count--;
        return item;
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "items=" + Arrays.toString(items) +
                ", length=" + length +
                ", count=" + count +
                '}';
    }
}
