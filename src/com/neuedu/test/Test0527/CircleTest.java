package com.neuedu.test.Test0527;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Circle cir=new Circle();
        Scanner s=new Scanner(System.in);
        System.out.println("请输入圆的半径(不要输入负值)：");
        double ra=s.nextDouble();
        cir.setRa(ra);
        if (ra<0){
            System.out.println("请输入正确的半径");
        }else{
            cir.Circum();
            cir.Square();
        }
    }
}
