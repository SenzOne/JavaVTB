package com.vtb.homework_1_OOP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Mursik");
        //cat1.run(50);
        //cat2.swim(50);

        Dog dog1 = new Dog("Bobik");
        Dog dog2 = new Dog("Rex");
        //dog1.run(50);
        //dog2.swim(50);


        System.out.println(cat2.getCount());

        List<Animals> animals = new ArrayList<>(List.of(cat1, cat2, dog1, dog2));
        for (Animals a: animals) {
            a.run(100);
            a.swim(5);
        }
    }
}
