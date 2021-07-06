package com.yongyuan.stategy.demo;

public class DogCompareAge implements ComparatorTest<Dog>{
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.getAge() <o2.getAge()){
            return -1;
        } else if(o1.getAge() > o2.getAge()){
            return 1;
        }
        return 0;
    }
}
