package com.huajie.nowcoder;

import java.util.Scanner;

/**
 * 立方根
 *
 * @author ：xwf
 * @date ：Created in 2020-7-29 17:10
 */
public class CubeRoot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        //0.1*0.1*0.1=0.0001
        double l = 0.0, r = d;
        while (r - l > 0.0001) {
            double mid = (r + l) / 2;
            if (Math.pow(mid, 3) < d) {
                l = mid;
            } else {
                r = mid;
            }
        }
        if (Math.pow(Math.round(r), 3) == d) { //216的开方 6.0，精益求精，5.9
            System.out.printf("%.1f", (double) Math.round(r));
        } else {
            System.out.printf("%.1f", r);
        }
    }
}
