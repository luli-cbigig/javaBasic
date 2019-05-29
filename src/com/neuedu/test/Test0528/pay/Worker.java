package com.neuedu.test.Test0528.pay;

public class Worker {
    private String name;
    private char sex;
    private String birthday;
    private int day;
    private float say;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public float getSay() {
        return say;
    }

    public void setSay(float say) {
        this.say = say;
    }

    public void computeSalay(){
        System.out.println(day*say);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                ", day=" + day +
                ", say=" + say +
                '}';
    }
}
