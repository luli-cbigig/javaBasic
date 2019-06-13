package com.neuedu.test.Test0613;

import java.util.ArrayList;

public class Indexical {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        array.add(1);
        array.add(4);
        array.add(8);
        array.add(12);
        array.add(16);
        array.add(20);
        System.out.println("索引值为："+listT(array,5));
    }
    public static int listT(ArrayList<Integer> al, Integer s){
        for (int i = 0;i<al.size();i++){
            if (al.get(i)==s){
                return i;
            }
        }
        return -1;
    }
}
