package com.huajie.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number
 *
 * @author ：xwf
 * @date ：Created in 2020-7-22 17:43
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 1};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumber1(nums));
    }

    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet();
        Set<Integer> setN = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i]) && !setN.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                set.remove(nums[i]);
                setN.add(nums[i]);
            }
        }
        return set.iterator().next();
    }

    /**
     * 官方解法
     *
     * @param nums
     * @return
     */
    public static int singleNumber1(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

}
