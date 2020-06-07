package com.huajie.chapter06;

/**
 * n 阶楼梯问题
 */
public class StepsRecursionDemo {
    public static void main(String[] args) {
        int n = 10;
        int steps = f(n);
        System.out.printf("[%d]阶楼梯，我们有[%d]种走法\n", n, steps);
        System.out.println("====改写之后====");
        steps = f2(n);
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
        int n_minus_1 = 2;// 假设 n=3,n-1=2 个台阶有2种走法
        int n_minus_2 = 1;// 假设 n=3,n-2=1 个台阶有1种走法
        for (int i = 3; i <= n; i++) {
            res = n_minus_1 + n_minus_2;
            n_minus_2 = n_minus_1;// 假设 n=4,第二次循环，4-2 = 2 有2种走法
            n_minus_1 = res;// 假设 n=4,第二次循环，4-1=3 有 3(上一次的2+1) 种走法
        }
        return res;
    }
}
