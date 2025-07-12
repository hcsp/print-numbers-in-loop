package com.github.hcsp.controlflow;

public class Main {
    /**
     * 打印从start到end区间所有的奇数，包括start和end本身（若符合条件）。 注意，数字之间用英文逗号分隔。
     *
     * <p>例如，start=1,end=5，则打印1,3,5 又如，start=-2,end=2，则打印-1,1
     *
     * @param start 区间开始
     * @param end 区间结束
     */
    public static void printOddNumbersBetween(int start, int end) {
        StringBuilder result = new StringBuilder(); //一开始我只是想用","将结果拼接在一起,结果Java中没有像python那种strip的方法
                                                    // 只能用StringBuilder
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                result.append(i).append(",");      //一开始想的是%2==0的时候continue来跳过偶数
                                                    // 用了string Builder之后是将奇数append起来
            }
        }
        if (result.length()>0){
            result.deleteCharAt(result.length() -1);
        }
        System.out.println(result);
    }

            public static void main (String[]args){
                printOddNumbersBetween(1, 5);
                printOddNumbersBetween(-2, 2);
            }
        }
