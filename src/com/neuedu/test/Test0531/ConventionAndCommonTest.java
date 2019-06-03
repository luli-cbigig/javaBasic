package com.neuedu.test.Test0531;

import java.util.Scanner;

public class ConventionAndCommonTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入a:");
        int a = scanner.nextInt();
        System.out.println("请输入b:");
        int b = scanner.nextInt();
        System.out.println("最大公约数：" + new ConventionAndCommon().getGcd(a, b));
    }
}
