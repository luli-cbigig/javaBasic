package com.neuedu.test;

public class Counter {
    public void add(int num1,int num2){
        int num=num1+num2;
        System.out.println("和为："+num);
    }
    public void cut(int num1,int num2){
        int num=num1-num2;
        System.out.println("差为："+num);
    }
    public void ride(int num1,int num2){
        int num=num1*num2;
        System.out.println("积为："+num);
    }
    public void divide(int num1,int num2){
        int num=num1/num2;
        System.out.println("商为："+num);
    }
}
