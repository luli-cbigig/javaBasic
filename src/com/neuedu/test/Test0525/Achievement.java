package com.neuedu.test.Test0525;

import java.util.Scanner;

public class Achievement {
//    成绩查询
    public static void main(String[] args) {
        int c;
        Scanner s=new Scanner(System.in);
        System.out.println("输入成绩：");
        c=s.nextInt();
        if (c <= 100&& c >= 90){
            System.out.println("等级为A");
        }else if (c <= 89 && c >= 60){
            System.out.println("等级为B");
        }else if(c < 60 && c >= 0){
            System.out.println("等级为C");
        }else{
            System.out.println("同学请不要开玩笑，请输入正确的成绩");
        }
    }
}
