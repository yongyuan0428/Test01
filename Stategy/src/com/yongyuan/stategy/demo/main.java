package com.yongyuan.stategy.demo;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        //比较数字
        int[] arr = {6, 8, 5, 4, 9, 3};
        SortedNum sortedNum = new SortedNum();
        sortedNum.sort(arr);
        System.out.println(Arrays.toString(arr));
        //比较学生
        Student[] student = {new Student("xiaoyi",21) , new Student("xiaoer",19),new Student("xiaosan",22)};
        SortedStudent sortedStudent = new SortedStudent();
        sortedStudent.sort(student);
        System.out.println(Arrays.toString(student));
        //比较猫
        Cat[] cat = {new Cat(3,3),new Cat(2,2),new Cat(4,4)};
        SortedObject sortedObject = new SortedObject();
        sortedObject.sort(cat);
        System.out.println(Arrays.toString(cat));
        System.out.println("----------------------------");

        //比较狗
        Dog[] dog = {new Dog(12,5),new Dog(11,2),new Dog(14,6)};
        Sorted<Dog> sorted = new Sorted<>();
        sorted.sort(dog,new DogCompareAge());
        System.out.println(Arrays.toString(dog));
    }
}
