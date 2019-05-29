package com.neuedu.test.Test0525;

public class Odevity {
    public static void main(String[] args) {
//        奇数和与偶数和
        int a;
        int sum=0;
        int sum1=0;
        for (a = 1;a <= 100;a++){
            if (a%2==0){
                sum=sum+a;
            }else{
                sum1=sum1+a;
            }
        }System.out.println("偶数和"+sum);
        System.out.println("奇数和"+sum1);
    }
}
