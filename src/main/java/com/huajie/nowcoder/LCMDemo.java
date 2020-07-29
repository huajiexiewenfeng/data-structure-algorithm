package com.huajie.nowcoder;

import java.util.Scanner;

/**
 * 求两个数的最小公倍数
 *
 * @author ：xwf
 * @date ：Created in 2020-7-29 16:42
 */
public class LCMDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(method(a, b));
        System.out.println(method1(a, b));
    }

    private static int method(int a, int b) {
        if (a > b) {
            return a * b / (gcb(a, b));
        } else {
            return a * b / (gcb(b, a));
        }
    }

    private static int gcb(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcb(b, a % b);
    }

    private static int method1(int a, int b) {
        if (a > b) {
            return method2(a, b);
        } else {
            return method2(b, a);
        }
    }

    private static int method2(int a, int b) {
        for (int i = 1; i <= b; i++) {
            if ((a * i) % b == 0) {
                return a * i;
            }
        }
        return a * b;
    }
}
