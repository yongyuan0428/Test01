package com.yongyuan.stategy.demo;

public class SortedObject {

    public void sort(Compare[] objects){
        for (int i = 0; i < objects.length - 1; i++) {
            int minNum = i;
            for (int j = i+1; j < objects.length; j++) {
                minNum = objects[j].compareTo(objects[minNum]) == -1 ? j : minNum;
            }
            changeNum(objects , i , minNum);
        }
    }

    public void changeNum(Object[] s,int i ,int minNum){
        Object temp = s[i];
        s[i] = s[minNum];
        s[minNum] = temp;
    }
}
