package com.trc.school;

public class Course {

    private String name;
    private int numberOfStudyHours;
    private int studyHoursComplete;
    private int numberOfAssignments;
    private int assignmentsComplete;

    public Course(String name, int numberOfHours, int numberOfAssignments) {
        this.name = name;
        this.numberOfStudyHours = numberOfHours;
        this.studyHoursComplete = 0;
        this.numberOfAssignments = numberOfAssignments;
        this.assignmentsComplete = 0;
    }

    public void study(int duration) {
        if (this.studyHoursComplete + duration > this.numberOfStudyHours) {
            this.studyHoursComplete = this.numberOfStudyHours;
        } else {
            this.studyHoursComplete += duration;
        }
    }

    public void doAssignment() {
        if (this.assignmentsComplete + 1 > this.numberOfAssignments) {
            this.assignmentsComplete = this.numberOfAssignments;
        } else {
            this.assignmentsComplete += 1;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfHours() {
        return this.numberOfStudyHours;
    }

    public boolean isComplete() {
        if (studyHoursComplete == 0) {
            return true;
        } else {
            return false;
        }
    }
}
