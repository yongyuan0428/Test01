package com.yongyuan.stategy.demo;

public class SortedNum {

    public void sort (int[] arr){
        //选择排序
        for (int i = 0; i < arr.length - 1; i++) {
            int minNum = i;
            for (int j = i+1; j < arr.length; j++) {
                minNum = arr[j] < arr[minNum] ? j : minNum;
            }
            changeNum(arr , i , minNum);
        }
    }

    public void changeNum(int[] arr,int i ,int minNum){
        int temp = arr[i];
        arr[i] = arr[minNum];
        arr[minNum] = temp;
    }
}
