package com.neuedu.test.Test0525;

public class Narcissistic {
    //水仙花数
    public static void main(String[] args){
        int a,b,c;
        for (int i = 100;i < 1000;i++){
            a = i / 100;//百位
            b = i % 100 / 10;//十位
            c = i % 10;//个位
            if(i == a*a*a+b*b*b+c*c*c){
                System.out.println("100~999的水仙花数为:"+i);
            }
        }
    }
}
