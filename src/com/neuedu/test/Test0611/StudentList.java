package com.neuedu.test.Test0611;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("Tom", 18, 100, "class05"));
        list.add(new Student("Jerry", 22, 70, "class04"));
        list.add(new Student("Owen", 25, 90, "class05"));
        list.add(new Student("Jim", 30,80 , "class05"));
        list.add(new Student("Steve", 28, 66, "class06"));
        list.add(new Student("Kevin", 24, 100, "class04"));

        System.out.println();

        int ageAvg = AgeAvg(list);
        System.out.println("平均年龄为："+ageAvg);

        int scoreAvg = ScoreAvg(list);
        System.out.println("平均分数为："+scoreAvg);
    }
    public static int AgeAvg(List list){
        int ageSum = 0;
        int ageAvg;
        for (Object ob:list
             ) {
            Student st= (Student) ob;
            ageSum += st.getAge();
        }
        ageAvg = ageSum/list.size();
        return ageAvg;
    }
    public static int ScoreAvg(List list){
        int scoreSum = 0;
        int scoreAvg;
        for (Object ob:list
             ) {
            Student st=(Student) ob;
            scoreSum += st.getScore();
        }
        scoreAvg = scoreSum / list.size();
        return scoreAvg;
    }
}
