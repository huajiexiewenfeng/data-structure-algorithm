package com.huajie.utils;


/**
 * 打印输出工具类
 */
public class PrintUtil {
    public static void printlnArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.printf(array[i] + ",");
            } else {
                System.out.println(array[i]);
            }
        }
    }
}
