package com.neuedu.test;

import java.util.Scanner;

public class CounterTest {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.print("请输入第一个数");
        int b = s.nextInt();
        System.out.print("请输入第二个数");
        int c = s.nextInt();
        switch (a){
            case 1:
                counter.add( b , c );
                break;
            case 2:
                counter.cut( b , c );
                break;
            case 3:
                counter.ride( b , c );
                break;
            case 4:
                counter.divide( b , c );
                break;
            default:
                System.out.print("请选择正确选项");
        }
    }

}

