package com.yongyuan.stategy.demo;

public class Dog {
    private int age;
    private int weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }

    public Dog(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }
}
