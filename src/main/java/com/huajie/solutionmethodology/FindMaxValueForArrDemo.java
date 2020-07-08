package com.huajie.solutionmethodology;

/**
 * 找到数组的最大值
 *
 * @author ：xwf
 * @date ：Created in 2020-7-8 9:11
 */
public class FindMaxValueForArrDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 10, 2, 3};
        int maxValue = findMaxValue(arr);
        System.out.println("最大值：" + maxValue);
    }

    private static int findMaxValue(int[] arr) {
        int maxValue = -1;
        for (int i = 0; i < arr.length; i++) {
            if (maxValue <= arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
