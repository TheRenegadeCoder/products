/**
 * The basic layout for a student class.
 * 
 * In this exercise, the goal is to simply clean up this class so that
 * it is actually readable. Consider making the following changes:
 * 
 * - Place fields on separate lines
 * - Place spaces between methods
 * - Add JavaDoc comments
 * - Check spelling
 * - Use proper naming conventions
 * - etc...
 * 
 * Copyright (C) 2017 Jeremy Griffith
 */
public class Student {

    int id, age, gradyear;
    String name, address, major;
    
    public Student(int Age, int grad_year, String Name, String Address, String Major) {
        id = (int)(Math.random() * 1000);
        gradyear = grad_year;
        name = Name;
        address = Address;
        major = Major;
    }
    
    public int getid() {
        return id;
    }
    public int getage() {return age;}
    public int getGardyear() { return gradyear;} public String getName () {
        return name;
    }
    
    public String gimmeAddress() {
        return address;
    }
    
    public String getMajur() {
      return major;
    }
}
