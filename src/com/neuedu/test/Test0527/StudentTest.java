package com.neuedu.test.Test0527;

public class StudentTest {
    public static void main(String[] args) {
        Student[] stu = new Student[5];
        for (int i=0;i<stu.length;i++){
            Student stus = new Student();
            stus.setSname("abc");
            stus.setGrade(60+i);
            stu[i]=stus;
        }
        for (int i=0;i<stu.length;i++){
            for (int j=0;j<stu.length-i;j++){
                if (stu[j].getGrade()>stu[j+1].getGrade()){

                }
            }
        }
        for (Student s:stu){
            System.out.println(s);
        }
    }
}
