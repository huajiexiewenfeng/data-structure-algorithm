package com.huajie.chapter01;

/**
 * 时间复杂度分析示例
 */
public class TimeComplexityDemo {

    public static void main(String[] args) {
        println(cal(10));
        println(cal2(10));
    }

    /**
     * 假设每行代码执行的时间一样，为 unit_time
     * 本方法执行总时间：(2n+2)*unit_time
     *
     * @param n
     * @return
     */
    public static int cal(int n) {
        int sum = 0;
        int i = 1;
        for (; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * 假设每行代码执行的时间一样，为 unit_time
     * 本方法执行总时间：(2+2n+2n^2)*unit_time
     *
     * @param n
     * @return
     */
    public static int cal2(int n) {
        int sum = 0;
        int i = 1;
        for (; i <= n; i++) {
            int j = 1;
            for (; j < n; j++) {
                sum = sum + i;
            }
        }
        return sum;
    }

    /**
     * 加法法则：T(n) = O(max(f(n), g(n)))
     *
     * @param n
     */
    public static void cal3(int n) {
        cal(n);//T1(n)=O(f(n))
        cal2(n);//T2(n)=O(g(n))
    }

    /**
     * 乘法法则：T(n) = T1(n) * T2(n) = O(n*n) = O(n2)
     *
     * @param n
     */
    public static void cal4(int n) {
        for (int i = 0; i < n; i++) {//T1(n)
            cal(n);//T2(n)
        }
    }

    /**
     * T(n) = O(logn)
     *
     * @param n
     */
    public static int calLogn(int n) {
        int i = 1;
        while (i <= n) {
            i = i * 2;
        }
        return i;
    }

    /**
     *
     * @param m
     * @param n
     * @return
     */
    public static int calMN(int m, int n) {
        int sum = 0;

        for (int i = 0; i < m; i++) {
            sum = sum + i;
        }

        for (int i = 0; i < n; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void println(Object res) {
        System.out.println("输出结果：" + res);
    }

}
