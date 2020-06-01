package com.huajie.chapter04;

/**
 * JVM 虚拟机栈
 *
 * @Author xwf
 * @Date 2020\6\1 0001 21:14
 */
public class JVMStackDemo {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 1;
        int res = 0;
        int result = 0;
        res = add(a, b);
        result = res + c;
        System.out.println(result);
    }

    public static int add(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }

}
