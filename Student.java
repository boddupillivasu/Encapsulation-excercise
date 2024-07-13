package com.encap.exercises;

public class Student {


    //instance variables
    private String name;
    private int age;
    private double grade;

    // non argument constructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // getter name
    public String getName() {
        return name;
    }

    // to set the name
    public void setName(String name) {
        this.name = name;
    }

    // get the age

    public int getAge() {
        return age;
    }

    // set the age
    public void setAge(int age) {
        this.age = age;
    }

    //getter grade
    public double getGrade() {
        return grade;
    }

    // set the grade

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // display the student details
    void displayInfo() {
        System.out.println("student name :" + name);
        System.out.println("student age:" + age);
        System.out.println("student grade:" + grade);

    }
}

