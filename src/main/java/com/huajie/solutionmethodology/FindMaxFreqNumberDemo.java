package com.huajie.solutionmethodology;

import java.util.HashMap;
import java.util.Map;

/**
 * 查找数组中出现次数最多的数字
 *
 * @author ：xwf
 * @date ：Created in 2020-7-8 9:42
 */
public class FindMaxFreqNumberDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 4, 4, 1, 2, 3};
        int value = findMaxFreqNumber(arr);
        System.out.println("出现次数最多的数字：" + value);
        int value2 = findMaxFreqNumberBetter(arr);
        System.out.println("出现次数最多的数字：" + value2);
    }

    /**
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(1)
     *
     * @param arr
     * @return
     */
    private static int findMaxFreqNumber(int[] arr) {
        int timeMax = 0;
        int value = -1;
        for (int i = 0; i < arr.length; i++) {
            int timeTmp = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    timeTmp++;
                }
            }
            if (timeMax <= timeTmp) {
                timeMax = timeTmp;
                value = arr[i];
            }
        }
        return value;
    }

    /**
     * 时间复杂度 O(n)
     * 空间复杂度 O(n)
     *
     * @param arr
     * @return
     */
    private static int findMaxFreqNumberBetter(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();// 存放元素和出现的次数
        int resValue = -1;
        int timeMax = 0;
        for (int i = 0; i < arr.length; i++) {
            Integer key = arr[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = map.get(entry.getKey());// 获取次数
            if (timeMax < value) {
                timeMax = value;
                resValue = entry.getKey();
            }
        }
        return resValue;
    }
}
