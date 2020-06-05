package com.huajie.chapter07;

import java.util.Arrays;

/**
 * 冒泡排序示例
 *
 * @Author xwf
 * @Date 2020\6\5 0005 21:56
 */
public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 1, 4, 10, 2, 5};
        bubbleSort(numbers);
        bubbleSortBetter(numbers);
    }

    private static void bubbleSort(int[] numbers) {
        int count = 0;
        int size = numbers.length;
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int tmp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = tmp;
                }
                count++;
            }
        }
        System.out.printf("循环[%d]次，结果为：%s\n", count, Arrays.toString(numbers));
    }

    private static void bubbleSortBetter(int[] numbers) {
        int count = 0;
        int size = numbers.length;
        for (int j = 0; j < size; j++) {
            boolean flag = false;
            for (int i = 0; i < size - 1; i++) {
                flag = true;
                if (numbers[i] > numbers[i + 1]) {
                    flag = false;// 有数据交换
                    int tmp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = tmp;
                }
                count++;
            }
            if (flag) {// 表示没有发生交换，完全有序，可以提前退出
                break;
            }
        }
        System.out.printf("循环[%d]次，结果为：%s\n", count, Arrays.toString(numbers));
    }
}
