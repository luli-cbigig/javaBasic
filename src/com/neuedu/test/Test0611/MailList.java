package com.neuedu.test.Test0611;

import java.util.ArrayList;
import java.util.List;

public class MailList {
    public static void main(String[] args) {
        List<Mail> list = new ArrayList<>();
        list.add(new Mail("zhang","自强","西安","陕西","中国"));
        list.add(new Mail("zhangyi","皇后大道","香港"," ","中国"));
        for(int i=0;i<list.size();i++)
        {
            Mail m=(Mail)list.get(i);
            System.out.println(m.getName() + m.getStreet() + m.getCity()+m.getProvince()+m.getCountry());
        }
    }
}
