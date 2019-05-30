package com.neuedu.test.Test0529;

import java.util.Scanner;

public class GraphTest {
    public static void main(String[] args) {

            System.out.println("请输入正方形的边长");
            Scanner side=new Scanner(System.in);
            double r=side.nextDouble();
            Square s=new Square();
            s.setSide(r);
//            System.out.println(s.getSide());
            s.Circum();
            s.Square();

            System.out.println("请输入圆形的半径");
            Scanner ridus=new Scanner(System.in);
            Circle c=new Circle();
            c.setRadius(ridus.nextDouble());
            c.Circum();
            c.Square();

    }
}
