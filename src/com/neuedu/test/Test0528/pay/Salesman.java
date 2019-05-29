package com.neuedu.test.Test0528.pay;

public class Salesman {
    private String name;
    private char sex;
    private String birthday;
    private float basic;
    private float exsay;

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

    public float getExsay() {
        return exsay;
    }

    public void setExsay(float exsay) {
        this.exsay = exsay;
    }
    public void computeSalay(){
        System.out.println(basic+exsay);
    }

    @Override
    public String toString() {
        return "Salesman{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                ", basic=" + basic +
                ", exsay=" + exsay +
                '}';
    }
}
