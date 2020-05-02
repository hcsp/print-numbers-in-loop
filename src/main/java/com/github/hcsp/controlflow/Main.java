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
       if(start % 2 ==0 && end % 2 == 0){
           for (int i = start+1; i <end ; i+=2) {
               System.out.print(i);
               if(i == end-1){
                   System.out.println("");
               }else{
                   System.out.print(",");
               }
           }
       }else if(start % 2 ==0 && end % 2 != 0){
           for (int i = start+1; i <end+1 ; i+=2) {
               System.out.print(i);
               if(i == end){
                   System.out.println("");
               }else{
                   System.out.print(",");
               }
           }
       }else if(start % 2 != 0 && end % 2 == 0){
           for (int i = start; i <end ; i+=2) {
               System.out.print(i);
               if(i == end-1){
                   System.out.println("");
               }else{
                   System.out.print(",");
               }
           }
       }else{
           for (int i = start; i <end+1 ; i+=2) {
               System.out.print(i);
               if(i == end){
                   System.out.println("");
               }else{
                   System.out.print(",");
               }
           }
       }




    }

    public static void main(String[] args) {
        printOddNumbersBetween(1, 5);
        printOddNumbersBetween(-2, 2);
    }
}
