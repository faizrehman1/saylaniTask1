package com.company;

public class Teacher {

    private String teachName;
    private String teachCourse;
    private int teachAge;

    public Teacher() {
    }

    public Teacher(String teachName, String teachCourse, int teachAge) {
        this.teachName = teachName;
        this.teachCourse = teachCourse;
        this.teachAge = teachAge;
    }

    public String getTeachName() {
        return teachName;
    }

    public void setTeachName(String teachName) {
        this.teachName = teachName;
    }

    public String getTeachCourse() {
        return teachCourse;
    }

    public void setTeachCourse(String teachCourse) {
        this.teachCourse = teachCourse;
    }

    public int getTeachAge() {
        return teachAge;
    }

    public void setTeachAge(int teachAge) {
        this.teachAge = teachAge;
    }
}
