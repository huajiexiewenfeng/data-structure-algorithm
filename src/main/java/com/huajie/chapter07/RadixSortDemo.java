package com.huajie.chapter07;

import java.util.Arrays;

/**
 * 基数排序示例
 *
 * @author ：xwf
 * @date ：Created in 2020-6-10 11:31
 */
public class RadixSortDemo {
    public static void main(String[] args) {
        // 随机生成100长度的数组，数组元素 9 位以内的数字，长度不够补 0
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = NumberUtil.generateInt(9, "");
        }
        System.out.println("排序前:" + Arrays.toString(numbers));
        radixSort(numbers);
    }

    private static void radixSort(int[] numbers) {
        // 找到数组中的最大值
        int maxValue = numbers[0];

        // 查找数组的最大值
        for (int i = 0; i < numbers.length; i++) {
            if (maxValue < numbers[i]) {
                maxValue = numbers[i];
            }
        }

        // 根据位数分别进行计数排序
        for (int exp = 1; maxValue / exp > 0; exp *= 10) {
            numbers = countingSort(numbers, exp);
        }

        System.out.println("排序后:" + Arrays.toString(numbers));
    }

    private static int[] countingSort(int[] numbers, int exp) {

        // 计数数组
        int[] countArr = new int[10];

        // 统计每个元素出现的次数
        for (int i = 0; i < numbers.length; i++) {
            countArr[(numbers[i] / exp) % 10]++;
        }

        // countArr 顺序求和
        for (int i = 1; i < 10; i++) {
            countArr[i] = countArr[i - 1] + countArr[i];
        }

        int[] resArr = new int[numbers.length];

        // 倒序插入
        for (int i = numbers.length - 1; i >= 0; i--) {
            // 获取最后一个元素
            int number = numbers[i];
            // 找到元素对应的 count 计数值
            int indexCount = countArr[(number / exp) % 10] - 1;
            // 插入到对应的结果数组中
            resArr[indexCount] = number;
            // 对应的 countArr 的 count -1
            countArr[(number / exp) % 10] = indexCount;
        }

        return resArr;
    }
}
