package com.neuedu.test;

import java.util.Scanner;

public class Palindromic {
//    判断是否为回文数
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int i=s.nextInt();
    int a = i/10000;
    int b = i%10000/1000;
    int d = i%100/10;
    int e = i%10;
    if(i>=10000 && i<=99999){
        if (a==e && b==d){
            System.out.println("它是一个回文数");
        }else{
            System.out.println("它不是回文数");
        }
    }else{
        System.out.println("请输入五位数");
        }
    }
}
