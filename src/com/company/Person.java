package com.company;

public class Person {

    private String name;
    private String surName;
    private int age;
    private double weight;
    private double growth;

    public Person(String name, String surName, int age, double weight, double growth) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.weight = weight;
        this.growth = growth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setGrowth(double growth) {
        this.growth = growth;
    }

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getGrowth() {
        return growth;
    }

    @Override
    public String toString() {
        return surName + " " + name +
                ", возраст:" + age + " лет (года)" +
                ", вес: " + weight + " кг." +
                ", рост: " + growth + " см.\n";
    }
}