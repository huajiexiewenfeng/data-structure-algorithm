package com.huajie.chapter07;

import java.util.Arrays;
import java.util.Random;

/**
 * 桶排序示例
 *
 * @Author xwf
 * @Date 2020\6\9 0009 21:00
 */
public class BucketSortDemo {

    public static void main(String[] args) {
        // 随机生成1000长度的数组，数组元素10000以内
        int[] numbers = new int[1000];
        for (int i = 0; i < 1000; i++) {
            numbers[i] = new Random().nextInt(10000);
        }
        System.out.println("排序前:" + Arrays.toString(numbers));
        bucketSort(numbers, 100);
        System.out.println("排序后:" + Arrays.toString(numbers));
    }

    /**
     * 桶排序
     *
     * @param numbers    需要排序的数组
     * @param bucketSize 桶容量
     */
    private static void bucketSort(int[] numbers, int bucketSize) {
        // 获取数组的最大值和最小值
        int maxValue = numbers[0];
        int minValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        System.out.println("最大值：" + maxValue);
        System.out.println("最大值：" + minValue);
        // 计算桶的数量
        int bucketCount = (maxValue - minValue) / bucketSize + 1;
        // 创建桶
        int[][] buckets = new int[bucketCount][bucketSize];
        // 每个桶中的下标数组
        int[] indexArr = new int[bucketCount];

        // 将 numbers 数组中的元素均匀的分配到桶中
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            //计算桶的位置
            int bucketIndex = (number - minValue) / bucketSize;
            buckets[bucketIndex][indexArr[bucketIndex]++] = number;
        }
        int k = 0;
        // 每个桶进行排序，这里使用快排
        for (int i = 0; i < buckets.length; i++) {
            quickSort(buckets[i], 0, indexArr[i] - 1);
            // 最后将桶的数据依次插入到原数组中
            for (int j = 0; j < indexArr[i]; j++) {
                numbers[k++] = buckets[i][j];
            }
        }
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
            if (numbers[j] < pivot) {
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
