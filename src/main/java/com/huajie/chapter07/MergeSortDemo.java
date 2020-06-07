package com.huajie.chapter07;

import java.util.Arrays;

/**
 * 归并排序示例
 *
 * @Author xwf
 * @Date 2020\6\7 0007 11:57
 */
public class MergeSortDemo {
    public static void main(String[] args) {
        int[] numbers = new int[]{7, 3, 10,1, 4, 2, 8, 6, 5};
        testMergeSort(numbers);
    }

    private static void testMergeSort(int[] numbers) {
        int size = numbers.length;
        int p = 0;
        int r = size - 1;
        int[] res = mergeSort(numbers, p, r);
        System.out.printf("排序结果为：%s\n", Arrays.toString(res));
    }

    private static int[] mergeSort(int[] numbers, int p, int r) {
        if (p >= r) {
            return new int[]{numbers[p]};
        }
        int q = (p + r) / 2;
        int[] numbers1 = mergeSort(numbers, p, q);
        int[] numbers2 = mergeSort(numbers, q + 1, r);
        return mergeArray(numbers1, numbers2);
    }

    private static int[] mergeArray(int[] numbers1, int[] numbers2) {
        int size1 = numbers1.length;
        int size2 = numbers2.length;
        // 申请临时数组
        int[] tmpArray = new int[size1 + size2];
        int i = 0;
        int j = 0;
        int k = 0;
        // 数组1的元素依次和数组2的元素进行对比，将小元素放到临时数组中
        while (i < size1 && j < size2) {
            if (numbers1[i] <= numbers2[j]) {
                tmpArray[k++] = numbers1[i++];
            } else {
                tmpArray[k++] = numbers2[j++];
            }
        }
        // 查找数组1中剩余的没有比较的元素 移动到临时数组中
        if (i < size1) {
            int n = size1 - i;
            for (int l = 0; l < n; l++) {
                tmpArray[k++] = numbers1[i++];
            }
        }
        // 查找数组2中剩余的没有比较的元素 移动到临时数组中
        if (j < size2) {
            int n = size2 - j;
            for (int l = 0; l < n; l++) {
                tmpArray[k++] = numbers2[j++];
            }
        }
        // 将临时数组移动到原数组中
        return tmpArray;
    }

}
