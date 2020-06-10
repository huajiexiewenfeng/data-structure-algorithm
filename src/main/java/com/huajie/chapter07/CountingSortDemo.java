package com.huajie.chapter07;

import java.util.Arrays;
import java.util.Random;

/**
 * 计数排序示例
 *
 * @author ：xwf
 * @date ：Created in 2020-6-10 8:52
 */
public class CountingSortDemo {

    public static void main(String[] args) {
        // 随机生成100长度的数组，数组元素100以内
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = new Random().nextInt(100);
        }
        System.out.println("排序前:" + Arrays.toString(numbers));
        numbers = countingSort(numbers);
        System.out.println("排序后:" + Arrays.toString(numbers));
    }

    private static int[] countingSort(int[] numbers) {
        int maxValue = numbers[0];

        // 查找数组的最大值
        for (int i = 0; i < numbers.length; i++) {
            if (maxValue < numbers[i]) {
                maxValue = numbers[i];
            }
        }

        // 计数数组
        int[] countArr = new int[maxValue + 1];

        // 统计每个元素出现的次数
        for (int i = 0; i < numbers.length; i++) {
            countArr[numbers[i]]++;
        }

        // countArr 顺序求和
        for (int i = 1; i < maxValue + 1; i++) {
            countArr[i] = countArr[i - 1] + countArr[i];
        }

        int[] resArr = new int[numbers.length];

        // 倒序插入
        for (int i = numbers.length - 1; i >= 0; i--) {
            // 获取最后一个元素
            int number = numbers[i];
            // 找到元素对应的 count 计数值
            int indexCount = countArr[number] - 1;
            // 插入到对应的结果数组中
            resArr[indexCount] = number;
            // 对应的 countArr 的 count -1
            countArr[number] = indexCount;
        }

        return resArr;
    }
}
