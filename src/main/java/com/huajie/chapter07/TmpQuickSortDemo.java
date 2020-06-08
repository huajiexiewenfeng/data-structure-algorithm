package com.huajie.chapter07;

import java.util.Arrays;

/**
 * @Author xwf
 * @Date 2020\6\8 0008 21:04
 */
public class TmpQuickSortDemo {
    public static void main(String[] args) {
        int[] numbers = new int[]{7, 3, 10, 1, 4, 2, 8, 6, 5};
        testQuickSort(numbers);
    }

    private static void testQuickSort(int[] numbers) {
        int size = numbers.length;
        int p = 0;
        int r = size - 1;
        quickSort(numbers, p, r);
        System.out.printf("排序结果为：%s\n", Arrays.toString(numbers));
    }

    private static void quickSort(int[] numbers, int p, int r) {
        if (p >= r) {
            return;
        }
        int q = partition(numbers, p, r);// 获取分区点
        quickSort(numbers, p, q - 1);
        quickSort(numbers, q + 1, r);
    }

    private static int partition(int[] numbers, int p, int r) {
        int pivot = numbers[r];// 将数组的最后一个元素作为分区点
        int i = p, j = p;
        while (j < r) {
            if(numbers[j] < pivot) {
                swap(numbers, i, j);
                i++;
            }
            j++;
        }
        swap(numbers, i, j);
        return i;
    }

    private static void swap(int[] numbers, int i, int j) {
        int tmp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = tmp;
    }

}
