package com.neuedu.test.Test0613;

import java.util.HashSet;
import java.util.Scanner;

public class CharacterTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一串字符");
        HashSet<Character> hs = new HashSet<>();
        String cha = input.next();
        char[] arr = cha.toCharArray();

        for (char a:arr
             ) {
            hs.add(a);
        }
        for (Character b:hs
             ) {
            System.out.println(b);
        }
    }
}
