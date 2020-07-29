package com.huajie.leetcode.array;

import java.util.Arrays;

/**
 * 题目描述：给定一个长度为n的数组A，求数组B，B[i] = A[0]A[1]...A[i-1]*A[i+1]...A[n-1]。
 * 要求不能使用除法。
 *
 * @author ：xwf
 * @date ：Created in 2020\7\28 0028 21:47
 */
public class Multiply {
    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(multiply(A)));
    }

    public static int[] multiply(int[] A) {
        int[] B = new int[A.length];
        B[0] = 1;
        for (int i = 1; i < A.length; i++) {
            B[i] = B[i - 1] * A[i - 1];
        }
        int tmp = 1;
        for (int i = A.length - 2; i >= 0; i--) {
            tmp = tmp * A[i + 1];
            B[i] = B[i] * tmp;
        }
        return B;
    }
}
