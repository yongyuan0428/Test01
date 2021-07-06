package com.yongyuan.stategy.demo;

public class Sorted<T> {
    public void sort(T [] objects, ComparatorTest<T> comparatorTest){
        for (int i = 0; i < objects.length - 1; i++) {
            int minNum = i;
            for (int j = i+1; j < objects.length; j++) {
                minNum = comparatorTest.compare(objects[j],objects[minNum]) == -1 ? j : minNum;
            }
            changeNum(objects , i , minNum);
        }
    }

    public void changeNum(T[] s,int i ,int minNum){
        T temp = s[i];
        s[i] = s[minNum];
        s[minNum] = temp;
    }
}
