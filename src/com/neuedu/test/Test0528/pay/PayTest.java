package com.neuedu.test.Test0528.pay;

public class PayTest {
    public static void main(String[] args) {
        Worker wk = new Worker();
        wk.setName("xiaoyao");
        wk.setDay(30);
        wk.setSay(100);
        wk.setSex('男');
        wk.setBirthday("1990-02-03");
        wk.computeSalay();
        System.out.println(wk.toString());
        Salesman sam = new Salesman();
        sam.setName("laoliu");
        sam.setBasic(2500);
        sam.setExsay(600);
        sam.setSex('男');
        sam.setBirthday("1994-05-03");
        sam.computeSalay();
        System.out.println(sam.toString());
        Manager mag = new Manager();
        mag.setName("xiaomeng");
        mag.setBasic(4000);
        mag.setSex('女');
        mag.setBirthday("1998-10-21");
        mag.computeSalay();
        System.out.println(mag.toString());
        Floater fot = new Floater();
        fot.setName("xiaojin");
        fot.setBasic(40);
        fot.setHour(68);
        fot.setSex('女');
        fot.setBirthday("1999-10-25");
        fot.computeSalay();
        System.out.println(fot.toString());
    }
}
