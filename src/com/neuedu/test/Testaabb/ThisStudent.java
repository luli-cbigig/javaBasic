package com.neuedu.test.Testaabb;

public class ThisStudent extends Student {
    int age;

    @Override
    public void stu() {
        super.stu();
        age=17;
        System.out.println("这个学生的年龄是:"+age);
    }
}
