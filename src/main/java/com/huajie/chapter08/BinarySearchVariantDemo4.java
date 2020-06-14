package com.huajie.chapter08;


/**
 * 二分查找示例 变形问题4
 * 查找最后一个大于等于给定值的元素
 *
 * @author ：xwf
 * @date ：Created in 2020-6-14 22:33
 */
public class BinarySearchVariantDemo4 {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 11, 19, 19, 20, 25, 28, 38, 55, 87};

        int index = binarySearch(numbers, 0, numbers.length, 18);
        System.out.printf("变形问题4-元素[%d]下标：[%d]\n", 18, index);
    }

    private static int binarySearch(int[] numbers, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            int midValue = numbers[mid];
            if (midValue <= key) {
                if (mid == high || numbers[mid + 1] > key) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else {
                high = mid - 1;
            }
        }
        return -(low + 1);
    }

}
