package com.neuedu.test;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String d=s.next();
        char[] c=d.toCharArray();
        if (c[0] >= 97 && c[0] <= 122){
            char re=(char)(c[0]-32);
            System.out.println(c[0]);
        }else if (c[0] >= 65 && c[0] <= 90){
            System.out.println(c);
        }else {
            System.out.println("不是英文字符");
        }
    }
}
