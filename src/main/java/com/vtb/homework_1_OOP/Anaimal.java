package com.vtb.homework_1_OOP;

abstract class Animals{
    private String name;
    private String color;
    private static int count = 0;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCount() {
        return String.format("Экземпляров класса - %s шт", count);
    }

    public Animals(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public void swim(int distance);
    abstract public void run(int distance);
}
