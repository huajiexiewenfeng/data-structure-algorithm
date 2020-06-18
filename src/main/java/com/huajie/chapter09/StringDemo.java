package com.huajie.chapter09;

/**
 * @author ：xwf
 * @date ：Created in 2020-6-18 10:11
 */
public class StringDemo {
    public static void main(String[] args) {
        String strA = "baddef";
        String strB = "abc";
        String strC = "ad";
        int index = strMatchForBF(strA, strB);
        int index1 = strMatchForBF(strA, strC);
        System.out.printf("主串：[%s],模式串：[%s],匹配位置：[%d]\n", strA, strB, index);
        System.out.printf("主串：[%s],模式串：[%s],匹配位置：[%d]\n", strA, strC, index1);
    }

    /**
     * BF算法
     *
     * @param strA 主串
     * @param strB 模式串
     * @return 模式串B所在的位置
     */
    public static int strMatchForBF(String strA, String strB) {
        char[] charsA = strA.toCharArray();
        char[] charsB = strB.toCharArray();
        int lengthA = charsA.length;
        int lengthB = charsB.length;
        for (int i = 0; i <= lengthA - lengthB; i++) {
            int k = 0;// 用来记录对比结果
            if (charsA[i] == charsB[0]) {// 如果第一位相等
                for (int j = 1; j < lengthB; j++) {
                    if (charsA[i + j] == charsB[j]) {// 后续的字符是否相等
                        k++;
                    } else {
                        break;
                    }
                }
                if (k == lengthB - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
