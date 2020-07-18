package com.huajie.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 无重复字符的最长子串
 *
 * @author ：xwf
 * @date ：Created in 2020-7-18 15:19
 */
public class LengthOfLongestSubstringSolution {

    public static void main(String[] args) {
        String str = "dvdf";
        int maxLength = lengthOfLongestSubstring(str);
        System.out.printf("字符串[%s]的无重复最长子串长度为[%d]\n", str, maxLength);
    }


    /**
     * 解法1
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        if ("".equals(s)) return 0;
        int maxLength = 1;
        Map<Character, Integer> map = new HashMap<>();
        for (int start = 0; start < s.length(); start++) {
            Character chr = s.charAt(start);
            if (!map.containsKey(chr)) {
                map.put(chr, start);
                if (maxLength < map.size()) {
                    maxLength = map.size();
                }
            } else {//从第一个重复的下标+1的位置重新开始记录
                start = map.get(chr);
                map.clear();
            }
        }
        return maxLength;
    }

    /**
     * 减少重复退回查询的次数
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring2(String s) {
        if ("".equals(s)) return 0;
        int maxLength = 1;
        Map<Character, Integer> map = new HashMap<>();
        for (int start = 0; start < s.length(); start++) {
            Character chr = s.charAt(start);
            if (!map.containsKey(chr)) {
                map.put(chr, start);
                if (maxLength < map.size()) {
                    maxLength = map.size();
                }
            } else {
                //map 里面删除 重复字符之前的元素，然后数组下标从当前重复的这个位置开始往前进行
                //...
            }
        }
        return maxLength;
    }

}
