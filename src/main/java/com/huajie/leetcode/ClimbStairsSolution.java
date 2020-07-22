package com.huajie.leetcode;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 * <p>
 * 示例 1：
 * <p>
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 * <p>
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 * <p>
 * 来源：力扣（LeetCode）
 *
 * @author ：xwf
 * @date ：Created in 2020-7-22 16:38
 */
public class ClimbStairsSolution {

    public static void main(String[] args) {
        System.out.println(climbStairs2(10));
        System.out.println(climbStairs(10));
    }

    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static int climbStairs2(int n) {
        int res[] = new int[n + 2];
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i <= n + 1; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[n + 1];
    }

}
