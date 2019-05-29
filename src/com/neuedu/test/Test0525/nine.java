package com.neuedu.test.Test0525;

import java.util.Scanner;

public class nine {
//    被9整除
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int i=s.nextInt();
    int a=0;
    if (i>=0){
        a+=i%10;
        i=i/10;
    }
    a+=i;
    if (a%9==0){
        System.out.println("能被9整除");
    }else{
        System.out.println("不能被9整除");
    }
}
}
