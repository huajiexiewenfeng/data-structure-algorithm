package com.huajie.nowcoder;

import java.util.Scanner;

/**
 * 旋转字符串
 *
 * @author ：xwf
 * @date ：Created in 2020-7-29 17:12
 */
public class StringRotate {

    public static void main(String[] args) {
//        Scanner sacnner = new Scanner(System.in);
//        String str = sacnner.nextLine();
        System.out.println(stringRotate("m jbrwbmamzlz bkjokxancguvcoc"));
    }

    public static String stringRotate(String str) {
        String resStr = "";
        String[] strs = str.split(" ");
        for (int i = strs.length - 1; i >= 0; i--) {
            resStr += singleStringRotate(strs[i]) + " ";
        }
        return resStr.substring(0,resStr.length()-1);
    }

    public static String singleStringRotate(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }

}
