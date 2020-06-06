package com.huajie.chapter06;

public class StepsRecursionDemo {
    public static void main(String[] args) {
        int n = 10;
        int steps = f(n);
        System.out.printf("[%d]阶楼梯，我们有[%d]种走法\n", n, steps);
    }

    private static int f(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return f(n - 1) + f(n - 2);
    }

    private static int f2(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int res = 0;
//        int n_1 = 1;
//        int n_2 = 2;
//        for (int i = 0; i < n; i++) {
//            res = n_1 + n_2;
//        }

        return res;
    }
}
