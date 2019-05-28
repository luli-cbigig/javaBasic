package com.neuedu.test;

import java.util.Scanner;

public class CounterTest {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Scanner s = new Scanner(System.in);
        System.out.println("请输入运算方式，1加法，2减法，3乘法，4除法");
        int a = s.nextInt();

        System.out.print("请输入第一个数");
        int num1 = s.nextInt();
        counter.num1 = num1 ;
        System.out.print("请输入第二个数");
        int num2 = s.nextInt();
        counter.num2 = num2;
        switch (a){
            case 1:
                counter.add();//和
                break;
            case 2:
                counter.cut();//差
                break;
            case 3:
                counter.ride();//积
                break;
            case 4:
                counter.divide();//商
                break;
            default:
                System.out.print("请选择正确选项");
        }
    }

}

