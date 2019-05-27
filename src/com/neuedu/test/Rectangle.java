package com.neuedu.test;

public class Rectangle {
//    定义长方形类，含：
//    特征：宽、高（整型）；
//    方法：求周长、面积；
//    方法3个：（1）无参——宽、高默认值为1；（2）1个参数——宽、高均为参数值；（3）2个参数——宽、高各为参数值。
//    并对其进行测试
    private int width;
    private int height;
    public void Circum1(){
        int width = 1;
        int height = 1;
        int C = (width + height) * 2;
        System.out.println("周长为"+C);
    }
    public void square1(){
        int width = 1;
        int height = 1;
        int S = width * height;
        System.out.println("面积为"+S);
    }
    public void Circum2(int a){
        this.width=a;
        this.height=a;
        int C2 = (width + height) * 2;
        int S2 = width * height;
        System.out.println("周长为"+C2);
        System.out.println("面积为"+S2);
    }
    public void Circum3(int width,int height){
        int C3=(width+height)*2;
        System.out.println(C3);
    }
    public void Square3(int width,int height){
        int S3=width*height;
        System.out.println(S3);
    }
}
