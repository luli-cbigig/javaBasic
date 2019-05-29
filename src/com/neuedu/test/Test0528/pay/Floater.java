package com.neuedu.test.Test0528.pay;

public class Floater {
    private String name;
    private char sex;
    private String birthday;
    private float basic;
    private int hour;

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

    public float getBasic() {
        return basic;
    }

    public void setBasic(float basic) {
        this.basic = basic;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public void computeSalay(){
        System.out.println(basic*hour);
    }

    @Override
    public String toString() {
        return "Floater{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                ", basic=" + basic +
                ", hour=" + hour +
                '}';
    }
}
