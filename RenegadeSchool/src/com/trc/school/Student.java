package com.trc.school;

public class Student {

    private String firstName;
    private String lastName;
    private String address;
    private Course codingCourse;
    private Course mathCourse;
    private Course englishCourse;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress(String address) {
        return this.address;
    }

    public void setCodingCourse(Course codingCourse) {
        this.codingCourse = codingCourse;
    }

    public Course getCodingCourse() {
        return this.codingCourse;
    }

    public void setMathCourse(Course mathCourse) {
        this.mathCourse = mathCourse;
    }

    public Course getMathCourse() {
        return this.mathCourse;
    }

    public void setEnglishCourse(Course englishCourse) {
        this.englishCourse = englishCourse;
    }

    public Course getEnglishCourse() {
        return this.englishCourse;
    }
}
