package com.huajie.leetcode.array;

/**
 * 88. 合并两个有序数组
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 *
 * @author ：xwf
 * @date ：Created in 2020\7\26 0026 19:57
 */
public class MergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j = 0; i < m + n; i++, j++) {
            nums1[i] = nums2[j];
        }
        quickSort(nums1, 0, m + n);
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
        int size = numbers.length;
        int pivot = numbers[r];// 将数组的最后一个元素作为分区点

        int[] tmpArray1 = new int[size];// 用来存储大于分区点的元素
        int[] tmpArray2 = new int[size];// 用来存储小于分区点的元素

        int j = 0;
        int k = 0;
        for (int i = p; i < r; i++) {
            int number = numbers[i];
            if (number <= pivot) {
                tmpArray1[j++] = number;
            } else {
                tmpArray2[k++] = number;
            }
        }

        // 将排序后的数组放回掉临时数组中
        for (int i = 0; i < j; i++) {
            numbers[p + i] = tmpArray1[i];
        }

        numbers[p + j] = pivot;

        for (int i = 0; i < k; i++) {
            numbers[p + i + j + 1] = tmpArray2[i];
        }

        return p + j;// 返回当前分区点所在的位置
    }
}
