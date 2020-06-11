package com.huajie.chapter08;


import java.util.Arrays;

/**
 * 二分查找示例
 *
 * @author ：xwf
 * @date ：Created in 2020-6-11 9:27
 */
public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 11, 19, 21, 25, 27, 33, 38, 55, 87};

        int index = binarySearch(numbers, 19);
        System.out.printf("普通实现-元素[%d]下标：[%d]\n", 19, index);
        // JDK 自带二分查找实现
        Arrays.binarySearch(numbers, 19);
        //递归实现
        int index2 = binarySearchInternally(numbers, 0, 10, 19);

        System.out.printf("递归实现-元素[%d]下标：[%d]\n", 19, index2);
    }

    private static int binarySearch(int[] numbers, int value) {
        int index = -1;
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (numbers[mid] == value) {
                return mid;
            } else if (numbers[mid] < value) {
                low = mid + 1;
            } else if (numbers[mid] > value) {
                high = mid - 1;
            }
        }
        return index;
    }

    /**
     * 递归写法
     */
    private static int binarySearchInternally(int[] numbers, int low, int high, int key) {
        if (low > high || low >= numbers.length) {
            return -(low + 1);
        }

        int mid = low + ((high - low) >> 1);
        int midVal = numbers[mid];
        if (midVal == key) {
            return mid;
        } else if (midVal < key) {
            return binarySearchInternally(numbers, mid + 1, high, key);
        } else {
            return binarySearchInternally(numbers, low, mid - 1, key);
        }
    }
}
