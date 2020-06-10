package com.huajie.chapter07;

/**
 * 生成随机数工具类
 *
 * @author ：xwf
 * @date ：Created in 2020-6-10 11:29
 */
public class NumberUtil {
    /**
     * 获取长度固定的随机数
     *
     * @param len            随机数长度
     * @param excludeNumbers 需要排除的数字：1,2,3...
     * @return
     */
    public static Integer generateInt(int len, String excludeNumbers) {
        Integer number = 1;
        for (Integer i = 0; i < len; i++) {
            number = number * 10;
        }
        boolean flag = true;
        Integer res = 0;
        while (flag) {
            Integer num = Integer.valueOf(String.valueOf(Math.round((Math.random()) * number)));
            if (!exist(excludeNumbers, num)) {
                flag = false;
                res = (num + "").length() >= len ? num : Integer.valueOf(num + getZeroStr(len - (num + "").length()));
            }
        }
        return res;
    }

    /**
     * 位数不够，后面补0
     */
    public static String getZeroStr(Integer len) {
        String str = "";
        for (int i = 0; i < len; i++) {
            str += "0";
        }
        return str;
    }

    /**
     * excludeNumbers中是否存在num元素
     */
    public static boolean exist(String excludeNumbers, Integer num) {
        if (excludeNumbers.equals("") || excludeNumbers == null) {
            return false;
        }
        String[] numbers = excludeNumbers.split(",");
        for (int i = 0; i < numbers.length; i++) {
            if (Integer.parseInt(numbers[i]) == num) {
                return true;
            }
        }
        return false;
    }
}
