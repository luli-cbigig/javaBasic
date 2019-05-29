package com.neuedu.test.Test0528;

public class Student20 {
//    有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩
    private String number;
    private String name;
    private int Chineae;
    private int English;
    private int Math;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChineae() {
        return Chineae;
    }

    public void setChineae(int chineae) {
        Chineae = chineae;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public void back() {
        int a = (getChineae() + getEnglish() + getMath()) / 3;
        System.out.println(getName() + "平均数" + a);

    }
}
