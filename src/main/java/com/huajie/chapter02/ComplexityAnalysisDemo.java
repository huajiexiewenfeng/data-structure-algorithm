package com.huajie.chapter02;

import com.huajie.utils.PrintUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

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
        // 均摊时间复杂度

        array = new int[5];

        for (int i = 0; i < 6; i++) {
            insert(array, i);
        }

        PrintUtil.printlnArray(array);

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

    static int count = 0;

    public static void insert(int[] array, int val) {
        if (count == array.length) {//如果count和数组
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            array[0] = sum;
            count = 1;
        }
        array[count] = val;
        ++count;
    }


    public static void println(Object res) {
        System.out.println("输出结果：" + res);
    }


}
