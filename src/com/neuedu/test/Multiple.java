package com.neuedu.test;

public class Multiple {
//    3的倍数
    public static void main(String[] args) {
        int i=3;
        int sum=0;
        while(i<200){
            if (i%3==0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println("3的倍数之和为:"+sum);
    }
}
