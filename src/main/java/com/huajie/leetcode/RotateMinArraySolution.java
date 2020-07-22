package com.huajie.leetcode;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[3,4,5,1,2]
 * 输出：1
 * <p>
 * 示例 2：
 * <p>
 * 输入：[2,2,2,0,1]
 * 输出：0
 *
 * @author ：xwf
 * @date ：Created in 2020-7-22 14:39
 */
public class RotateMinArraySolution {

    public static void main(String[] args) {
        int[] numbers = new int[]{3, 1};
        System.out.println(minArray2(numbers));
    }

    public static int minArray(int[] numbers) {
        int res = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (res > numbers[i]) {
                res = numbers[i];
            }
        }
        return res;
    }

    /**
     * 变形的二分查找
     *
     * @param numbers
     * @return
     */
    public static int minArray2(int[] numbers) {
        return findMinArray(numbers,0,numbers.length - 1);
    }

    public static int findMinArray(int[] numbers, int low, int high) {
        if (low == high) {
            return numbers[low];
        }
        int mid = low + ((high - low) >> 1);
        if (numbers[mid] < numbers[high]) { // 说明最小值在 low, mid 区间
            return findMinArray(numbers, low, mid);
        } else if (numbers[mid] > numbers[high]) {// 说明最小值在 mid+1, high 区间
            return findMinArray(numbers, mid + 1, high);
        } else {// 相等说明两个区间都有可能继续递归
            int a = findMinArray(numbers, low, mid);
            int b = findMinArray(numbers, mid + 1, high);
            return a < b ? a : b;
        }
    }
}
