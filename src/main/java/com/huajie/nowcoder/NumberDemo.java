package com.huajie.nowcoder;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author ：xwf
 * @date ：Created in 2020-7-29 17:33
 */
public class NumberDemo {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String[] str = in.nextLine().split(" ");
//        method(str);
//        int[] nums = new int[]{-13, -4, -7, 2, 1};
//        method(nums);
    }

    public static void method(String[] nums) {
        int length = nums.length;
        int count = 0;
        double sum = 0;

        for (int i = 0; i < length; i++) {
            int num = Integer.parseInt(nums[i]);
            if (num < 0) {
                count++;
            } else {
                sum += num;
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat(".#");

        System.out.println(count);
        if (length == count) {
            System.out.println(0.0);
        } else {
            System.out.println(decimalFormat.format(sum/(length-count)));
        }
    }
}
