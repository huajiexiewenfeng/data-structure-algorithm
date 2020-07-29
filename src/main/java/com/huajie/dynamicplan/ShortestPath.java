package com.huajie.dynamicplan;

/**
 * 最短路径
 *
 * @author ：xwf
 * @date ：Created in 2020\7\25 0025 16:26
 */
public class ShortestPath {
    public static void main(String[] args) {
        int[][] m = {{0, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 8, 7, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 6, 8, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 3, 5, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 8, 4, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 2, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 6, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3}};
        System.out.println(shortestPath(m));
    }

    public static int shortestPath(int[][] matrix) {
        return process(matrix, matrix[0].length - 1);
    }

    private static int process(int[][] matrix, int i) {
        if (i == 0) {// 说明已经递归到起点 A
            return 0;
        } else {
            int distance = 999;
            for (int j = 0; j < i; j++) {
                if (matrix[j][i] != 0) {// 只有值不为 0 才说明两个结点之间存在通路
                    int tmp_p = matrix[j][i] + process(matrix, j);// 计算路径长度
                    if (tmp_p < distance) {
                        distance = tmp_p;
                    }
                }
            }
            return distance;
        }
    }
}
