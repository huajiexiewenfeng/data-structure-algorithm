package com.huajie.chapter08;


/**
 * 二分查找示例 变形问题2
 * 查找最后一个值等于给定值的元素
 *
 * @author ：xwf
 * @date ：Created in 2020-6-14 22:13
 */
public class BinarySearchVariantDemo2 {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 11, 19, 19, 20, 25, 28, 38, 55, 87};

        int index = binarySearch(numbers, 0, numbers.length, 19);
        System.out.printf("变形问题2-元素[%d]下标：[%d]\n", 19, index);
    }

    private static int binarySearch(int[] numbers, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            int midValue = numbers[mid];
            if (midValue > key) {
                high = mid - 1;
            } else if (midValue < key) {
                low = mid + 1;
            } else {
                if (mid == high || numbers[mid + 1] != key) {// 表示这是第一个值
                    return mid;
                } else {// 如果 mid值 = key，而且 mid-1 的位置也等于 key
                    low = mid + 1;
                }
            }
        }
        return -(low + 1);
    }

}
