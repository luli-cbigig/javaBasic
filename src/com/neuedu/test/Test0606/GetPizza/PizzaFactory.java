package com.neuedu.test.Test0606.GetPizza;

import java.util.Scanner;

public class PizzaFactory {
    public static Pizza getPizza(int gain) {
        Scanner input = new Scanner(System.in);
        Pizza p = null;
        if (gain == 1) { // 培根披萨
            System.out.println("请输入培根克数:");
            int gramNum = input.nextInt();
            System.out.println("请输入披萨价格:");
            int price = input.nextInt();
            System.out.println("请输入披萨大小:");
            int size = input.nextInt();
            p = new BaconPizza("培根披萨", price, size, gramNum);
        }
        if (gain == 2) { // 海鲜披萨
            System.out.println("请输入配料信息:");
            String category = input.next();
            System.out.println("请输入披萨价格:");
            int price = input.nextInt();
            System.out.println("请输入披萨大小:");
            int size = input.nextInt();
            p = new SeafoodPizza("海鲜披萨",price,size,category);
        }
        return p;
    }
}
