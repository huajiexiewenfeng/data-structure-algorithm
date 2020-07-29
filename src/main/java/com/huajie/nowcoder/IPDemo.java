package com.huajie.nowcoder;

import java.util.Scanner;

/**
 * @author ：xwf
 * @date ：Created in 2020\7\29 0029 22:40
 */
public class IPDemo {
    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//            String ip =  in.nextLine();
//            System.out.println(method(ip));
//        }
        System.out.println(method("12.12.12.0"));
    }

    public static String method(String ip){
        String[] strs = ip.split("\\.");
        if(strs.length==4){
            for(int i=0;i<4;i++){
                int a = Integer.valueOf(strs[i]);
                if(a>255||a<0){
                    return "NO";
                }
            }
            return "YES";
        }else{
            return "NO";
        }
    }
}
