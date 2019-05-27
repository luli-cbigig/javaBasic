package com.neuedu.test;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle();
        rec.Circum1();
        rec.square1();

        rec.Circum2(5);

        Scanner w=new Scanner(System.in);
        System.out.println("请输入长方形的宽：");
        int width=w.nextInt();
        Scanner h=new Scanner(System.in);
        System.out.println("请输入长方形的高");
        int height=w.nextInt();
        rec.Circum3(width,height);
        rec.Square3(width,height);
    }
}
