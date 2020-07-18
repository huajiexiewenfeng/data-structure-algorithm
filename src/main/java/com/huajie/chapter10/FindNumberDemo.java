package com.huajie.chapter10;

/**
 * 判断一个数组中是否存在某个数
 * 给定一个经过任意位数的旋转后的排序数组，判断某个数是否在里面。
 * <p>
 * 例如，对于一个给定数组 {4, 5, 6, 7, 0, 1, 2}，它是将一个有序数组的前三位旋转地放在了数组末尾。
 * 假设输入的 target 等于 0，则输出答案是 4，即 0 所在的位置下标是 4。如果输入 3，则返回 -1。
 *
 * @author ：xwf
 * @date ：Created in 2020-7-18 9:20
 */
public class FindNumberDemo {
    public static void main(String[] args) {
        int[] numbers = new int[]{4, 5, 6, 7, 8, 0, 1, 2};
        int number = 2;
        int index = findNumber(numbers, number, 0, numbers.length - 1);
        System.out.printf("数组中数字[%d]的位置是[%d]\n", number, index);
    }

    private static int findNumber(int[] numbers, int number, int begin, int end) {
        int mid = begin + ((end - begin) >> 1);
        if (number == numbers[mid]) {
            return mid;
        }
        if (numbers[begin] < numbers[mid - 1]) {// 有序
            if (number <= numbers[mid - 1] && number >= (numbers[begin])) {
                return binarySearch(numbers, number, begin, mid - 1);
            } else {
                return findNumber(numbers, number, mid + 1, end);
            }
        } else {
            if (number <= numbers[end] && number >= (numbers[mid + 1])) {
                return binarySearch(numbers, number, mid + 1, end);
            } else {
                return findNumber(numbers, number, begin, mid - 1);
            }
        }
    }

    private static int binarySearch(int[] numbers, int value, int low, int high) {
        int index = -1;
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
}
