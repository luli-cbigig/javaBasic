package com.neuedu.test.Test0531;

import java.util.Scanner;

public class GuessingConjectureTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个数");
        int num = input.nextInt();
        GuessingConjecture guco = new GuessingConjecture();
        guco.setNnum(num);
        guco.guigu();
    }
}
