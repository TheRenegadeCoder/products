package com.trc.school;

public class Course {

    private String name;
    private boolean complete;
    private int numberOfHours;
    private int hoursRemaining;

    public Course(String name, int numberOfHours) {
        this.name = name;
        this.complete = false;
        this.numberOfHours = numberOfHours;
        this.hoursRemaining = numberOfHours;
    }

    public void study(int duration) {
        if (this.hoursRemaining - duration < 0) {
            this.hoursRemaining = 0;
            this.complete = true;
        } else {
            this.hoursRemaining -= duration;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfHours() {
        return this.numberOfHours;
    }

    public boolean isComplete() {
        return this.complete;
    }
}
