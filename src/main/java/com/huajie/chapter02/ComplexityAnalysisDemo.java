package com.huajie.chapter02;

import java.util.ArrayList;

/**
 * 复杂度分析示例
 */
public class ComplexityAnalysisDemo {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        println(find(array, array.length, 3));
        println(find2(array, array.length, 3));
        Object[][] objects = new Object[][]{};
        ArrayList<ArrayList<Object>> objArr = new ArrayList<ArrayList<Object>>();
    }

    /**
     * 找到数组中元素为 x 的下标位置
     */
    public static int find(int[] array, int n, int x) {
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                pos = i;
            }
        }
        return pos;
    }

    /**
     * 找到数组中元素为 x 的下标位置 优化
     */
    public static int find2(int[] array, int n, int x) {
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }


    public static void println(Object res) {
        System.out.println("输出结果：" + res);
    }

}
