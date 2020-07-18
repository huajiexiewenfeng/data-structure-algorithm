package com.huajie.chapter10;

/**
 * 斐波纳契数列
 *
 * @author ：xwf
 * @date ：Created in 2020-7-17 17:19
 */
public class FibonacciDemo {
    public static void main(String[] args) {
        int index = 1;
        System.out.printf("位置[%d]的斐波纳契数为：[%d]\n", index, fn(index));
    }

    public static int fn(int number) {
        if (number <= 1) {
            return number;
        }
        return fn(number - 1) + fn(number - 2);
    }
}
