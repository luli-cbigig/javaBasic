package com.neuedu.test.Test0611;

import java.util.ArrayList;
import java.util.List;

public class WorkerList {
    public static void main(String[] args) {
        List<Worker> list = new ArrayList<>();
        list.add(new Worker("zhang3",18,3000));
        list.add(new Worker("li4",25,3500));
        list.add(new Worker("wang5",22,3200));
        for(Worker a:list){
            System.out.println(a);
        }
        System.out.println("--------------------------------");
        list.add(1,new Worker("zhao6",24,3300));
        list.remove(3);
        list.iterator().forEachRemaining(System.out::println);
    }
}
