package com.trc.school;

public class School {

    private int numberOfStudents = 0;

    public Student enroll(String firstName, String lastName) {
        Student newStudent = new Student(firstName, lastName, numberOfStudents);
        numberOfStudents++;
        return newStudent;
    }

}
