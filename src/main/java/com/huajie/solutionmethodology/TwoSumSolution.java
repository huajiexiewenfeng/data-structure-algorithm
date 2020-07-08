package com.huajie.solutionmethodology;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * @author ：xwf
 * @date ：Created in 2020-7-8 11:10
 */
public class TwoSumSolution {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(arr, target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] twoSum(int[] arr, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();// 用来存储差值和原值下标
        for (int i = 0; i < arr.length; i++) {
            map.put(target - arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {// 存在差值元素
                int index = map.get(arr[i]);
                if (i == index) {// [3,3]->6 元素重复问题
                    continue;
                }
                res[0] = index;// 原值位置
                res[1] = i;// 差值位置
            }
        }
        return res;
    }
}
