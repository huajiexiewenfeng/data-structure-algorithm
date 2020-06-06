package com.huajie.chapter06;

/**
 * 电影院递归相关示例
 */
public class CinemaRecursionDemo {
    public static void main(String[] args) {
        int n = f(10);
        System.out.printf("原来我们在第[%d]排\n", n);
        // 改写之后
        int n2 = f2(2);
        System.out.printf("改写之后原来我们在第[%d]排\n", n2);
    }

    private static int f(int n) {
        if (n == 1) {
            return 1;
        }
        return f(n - 1) + 1;
    }

    private static int f2(int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res++;
        }
        return res;
    }
}
