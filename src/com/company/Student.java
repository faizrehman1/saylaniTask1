package com.company;

public class Student {

    private String sName;
    private int age;
    private String course;

    public Student(String sName, int age, String course) {
        this.sName = sName;
        this.age = age;
        this.course = course;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }



}
