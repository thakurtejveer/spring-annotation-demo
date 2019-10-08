package com.stackroute.domain;

public class Actor {
    private int age;
    private String name;
    private String gender;


    public Actor(String Name, String Gender, int Age) {
        this.age = Age;
        this.name = Name;
        this.gender = Gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
