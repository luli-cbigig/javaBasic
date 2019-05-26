package com.neuedu.test;

public class Compose {
//    1,2,3,4组合三位数
    public static void main(String[] args) {
        int a,b,c;
        int d=0;
        for (a = 1;a <= 4;a++)
            for (b = 1;b <= 4;b++)
                for(c = 1;c <= 4;c++)
                    if (a != b && b != c && a != c){
                        d += 1;
                        System.out.println(a*100+b*10+c);
                    }
        System.out.println("共有"+d+"组三位数");
    }
}
