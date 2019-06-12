package com.neuedu.test.Test0611;

public class Worker {
    private String name;
    private int age;
    private int sal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public Worker(String name, int age, int sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "员工姓名：" + name +
                ", 年龄：" + age +
                ", 工资：" + sal;
    }
}
