package com.huajie.chapter07;

import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 1, 4, 10, 2, 5};
        selectionSort(numbers);
    }

    private static void selectionSort(int[] numbers) {
        int size = numbers.length;
        for (int i = 0; i < size - 1; i++) {
            int minValue = numbers[i];
            int k = i;// 未排序区间最小值的下标
            for (int j = i + 1; j < size; j++) {// 找到未排序区域最小的元素
                if (minValue > numbers[j]) {
                    minValue = numbers[j];
                    k = j;
                }
            }
            numbers[k] = numbers[i];// 交换
            numbers[i] = minValue;// 将元素插入到已排序区域的末尾
        }
        System.out.printf("排序结果为：%s\n", Arrays.toString(numbers));
    }
}
