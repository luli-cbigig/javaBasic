package com.neuedu.test;

public class Counter {
//    定义一个计算器类，包括加、减、乘、除运算。
//    并对其进行测试
    int num1;
    int num2;
    public void add(){
        int num=num1+num2;
        System.out.println("和为："+num);
    }
    public void cut(){
        int num=num1-num2;
        System.out.println("差为："+num);
    }
    public void ride(){
        int num=num1*num2;
        System.out.println("积为："+num);
    }
    public void divide(){
        int num=num1/num2;
        System.out.println("商为："+num);
    }
}
