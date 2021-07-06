package com.yongyuan.stategy.demo;

public class Student {

    private String name ;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareWithAge(Student student){

        if (this.age < student.age){
            return -1;
        }else if (this.age > student.age){
            return 1;
        }else return 0;

    }
}
