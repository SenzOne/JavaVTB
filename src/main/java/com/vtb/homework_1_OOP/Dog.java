package com.vtb.homework_1_OOP;

public class Dog extends Animals {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void swim(int distance) {
        if (0 < distance && distance < 10){
            System.out.printf("Собака %s проплыла %s метров\n", this.getName(), distance);
        } else
            System.out.printf("Собака %s не может проплыть больше 10 метров\n", this.getName());
    }

    @Override
    public void run(int distance) {
        if (distance <= 500)
            System.out.printf("Собака %s пробежала %s метров\n", this.getName(), distance);
        else
            System.out.printf("Собака %s не может проплыть больше 500 метров\n", this.getName());
    }
}
