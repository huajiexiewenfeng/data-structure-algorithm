package com.huajie.chapter09;

import java.util.Arrays;

/**
 * 反转字符串题解
 *
 * @author ：xwf
 * @date ：Created in 2020-6-18 11:55
 */
public class ReverseStringSolution {

    public static void main(String[] args) {
        char[] a = "hello".toCharArray();
        System.out.println("原字符串：" + Arrays.toString(a));
        reverseString(a);
        System.out.println("反转后：" + Arrays.toString(a));
    }

    public static void reverseString(char[] s) {
        reverseStr(s, 0, s.length - 1);
    }

    private static void reverseStr(char[] s, int left, int right) {
        if (left <= right) {
            char tmp = s[right];
            s[right--] = s[left];
            s[left++] = tmp;
            reverseStr(s, left, right);
        }
    }

}
