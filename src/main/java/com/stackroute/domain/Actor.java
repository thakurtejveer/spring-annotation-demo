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
    public void studentInfo() {
        System.out.println("Name is "+name);;
        System.out.println("Gender is "+gender);
        System.out.println("Age is "+age);
    }
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getGender() {
//        return gender;
//    }
}
