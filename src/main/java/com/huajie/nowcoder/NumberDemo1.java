package com.huajie.nowcoder;

import java.util.Scanner;

/**
 * @author ：xwf
 * @date ：Created in 2020\7\29 0029 22:33
 */
public class NumberDemo1 {
        public static void main(String[] args){
//            Scanner in = new Scanner(System.in);
//            while(in.hasNext()){
//                int a =  in.nextInt();
//                int b =  in.nextInt();
//                System.out.println(method(a,b));
//            }
            System.out.println(method(2,2));
        }

        public static int method(int a,int b){
            if(a==0||b==0){
                return 1;
            }
            return method( a-1, b)+method( a, b-1);
        }
}
