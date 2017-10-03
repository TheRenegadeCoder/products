/**
 * The Student class.
 * 
 * Copyright (C) 2017 Jeremy Griffith
 */
public class Student {

    /**
     * The student's ID.
     */
    int id;

    /**
     * The student's age.
     */
    int age;

    /**
     * The student's graduation year.
     */
    int gradYear;

    /**
     * The student's name.
     */
    String name;

    /**
     * The student's address.
     */
    String address;

    /**
     * The student's major.
     */
    String major;

    /**
     * The student constructor.
     * 
     * The ID is randomly generated. You can ignore the fact that it's going to
     * inevitably generate duplicate IDs. It's just for show.
     * 
     * @param age the age of the student in years
     * @param gradYear the graduation year of the student
     * @param name the name of the student
     * @param address the address of the student
     * @param major the major of the student
     */
    public Student(int age, int gradYear, String name, String address, String major) {
        this.id = (int) (Math.random() * 1000);
        this.gradYear = gradYear;
        this.name = name;
        this.address = address;
        this.major = major;
    }

    /**
     * Retrieves the student's ID.
     * 
     * @return the id field as an integer
     */
    public int getID() {
        return id;
    }

    /**
     * Retrieves the student's age.
     * 
     * @return the age field as an integer
     */
    public int getAge() {
        return age;
    }

    /**
     * Retrieves the student's graduation year.
     * 
     * @return the gradYear field as an integer
     */
    public int getGradYear() {
        return gradYear;
    }

    /**
     * Retrieves the student's name.
     * 
     * @return the name field as a String
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the student's address.
     * 
     * @return the address field as a String
     */
    public String getAddress() {
        return address;
    }

    /**
     * Retrieves the student's major.
     * 
     * @return the major field as a String
     */
    public String getMajor() {
        return major;
    }
}
