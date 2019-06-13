package com.neuedu.test.Test0613;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] aegs){
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"张三丰");
        map.put(2,"周芷若");
        map.put(3,"汪峰");
        map.put(4,"灭绝师太");
        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }

        map.remove(1);

        map.put(2,"周林");
        System.out.println("--------------------------");
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
    }
}
