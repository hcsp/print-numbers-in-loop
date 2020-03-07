package com.github.hcsp.controlflow;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /**
     * 打印从start到end区间所有的奇数，包括start和end本身（若符合条件）。 注意，数字之间用英文逗号分隔。
     *
     * <p>例如，start=1,end=5，则打印1,3,5 又如，start=-2,end=2，则打印-1,1
     *
     * @param start 区间开始
     * @param end   区间结束
     */
    public static void printOddNumbersBetween(int start, int end) {


        for (int i=start;i<=end;i++){ //把start 值赋给i 循环I直到与end一样大

            if (i%2!=0){    //筛选余2是否等于0 是则为质数输出
                System.out.println(i);
            if(start<=end-1){
                System.out.println(",");
            }
        }
    }


    }

    public static void main(String[] args) {
        printOddNumbersBetween(1, 5);
        printOddNumbersBetween(-2, 2);
    }
}
