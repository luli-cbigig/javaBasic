package com.neuedu.test.Test0531;

import java.util.Scanner;

public class CraphicalTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入半径");
        int radius = input.nextInt();
        Craphical graphical = new Circular();
        ((Circular) graphical).setRadius(radius);
        ((Circular) graphical).Perimeter();
        ((Circular) graphical).area();
        System.out.println("输入边长");
        int bianchang = input.nextInt();
        Craphical graphical1 = new Squer();
        ((Squer) graphical1).setBianchang(bianchang);
        ((Squer) graphical1).Perimeter();
        ((Squer) graphical1).area();
    }
}
