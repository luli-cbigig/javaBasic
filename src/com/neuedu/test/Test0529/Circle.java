package com.neuedu.test.Test0529;

public class Circle {
//    定义一个图形类
//2 创建图形 圆形 正方形 有自己的属性 例如圆形的特征 都有半径 分别定义自己的计算面积和计算周长
//3 创建main方法 进行测试 创建对象 调用方法计算面积和周长
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void Circum(){
        double C=2*Math.PI*this.radius;
        System.out.println("圆的周长"+C);
    }
    public void Square(){
        double S=Math.PI*Math.pow(radius,2);
        System.out.println("圆的面积"+S);
    }
}
