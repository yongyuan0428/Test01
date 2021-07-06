package com.yongyuan.stategy.demo;

public class Cat implements Compare<Cat>{

    private int weight;
    private int age;

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", age=" + age +
                '}';
    }

    public Cat(int weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    @Override
    public int compareTo(Cat o) {

        if (this.age < o.age){
            return -1;
        }else if (this.age > o.age){
            return 1;
        }else return 0;
    }
}
