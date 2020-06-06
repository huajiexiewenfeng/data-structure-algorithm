package com.huajie.chapter07;

import java.util.Arrays;

/**
 * 插入排序示例
 */
public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 1, 4, 10, 2, 5};
        insertionSort(numbers);
    }

    private static void insertionSort(int[] numbers) {
        int size = numbers.length;
        for (int i = 1; i < size; i++) {
            int j = i - 1;// 表示已经排序的区域
            int value = numbers[i];// 插入的值
            // value 和已排序区域的每一个元素进行比较，查找插入的位置
            for (; j >= 0; j--) {
                if (numbers[j] > value) { // 如果已排序区域位置[j]的元素大于 value 值
                    numbers[j + 1] = numbers[j];// 往后移动一位
                } else {
                    break;
                }
            }
            numbers[j + 1] = value;// 在腾出的位置插入新元素
        }
        System.out.printf("排序结果为：%s\n", Arrays.toString(numbers));
    }
}
