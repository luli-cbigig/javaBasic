package com.neuedu.test;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Circle cir=new Circle();
        Scanner s=new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        double r=s.nextDouble();
        if (r<0){
            System.out.println("请输入正确的半径");
        }else{

            cir.Circum();
            cir.Square();
        }





    }
}
