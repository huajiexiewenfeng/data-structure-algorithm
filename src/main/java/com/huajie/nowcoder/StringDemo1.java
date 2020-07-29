package com.huajie.nowcoder;

import java.util.Scanner;

/**
 * 字符串反转
 *
 * @author ：xwf
 * @date ：Created in 2020\7\29 0029 22:43
 */
public class StringDemo1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String res="";
        for(int i = a.length()-1;i>=0;i--){
            res+=a.charAt(i);
        }
        System.out.println(res);
    }
}
