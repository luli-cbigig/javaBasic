package com.neuedu.test.Test0527;

public class Car {
//    编写一个Java程序，并满足如下要求：
//            1）编写一个Car类，具有：   特征：品牌(mark)——String类型   价格（price）、速度（speed）——int型
//    功能：驾驶（void drive( )）    功能：变速（void speedChange(int newSpeed)），把新速度赋给speed
//3）定义主类E，在其main方法中创建Car类的两个对象：aodi和benchi的对 象并测试其对象的特性。

    private String mark;
    private int price;
    private int speed;


    public void drive(){

    }
    public void speedChange(int newSpeed){
        speed=newSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }
}
