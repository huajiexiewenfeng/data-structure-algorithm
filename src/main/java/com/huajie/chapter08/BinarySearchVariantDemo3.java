package com.huajie.chapter08;


/**
 * 二分查找示例 变形问题3
 * 查找第一个大于等于给定值的元素
 *
 * @author ：xwf
 * @date ：Created in 2020-6-14 22:13
 */
public class BinarySearchVariantDemo3 {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 11, 19, 19, 20, 25, 28, 38, 55, 87};

        int index = binarySearch(numbers, 0, numbers.length, 19);
        System.out.printf("变形问题3-元素[%d]下标：[%d]\n", 19, index);

        int index2 = binarySearch(numbers, 0, numbers.length, 20);
        System.out.printf("变形问题3-元素[%d]下标：[%d]\n", 20, index2);
    }

    private static int binarySearch(int[] numbers, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            int midValue = numbers[mid];
            if (midValue >= key) {
                if (mid == 0 || numbers[mid - 1] < key) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else {
                low = mid + 1;
            }
        }
        return -(low + 1);
    }

}
