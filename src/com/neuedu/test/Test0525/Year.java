package com.neuedu.test.Test0525;

import java.util.Scanner;
//平年与闰年
public class Year {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        if (i%4==0&&i%100==0||i%400==0){
            System.out.println("它是闰年");
        }else{
            System.out.println("它是平年");
        }
    }
}
