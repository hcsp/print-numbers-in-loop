package com.github.hcsp.controlflow;

import java.util.Arrays;

public class Main {
    /**
     * 打印从start到end区间所有的奇数，包括start和end本身（若符合条件）
     * 注意，数字之间用英文逗号分隔
     *
     * start=1,end=5，则打印1,3,5
     * start=-2,end=2，则打印-1,1
     *
     * @param start 区间开始
     * @param end 区间结束
     */
    public static void printOddNumbersBetween(int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {             // 判断奇数
                result.append(i + ",");   // 如果是奇数就 append 到 result 上, 后面加上 ,
            }
        }
        if(result.length()>0){           // 去除字符串中最后一个 , 的方法
            result.deleteCharAt(result.length()-1);
        }

            System.out.print(result);    // 因为这个method的return value是void, 就直接print
        }


    public static void main(String[] args) {
        printOddNumbersBetween(1, 5);
        printOddNumbersBetween(-2, 2);
    }
}
