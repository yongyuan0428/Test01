package com.yongyuan.stategy.demo;

public class SortedStudent {

    public void sort(Student[] student){
        for (int i = 0; i < student.length - 1; i++) {
            int minNum = i;
            for (int j = i+1; j < student.length; j++) {
                minNum = student[j].compareWithAge(student[minNum]) == -1 ? j : minNum;
            }
            changeNum(student , i , minNum);
        }
    }

    public void changeNum(Student[] s,int i ,int minNum){
        Student temp = s[i];
        s[i] = s[minNum];
        s[minNum] = temp;
    }
}
