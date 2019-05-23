package com.neuedu.test;

public class TestTwo {
    public static void main(String[] args) {
        int a=465;
        int b=0;
        while(a != 0){
            b=a%10;
            System.out.print(b);
            //第一次执行b=5，a=46
            //第二次执行b=6，a=4
            //第三次执行b=4，a=0 循环结束
            a=a/10;
        }
    }
}
