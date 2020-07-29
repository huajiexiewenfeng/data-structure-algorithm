package com.huajie.nowcoder;

import java.util.Scanner;

/**
 * @author ：xwf
 * @date ：Created in 2020\7\29 0029 22:51
 */
public class StringDemo2 {
    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        String a = in.nextLine();
        String a ="EaPAaNfzmnCfnEzSUAFKfXDfbWlYorJHkAmSbZltSetyWSLGfkWdzZjCmKIvFcRIRvuxpuASNdCfrXCQCOlmoaVPzvDegpSxAywfLlzZWkpPCFXUWwkugIMIopzKfdvFianTqwjeGSSfBqSMXnuADdBSXDQjVRAdVaiDOOkCoUXAqeCVomEjZieNvsVGgRQxH";
        int res=0;
        for(int i = a.length()-1;i>=0;i--){
            char b = a.charAt(i);
            if(b>='A'&&b<='Z'){
                res++;
            }
        }
        System.out.println(res);
    }
}
