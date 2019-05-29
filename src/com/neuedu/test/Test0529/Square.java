package com.neuedu.test.Test0529;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void Circum(){
        double C1=4*this.side;
        System.out.println(C1);
    }
    public void Square(){
        double S2=Math.pow(side,2);
        System.out.println(S2);
    }
}
