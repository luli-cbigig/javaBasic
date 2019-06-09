package com.neuedu.test.Test0529;

public class Circle extends Graph {

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
