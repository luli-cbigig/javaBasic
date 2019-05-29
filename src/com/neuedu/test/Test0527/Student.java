package com.neuedu.test.Test0527;

public class Student {
//    定义一个学生类 包括 姓名 年龄 分数的特征
//    创建五个学生对象 对其中特征进行赋值 赋值后 根据分数从大到小进行排序
    private String sname;
    private int age;
    private int grade;


    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
