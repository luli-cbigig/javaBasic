package com.neuedu.test;

public class Circle {
//    定义圆类，它有一个变量radius(半径)。从键盘输入数据，将半径传递给radius，编程计算并输出圆的周长和面积（确保输入的数据不为负数）。
//    并对其进行测试
    private double ra;
    public void Radi(double r){

        this.ra = r;

    }
    public void Circum(){

        double C = 2*Math.PI*this.ra;
        System.out.println("周长为"+C);
    }
    public void Square(){

        double S = Math.PI*this.ra*this.ra;
        System.out.println("面积为"+S);
    }
}
