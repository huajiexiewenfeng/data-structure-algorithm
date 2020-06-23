package com.huajie.chapter09;

/**
 * 最大公共子串题解
 *
 * @author ：xwf
 * @date ：Created in 2020-6-23 9:17
 */
public class LongestSameSubStringSolution {
    public static void main(String[] args) {
        String a = "badfeifgh";
        String b = "ba";
        System.out.println(getLongestSameSubString(a, b));
    }

    public static String getLongestSameSubString(String a, String b) {
        Integer aLength = a.length();
        Integer bLength = b.length();
        String res = "";
        for (int i = 0; i < aLength; i++) {
            for (int j = 0; j < bLength; j++) {
                if (a.charAt(i) == b.charAt(j)) {// 如果相等
                    int startIndex = j;
                    for (int k = 0; k < bLength; k++) {
                        if (i + k < aLength && j + k < bLength && a.charAt(i + k) == b.charAt(j + k)) {
                            String str = b.substring(startIndex, j + k + 1);
                            if (str.length() > res.length()) {
                                res = str;
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}
