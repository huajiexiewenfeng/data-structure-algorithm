package com.huajie.chapter07;


import java.util.Arrays;

/**
 * 快速排序示例
 *
 * @Author xwf
 * @Date 2020\6\8 0008 10:17
 */
public class QuickSortDemo {
    public static void main(String[] args) {
        int[] numbers = new int[]{7, 3, 10, 1, 4, 2, 8, 6, 9, 11, 5};
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
        int size = numbers.length;
        int pivot = numbers[r];// 将数组的最后一个元素作为分区点

        int[] tmpArray1 = new int[size];// 用来存储大于分区点的元素
        int[] tmpArray2 = new int[size];// 用来存储小于分区点的元素

        int j = 0;
        int k = 0;
        for (int i = p; i < r; i++) {
            int number = numbers[i];
            if (number <= pivot) {
                tmpArray1[j++] = number;
            } else {
                tmpArray2[k++] = number;
            }
        }

        // 将排序后的数组放回掉临时数组中
        for (int i = 0; i < j; i++) {
            numbers[p + i] = tmpArray1[i];
        }

        numbers[p + j] = pivot;

        for (int i = 0; i < k; i++) {
            numbers[p + i + j + 1] = tmpArray2[i];
        }

        return p + j;// 返回当前分区点所在的位置
    }


    private static int partitionBetter(int[] numbers, int low, int high) {



        return low;// 返回当前分区点所在的位置
    }

}
