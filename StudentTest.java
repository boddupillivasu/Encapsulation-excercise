package com.encap.exercises;


public class StudentTest {
    public static void main(String[] args) {

        // create student instance and pass the details
        Student student = new Student("bharath", 20, 75.9);

        System.out.println("the  actual student details are");
        student.displayInfo();


        // we can modifying by using set method
        student.setAge(21);
        student.setName("challa venkata kalyan");
        student.setGrade(56.7);
        System.out.println("the modified student details are given below");
        student.displayInfo();

        student.setAge(22);
        student.setName("manohar");
        student.setGrade(77.97);
        System.out.println("again modified student details are given below");
        student.displayInfo();

    }

}
