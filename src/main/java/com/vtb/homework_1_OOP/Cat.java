package com.vtb.homework_1_OOP;

public class Cat extends Animals{
    public Cat(String name) {
        super(name);

    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать\n");
    }

    @Override
    public void run(int distance) {
        if (distance <= 200)
            System.out.printf("Кот %s пробежал %s метров\n",this.getName(),  distance);
    }
}
