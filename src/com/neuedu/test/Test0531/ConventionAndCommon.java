package com.neuedu.test.Test0531;

import java.util.Scanner;

public class ConventionAndCommon {
    // 输入两个正整数m和n，求其最大公约数和最小公倍数。
    public int getGcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
